
#include "definitions.h"

#include "sm_historyTest.h"

/* Include all nested states/regions */
#include "sm_historyTest_MainState.h"

/* var() gives complete access to the variable 
   this is only used for better readablility */
#define var(x) (rhandle->global->ihandle.x)

/* send() raises a trigger. This is implemented for easier readablility */
#define send(x) (historyTest_Iface_raiseTrigger(&rhandle->global->ihandle,x))

/* Forward Declaration of internal functions */
static void local_MainState_handle(SM_HistoryTest_Handle* rhandle);
static void local_Initial_handle(SM_HistoryTest_Handle* rhandle);
static void local_StateKey1_handle(SM_HistoryTest_Handle* rhandle);
static void local_StateKey2_handle(SM_HistoryTest_Handle* rhandle);

static BOOL local_MainState_analyseTransitionIn(SM_HistoryTest_Handle* rhandle);
static BOOL local_Initial_analyseTransitionIn(SM_HistoryTest_Handle* rhandle);
static BOOL local_StateKey1_analyseTransitionIn(SM_HistoryTest_Handle* rhandle);
static BOOL local_StateKey2_analyseTransitionIn(SM_HistoryTest_Handle* rhandle);

static void local_MainState_enter(SM_HistoryTest_Handle* rhandle);
static void local_Initial_enter(SM_HistoryTest_Handle* rhandle);
static void local_StateKey1_enter(SM_HistoryTest_Handle* rhandle);
static void local_StateKey2_enter(SM_HistoryTest_Handle* rhandle);

static void local_MainState_exit(SM_HistoryTest_Handle* rhandle, HistoryTest_StateType oldState);
static void local_Initial_exit(SM_HistoryTest_Handle* rhandle, HistoryTest_StateType oldState);
static void local_StateKey1_exit(SM_HistoryTest_Handle* rhandle, HistoryTest_StateType oldState);
static void local_StateKey2_exit(SM_HistoryTest_Handle* rhandle, HistoryTest_StateType oldState);

static HistoryTest_StateType getLocalStateInThisRegion(HistoryTest_StateType globalState);

/* End of forward declarations */

/*! The function returns the state on this hierarchy level, the state given as parameter belongs to.
    
    The state machine does only store the actual state of a state machine. The state, this actual state
    is nested in can be extracted by this function.
    
    Every region level provides this function to get the right state in this hierarchy level. 

*/
HistoryTest_StateType getLocalStateInThisRegion(HistoryTest_StateType globalState)
{
    HistoryTest_StateType stateInThisRegion;
    
	switch (globalState) {
    
      /* look for state in this region */
      case st_historyTest_MainState: {
        stateInThisRegion = st_historyTest_MainState;
	 	break;
	  }

      /* Nested states within subsequent region */
	  case st_historyTest_MainState_State0_State3_State5: {
        stateInThisRegion = st_historyTest_MainState;
	    break;	  
	  }
	  
	  case st_historyTest_MainState_State1: {
        stateInThisRegion = st_historyTest_MainState;
	    break;	  
	  }
	  
	  case st_historyTest_MainState_State2: {
        stateInThisRegion = st_historyTest_MainState;
	    break;	  
	  }
	  
	  case st_historyTest_MainState_State0_State3: {
        stateInThisRegion = st_historyTest_MainState;
	    break;	  
	  }
	  
	  case st_historyTest_MainState_State0_Initial: {
        stateInThisRegion = st_historyTest_MainState;
	    break;	  
	  }
	  
	  case st_historyTest_MainState_State0_State3_Initial: {
        stateInThisRegion = st_historyTest_MainState;
	    break;	  
	  }
	  
	  case st_historyTest_MainState_State0_State3_State4: {
        stateInThisRegion = st_historyTest_MainState;
	    break;	  
	  }
	  
	  case st_historyTest_MainState_Initial: {
        stateInThisRegion = st_historyTest_MainState;
	    break;	  
	  }
	  
	  case st_historyTest_MainState_State2_State6: {
        stateInThisRegion = st_historyTest_MainState;
	    break;	  
	  }
	  
	  case st_historyTest_MainState_State0: {
        stateInThisRegion = st_historyTest_MainState;
	    break;	  
	  }
	  
	  case st_historyTest_MainState_DeepHistory: {
        stateInThisRegion = st_historyTest_MainState;
	    break;	  
	  }
	  
	  case st_historyTest_MainState_ShallowHistory: {
        stateInThisRegion = st_historyTest_MainState;
	    break;	  
	  }
	  
	  case st_historyTest_MainState_State2_Initial: {
        stateInThisRegion = st_historyTest_MainState;
	    break;	  
	  }
	  

    
      /* look for state in this region */
      case st_historyTest_Initial: {
        stateInThisRegion = st_historyTest_Initial;
	 	break;
	  }


    
      /* look for state in this region */
      case st_historyTest_StateKey1: {
        stateInThisRegion = st_historyTest_StateKey1;
	 	break;
	  }


    
      /* look for state in this region */
      case st_historyTest_StateKey2: {
        stateInThisRegion = st_historyTest_StateKey2;
	 	break;
	  }


    
    default: {
      /* error: using the inital state - only for completeness */
      stateInThisRegion = st_historyTest_Initial;
      break;
    }
  }
  
  return(stateInThisRegion);
}

