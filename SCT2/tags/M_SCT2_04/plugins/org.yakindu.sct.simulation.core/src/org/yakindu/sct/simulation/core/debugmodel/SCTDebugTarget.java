package org.yakindu.sct.simulation.core.debugmodel;

import org.eclipse.core.resources.IMarkerDelta;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.PlatformObject;
import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.model.IBreakpoint;
import org.eclipse.debug.core.model.IDebugTarget;
import org.eclipse.debug.core.model.IMemoryBlock;
import org.eclipse.debug.core.model.IProcess;
import org.eclipse.debug.core.model.IThread;
import org.yakindu.sct.simulation.core.ISGraphExecutionFacade;

/**
 * 
 * @author andreas muelder - Initial contribution and API
 * 
 */
public class SCTDebugTarget extends PlatformObject implements IDebugTarget {

	private IProcess process;

	private ILaunch launch;

	private SCTDebugThread thread;

	public SCTDebugTarget(ILaunch launch, ISGraphExecutionFacade facade)
			throws CoreException {
		this.launch = launch;
		thread = new SCTDebugThread(this, facade);
		DebugPlugin.getDefault().getBreakpointManager()
				.addBreakpointListener(this);
	}

	public IProcess getProcess() {
		return process;
	}

	public IThread[] getThreads() throws DebugException {
		return new IThread[] { thread };
	}

	public boolean hasThreads() throws DebugException {
		return true;
	}

	public String getName() throws DebugException {
		return IDebugConstants.DEBUG_TARGET;
	}

	public boolean supportsBreakpoint(IBreakpoint breakpoint) {
		return false;
	}

	public boolean canTerminate() {
		return thread.canTerminate();
	}

	public boolean isTerminated() {
		return thread.isTerminated();
	}

	public void terminate() throws DebugException {

		thread.terminate();
	}

	public boolean canResume() {
		return thread.canResume();
	}

	public boolean canSuspend() {
		return thread.canSuspend();
	}

	public boolean isSuspended() {
		return thread.isSuspended();
	}

	public void resume() throws DebugException {
		thread.resume();
	}

	public void suspend() throws DebugException {
		thread.suspend();
	}

	public void breakpointAdded(IBreakpoint breakpoint) {
	}

	public void breakpointRemoved(IBreakpoint breakpoint, IMarkerDelta delta) {
	}

	public void breakpointChanged(IBreakpoint breakpoint, IMarkerDelta delta) {
	}

	public boolean canDisconnect() {
		return false;
	}

	public void disconnect() throws DebugException {

	}

	public boolean isDisconnected() {
		return false;
	}

	public boolean supportsStorageRetrieval() {
		return false;
	}
	public IMemoryBlock getMemoryBlock(long startAddress, long length)
			throws DebugException {
		return null;
	}

	public ILaunch getLaunch() {
		return launch;
	}

	public String getModelIdentifier() {
		return IDebugConstants.DEBUG_TARGET;
	}

	public IDebugTarget getDebugTarget() {
		return this;
	}
}
