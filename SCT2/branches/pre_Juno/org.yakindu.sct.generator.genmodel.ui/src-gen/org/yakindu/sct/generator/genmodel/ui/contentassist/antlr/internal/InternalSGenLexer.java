package org.yakindu.sct.generator.genmodel.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSGenLexer extends Lexer {
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int RULE_ID=4;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__29=29;
    public static final int T__64=64;
    public static final int T__28=28;
    public static final int T__65=65;
    public static final int T__27=27;
    public static final int T__62=62;
    public static final int T__26=26;
    public static final int T__63=63;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T__61=61;
    public static final int EOF=-1;
    public static final int T__60=60;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int RULE_HEX=5;
    public static final int T__58=58;
    public static final int T__16=16;
    public static final int T__51=51;
    public static final int T__15=15;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__59=59;
    public static final int RULE_INT=6;
    public static final int RULE_DECIMAL=7;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=10;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=8;
    public static final int T__33=33;
    public static final int T__71=71;
    public static final int T__34=34;
    public static final int T__72=72;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__70=70;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=11;
    public static final int T__74=74;
    public static final int T__73=73;

    // delegates
    // delegators

    public InternalSGenLexer() {;} 
    public InternalSGenLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalSGenLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g"; }

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:11:7: ( '=' )
            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:11:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:12:7: ( '+=' )
            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:12:9: '+='
            {
            match("+="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:13:7: ( '||' )
            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:13:9: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:14:7: ( '&&' )
            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:14:9: '&&'
            {
            match("&&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:15:7: ( '::' )
            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:15:9: '::'
            {
            match("::"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:16:7: ( '.' )
            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:16:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:17:7: ( '==' )
            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:17:9: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:18:7: ( '!=' )
            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:18:9: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:19:7: ( '>=' )
            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:19:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:20:7: ( '<=' )
            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:20:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:21:7: ( '>' )
            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:21:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:22:7: ( '<' )
            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:22:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:23:7: ( '->' )
            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:23:9: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:24:7: ( '..' )
            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:24:9: '..'
            {
            match(".."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:25:7: ( '+' )
            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:25:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:26:7: ( '-' )
            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:26:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:27:7: ( '*' )
            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:27:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:28:7: ( '**' )
            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:28:9: '**'
            {
            match("**"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:29:7: ( '/' )
            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:29:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:30:7: ( '%' )
            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:30:9: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:31:7: ( '!' )
            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:31:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:32:7: ( 'val' )
            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:32:9: 'val'
            {
            match("val"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:33:7: ( 'super' )
            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:33:9: 'super'
            {
            match("super"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:34:7: ( 'false' )
            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:34:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:35:7: ( 'GeneratorModel' )
            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:35:9: 'GeneratorModel'
            {
            match("GeneratorModel"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:36:7: ( 'for' )
            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:36:9: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:37:7: ( '{' )
            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:37:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:38:7: ( '}' )
            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:38:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:39:7: ( 'feature' )
            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:39:9: 'feature'
            {
            match("feature"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:40:7: ( 'instanceof' )
            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:40:9: 'instanceof'
            {
            match("instanceof"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:41:7: ( 'as' )
            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:41:9: 'as'
            {
            match("as"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:42:7: ( ',' )
            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:42:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:43:7: ( ')' )
            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:43:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:44:7: ( '[' )
            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:44:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:45:7: ( ']' )
            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:45:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:46:7: ( ';' )
            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:46:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:47:7: ( '(' )
            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:47:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:48:7: ( 'if' )
            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:48:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:49:7: ( 'else' )
            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:49:9: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:50:7: ( 'switch' )
            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:50:9: 'switch'
            {
            match("switch"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:51:7: ( ':' )
            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:51:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:52:7: ( 'default' )
            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:52:9: 'default'
            {
            match("default"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:53:7: ( 'case' )
            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:53:9: 'case'
            {
            match("case"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:54:7: ( 'while' )
            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:54:9: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:55:7: ( 'do' )
            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:55:9: 'do'
            {
            match("do"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:56:7: ( 'new' )
            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:56:9: 'new'
            {
            match("new"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:57:7: ( 'null' )
            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:57:9: 'null'
            {
            match("null"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:58:7: ( 'typeof' )
            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:58:9: 'typeof'
            {
            match("typeof"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:59:7: ( 'throw' )
            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:59:9: 'throw'
            {
            match("throw"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:60:7: ( 'return' )
            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:60:9: 'return'
            {
            match("return"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:61:7: ( 'try' )
            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:61:9: 'try'
            {
            match("try"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:62:7: ( 'finally' )
            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:62:9: 'finally'
            {
            match("finally"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:63:7: ( 'catch' )
            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:63:9: 'catch'
            {
            match("catch"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:64:7: ( '=>' )
            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:64:9: '=>'
            {
            match("=>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:65:7: ( '?' )
            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:65:9: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:66:7: ( 'extends' )
            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:66:9: 'extends'
            {
            match("extends"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:67:7: ( '&' )
            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:67:9: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:68:7: ( '?.' )
            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:68:9: '?.'
            {
            match("?."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:69:7: ( '*.' )
            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:69:9: '*.'
            {
            match("*."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:70:7: ( '|' )
            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:70:9: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:71:7: ( 'var' )
            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:71:9: 'var'
            {
            match("var"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:72:7: ( 'true' )
            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:72:9: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "RULE_HEX"
    public final void mRULE_HEX() throws RecognitionException {
        try {
            int _type = RULE_HEX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:15814:10: ( ( '0x' | '0X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '_' )+ ( '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) ) )? )
            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:15814:12: ( '0x' | '0X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '_' )+ ( '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) ) )?
            {
            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:15814:12: ( '0x' | '0X' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='0') ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1=='x') ) {
                    alt1=1;
                }
                else if ( (LA1_1=='X') ) {
                    alt1=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:15814:13: '0x'
                    {
                    match("0x"); 


                    }
                    break;
                case 2 :
                    // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:15814:18: '0X'
                    {
                    match("0X"); 


                    }
                    break;

            }

            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:15814:24: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '_' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='F')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='f')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='f') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:15814:58: ( '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='#') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:15814:59: '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) )
                    {
                    match('#'); 
                    // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:15814:63: ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) )
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0=='B'||LA3_0=='b') ) {
                        alt3=1;
                    }
                    else if ( (LA3_0=='L'||LA3_0=='l') ) {
                        alt3=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 0, input);

                        throw nvae;
                    }
                    switch (alt3) {
                        case 1 :
                            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:15814:64: ( 'b' | 'B' ) ( 'i' | 'I' )
                            {
                            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}

                            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;
                        case 2 :
                            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:15814:84: ( 'l' | 'L' )
                            {
                            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;

                    }


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_HEX"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:15816:10: ( '0' .. '9' ( '0' .. '9' | '_' )* )
            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:15816:12: '0' .. '9' ( '0' .. '9' | '_' )*
            {
            matchRange('0','9'); 
            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:15816:21: ( '0' .. '9' | '_' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')||LA5_0=='_') ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||input.LA(1)=='_' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_DECIMAL"
    public final void mRULE_DECIMAL() throws RecognitionException {
        try {
            int _type = RULE_DECIMAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:15818:14: ( RULE_INT ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT )? ( ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' ) | ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' ) )? )
            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:15818:16: RULE_INT ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT )? ( ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' ) | ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' ) )?
            {
            mRULE_INT(); 
            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:15818:25: ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='E'||LA7_0=='e') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:15818:26: ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT
                    {
                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:15818:36: ( '+' | '-' )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0=='+'||LA6_0=='-') ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:
                            {
                            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;

                    }

                    mRULE_INT(); 

                    }
                    break;

            }

            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:15818:58: ( ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' ) | ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' ) )?
            int alt8=3;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='B'||LA8_0=='b') ) {
                alt8=1;
            }
            else if ( (LA8_0=='D'||LA8_0=='F'||LA8_0=='L'||LA8_0=='d'||LA8_0=='f'||LA8_0=='l') ) {
                alt8=2;
            }
            switch (alt8) {
                case 1 :
                    // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:15818:59: ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' )
                    {
                    if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='D'||input.LA(1)=='I'||input.LA(1)=='d'||input.LA(1)=='i' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;
                case 2 :
                    // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:15818:87: ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' )
                    {
                    if ( input.LA(1)=='D'||input.LA(1)=='F'||input.LA(1)=='L'||input.LA(1)=='d'||input.LA(1)=='f'||input.LA(1)=='l' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DECIMAL"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:15820:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' | '0' .. '9' )* )
            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:15820:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' | '0' .. '9' )*
            {
            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:15820:11: ( '^' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='^') ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:15820:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( input.LA(1)=='$'||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:15820:44: ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' | '0' .. '9' )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='$'||(LA10_0>='0' && LA10_0<='9')||(LA10_0>='A' && LA10_0<='Z')||LA10_0=='_'||(LA10_0>='a' && LA10_0<='z')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:
            	    {
            	    if ( input.LA(1)=='$'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:15822:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:15822:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:15822:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='\"') ) {
                alt13=1;
            }
            else if ( (LA13_0=='\'') ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:15822:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:15822:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop11:
                    do {
                        int alt11=3;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0=='\\') ) {
                            alt11=1;
                        }
                        else if ( ((LA11_0>='\u0000' && LA11_0<='!')||(LA11_0>='#' && LA11_0<='[')||(LA11_0>=']' && LA11_0<='\uFFFF')) ) {
                            alt11=2;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:15822:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:15822:66: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:15822:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:15822:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop12:
                    do {
                        int alt12=3;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0=='\\') ) {
                            alt12=1;
                        }
                        else if ( ((LA12_0>='\u0000' && LA12_0<='&')||(LA12_0>='(' && LA12_0<='[')||(LA12_0>=']' && LA12_0<='\uFFFF')) ) {
                            alt12=2;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:15822:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:15822:137: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:15824:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:15824:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:15824:24: ( options {greedy=false; } : . )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0=='*') ) {
                    int LA14_1 = input.LA(2);

                    if ( (LA14_1=='/') ) {
                        alt14=2;
                    }
                    else if ( ((LA14_1>='\u0000' && LA14_1<='.')||(LA14_1>='0' && LA14_1<='\uFFFF')) ) {
                        alt14=1;
                    }


                }
                else if ( ((LA14_0>='\u0000' && LA14_0<=')')||(LA14_0>='+' && LA14_0<='\uFFFF')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:15824:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:15826:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:15826:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:15826:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='\u0000' && LA15_0<='\t')||(LA15_0>='\u000B' && LA15_0<='\f')||(LA15_0>='\u000E' && LA15_0<='\uFFFF')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:15826:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:15826:40: ( ( '\\r' )? '\\n' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0=='\n'||LA17_0=='\r') ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:15826:41: ( '\\r' )? '\\n'
                    {
                    // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:15826:41: ( '\\r' )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0=='\r') ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:15826:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:15828:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:15828:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:15828:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>='\t' && LA18_0<='\n')||LA18_0=='\r'||LA18_0==' ') ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt18 >= 1 ) break loop18;
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:15830:16: ( . )
            // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:15830:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:1:8: ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | RULE_HEX | RULE_INT | RULE_DECIMAL | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt19=71;
        alt19 = dfa19.predict(input);
        switch (alt19) {
            case 1 :
                // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:1:10: T__13
                {
                mT__13(); 

                }
                break;
            case 2 :
                // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:1:16: T__14
                {
                mT__14(); 

                }
                break;
            case 3 :
                // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:1:22: T__15
                {
                mT__15(); 

                }
                break;
            case 4 :
                // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:1:28: T__16
                {
                mT__16(); 

                }
                break;
            case 5 :
                // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:1:34: T__17
                {
                mT__17(); 

                }
                break;
            case 6 :
                // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:1:40: T__18
                {
                mT__18(); 

                }
                break;
            case 7 :
                // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:1:46: T__19
                {
                mT__19(); 

                }
                break;
            case 8 :
                // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:1:52: T__20
                {
                mT__20(); 

                }
                break;
            case 9 :
                // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:1:58: T__21
                {
                mT__21(); 

                }
                break;
            case 10 :
                // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:1:64: T__22
                {
                mT__22(); 

                }
                break;
            case 11 :
                // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:1:70: T__23
                {
                mT__23(); 

                }
                break;
            case 12 :
                // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:1:76: T__24
                {
                mT__24(); 

                }
                break;
            case 13 :
                // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:1:82: T__25
                {
                mT__25(); 

                }
                break;
            case 14 :
                // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:1:88: T__26
                {
                mT__26(); 

                }
                break;
            case 15 :
                // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:1:94: T__27
                {
                mT__27(); 

                }
                break;
            case 16 :
                // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:1:100: T__28
                {
                mT__28(); 

                }
                break;
            case 17 :
                // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:1:106: T__29
                {
                mT__29(); 

                }
                break;
            case 18 :
                // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:1:112: T__30
                {
                mT__30(); 

                }
                break;
            case 19 :
                // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:1:118: T__31
                {
                mT__31(); 

                }
                break;
            case 20 :
                // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:1:124: T__32
                {
                mT__32(); 

                }
                break;
            case 21 :
                // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:1:130: T__33
                {
                mT__33(); 

                }
                break;
            case 22 :
                // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:1:136: T__34
                {
                mT__34(); 

                }
                break;
            case 23 :
                // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:1:142: T__35
                {
                mT__35(); 

                }
                break;
            case 24 :
                // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:1:148: T__36
                {
                mT__36(); 

                }
                break;
            case 25 :
                // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:1:154: T__37
                {
                mT__37(); 

                }
                break;
            case 26 :
                // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:1:160: T__38
                {
                mT__38(); 

                }
                break;
            case 27 :
                // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:1:166: T__39
                {
                mT__39(); 

                }
                break;
            case 28 :
                // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:1:172: T__40
                {
                mT__40(); 

                }
                break;
            case 29 :
                // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:1:178: T__41
                {
                mT__41(); 

                }
                break;
            case 30 :
                // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:1:184: T__42
                {
                mT__42(); 

                }
                break;
            case 31 :
                // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:1:190: T__43
                {
                mT__43(); 

                }
                break;
            case 32 :
                // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:1:196: T__44
                {
                mT__44(); 

                }
                break;
            case 33 :
                // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:1:202: T__45
                {
                mT__45(); 

                }
                break;
            case 34 :
                // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:1:208: T__46
                {
                mT__46(); 

                }
                break;
            case 35 :
                // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:1:214: T__47
                {
                mT__47(); 

                }
                break;
            case 36 :
                // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:1:220: T__48
                {
                mT__48(); 

                }
                break;
            case 37 :
                // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:1:226: T__49
                {
                mT__49(); 

                }
                break;
            case 38 :
                // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:1:232: T__50
                {
                mT__50(); 

                }
                break;
            case 39 :
                // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:1:238: T__51
                {
                mT__51(); 

                }
                break;
            case 40 :
                // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:1:244: T__52
                {
                mT__52(); 

                }
                break;
            case 41 :
                // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:1:250: T__53
                {
                mT__53(); 

                }
                break;
            case 42 :
                // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:1:256: T__54
                {
                mT__54(); 

                }
                break;
            case 43 :
                // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:1:262: T__55
                {
                mT__55(); 

                }
                break;
            case 44 :
                // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:1:268: T__56
                {
                mT__56(); 

                }
                break;
            case 45 :
                // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:1:274: T__57
                {
                mT__57(); 

                }
                break;
            case 46 :
                // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:1:280: T__58
                {
                mT__58(); 

                }
                break;
            case 47 :
                // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:1:286: T__59
                {
                mT__59(); 

                }
                break;
            case 48 :
                // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:1:292: T__60
                {
                mT__60(); 

                }
                break;
            case 49 :
                // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:1:298: T__61
                {
                mT__61(); 

                }
                break;
            case 50 :
                // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:1:304: T__62
                {
                mT__62(); 

                }
                break;
            case 51 :
                // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:1:310: T__63
                {
                mT__63(); 

                }
                break;
            case 52 :
                // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:1:316: T__64
                {
                mT__64(); 

                }
                break;
            case 53 :
                // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:1:322: T__65
                {
                mT__65(); 

                }
                break;
            case 54 :
                // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:1:328: T__66
                {
                mT__66(); 

                }
                break;
            case 55 :
                // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:1:334: T__67
                {
                mT__67(); 

                }
                break;
            case 56 :
                // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:1:340: T__68
                {
                mT__68(); 

                }
                break;
            case 57 :
                // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:1:346: T__69
                {
                mT__69(); 

                }
                break;
            case 58 :
                // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:1:352: T__70
                {
                mT__70(); 

                }
                break;
            case 59 :
                // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:1:358: T__71
                {
                mT__71(); 

                }
                break;
            case 60 :
                // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:1:364: T__72
                {
                mT__72(); 

                }
                break;
            case 61 :
                // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:1:370: T__73
                {
                mT__73(); 

                }
                break;
            case 62 :
                // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:1:376: T__74
                {
                mT__74(); 

                }
                break;
            case 63 :
                // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:1:382: RULE_HEX
                {
                mRULE_HEX(); 

                }
                break;
            case 64 :
                // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:1:391: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 65 :
                // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:1:400: RULE_DECIMAL
                {
                mRULE_DECIMAL(); 

                }
                break;
            case 66 :
                // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:1:413: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 67 :
                // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:1:421: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 68 :
                // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:1:433: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 69 :
                // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:1:449: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 70 :
                // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:1:465: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 71 :
                // ../org.yakindu.sct.generator.genmodel.ui/src-gen/org/yakindu/sct/generator/genmodel/ui/contentassist/antlr/internal/InternalSGen.g:1:473: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA19 dfa19 = new DFA19(this);
    static final String DFA19_eotS =
        "\1\uffff\1\56\1\60\1\62\1\64\1\66\1\70\1\72\1\74\1\76\1\100\1\103"+
        "\1\106\1\uffff\4\111\2\uffff\2\111\6\uffff\7\111\1\151\2\154\1\53"+
        "\1\uffff\2\53\36\uffff\1\111\1\uffff\7\111\2\uffff\1\111\1\172\1"+
        "\173\6\uffff\3\111\1\177\10\111\3\uffff\1\154\4\uffff\1\u008a\1"+
        "\u008b\3\111\1\u008f\4\111\2\uffff\3\111\1\uffff\3\111\1\u009a\3"+
        "\111\1\u009e\2\111\2\uffff\3\111\1\uffff\4\111\1\u00a8\2\111\1\u00ab"+
        "\2\111\1\uffff\1\u00ae\2\111\1\uffff\1\u00b1\1\111\1\u00b3\1\111"+
        "\1\u00b5\4\111\1\uffff\2\111\1\uffff\1\u00bc\1\u00bd\1\uffff\1\111"+
        "\1\u00bf\1\uffff\1\111\1\uffff\1\u00c1\1\uffff\6\111\2\uffff\1\u00c8"+
        "\1\uffff\1\u00c9\1\uffff\1\u00ca\1\u00cb\2\111\1\u00ce\1\u00cf\4"+
        "\uffff\2\111\2\uffff\3\111\1\u00d5\1\111\1\uffff\2\111\1\u00d9\1"+
        "\uffff";
    static final String DFA19_eofS =
        "\u00da\uffff";
    static final String DFA19_minS =
        "\1\0\2\75\1\174\1\46\1\72\1\56\3\75\1\76\2\52\1\uffff\1\141\1\165"+
        "\1\141\1\145\2\uffff\1\146\1\163\6\uffff\1\154\1\145\1\141\1\150"+
        "\1\145\1\150\1\145\1\56\2\60\1\44\1\uffff\2\0\36\uffff\1\154\1\uffff"+
        "\1\160\1\151\1\154\1\162\1\141\2\156\2\uffff\1\163\2\44\6\uffff"+
        "\1\163\1\164\1\146\1\44\1\163\1\151\1\167\1\154\1\160\1\162\1\165"+
        "\1\164\3\uffff\1\60\4\uffff\2\44\1\145\1\164\1\163\1\44\1\164\1"+
        "\141\1\145\1\164\2\uffff\2\145\1\141\1\uffff\1\145\1\143\1\154\1"+
        "\44\1\154\1\145\1\157\1\44\1\145\1\165\2\uffff\1\162\1\143\1\145"+
        "\1\uffff\1\165\1\154\1\162\1\141\1\44\1\156\1\165\1\44\1\150\1\145"+
        "\1\uffff\1\44\1\157\1\167\1\uffff\1\44\1\162\1\44\1\150\1\44\1\162"+
        "\1\154\1\141\1\156\1\uffff\1\144\1\154\1\uffff\2\44\1\uffff\1\146"+
        "\1\44\1\uffff\1\156\1\uffff\1\44\1\uffff\1\145\1\171\1\164\1\143"+
        "\1\163\1\164\2\uffff\1\44\1\uffff\1\44\1\uffff\2\44\1\157\1\145"+
        "\2\44\4\uffff\1\162\1\157\2\uffff\1\115\1\146\1\157\1\44\1\144\1"+
        "\uffff\1\145\1\154\1\44\1\uffff";
    static final String DFA19_maxS =
        "\1\uffff\1\76\1\75\1\174\1\46\1\72\1\56\3\75\1\76\1\56\1\57\1\uffff"+
        "\1\141\1\167\1\157\1\145\2\uffff\1\156\1\163\6\uffff\1\170\1\157"+
        "\1\141\1\150\1\165\1\171\1\145\1\56\1\170\1\154\1\172\1\uffff\2"+
        "\uffff\36\uffff\1\162\1\uffff\1\160\1\151\1\154\1\162\1\141\2\156"+
        "\2\uffff\1\163\2\172\6\uffff\1\163\1\164\1\146\1\172\1\164\1\151"+
        "\1\167\1\154\1\160\1\162\1\171\1\164\3\uffff\1\154\4\uffff\2\172"+
        "\1\145\1\164\1\163\1\172\1\164\1\141\1\145\1\164\2\uffff\2\145\1"+
        "\141\1\uffff\1\145\1\143\1\154\1\172\1\154\1\145\1\157\1\172\1\145"+
        "\1\165\2\uffff\1\162\1\143\1\145\1\uffff\1\165\1\154\1\162\1\141"+
        "\1\172\1\156\1\165\1\172\1\150\1\145\1\uffff\1\172\1\157\1\167\1"+
        "\uffff\1\172\1\162\1\172\1\150\1\172\1\162\1\154\1\141\1\156\1\uffff"+
        "\1\144\1\154\1\uffff\2\172\1\uffff\1\146\1\172\1\uffff\1\156\1\uffff"+
        "\1\172\1\uffff\1\145\1\171\1\164\1\143\1\163\1\164\2\uffff\1\172"+
        "\1\uffff\1\172\1\uffff\2\172\1\157\1\145\2\172\4\uffff\1\162\1\157"+
        "\2\uffff\1\115\1\146\1\157\1\172\1\144\1\uffff\1\145\1\154\1\172"+
        "\1\uffff";
    static final String DFA19_acceptS =
        "\15\uffff\1\24\4\uffff\1\33\1\34\2\uffff\1\40\1\41\1\42\1\43\1\44"+
        "\1\45\13\uffff\1\102\2\uffff\1\106\1\107\1\7\1\66\1\1\1\2\1\17\1"+
        "\3\1\74\1\4\1\71\1\5\1\51\1\16\1\6\1\10\1\25\1\11\1\13\1\12\1\14"+
        "\1\15\1\20\1\22\1\73\1\21\1\104\1\105\1\23\1\24\1\uffff\1\102\7"+
        "\uffff\1\33\1\34\3\uffff\1\40\1\41\1\42\1\43\1\44\1\45\14\uffff"+
        "\1\72\1\67\1\77\1\uffff\1\100\1\101\1\103\1\106\12\uffff\1\46\1"+
        "\37\3\uffff\1\55\12\uffff\1\26\1\75\3\uffff\1\32\12\uffff\1\56\3"+
        "\uffff\1\63\11\uffff\1\47\2\uffff\1\53\2\uffff\1\57\2\uffff\1\76"+
        "\1\uffff\1\27\1\uffff\1\30\6\uffff\1\65\1\54\1\uffff\1\61\1\uffff"+
        "\1\50\6\uffff\1\60\1\62\1\35\1\64\2\uffff\1\70\1\52\5\uffff\1\36"+
        "\3\uffff\1\31";
    static final String DFA19_specialS =
        "\1\2\47\uffff\1\0\1\1\u00b0\uffff}>";
    static final String[] DFA19_transitionS = {
            "\11\53\2\52\2\53\1\52\22\53\1\52\1\7\1\50\1\53\1\47\1\15\1\4"+
            "\1\51\1\33\1\27\1\13\1\2\1\26\1\12\1\6\1\14\1\44\11\45\1\5\1"+
            "\32\1\11\1\1\1\10\1\43\1\53\6\47\1\21\23\47\1\30\1\53\1\31\1"+
            "\46\1\47\1\53\1\25\1\47\1\36\1\35\1\34\1\20\2\47\1\24\4\47\1"+
            "\40\3\47\1\42\1\17\1\41\1\47\1\16\1\37\3\47\1\22\1\3\1\23\uff82"+
            "\53",
            "\1\54\1\55",
            "\1\57",
            "\1\61",
            "\1\63",
            "\1\65",
            "\1\67",
            "\1\71",
            "\1\73",
            "\1\75",
            "\1\77",
            "\1\101\3\uffff\1\102",
            "\1\104\4\uffff\1\105",
            "",
            "\1\110",
            "\1\112\1\uffff\1\113",
            "\1\114\3\uffff\1\116\3\uffff\1\117\5\uffff\1\115",
            "\1\120",
            "",
            "",
            "\1\124\7\uffff\1\123",
            "\1\125",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\134\13\uffff\1\135",
            "\1\136\11\uffff\1\137",
            "\1\140",
            "\1\141",
            "\1\142\17\uffff\1\143",
            "\1\145\11\uffff\1\146\6\uffff\1\144",
            "\1\147",
            "\1\150",
            "\12\153\10\uffff\1\155\1\uffff\3\155\5\uffff\1\155\13\uffff"+
            "\1\152\6\uffff\1\153\2\uffff\1\155\1\uffff\3\155\5\uffff\1\155"+
            "\13\uffff\1\152",
            "\12\153\10\uffff\1\155\1\uffff\3\155\5\uffff\1\155\22\uffff"+
            "\1\153\2\uffff\1\155\1\uffff\3\155\5\uffff\1\155",
            "\1\111\34\uffff\32\111\4\uffff\1\111\1\uffff\32\111",
            "",
            "\0\156",
            "\0\156",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\160\5\uffff\1\161",
            "",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "",
            "",
            "\1\171",
            "\1\111\13\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff"+
            "\32\111",
            "\1\111\13\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff"+
            "\32\111",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\111\13\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff"+
            "\32\111",
            "\1\u0080\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0088\3\uffff\1\u0087",
            "\1\u0089",
            "",
            "",
            "",
            "\12\153\10\uffff\1\155\1\uffff\3\155\5\uffff\1\155\22\uffff"+
            "\1\153\2\uffff\1\155\1\uffff\3\155\5\uffff\1\155",
            "",
            "",
            "",
            "",
            "\1\111\13\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff"+
            "\32\111",
            "\1\111\13\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff"+
            "\32\111",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\111\13\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff"+
            "\32\111",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "",
            "",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\111\13\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff"+
            "\32\111",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\111\13\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff"+
            "\32\111",
            "\1\u009f",
            "\1\u00a0",
            "",
            "",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\111\13\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff"+
            "\32\111",
            "\1\u00a9",
            "\1\u00aa",
            "\1\111\13\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff"+
            "\32\111",
            "\1\u00ac",
            "\1\u00ad",
            "",
            "\1\111\13\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff"+
            "\32\111",
            "\1\u00af",
            "\1\u00b0",
            "",
            "\1\111\13\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff"+
            "\32\111",
            "\1\u00b2",
            "\1\111\13\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff"+
            "\32\111",
            "\1\u00b4",
            "\1\111\13\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff"+
            "\32\111",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "",
            "\1\u00ba",
            "\1\u00bb",
            "",
            "\1\111\13\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff"+
            "\32\111",
            "\1\111\13\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff"+
            "\32\111",
            "",
            "\1\u00be",
            "\1\111\13\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff"+
            "\32\111",
            "",
            "\1\u00c0",
            "",
            "\1\111\13\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff"+
            "\32\111",
            "",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "",
            "",
            "\1\111\13\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff"+
            "\32\111",
            "",
            "\1\111\13\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff"+
            "\32\111",
            "",
            "\1\111\13\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff"+
            "\32\111",
            "\1\111\13\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff"+
            "\32\111",
            "\1\u00cc",
            "\1\u00cd",
            "\1\111\13\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff"+
            "\32\111",
            "\1\111\13\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff"+
            "\32\111",
            "",
            "",
            "",
            "",
            "\1\u00d0",
            "\1\u00d1",
            "",
            "",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "\1\111\13\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff"+
            "\32\111",
            "\1\u00d6",
            "",
            "\1\u00d7",
            "\1\u00d8",
            "\1\111\13\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff"+
            "\32\111",
            ""
    };

    static final short[] DFA19_eot = DFA.unpackEncodedString(DFA19_eotS);
    static final short[] DFA19_eof = DFA.unpackEncodedString(DFA19_eofS);
    static final char[] DFA19_min = DFA.unpackEncodedStringToUnsignedChars(DFA19_minS);
    static final char[] DFA19_max = DFA.unpackEncodedStringToUnsignedChars(DFA19_maxS);
    static final short[] DFA19_accept = DFA.unpackEncodedString(DFA19_acceptS);
    static final short[] DFA19_special = DFA.unpackEncodedString(DFA19_specialS);
    static final short[][] DFA19_transition;

    static {
        int numStates = DFA19_transitionS.length;
        DFA19_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA19_transition[i] = DFA.unpackEncodedString(DFA19_transitionS[i]);
        }
    }

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = DFA19_eot;
            this.eof = DFA19_eof;
            this.min = DFA19_min;
            this.max = DFA19_max;
            this.accept = DFA19_accept;
            this.special = DFA19_special;
            this.transition = DFA19_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | RULE_HEX | RULE_INT | RULE_DECIMAL | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA19_40 = input.LA(1);

                        s = -1;
                        if ( ((LA19_40>='\u0000' && LA19_40<='\uFFFF')) ) {s = 110;}

                        else s = 43;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA19_41 = input.LA(1);

                        s = -1;
                        if ( ((LA19_41>='\u0000' && LA19_41<='\uFFFF')) ) {s = 110;}

                        else s = 43;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA19_0 = input.LA(1);

                        s = -1;
                        if ( (LA19_0=='=') ) {s = 1;}

                        else if ( (LA19_0=='+') ) {s = 2;}

                        else if ( (LA19_0=='|') ) {s = 3;}

                        else if ( (LA19_0=='&') ) {s = 4;}

                        else if ( (LA19_0==':') ) {s = 5;}

                        else if ( (LA19_0=='.') ) {s = 6;}

                        else if ( (LA19_0=='!') ) {s = 7;}

                        else if ( (LA19_0=='>') ) {s = 8;}

                        else if ( (LA19_0=='<') ) {s = 9;}

                        else if ( (LA19_0=='-') ) {s = 10;}

                        else if ( (LA19_0=='*') ) {s = 11;}

                        else if ( (LA19_0=='/') ) {s = 12;}

                        else if ( (LA19_0=='%') ) {s = 13;}

                        else if ( (LA19_0=='v') ) {s = 14;}

                        else if ( (LA19_0=='s') ) {s = 15;}

                        else if ( (LA19_0=='f') ) {s = 16;}

                        else if ( (LA19_0=='G') ) {s = 17;}

                        else if ( (LA19_0=='{') ) {s = 18;}

                        else if ( (LA19_0=='}') ) {s = 19;}

                        else if ( (LA19_0=='i') ) {s = 20;}

                        else if ( (LA19_0=='a') ) {s = 21;}

                        else if ( (LA19_0==',') ) {s = 22;}

                        else if ( (LA19_0==')') ) {s = 23;}

                        else if ( (LA19_0=='[') ) {s = 24;}

                        else if ( (LA19_0==']') ) {s = 25;}

                        else if ( (LA19_0==';') ) {s = 26;}

                        else if ( (LA19_0=='(') ) {s = 27;}

                        else if ( (LA19_0=='e') ) {s = 28;}

                        else if ( (LA19_0=='d') ) {s = 29;}

                        else if ( (LA19_0=='c') ) {s = 30;}

                        else if ( (LA19_0=='w') ) {s = 31;}

                        else if ( (LA19_0=='n') ) {s = 32;}

                        else if ( (LA19_0=='t') ) {s = 33;}

                        else if ( (LA19_0=='r') ) {s = 34;}

                        else if ( (LA19_0=='?') ) {s = 35;}

                        else if ( (LA19_0=='0') ) {s = 36;}

                        else if ( ((LA19_0>='1' && LA19_0<='9')) ) {s = 37;}

                        else if ( (LA19_0=='^') ) {s = 38;}

                        else if ( (LA19_0=='$'||(LA19_0>='A' && LA19_0<='F')||(LA19_0>='H' && LA19_0<='Z')||LA19_0=='_'||LA19_0=='b'||(LA19_0>='g' && LA19_0<='h')||(LA19_0>='j' && LA19_0<='m')||(LA19_0>='o' && LA19_0<='q')||LA19_0=='u'||(LA19_0>='x' && LA19_0<='z')) ) {s = 39;}

                        else if ( (LA19_0=='\"') ) {s = 40;}

                        else if ( (LA19_0=='\'') ) {s = 41;}

                        else if ( ((LA19_0>='\t' && LA19_0<='\n')||LA19_0=='\r'||LA19_0==' ') ) {s = 42;}

                        else if ( ((LA19_0>='\u0000' && LA19_0<='\b')||(LA19_0>='\u000B' && LA19_0<='\f')||(LA19_0>='\u000E' && LA19_0<='\u001F')||LA19_0=='#'||LA19_0=='@'||LA19_0=='\\'||LA19_0=='`'||(LA19_0>='~' && LA19_0<='\uFFFF')) ) {s = 43;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 19, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}