BOOL sm_historyTest_runCycle(SM_HistoryTest_Handle* rhandle)
{
	HistoryTest_StateType oldState = rhandle->global->state;
	HistoryTest_StateType localState = getLocalStateInThisRegion(rhandle->global->state);
	
	/* clean transition information */
	rhandle->global->transition = trans_HistoryTest_noTransition;
	
    /* handle actual state and find transitions */
	switch (localState) {
    
      case st_historyTest_MainState: {
        local_MainState_handle(rhandle);
	 	break;
	  }  
    
      case st_historyTest_Initial: {
        local_Initial_handle(rhandle);
	 	break;
	  }  
    
      case st_historyTest_StateKey1: {
        local_StateKey1_handle(rhandle);
	 	break;
	  }  
    
      case st_historyTest_StateKey2: {
        local_StateKey2_handle(rhandle);
	 	break;
	  }  
	  
    default: {
        local_Initial_handle(rhandle);
      }
	}
	
	/* if the new state is within this region but the local state has changed,
	   then run the enter entries */
	if (((sm_historyTest_isIn(rhandle->global->state) == TRUE) && 
	    (localState != getLocalStateInThisRegion(rhandle->global->state))) ||
	    ((rhandle->global->state == localState) && (rhandle->global->transition != trans_HistoryTest_noTransition))) {

	  /* run the state exit actions from this point */
      sm_historyTest_exit(rhandle, oldState);

      /* run the transition action */
	  if (rhandle->global->transition != trans_HistoryTest_noTransition)
	    historyTest_callTransitionAction(rhandle->global);
	  
	  /* run the state entry actions from this point */
	  sm_historyTest_enter(rhandle);
	}
	
  return(rhandle->global->state == oldState);
}

BOOL sm_historyTest_isIn(HistoryTest_StateType testState)
{
	BOOL retvalue = FALSE;
	
	switch (testState) {
	
	case st_historyTest_MainState_State0_State3_State5: {
		retvalue = TRUE;
		break;
	}
	
	case st_historyTest_MainState_State1: {
		retvalue = TRUE;
		break;
	}
	
	case st_historyTest_StateKey2: {
		retvalue = TRUE;
		break;
	}
	
	case st_historyTest_MainState_State2: {
		retvalue = TRUE;
		break;
	}
	
	case st_historyTest_Initial: {
		retvalue = TRUE;
		break;
	}
	
	case st_historyTest_MainState_State0_State3: {
		retvalue = TRUE;
		break;
	}
	
	case st_historyTest_MainState_State0_Initial: {
		retvalue = TRUE;
		break;
	}
	
	case st_historyTest_MainState_State0_State3_Initial: {
		retvalue = TRUE;
		break;
	}
	
	case st_historyTest_MainState_State0_State3_State4: {
		retvalue = TRUE;
		break;
	}
	
	case st_historyTest_MainState_Initial: {
		retvalue = TRUE;
		break;
	}
	
	case st_historyTest_StateKey1: {
		retvalue = TRUE;
		break;
	}
	
	case st_historyTest_MainState_State2_State6: {
		retvalue = TRUE;
		break;
	}
	
	case st_historyTest_MainState_State0: {
		retvalue = TRUE;
		break;
	}
	
	case st_historyTest_MainState: {
		retvalue = TRUE;
		break;
	}
	
	case st_historyTest_MainState_DeepHistory: {
		retvalue = TRUE;
		break;
	}
	
	case st_historyTest_MainState_ShallowHistory: {
		retvalue = TRUE;
		break;
	}
	
	case st_historyTest_MainState_State2_Initial: {
		retvalue = TRUE;
		break;
	}
	
	default: {
	  retvalue = FALSE;
	}
	
	}
	
	return(retvalue);
}

