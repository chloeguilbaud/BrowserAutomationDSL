package org.xtext.project.browserautomationdsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDomainmodelLexer extends Lexer {
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_ID=7;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_VARTYPE=4;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators

    public InternalDomainmodelLexer() {;} 
    public InternalDomainmodelLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalDomainmodelLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalDomainmodel.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomainmodel.g:11:7: ( 'procedure' )
            // InternalDomainmodel.g:11:9: 'procedure'
            {
            match("procedure"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomainmodel.g:12:7: ( 'with' )
            // InternalDomainmodel.g:12:9: 'with'
            {
            match("with"); 


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
            // InternalDomainmodel.g:13:7: ( 'open' )
            // InternalDomainmodel.g:13:9: 'open'
            {
            match("open"); 


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
            // InternalDomainmodel.g:14:7: ( 'FIREFOX' )
            // InternalDomainmodel.g:14:9: 'FIREFOX'
            {
            match("FIREFOX"); 


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
            // InternalDomainmodel.g:15:7: ( 'CHROME' )
            // InternalDomainmodel.g:15:9: 'CHROME'
            {
            match("CHROME"); 


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
            // InternalDomainmodel.g:16:7: ( 'go to' )
            // InternalDomainmodel.g:16:9: 'go to'
            {
            match("go to"); 


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
            // InternalDomainmodel.g:17:7: ( 'given' )
            // InternalDomainmodel.g:17:9: 'given'
            {
            match("given"); 


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
            // InternalDomainmodel.g:18:7: ( 'click' )
            // InternalDomainmodel.g:18:9: 'click'
            {
            match("click"); 


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
            // InternalDomainmodel.g:19:7: ( 'on' )
            // InternalDomainmodel.g:19:9: 'on'
            {
            match("on"); 


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
            // InternalDomainmodel.g:20:7: ( 'BUTTON' )
            // InternalDomainmodel.g:20:9: 'BUTTON'
            {
            match("BUTTON"); 


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
            // InternalDomainmodel.g:21:7: ( 'LINK' )
            // InternalDomainmodel.g:21:9: 'LINK'
            {
            match("LINK"); 


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
            // InternalDomainmodel.g:22:7: ( 'IMAGE' )
            // InternalDomainmodel.g:22:9: 'IMAGE'
            {
            match("IMAGE"); 


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
            // InternalDomainmodel.g:23:7: ( 'TEXT' )
            // InternalDomainmodel.g:23:9: 'TEXT'
            {
            match("TEXT"); 


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
            // InternalDomainmodel.g:24:7: ( 'fill' )
            // InternalDomainmodel.g:24:9: 'fill'
            {
            match("fill"); 


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
            // InternalDomainmodel.g:25:7: ( 'TEXTFIELD' )
            // InternalDomainmodel.g:25:9: 'TEXTFIELD'
            {
            match("TEXTFIELD"); 


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
            // InternalDomainmodel.g:26:7: ( 'SEARCHFIELD' )
            // InternalDomainmodel.g:26:9: 'SEARCHFIELD'
            {
            match("SEARCHFIELD"); 


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
            // InternalDomainmodel.g:27:7: ( 'saved' )
            // InternalDomainmodel.g:27:9: 'saved'
            {
            match("saved"); 


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
            // InternalDomainmodel.g:28:7: ( 'check' )
            // InternalDomainmodel.g:28:9: 'check'
            {
            match("check"); 


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
            // InternalDomainmodel.g:29:7: ( 'all' )
            // InternalDomainmodel.g:29:9: 'all'
            {
            match("all"); 


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
            // InternalDomainmodel.g:30:7: ( 'CHECKBOX' )
            // InternalDomainmodel.g:30:9: 'CHECKBOX'
            {
            match("CHECKBOX"); 


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
            // InternalDomainmodel.g:31:7: ( 'uncheck' )
            // InternalDomainmodel.g:31:9: 'uncheck'
            {
            match("uncheck"); 


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
            // InternalDomainmodel.g:32:7: ( 'select' )
            // InternalDomainmodel.g:32:9: 'select'
            {
            match("select"); 


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
            // InternalDomainmodel.g:33:7: ( 'in' )
            // InternalDomainmodel.g:33:9: 'in'
            {
            match("in"); 


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
            // InternalDomainmodel.g:34:7: ( 'COMBOBOX' )
            // InternalDomainmodel.g:34:9: 'COMBOBOX'
            {
            match("COMBOBOX"); 


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
            // InternalDomainmodel.g:35:7: ( 'read' )
            // InternalDomainmodel.g:35:9: 'read'
            {
            match("read"); 


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
            // InternalDomainmodel.g:36:7: ( 'url' )
            // InternalDomainmodel.g:36:9: 'url'
            {
            match("url"); 


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
            // InternalDomainmodel.g:37:7: ( 'from' )
            // InternalDomainmodel.g:37:9: 'from'
            {
            match("from"); 


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
            // InternalDomainmodel.g:38:7: ( 'identified' )
            // InternalDomainmodel.g:38:9: 'identified'
            {
            match("identified"); 


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
            // InternalDomainmodel.g:39:7: ( 'by' )
            // InternalDomainmodel.g:39:9: 'by'
            {
            match("by"); 


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
            // InternalDomainmodel.g:40:7: ( 'LABEL' )
            // InternalDomainmodel.g:40:9: 'LABEL'
            {
            match("LABEL"); 


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
            // InternalDomainmodel.g:41:7: ( 'CLASS' )
            // InternalDomainmodel.g:41:9: 'CLASS'
            {
            match("CLASS"); 


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
            // InternalDomainmodel.g:42:7: ( 'ID' )
            // InternalDomainmodel.g:42:9: 'ID'
            {
            match("ID"); 


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
            // InternalDomainmodel.g:43:7: ( 'ALT' )
            // InternalDomainmodel.g:43:9: 'ALT'
            {
            match("ALT"); 


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
            // InternalDomainmodel.g:44:7: ( 'count' )
            // InternalDomainmodel.g:44:9: 'count'
            {
            match("count"); 


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
            // InternalDomainmodel.g:45:7: ( 'ELEMENT' )
            // InternalDomainmodel.g:45:9: 'ELEMENT'
            {
            match("ELEMENT"); 


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
            // InternalDomainmodel.g:46:7: ( 'and' )
            // InternalDomainmodel.g:46:9: 'and'
            {
            match("and"); 


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
            // InternalDomainmodel.g:47:7: ( 'save' )
            // InternalDomainmodel.g:47:9: 'save'
            {
            match("save"); 


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
            // InternalDomainmodel.g:48:7: ( 'verify' )
            // InternalDomainmodel.g:48:9: 'verify'
            {
            match("verify"); 


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
            // InternalDomainmodel.g:49:7: ( 'that' )
            // InternalDomainmodel.g:49:9: 'that'
            {
            match("that"); 


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
            // InternalDomainmodel.g:50:7: ( 'PAGE' )
            // InternalDomainmodel.g:50:9: 'PAGE'
            {
            match("PAGE"); 


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
            // InternalDomainmodel.g:51:7: ( 'contains' )
            // InternalDomainmodel.g:51:9: 'contains'
            {
            match("contains"); 


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
            // InternalDomainmodel.g:52:7: ( 'equals' )
            // InternalDomainmodel.g:52:9: 'equals'
            {
            match("equals"); 


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
            // InternalDomainmodel.g:53:7: ( 'play' )
            // InternalDomainmodel.g:53:9: 'play'
            {
            match("play"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "RULE_VARTYPE"
    public final void mRULE_VARTYPE() throws RecognitionException {
        try {
            int _type = RULE_VARTYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomainmodel.g:1203:14: ( ( 'A' .. 'Z' | 'a' .. 'z' | RULE_INT | '_' | '-' )* )
            // InternalDomainmodel.g:1203:16: ( 'A' .. 'Z' | 'a' .. 'z' | RULE_INT | '_' | '-' )*
            {
            // InternalDomainmodel.g:1203:16: ( 'A' .. 'Z' | 'a' .. 'z' | RULE_INT | '_' | '-' )*
            loop1:
            do {
                int alt1=6;
                switch ( input.LA(1) ) {
                case 'A':
                case 'B':
                case 'C':
                case 'D':
                case 'E':
                case 'F':
                case 'G':
                case 'H':
                case 'I':
                case 'J':
                case 'K':
                case 'L':
                case 'M':
                case 'N':
                case 'O':
                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                case 'T':
                case 'U':
                case 'V':
                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                    {
                    alt1=1;
                    }
                    break;
                case 'a':
                case 'b':
                case 'c':
                case 'd':
                case 'e':
                case 'f':
                case 'g':
                case 'h':
                case 'i':
                case 'j':
                case 'k':
                case 'l':
                case 'm':
                case 'n':
                case 'o':
                case 'p':
                case 'q':
                case 'r':
                case 's':
                case 't':
                case 'u':
                case 'v':
                case 'w':
                case 'x':
                case 'y':
                case 'z':
                    {
                    alt1=2;
                    }
                    break;
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    {
                    alt1=3;
                    }
                    break;
                case '_':
                    {
                    alt1=4;
                    }
                    break;
                case '-':
                    {
                    alt1=5;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // InternalDomainmodel.g:1203:17: 'A' .. 'Z'
            	    {
            	    matchRange('A','Z'); 

            	    }
            	    break;
            	case 2 :
            	    // InternalDomainmodel.g:1203:26: 'a' .. 'z'
            	    {
            	    matchRange('a','z'); 

            	    }
            	    break;
            	case 3 :
            	    // InternalDomainmodel.g:1203:35: RULE_INT
            	    {
            	    mRULE_INT(); 

            	    }
            	    break;
            	case 4 :
            	    // InternalDomainmodel.g:1203:44: '_'
            	    {
            	    match('_'); 

            	    }
            	    break;
            	case 5 :
            	    // InternalDomainmodel.g:1203:48: '-'
            	    {
            	    match('-'); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_VARTYPE"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomainmodel.g:1205:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalDomainmodel.g:1205:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalDomainmodel.g:1205:11: ( '^' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='^') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalDomainmodel.g:1205:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalDomainmodel.g:1205:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalDomainmodel.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop3;
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

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            // InternalDomainmodel.g:1207:19: ( ( '0' .. '9' )+ )
            // InternalDomainmodel.g:1207:21: ( '0' .. '9' )+
            {
            // InternalDomainmodel.g:1207:21: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalDomainmodel.g:1207:22: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomainmodel.g:1209:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalDomainmodel.g:1209:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalDomainmodel.g:1209:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\"') ) {
                alt7=1;
            }
            else if ( (LA7_0=='\'') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalDomainmodel.g:1209:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalDomainmodel.g:1209:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='!')||(LA5_0>='#' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalDomainmodel.g:1209:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalDomainmodel.g:1209:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop5;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalDomainmodel.g:1209:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalDomainmodel.g:1209:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='&')||(LA6_0>='(' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalDomainmodel.g:1209:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalDomainmodel.g:1209:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop6;
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
            // InternalDomainmodel.g:1211:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalDomainmodel.g:1211:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalDomainmodel.g:1211:24: ( options {greedy=false; } : . )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='*') ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1=='/') ) {
                        alt8=2;
                    }
                    else if ( ((LA8_1>='\u0000' && LA8_1<='.')||(LA8_1>='0' && LA8_1<='\uFFFF')) ) {
                        alt8=1;
                    }


                }
                else if ( ((LA8_0>='\u0000' && LA8_0<=')')||(LA8_0>='+' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalDomainmodel.g:1211:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop8;
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
            // InternalDomainmodel.g:1213:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalDomainmodel.g:1213:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalDomainmodel.g:1213:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalDomainmodel.g:1213:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop9;
                }
            } while (true);

            // InternalDomainmodel.g:1213:40: ( ( '\\r' )? '\\n' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\n'||LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalDomainmodel.g:1213:41: ( '\\r' )? '\\n'
                    {
                    // InternalDomainmodel.g:1213:41: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalDomainmodel.g:1213:41: '\\r'
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
            // InternalDomainmodel.g:1215:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalDomainmodel.g:1215:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalDomainmodel.g:1215:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalDomainmodel.g:
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
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
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
            // InternalDomainmodel.g:1217:16: ( . )
            // InternalDomainmodel.g:1217:18: .
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
        // InternalDomainmodel.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | RULE_VARTYPE | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt13=50;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // InternalDomainmodel.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // InternalDomainmodel.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // InternalDomainmodel.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // InternalDomainmodel.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // InternalDomainmodel.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // InternalDomainmodel.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // InternalDomainmodel.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // InternalDomainmodel.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // InternalDomainmodel.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // InternalDomainmodel.g:1:64: T__21
                {
                mT__21(); 

                }
                break;
            case 11 :
                // InternalDomainmodel.g:1:70: T__22
                {
                mT__22(); 

                }
                break;
            case 12 :
                // InternalDomainmodel.g:1:76: T__23
                {
                mT__23(); 

                }
                break;
            case 13 :
                // InternalDomainmodel.g:1:82: T__24
                {
                mT__24(); 

                }
                break;
            case 14 :
                // InternalDomainmodel.g:1:88: T__25
                {
                mT__25(); 

                }
                break;
            case 15 :
                // InternalDomainmodel.g:1:94: T__26
                {
                mT__26(); 

                }
                break;
            case 16 :
                // InternalDomainmodel.g:1:100: T__27
                {
                mT__27(); 

                }
                break;
            case 17 :
                // InternalDomainmodel.g:1:106: T__28
                {
                mT__28(); 

                }
                break;
            case 18 :
                // InternalDomainmodel.g:1:112: T__29
                {
                mT__29(); 

                }
                break;
            case 19 :
                // InternalDomainmodel.g:1:118: T__30
                {
                mT__30(); 

                }
                break;
            case 20 :
                // InternalDomainmodel.g:1:124: T__31
                {
                mT__31(); 

                }
                break;
            case 21 :
                // InternalDomainmodel.g:1:130: T__32
                {
                mT__32(); 

                }
                break;
            case 22 :
                // InternalDomainmodel.g:1:136: T__33
                {
                mT__33(); 

                }
                break;
            case 23 :
                // InternalDomainmodel.g:1:142: T__34
                {
                mT__34(); 

                }
                break;
            case 24 :
                // InternalDomainmodel.g:1:148: T__35
                {
                mT__35(); 

                }
                break;
            case 25 :
                // InternalDomainmodel.g:1:154: T__36
                {
                mT__36(); 

                }
                break;
            case 26 :
                // InternalDomainmodel.g:1:160: T__37
                {
                mT__37(); 

                }
                break;
            case 27 :
                // InternalDomainmodel.g:1:166: T__38
                {
                mT__38(); 

                }
                break;
            case 28 :
                // InternalDomainmodel.g:1:172: T__39
                {
                mT__39(); 

                }
                break;
            case 29 :
                // InternalDomainmodel.g:1:178: T__40
                {
                mT__40(); 

                }
                break;
            case 30 :
                // InternalDomainmodel.g:1:184: T__41
                {
                mT__41(); 

                }
                break;
            case 31 :
                // InternalDomainmodel.g:1:190: T__42
                {
                mT__42(); 

                }
                break;
            case 32 :
                // InternalDomainmodel.g:1:196: T__43
                {
                mT__43(); 

                }
                break;
            case 33 :
                // InternalDomainmodel.g:1:202: T__44
                {
                mT__44(); 

                }
                break;
            case 34 :
                // InternalDomainmodel.g:1:208: T__45
                {
                mT__45(); 

                }
                break;
            case 35 :
                // InternalDomainmodel.g:1:214: T__46
                {
                mT__46(); 

                }
                break;
            case 36 :
                // InternalDomainmodel.g:1:220: T__47
                {
                mT__47(); 

                }
                break;
            case 37 :
                // InternalDomainmodel.g:1:226: T__48
                {
                mT__48(); 

                }
                break;
            case 38 :
                // InternalDomainmodel.g:1:232: T__49
                {
                mT__49(); 

                }
                break;
            case 39 :
                // InternalDomainmodel.g:1:238: T__50
                {
                mT__50(); 

                }
                break;
            case 40 :
                // InternalDomainmodel.g:1:244: T__51
                {
                mT__51(); 

                }
                break;
            case 41 :
                // InternalDomainmodel.g:1:250: T__52
                {
                mT__52(); 

                }
                break;
            case 42 :
                // InternalDomainmodel.g:1:256: T__53
                {
                mT__53(); 

                }
                break;
            case 43 :
                // InternalDomainmodel.g:1:262: T__54
                {
                mT__54(); 

                }
                break;
            case 44 :
                // InternalDomainmodel.g:1:268: RULE_VARTYPE
                {
                mRULE_VARTYPE(); 

                }
                break;
            case 45 :
                // InternalDomainmodel.g:1:281: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 46 :
                // InternalDomainmodel.g:1:289: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 47 :
                // InternalDomainmodel.g:1:301: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 48 :
                // InternalDomainmodel.g:1:317: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 49 :
                // InternalDomainmodel.g:1:333: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 50 :
                // InternalDomainmodel.g:1:341: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\34\37\1\uffff\1\37\2\uffff\4\45\2\uffff\10\37\1\132\15\37\1\152\12\37\1\165\2\37\1\170\6\37\5\uffff\4\37\1\uffff\5\37\1\uffff\11\37\1\uffff\6\37\1\u0097\1\u0098\1\37\1\u009a\1\uffff\2\37\1\uffff\1\u009d\6\37\1\u00a4\1\u00a5\1\u00a6\13\37\1\u00b2\2\37\1\u00b6\1\u00b7\1\u00b8\1\37\1\u00bb\1\37\2\uffff\1\37\1\uffff\1\37\1\u00bf\1\uffff\2\37\1\u00c2\1\u00c3\2\37\3\uffff\4\37\1\u00ca\1\u00cb\1\u00cc\1\u00cd\1\u00ce\2\37\1\uffff\1\u00d1\1\u00d2\1\37\3\uffff\1\37\1\u00d5\1\uffff\3\37\1\uffff\2\37\2\uffff\3\37\1\u00de\2\37\5\uffff\1\37\1\u00e2\2\uffff\2\37\1\uffff\1\u00e5\3\37\1\u00e9\1\u00ea\1\37\1\u00ec\1\uffff\3\37\1\uffff\2\37\1\uffff\1\u00f2\1\37\1\u00f4\2\uffff\1\37\1\uffff\1\u00f6\1\u00f7\1\u00f8\2\37\1\uffff\1\37\1\uffff\1\u00fc\3\uffff\1\u00fd\2\37\2\uffff\1\37\1\u0101\1\u0102\2\uffff";
    static final String DFA13_eofS =
        "\u0103\uffff";
    static final String DFA13_minS =
        "\1\0\33\60\1\uffff\1\60\2\uffff\1\101\2\0\1\52\2\uffff\10\60\1\55\4\60\1\40\10\60\1\55\12\60\1\55\2\60\1\55\6\60\5\uffff\4\60\1\uffff\5\60\1\uffff\11\60\1\uffff\6\60\2\55\1\60\1\55\1\uffff\2\60\1\uffff\1\55\6\60\3\55\13\60\1\55\2\60\3\55\1\60\1\55\1\60\2\uffff\1\60\1\uffff\1\60\1\55\1\uffff\2\60\2\55\2\60\3\uffff\4\60\5\55\2\60\1\uffff\2\55\1\60\3\uffff\1\60\1\55\1\uffff\3\60\1\uffff\2\60\2\uffff\3\60\1\55\2\60\5\uffff\1\60\1\55\2\uffff\2\60\1\uffff\1\55\3\60\2\55\1\60\1\55\1\uffff\3\60\1\uffff\2\60\1\uffff\1\55\1\60\1\55\2\uffff\1\60\1\uffff\3\55\2\60\1\uffff\1\60\1\uffff\1\55\3\uffff\1\55\2\60\2\uffff\1\60\2\55\2\uffff";
    static final String DFA13_maxS =
        "\1\uffff\33\172\1\uffff\1\172\2\uffff\1\172\2\uffff\1\57\2\uffff\53\172\5\uffff\4\172\1\uffff\5\172\1\uffff\11\172\1\uffff\12\172\1\uffff\2\172\1\uffff\36\172\2\uffff\1\172\1\uffff\2\172\1\uffff\6\172\3\uffff\13\172\1\uffff\3\172\3\uffff\2\172\1\uffff\3\172\1\uffff\2\172\2\uffff\6\172\5\uffff\2\172\2\uffff\2\172\1\uffff\10\172\1\uffff\3\172\1\uffff\2\172\1\uffff\3\172\2\uffff\1\172\1\uffff\5\172\1\uffff\1\172\1\uffff\1\172\3\uffff\3\172\2\uffff\3\172\2\uffff";
    static final String DFA13_acceptS =
        "\34\uffff\1\54\1\uffff\2\54\4\uffff\1\61\1\62\53\uffff\1\55\1\56\1\57\1\60\1\61\4\uffff\1\11\5\uffff\1\6\11\uffff\1\40\12\uffff\1\27\2\uffff\1\35\36\uffff\1\23\1\44\1\uffff\1\32\2\uffff\1\41\6\uffff\1\53\1\2\1\3\13\uffff\1\13\3\uffff\1\15\1\16\1\33\2\uffff\1\45\3\uffff\1\31\2\uffff\1\47\1\50\6\uffff\1\37\1\7\1\10\1\22\1\42\2\uffff\1\36\1\14\2\uffff\1\21\10\uffff\1\5\3\uffff\1\12\2\uffff\1\26\3\uffff\1\46\1\52\1\uffff\1\4\5\uffff\1\25\1\uffff\1\43\1\uffff\1\24\1\30\1\51\3\uffff\1\1\1\17\3\uffff\1\34\1\20";
    static final String DFA13_specialS =
        "\1\1\40\uffff\1\0\1\2\u00e0\uffff}>";
    static final String[] DFA13_transitionS = {
            "\11\45\2\44\2\45\1\44\22\45\1\44\1\45\1\41\4\45\1\42\5\45\1\36\1\45\1\43\12\34\7\45\1\24\1\10\1\5\1\32\1\25\1\4\2\32\1\12\2\32\1\11\3\32\1\30\2\32\1\15\1\13\6\32\3\45\1\40\1\35\1\45\1\17\1\23\1\7\1\33\1\31\1\14\1\6\1\33\1\21\5\33\1\3\1\1\1\33\1\22\1\16\1\27\1\20\1\26\1\2\3\33\uff85\45",
            "\12\52\7\uffff\32\50\4\uffff\1\53\1\uffff\13\51\1\47\5\51\1\46\10\51",
            "\12\52\7\uffff\32\50\4\uffff\1\53\1\uffff\10\51\1\54\21\51",
            "\12\52\7\uffff\32\50\4\uffff\1\53\1\uffff\15\51\1\56\1\51\1\55\12\51",
            "\12\52\7\uffff\10\50\1\57\21\50\4\uffff\1\53\1\uffff\32\51",
            "\12\52\7\uffff\7\50\1\60\3\50\1\62\2\50\1\61\13\50\4\uffff\1\53\1\uffff\32\51",
            "\12\52\7\uffff\32\50\4\uffff\1\53\1\uffff\10\51\1\64\5\51\1\63\13\51",
            "\12\52\7\uffff\32\50\4\uffff\1\53\1\uffff\7\51\1\66\3\51\1\65\2\51\1\67\13\51",
            "\12\52\7\uffff\24\50\1\70\5\50\4\uffff\1\53\1\uffff\32\51",
            "\12\52\7\uffff\1\72\7\50\1\71\21\50\4\uffff\1\53\1\uffff\32\51",
            "\12\52\7\uffff\3\50\1\74\10\50\1\73\15\50\4\uffff\1\53\1\uffff\32\51",
            "\12\52\7\uffff\4\50\1\75\25\50\4\uffff\1\53\1\uffff\32\51",
            "\12\52\7\uffff\32\50\4\uffff\1\53\1\uffff\10\51\1\76\10\51\1\77\10\51",
            "\12\52\7\uffff\4\50\1\100\25\50\4\uffff\1\53\1\uffff\32\51",
            "\12\52\7\uffff\32\50\4\uffff\1\53\1\uffff\1\101\3\51\1\102\25\51",
            "\12\52\7\uffff\32\50\4\uffff\1\53\1\uffff\13\51\1\103\1\51\1\104\14\51",
            "\12\52\7\uffff\32\50\4\uffff\1\53\1\uffff\15\51\1\105\3\51\1\106\10\51",
            "\12\52\7\uffff\32\50\4\uffff\1\53\1\uffff\3\51\1\110\11\51\1\107\14\51",
            "\12\52\7\uffff\32\50\4\uffff\1\53\1\uffff\4\51\1\111\25\51",
            "\12\52\7\uffff\32\50\4\uffff\1\53\1\uffff\30\51\1\112\1\51",
            "\12\52\7\uffff\13\50\1\113\16\50\4\uffff\1\53\1\uffff\32\51",
            "\12\52\7\uffff\13\50\1\114\16\50\4\uffff\1\53\1\uffff\32\51",
            "\12\52\7\uffff\32\50\4\uffff\1\53\1\uffff\4\51\1\115\25\51",
            "\12\52\7\uffff\32\50\4\uffff\1\53\1\uffff\7\51\1\116\22\51",
            "\12\52\7\uffff\1\117\31\50\4\uffff\1\53\1\uffff\32\51",
            "\12\52\7\uffff\32\50\4\uffff\1\53\1\uffff\20\51\1\120\11\51",
            "\12\52\7\uffff\32\50\4\uffff\1\53\1\uffff\32\51",
            "\12\52\7\uffff\32\50\4\uffff\1\53\1\uffff\32\51",
            "",
            "\12\52\7\uffff\32\50\4\uffff\1\53\1\uffff\32\51",
            "",
            "",
            "\32\121\4\uffff\1\121\1\uffff\32\121",
            "\0\122",
            "\0\122",
            "\1\123\4\uffff\1\124",
            "",
            "",
            "\12\52\7\uffff\32\50\4\uffff\1\53\1\uffff\16\51\1\126\13\51",
            "\12\52\7\uffff\32\50\4\uffff\1\53\1\uffff\1\127\31\51",
            "\12\52\7\uffff\32\50\4\uffff\1\53\1\uffff\32\51",
            "\12\52\7\uffff\32\50\4\uffff\1\53\1\uffff\32\51",
            "\12\52\7\uffff\32\50\4\uffff\1\53\1\uffff\32\51",
            "\12\52\7\uffff\32\50\4\uffff\1\53\1\uffff\32\51",
            "\12\52\7\uffff\32\50\4\uffff\1\53\1\uffff\23\51\1\130\6\51",
            "\12\52\7\uffff\32\50\4\uffff\1\53\1\uffff\4\51\1\131\25\51",
            "\1\37\2\uffff\12\52\7\uffff\32\50\4\uffff\1\53\1\uffff\32\51",
            "\12\52\7\uffff\21\50\1\133\10\50\4\uffff\1\53\1\uffff\32\51",
            "\12\52\7\uffff\4\50\1\135\14\50\1\134\10\50\4\uffff\1\53\1\uffff\32\51",
            "\12\52\7\uffff\14\50\1\136\15\50\4\uffff\1\53\1\uffff\32\51",
            "\12\52\7\uffff\1\137\31\50\4\uffff\1\53\1\uffff\32\51",
            "\1\140\17\uffff\12\52\7\uffff\32\50\4\uffff\1\53\1\uffff\32\51",
            "\12\52\7\uffff\32\50\4\uffff\1\53\1\uffff\25\51\1\141\4\51",
            "\12\52\7\uffff\32\50\4\uffff\1\53\1\uffff\10\51\1\142\21\51",
            "\12\52\7\uffff\32\50\4\uffff\1\53\1\uffff\4\51\1\143\25\51",
            "\12\52\7\uffff\32\50\4\uffff\1\53\1\uffff\15\51\1\145\6\51\1\144\5\51",
            "\12\52\7\uffff\23\50\1\146\6\50\4\uffff\1\53\1\uffff\32\51",
            "\12\52\7\uffff\15\50\1\147\14\50\4\uffff\1\53\1\uffff\32\51",
            "\12\52\7\uffff\1\50\1\150\30\50\4\uffff\1\53\1\uffff\32\51",
            "\12\52\7\uffff\1\151\31\50\4\uffff\1\53\1\uffff\32\51",
            "\1\37\2\uffff\12\52\7\uffff\32\50\4\uffff\1\53\1\uffff\32\51",
            "\12\52\7\uffff\27\50\1\153\2\50\4\uffff\1\53\1\uffff\32\51",
            "\12\52\7\uffff\32\50\4\uffff\1\53\1\uffff\13\51\1\154\16\51",
            "\12\52\7\uffff\32\50\4\uffff\1\53\1\uffff\16\51\1\155\13\51",
            "\12\52\7\uffff\1\156\31\50\4\uffff\1\53\1\uffff\32\51",
            "\12\52\7\uffff\32\50\4\uffff\1\53\1\uffff\25\51\1\157\4\51",
            "\12\52\7\uffff\32\50\4\uffff\1\53\1\uffff\13\51\1\160\16\51",
            "\12\52\7\uffff\32\50\4\uffff\1\53\1\uffff\13\51\1\161\16\51",
            "\12\52\7\uffff\32\50\4\uffff\1\53\1\uffff\3\51\1\162\26\51",
            "\12\52\7\uffff\32\50\4\uffff\1\53\1\uffff\2\51\1\163\27\51",
            "\12\52\7\uffff\32\50\4\uffff\1\53\1\uffff\13\51\1\164\16\51",
            "\1\37\2\uffff\12\52\7\uffff\32\50\4\uffff\1\53\1\uffff\32\51",
            "\12\52\7\uffff\32\50\4\uffff\1\53\1\uffff\4\51\1\166\25\51",
            "\12\52\7\uffff\32\50\4\uffff\1\53\1\uffff\1\167\31\51",
            "\1\37\2\uffff\12\52\7\uffff\32\50\4\uffff\1\53\1\uffff\32\51",
            "\12\52\7\uffff\23\50\1\171\6\50\4\uffff\1\53\1\uffff\32\51",
            "\12\52\7\uffff\4\50\1\172\25\50\4\uffff\1\53\1\uffff\32\51",
            "\12\52\7\uffff\32\50\4\uffff\1\53\1\uffff\21\51\1\173\10\51",
            "\12\52\7\uffff\32\50\4\uffff\1\53\1\uffff\1\174\31\51",
            "\12\52\7\uffff\6\50\1\175\23\50\4\uffff\1\53\1\uffff\32\51",
            "\12\52\7\uffff\32\50\4\uffff\1\53\1\uffff\24\51\1\176\5\51",
            "",
            "",
            "",
            "",
            "",
            "\12\52\7\uffff\32\50\4\uffff\1\53\1\uffff\2\51\1\177\27\51",
            "\12\52\7\uffff\32\50\4\uffff\1\53\1\uffff\30\51\1\u0080\1\51",
            "\12\52\7\uffff\32\50\4\uffff\1\53\1\uffff\7\51\1\u0081\22\51",
            "\12\52\7\uffff\32\50\4\uffff\1\53\1\uffff\15\51\1\u0082\14\51",
            "",
            "\12\52\7\uffff\4\50\1\u0083\25\50\4\uffff\1\53\1\uffff\32\51",
            "\12\52\7\uffff\16\50\1\u0084\13\50\4\uffff\1\53\1\uffff\32\51",
            "\12\52\7\uffff\2\50\1\u0085\27\50\4\uffff\1\53\1\uffff\32\51",
            "\12\52\7\uffff\1\50\1\u0086\30\50\4\uffff\1\53\1\uffff\32\51",
            "\12\52\7\uffff\22\50\1\u0087\7\50\4\uffff\1\53\1\uffff\32\51",
            "",
            "\12\52\7\uffff\32\50\4\uffff\1\53\1\uffff\4\51\1\u0088\25\51",
            "\12\52\7\uffff\32\50\4\uffff\1\53\1\uffff\2\51\1\u0089\27\51",
            "\12\52\7\uffff\32\50\4\uffff\1\53\1\uffff\2\51\1\u008a\27\51",
            "\12\52\7\uffff\32\50\4\uffff\1\53\1\uffff\15\51\1\u008b\14\51",
            "\12\52\7\uffff\32\50\4\uffff\1\53\1\uffff\23\51\1\u008c\6\51",
            "\12\52\7\uffff\23\50\1\u008d\6\50\4\uffff\1\53\1\uffff\32\51",
            "\12\52\7\uffff\12\50\1\u008e\17\50\4\uffff\1\53\1\uffff\32\51",
            "\12\52\7\uffff\4\50\1\u008f\25\50\4\uffff\1\53\1\uffff\32\51",
            "\12\52\7\uffff\6\50\1\u0090\23\50\4\uffff\1\53\1\uffff\32\51",
            "",
            "\12\52\7\uffff\23\50\1\u0091\6\50\4\uffff\1\53\1\uffff\32\51",
            "\12\52\7\uffff\32\50\4\uffff\1\53\1\uffff\13\51\1\u0092\16\51",
            "\12\52\7\uffff\32\50\4\uffff\1\53\1\uffff\14\51\1\u0093\15\51",
            "\12\52\7\uffff\21\50\1\u0094\10\50\4\uffff\1\53\1\uffff\32\51",
            "\12\52\7\uffff\32\50\4\uffff\1\53\1\uffff\4\51\1\u0095\25\51",
            "\12\52\7\uffff\32\50\4\uffff\1\53\1\uffff\4\51\1\u0096\25\51",
            "\1\37\2\uffff\12\52\7\uffff\32\50\4\uffff\1\53\1\uffff\32\51",
            "\1\37\2\uffff\12\52\7\uffff\32\50\4\uffff\1\53\1\uffff\32\51",
            "\12\52\7\uffff\32\50\4\uffff\1\53\1\uffff\7\51\1\u0099\22\51",
            "\1\37\2\uffff\12\52\7\uffff\32\50\4\uffff\1\53\1\uffff\32\51",
            "",
            "\12\52\7\uffff\32\50\4\uffff\1\53\1\uffff\15\51\1\u009b\14\51",
            "\12\52\7\uffff\32\50\4\uffff\1\53\1\uffff\3\51\1\u009c\26\51",
            "",
            "\1\37\2\uffff\12\52\7\uffff\32\50\4\uffff\1\53\1\uffff\32\51",
            "\12\52\7\uffff\14\50\1\u009e\15\50\4\uffff\1\53\1\uffff\32\51",
            "\12\52\7\uffff\32\50\4\uffff\1\53\1\uffff\10\51\1\u009f\21\51",
            "\12\52\7\uffff\32\50\4\uffff\1\53\1\uffff\23\51\1\u00a0\6\51",
            "\12\52\7\uffff\4\50\1\u00a1\25\50\4\uffff\1\53\1\uffff\32\51",
            "\12\52\7\uffff\32\50\4\uffff\1\53\1\uffff\1\u00a2\31\51",
            "\12\52\7\uffff\32\50\4\uffff\1\53\1\uffff\4\51\1\u00a3\25\51",
            "\1\37\2\uffff\12\52\7\uffff\32\50\4\uffff\1\53\1\uffff\32\51",
            "\1\37\2\uffff\12\52\7\uffff\32\50\4\uffff\1\53\1\uffff\32\51",
            "\1\37\2\uffff\12\52\7\uffff\32\50\4\uffff\1\53\1\uffff\32\51",
            "\12\52\7\uffff\5\50\1\u00a7\24\50\4\uffff\1\53\1\uffff\32\51",
            "\12\52\7\uffff\14\50\1\u00a8\15\50\4\uffff\1\53\1\uffff\32\51",
            "\12\52\7\uffff\12\50\1\u00a9\17\50\4\uffff\1\53\1\uffff\32\51",
            "\12\52\7\uffff\16\50\1\u00aa\13\50\4\uffff\1\53\1\uffff\32\51",
            "\12\52\7\uffff\22\50\1\u00ab\7\50\4\uffff\1\53\1\uffff\32\51",
            "\12\52\7\uffff\32\50\4\uffff\1\53\1\uffff\15\51\1\u00ac\14\51",
            "\12\52\7\uffff\32\50\4\uffff\1\53\1\uffff\12\51\1\u00ad\17\51",
            "\12\52\7\uffff\32\50\4\uffff\1\53\1\uffff\12\51\1\u00ae\17\51",
            "\12\52\7\uffff\32\50\4\uffff\1\53\1\uffff\23\51\1\u00af\6\51",
            "\12\52\7\uffff\32\50\4\uffff\1\53\1\uffff\1\u00b0\31\51",
            "\12\52\7\uffff\16\50\1\u00b1\13\50\4\uffff\1\53\1\uffff\32\51",
            "\1\37\2\uffff\12\52\7\uffff\32\50\4\uffff\1\53\1\uffff\32\51",
            "\12\52\7\uffff\13\50\1\u00b3\16\50\4\uffff\1\53\1\uffff\32\51",
            "\12\52\7\uffff\4\50\1\u00b4\25\50\4\uffff\1\53\1\uffff\32\51",
            "\1\37\2\uffff\12\52\7\uffff\5\50\1\u00b5\24\50\4\uffff\1\53\1\uffff\32\51",
            "\1\37\2\uffff\12\52\7\uffff\32\50\4\uffff\1\53\1\uffff\32\51",
            "\1\37\2\uffff\12\52\7\uffff\32\50\4\uffff\1\53\1\uffff\32\51",
            "\12\52\7\uffff\2\50\1\u00b9\27\50\4\uffff\1\53\1\uffff\32\51",
            "\1\37\2\uffff\12\52\7\uffff\32\50\4\uffff\1\53\1\uffff\3\51\1\u00ba\26\51",
            "\12\52\7\uffff\32\50\4\uffff\1\53\1\uffff\2\51\1\u00bc\27\51",
            "",
            "",
            "\12\52\7\uffff\32\50\4\uffff\1\53\1\uffff\4\51\1\u00bd\25\51",
            "",
            "\12\52\7\uffff\32\50\4\uffff\1\53\1\uffff\23\51\1\u00be\6\51",
            "\1\37\2\uffff\12\52\7\uffff\32\50\4\uffff\1\53\1\uffff\32\51",
            "",
            "\12\52\7\uffff\4\50\1\u00c0\25\50\4\uffff\1\53\1\uffff\32\51",
            "\12\52\7\uffff\32\50\4\uffff\1\53\1\uffff\5\51\1\u00c1\24\51",
            "\1\37\2\uffff\12\52\7\uffff\32\50\4\uffff\1\53\1\uffff\32\51",
            "\1\37\2\uffff\12\52\7\uffff\32\50\4\uffff\1\53\1\uffff\32\51",
            "\12\52\7\uffff\32\50\4\uffff\1\53\1\uffff\13\51\1\u00c4\16\51",
            "\12\52\7\uffff\32\50\4\uffff\1\53\1\uffff\3\51\1\u00c5\26\51",
            "",
            "",
            "",
            "\12\52\7\uffff\16\50\1\u00c6\13\50\4\uffff\1\53\1\uffff\32\51",
            "\12\52\7\uffff\4\50\1\u00c7\25\50\4\uffff\1\53\1\uffff\32\51",
            "\12\52\7\uffff\1\50\1\u00c8\30\50\4\uffff\1\53\1\uffff\32\51",
            "\12\52\7\uffff\1\50\1\u00c9\30\50\4\uffff\1\53\1\uffff\32\51",
            "\1\37\2\uffff\12\52\7\uffff\32\50\4\uffff\1\53\1\uffff\32\51",
            "\1\37\2\uffff\12\52\7\uffff\32\50\4\uffff\1\53\1\uffff\32\51",
            "\1\37\2\uffff\12\52\7\uffff\32\50\4\uffff\1\53\1\uffff\32\51",
            "\1\37\2\uffff\12\52\7\uffff\32\50\4\uffff\1\53\1\uffff\32\51",
            "\1\37\2\uffff\12\52\7\uffff\32\50\4\uffff\1\53\1\uffff\32\51",
            "\12\52\7\uffff\32\50\4\uffff\1\53\1\uffff\10\51\1\u00cf\21\51",
            "\12\52\7\uffff\15\50\1\u00d0\14\50\4\uffff\1\53\1\uffff\32\51",
            "",
            "\1\37\2\uffff\12\52\7\uffff\32\50\4\uffff\1\53\1\uffff\32\51",
            "\1\37\2\uffff\12\52\7\uffff\32\50\4\uffff\1\53\1\uffff\32\51",
            "\12\52\7\uffff\10\50\1\u00d3\21\50\4\uffff\1\53\1\uffff\32\51",
            "",
            "",
            "",
            "\12\52\7\uffff\7\50\1\u00d4\22\50\4\uffff\1\53\1\uffff\32\51",
            "\1\37\2\uffff\12\52\7\uffff\32\50\4\uffff\1\53\1\uffff\32\51",
            "",
            "\12\52\7\uffff\32\50\4\uffff\1\53\1\uffff\23\51\1\u00d6\6\51",
            "\12\52\7\uffff\32\50\4\uffff\1\53\1\uffff\2\51\1\u00d7\27\51",
            "\12\52\7\uffff\32\50\4\uffff\1\53\1\uffff\10\51\1\u00d8\21\51",
            "",
            "\12\52\7\uffff\15\50\1\u00d9\14\50\4\uffff\1\53\1\uffff\32\51",
            "\12\52\7\uffff\32\50\4\uffff\1\53\1\uffff\30\51\1\u00da\1\51",
            "",
            "",
            "\12\52\7\uffff\32\50\4\uffff\1\53\1\uffff\22\51\1\u00db\7\51",
            "\12\52\7\uffff\32\50\4\uffff\1\53\1\uffff\24\51\1\u00dc\5\51",
            "\12\52\7\uffff\27\50\1\u00dd\2\50\4\uffff\1\53\1\uffff\32\51",
            "\1\37\2\uffff\12\52\7\uffff\32\50\4\uffff\1\53\1\uffff\32\51",
            "\12\52\7\uffff\16\50\1\u00df\13\50\4\uffff\1\53\1\uffff\32\51",
            "\12\52\7\uffff\16\50\1\u00e0\13\50\4\uffff\1\53\1\uffff\32\51",
            "",
            "",
            "",
            "",
            "",
            "\12\52\7\uffff\32\50\4\uffff\1\53\1\uffff\15\51\1\u00e1\14\51",
            "\1\37\2\uffff\12\52\7\uffff\32\50\4\uffff\1\53\1\uffff\32\51",
            "",
            "",
            "\12\52\7\uffff\4\50\1\u00e3\25\50\4\uffff\1\53\1\uffff\32\51",
            "\12\52\7\uffff\5\50\1\u00e4\24\50\4\uffff\1\53\1\uffff\32\51",
            "",
            "\1\37\2\uffff\12\52\7\uffff\32\50\4\uffff\1\53\1\uffff\32\51",
            "\12\52\7\uffff\32\50\4\uffff\1\53\1\uffff\12\51\1\u00e6\17\51",
            "\12\52\7\uffff\32\50\4\uffff\1\53\1\uffff\5\51\1\u00e7\24\51",
            "\12\52\7\uffff\23\50\1\u00e8\6\50\4\uffff\1\53\1\uffff\32\51",
            "\1\37\2\uffff\12\52\7\uffff\32\50\4\uffff\1\53\1\uffff\32\51",
            "\1\37\2\uffff\12\52\7\uffff\32\50\4\uffff\1\53\1\uffff\32\51",
            "\12\52\7\uffff\32\50\4\uffff\1\53\1\uffff\21\51\1\u00eb\10\51",
            "\1\37\2\uffff\12\52\7\uffff\32\50\4\uffff\1\53\1\uffff\32\51",
            "",
            "\12\52\7\uffff\27\50\1\u00ed\2\50\4\uffff\1\53\1\uffff\32\51",
            "\12\52\7\uffff\27\50\1\u00ee\2\50\4\uffff\1\53\1\uffff\32\51",
            "\12\52\7\uffff\32\50\4\uffff\1\53\1\uffff\22\51\1\u00ef\7\51",
            "",
            "\12\52\7\uffff\13\50\1\u00f0\16\50\4\uffff\1\53\1\uffff\32\51",
            "\12\52\7\uffff\10\50\1\u00f1\21\50\4\uffff\1\53\1\uffff\32\51",
            "",
            "\1\37\2\uffff\12\52\7\uffff\32\50\4\uffff\1\53\1\uffff\32\51",
            "\12\52\7\uffff\32\50\4\uffff\1\53\1\uffff\10\51\1\u00f3\21\51",
            "\1\37\2\uffff\12\52\7\uffff\32\50\4\uffff\1\53\1\uffff\32\51",
            "",
            "",
            "\12\52\7\uffff\32\50\4\uffff\1\53\1\uffff\4\51\1\u00f5\25\51",
            "",
            "\1\37\2\uffff\12\52\7\uffff\32\50\4\uffff\1\53\1\uffff\32\51",
            "\1\37\2\uffff\12\52\7\uffff\32\50\4\uffff\1\53\1\uffff\32\51",
            "\1\37\2\uffff\12\52\7\uffff\32\50\4\uffff\1\53\1\uffff\32\51",
            "\12\52\7\uffff\3\50\1\u00f9\26\50\4\uffff\1\53\1\uffff\32\51",
            "\12\52\7\uffff\4\50\1\u00fa\25\50\4\uffff\1\53\1\uffff\32\51",
            "",
            "\12\52\7\uffff\32\50\4\uffff\1\53\1\uffff\4\51\1\u00fb\25\51",
            "",
            "\1\37\2\uffff\12\52\7\uffff\32\50\4\uffff\1\53\1\uffff\32\51",
            "",
            "",
            "",
            "\1\37\2\uffff\12\52\7\uffff\32\50\4\uffff\1\53\1\uffff\32\51",
            "\12\52\7\uffff\13\50\1\u00fe\16\50\4\uffff\1\53\1\uffff\32\51",
            "\12\52\7\uffff\32\50\4\uffff\1\53\1\uffff\3\51\1\u00ff\26\51",
            "",
            "",
            "\12\52\7\uffff\3\50\1\u0100\26\50\4\uffff\1\53\1\uffff\32\51",
            "\1\37\2\uffff\12\52\7\uffff\32\50\4\uffff\1\53\1\uffff\32\51",
            "\1\37\2\uffff\12\52\7\uffff\32\50\4\uffff\1\53\1\uffff\32\51",
            "",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | RULE_VARTYPE | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_33 = input.LA(1);

                        s = -1;
                        if ( ((LA13_33>='\u0000' && LA13_33<='\uFFFF')) ) {s = 82;}

                        else s = 37;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_0 = input.LA(1);

                        s = -1;
                        if ( (LA13_0=='p') ) {s = 1;}

                        else if ( (LA13_0=='w') ) {s = 2;}

                        else if ( (LA13_0=='o') ) {s = 3;}

                        else if ( (LA13_0=='F') ) {s = 4;}

                        else if ( (LA13_0=='C') ) {s = 5;}

                        else if ( (LA13_0=='g') ) {s = 6;}

                        else if ( (LA13_0=='c') ) {s = 7;}

                        else if ( (LA13_0=='B') ) {s = 8;}

                        else if ( (LA13_0=='L') ) {s = 9;}

                        else if ( (LA13_0=='I') ) {s = 10;}

                        else if ( (LA13_0=='T') ) {s = 11;}

                        else if ( (LA13_0=='f') ) {s = 12;}

                        else if ( (LA13_0=='S') ) {s = 13;}

                        else if ( (LA13_0=='s') ) {s = 14;}

                        else if ( (LA13_0=='a') ) {s = 15;}

                        else if ( (LA13_0=='u') ) {s = 16;}

                        else if ( (LA13_0=='i') ) {s = 17;}

                        else if ( (LA13_0=='r') ) {s = 18;}

                        else if ( (LA13_0=='b') ) {s = 19;}

                        else if ( (LA13_0=='A') ) {s = 20;}

                        else if ( (LA13_0=='E') ) {s = 21;}

                        else if ( (LA13_0=='v') ) {s = 22;}

                        else if ( (LA13_0=='t') ) {s = 23;}

                        else if ( (LA13_0=='P') ) {s = 24;}

                        else if ( (LA13_0=='e') ) {s = 25;}

                        else if ( (LA13_0=='D'||(LA13_0>='G' && LA13_0<='H')||(LA13_0>='J' && LA13_0<='K')||(LA13_0>='M' && LA13_0<='O')||(LA13_0>='Q' && LA13_0<='R')||(LA13_0>='U' && LA13_0<='Z')) ) {s = 26;}

                        else if ( (LA13_0=='d'||LA13_0=='h'||(LA13_0>='j' && LA13_0<='n')||LA13_0=='q'||(LA13_0>='x' && LA13_0<='z')) ) {s = 27;}

                        else if ( ((LA13_0>='0' && LA13_0<='9')) ) {s = 28;}

                        else if ( (LA13_0=='_') ) {s = 29;}

                        else if ( (LA13_0=='-') ) {s = 30;}

                        else if ( (LA13_0=='^') ) {s = 32;}

                        else if ( (LA13_0=='\"') ) {s = 33;}

                        else if ( (LA13_0=='\'') ) {s = 34;}

                        else if ( (LA13_0=='/') ) {s = 35;}

                        else if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {s = 36;}

                        else if ( ((LA13_0>='\u0000' && LA13_0<='\b')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\u001F')||LA13_0=='!'||(LA13_0>='#' && LA13_0<='&')||(LA13_0>='(' && LA13_0<=',')||LA13_0=='.'||(LA13_0>=':' && LA13_0<='@')||(LA13_0>='[' && LA13_0<=']')||LA13_0=='`'||(LA13_0>='{' && LA13_0<='\uFFFF')) ) {s = 37;}

                        else s = 31;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA13_34 = input.LA(1);

                        s = -1;
                        if ( ((LA13_34>='\u0000' && LA13_34<='\uFFFF')) ) {s = 82;}

                        else s = 37;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 13, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}