void sm_historyTest_enter(SM_HistoryTest_Handle* rhandle)
{
  HistoryTest_StateType localState = getLocalStateInThisRegion(rhandle->global->state);
  
  /* running through all local states in this region */
  switch (localState) {
    /* look for state in this region */
    case st_historyTest_MainState: {
      local_MainState_enter(rhandle);
	  break;
	}

    /* look for state in this region */
    case st_historyTest_Initial: {
      local_Initial_enter(rhandle);
	  break;
	}

    /* look for state in this region */
    case st_historyTest_StateKey1: {
      local_StateKey1_enter(rhandle);
	  break;
	}

    /* look for state in this region */
    case st_historyTest_StateKey2: {
      local_StateKey2_enter(rhandle);
	  break;
	}

    default: {
        rhandle->global->state = st_historyTest_Initial;
        local_Initial_enter(rhandle);
      }
	}
	
    return;
}

void sm_historyTest_exit(SM_HistoryTest_Handle* rhandle, HistoryTest_StateType oldState)
{
    HistoryTest_StateType localState = getLocalStateInThisRegion(oldState);

    /* running through all local states in this region */
    switch (localState) {
      case st_historyTest_MainState: {
        local_MainState_exit(rhandle, oldState);
	 	break;
	  }

      case st_historyTest_Initial: {
        local_Initial_exit(rhandle, oldState);
	 	break;
	  }

      case st_historyTest_StateKey1: {
        local_StateKey1_exit(rhandle, oldState);
	 	break;
	  }

      case st_historyTest_StateKey2: {
        local_StateKey2_exit(rhandle, oldState);
	 	break;
	  }

	  
    default: {
        /* can't do anything here */
      }
	}

    return;
}



void local_MainState_enter(SM_HistoryTest_Handle* rhandle)
{
    /* "Enter" action in this state */
      var(inState0) = 0;
      var(inState1) = 0;
      var(inState2) = 0;
      var(inState3) = 0;
      var(inState4) = 0;
      var(inState5) = 0;
      var(inState6) = 0;
    
			
    /* enter the subsequent region states */
	sm_historyTest_MainState_enter(&rhandle->historyTest_MainState_Handle);
}


void local_MainState_exit(SM_HistoryTest_Handle* rhandle, HistoryTest_StateType oldState)
{

   /* Exit all subregions */
   sm_historyTest_MainState_exit(&rhandle->historyTest_MainState_Handle, oldState);
   /* no "Exit" action specified */
          
   /* remember the old state */
   
   return;
}


void local_MainState_handle(SM_HistoryTest_Handle* rhandle)
{
	BOOL      activeTransition;

	activeTransition = local_MainState_analyseTransitionIn(rhandle);
	
	if (activeTransition == FALSE) {
	
	    /* No "Do" action specified */

	   /* Calling the region cycle */

        sm_historyTest_MainState_runCycle(&rhandle->historyTest_MainState_Handle);
        
        /* if the new state is not within this states region, exit this state */
	    
	}	
  return;
}


BOOL local_MainState_analyseTransitionIn(SM_HistoryTest_Handle* rhandle)
{
  BOOL isTriggerSet = FALSE;
  
  /* Run through all transitions in order of their priority */
  
  /* test for transition "key1" */
  if (isTriggerSet == FALSE)
  {
    /* run through the triggers */    
	if (  historyTest_Iface_isTriggerRaised(&rhandle->global->ihandle,key1) )  
    {
      historyTest_Iface_resetTrigger(&rhandle->global->ihandle,key1); 
          
      /* return new status */
	  rhandle->global->state      = st_historyTest_StateKey1;
	  rhandle->global->transition = historyTest_MainState_TO_historyTest_StateKey1_P1;
	
	  isTriggerSet = TRUE;
    }
  }
  
  /* test for transition "key2" */
  if (isTriggerSet == FALSE)
  {
    /* run through the triggers */    
	if (  historyTest_Iface_isTriggerRaised(&rhandle->global->ihandle,key2) )  
    {
      historyTest_Iface_resetTrigger(&rhandle->global->ihandle,key2); 
          
      /* return new status */
	  rhandle->global->state      = st_historyTest_StateKey2;
	  rhandle->global->transition = historyTest_MainState_TO_historyTest_StateKey2_P1;
	
	  isTriggerSet = TRUE;
    }
  }



  return(isTriggerSet);
}



void local_Initial_enter(SM_HistoryTest_Handle* rhandle)
{
	
	/* rhandle->global->state = st_historyTest_Initial;  */ 
} 


void local_Initial_exit(SM_HistoryTest_Handle* rhandle, HistoryTest_StateType oldState)
{
} 


void local_Initial_handle(SM_HistoryTest_Handle* rhandle)
{
	(void)local_Initial_analyseTransitionIn(rhandle);

    return;
}


BOOL local_Initial_analyseTransitionIn(SM_HistoryTest_Handle* rhandle)
{
  BOOL isTriggerSet = FALSE;
  
  /* Run through all transitions in order of their priority */
  
  /* test for transition "" */
  if (isTriggerSet == FALSE)
  {
    /* run through the triggers */    
	if (  (1 == 1) )  
    {
          
      /* return new status */
	  rhandle->global->state      = st_historyTest_MainState;
	  rhandle->global->transition = historyTest_Initial_TO_historyTest_MainState_P1;
	
	  isTriggerSet = TRUE;
    }
  }



  return(isTriggerSet);
}



void local_StateKey1_enter(SM_HistoryTest_Handle* rhandle)
{
    /* "Enter" action in this state */
      var(counter) = var(counter) + (1);
      var(inState0) = 0;
      var(inState1) = 0;
      var(inState3) = 0;
      var(inState4) = 0;
      var(inState5) = 0;
      var(inState6) = 0;
    
			
}


void local_StateKey1_exit(SM_HistoryTest_Handle* rhandle, HistoryTest_StateType oldState)
{

   /* no "Exit" action specified */
          
   /* remember the old state */
   
   return;
}


void local_StateKey1_handle(SM_HistoryTest_Handle* rhandle)
{
	BOOL      activeTransition;

	activeTransition = local_StateKey1_analyseTransitionIn(rhandle);
	
  return;
}


BOOL local_StateKey1_analyseTransitionIn(SM_HistoryTest_Handle* rhandle)
{
  BOOL isTriggerSet = FALSE;
  
  /* Run through all transitions in order of their priority */
  
  /* test for transition "" */
  if (isTriggerSet == FALSE)
  {
    /* run through the triggers */    
	if (  (1 == 1) )  
    {
          
      /* return new status */
	  rhandle->global->state      = st_historyTest_MainState_ShallowHistory;
	  rhandle->global->transition = historyTest_StateKey1_TO_historyTest_MainState_ShallowHistory_P1;
	
	  isTriggerSet = TRUE;
    }
  }



  return(isTriggerSet);
}



void local_StateKey2_enter(SM_HistoryTest_Handle* rhandle)
{
    /* "Enter" action in this state */
      var(counter) = var(counter) + (2);
      var(inState0) = 0;
      var(inState1) = 0;
      var(inState3) = 0;
      var(inState4) = 0;
      var(inState5) = 0;
      var(inState6) = 0;
    
			
}


void local_StateKey2_exit(SM_HistoryTest_Handle* rhandle, HistoryTest_StateType oldState)
{

   /* no "Exit" action specified */
          
   /* remember the old state */
   
   return;
}


void local_StateKey2_handle(SM_HistoryTest_Handle* rhandle)
{
	BOOL      activeTransition;

	activeTransition = local_StateKey2_analyseTransitionIn(rhandle);
	
  return;
}


BOOL local_StateKey2_analyseTransitionIn(SM_HistoryTest_Handle* rhandle)
{
  BOOL isTriggerSet = FALSE;
  
  /* Run through all transitions in order of their priority */
  
  /* test for transition "" */
  if (isTriggerSet == FALSE)
  {
    /* run through the triggers */    
	if (  (1 == 1) )  
    {
          
      /* return new status */
	  rhandle->global->state      = st_historyTest_MainState_DeepHistory;
	  rhandle->global->transition = historyTest_StateKey2_TO_historyTest_MainState_DeepHistory_P1;
	
	  isTriggerSet = TRUE;
    }
  }



  return(isTriggerSet);
}



