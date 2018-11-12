package org.xtext.project.browserautomationdsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.project.browserautomationdsl.services.DomainmodelGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDomainmodelParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_VARTYPE", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'FIREFOX'", "'CHROME'", "'BUTTON'", "'LINK'", "'IMAGE'", "'TEXT'", "'TEXTFIELD'", "'SEARCHFIELD'", "'LABEL'", "'CLASS'", "'ID'", "'ALT'", "'PAGE'", "'procedure'", "'with'", "'given'", "'on'", "'saved'", "'all'", "'CHECKBOX'", "'in'", "'COMBOBOX'", "'url'", "'from'", "'identified'", "'by'", "'that'", "'contains'", "'equals'", "'ELEMENT'", "'and'", "'save'", "'open'", "'go to'", "'click'", "'fill'", "'check'", "'uncheck'", "'select'", "'read'", "'verify'", "'count'", "'play'"
    };
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
    public static final int RULE_STRING=4;
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
    public static final int RULE_VARTYPE=5;
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


        public InternalDomainmodelParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDomainmodelParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDomainmodelParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDomainmodel.g"; }


    	private DomainmodelGrammarAccess grammarAccess;

    	public void setGrammarAccess(DomainmodelGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRulePROGRAMME"
    // InternalDomainmodel.g:53:1: entryRulePROGRAMME : rulePROGRAMME EOF ;
    public final void entryRulePROGRAMME() throws RecognitionException {
        try {
            // InternalDomainmodel.g:54:1: ( rulePROGRAMME EOF )
            // InternalDomainmodel.g:55:1: rulePROGRAMME EOF
            {
             before(grammarAccess.getPROGRAMMERule()); 
            pushFollow(FOLLOW_1);
            rulePROGRAMME();

            state._fsp--;

             after(grammarAccess.getPROGRAMMERule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePROGRAMME"


    // $ANTLR start "rulePROGRAMME"
    // InternalDomainmodel.g:62:1: rulePROGRAMME : ( ( rule__PROGRAMME__ProceduresAssignment )* ) ;
    public final void rulePROGRAMME() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:66:2: ( ( ( rule__PROGRAMME__ProceduresAssignment )* ) )
            // InternalDomainmodel.g:67:2: ( ( rule__PROGRAMME__ProceduresAssignment )* )
            {
            // InternalDomainmodel.g:67:2: ( ( rule__PROGRAMME__ProceduresAssignment )* )
            // InternalDomainmodel.g:68:3: ( rule__PROGRAMME__ProceduresAssignment )*
            {
             before(grammarAccess.getPROGRAMMEAccess().getProceduresAssignment()); 
            // InternalDomainmodel.g:69:3: ( rule__PROGRAMME__ProceduresAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==25) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDomainmodel.g:69:4: rule__PROGRAMME__ProceduresAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__PROGRAMME__ProceduresAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getPROGRAMMEAccess().getProceduresAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePROGRAMME"


    // $ANTLR start "entryRulePROCEDURE"
    // InternalDomainmodel.g:78:1: entryRulePROCEDURE : rulePROCEDURE EOF ;
    public final void entryRulePROCEDURE() throws RecognitionException {
        try {
            // InternalDomainmodel.g:79:1: ( rulePROCEDURE EOF )
            // InternalDomainmodel.g:80:1: rulePROCEDURE EOF
            {
             before(grammarAccess.getPROCEDURERule()); 
            pushFollow(FOLLOW_1);
            rulePROCEDURE();

            state._fsp--;

             after(grammarAccess.getPROCEDURERule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePROCEDURE"


    // $ANTLR start "rulePROCEDURE"
    // InternalDomainmodel.g:87:1: rulePROCEDURE : ( ( rule__PROCEDURE__Group__0 ) ) ;
    public final void rulePROCEDURE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:91:2: ( ( ( rule__PROCEDURE__Group__0 ) ) )
            // InternalDomainmodel.g:92:2: ( ( rule__PROCEDURE__Group__0 ) )
            {
            // InternalDomainmodel.g:92:2: ( ( rule__PROCEDURE__Group__0 ) )
            // InternalDomainmodel.g:93:3: ( rule__PROCEDURE__Group__0 )
            {
             before(grammarAccess.getPROCEDUREAccess().getGroup()); 
            // InternalDomainmodel.g:94:3: ( rule__PROCEDURE__Group__0 )
            // InternalDomainmodel.g:94:4: rule__PROCEDURE__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PROCEDURE__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPROCEDUREAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePROCEDURE"


    // $ANTLR start "entryRuleINSTRUCTION"
    // InternalDomainmodel.g:103:1: entryRuleINSTRUCTION : ruleINSTRUCTION EOF ;
    public final void entryRuleINSTRUCTION() throws RecognitionException {
        try {
            // InternalDomainmodel.g:104:1: ( ruleINSTRUCTION EOF )
            // InternalDomainmodel.g:105:1: ruleINSTRUCTION EOF
            {
             before(grammarAccess.getINSTRUCTIONRule()); 
            pushFollow(FOLLOW_1);
            ruleINSTRUCTION();

            state._fsp--;

             after(grammarAccess.getINSTRUCTIONRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleINSTRUCTION"


    // $ANTLR start "ruleINSTRUCTION"
    // InternalDomainmodel.g:112:1: ruleINSTRUCTION : ( ( rule__INSTRUCTION__Alternatives ) ) ;
    public final void ruleINSTRUCTION() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:116:2: ( ( ( rule__INSTRUCTION__Alternatives ) ) )
            // InternalDomainmodel.g:117:2: ( ( rule__INSTRUCTION__Alternatives ) )
            {
            // InternalDomainmodel.g:117:2: ( ( rule__INSTRUCTION__Alternatives ) )
            // InternalDomainmodel.g:118:3: ( rule__INSTRUCTION__Alternatives )
            {
             before(grammarAccess.getINSTRUCTIONAccess().getAlternatives()); 
            // InternalDomainmodel.g:119:3: ( rule__INSTRUCTION__Alternatives )
            // InternalDomainmodel.g:119:4: rule__INSTRUCTION__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__INSTRUCTION__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getINSTRUCTIONAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleINSTRUCTION"


    // $ANTLR start "entryRuleOPEN"
    // InternalDomainmodel.g:128:1: entryRuleOPEN : ruleOPEN EOF ;
    public final void entryRuleOPEN() throws RecognitionException {
        try {
            // InternalDomainmodel.g:129:1: ( ruleOPEN EOF )
            // InternalDomainmodel.g:130:1: ruleOPEN EOF
            {
             before(grammarAccess.getOPENRule()); 
            pushFollow(FOLLOW_1);
            ruleOPEN();

            state._fsp--;

             after(grammarAccess.getOPENRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOPEN"


    // $ANTLR start "ruleOPEN"
    // InternalDomainmodel.g:137:1: ruleOPEN : ( ( rule__OPEN__Group__0 ) ) ;
    public final void ruleOPEN() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:141:2: ( ( ( rule__OPEN__Group__0 ) ) )
            // InternalDomainmodel.g:142:2: ( ( rule__OPEN__Group__0 ) )
            {
            // InternalDomainmodel.g:142:2: ( ( rule__OPEN__Group__0 ) )
            // InternalDomainmodel.g:143:3: ( rule__OPEN__Group__0 )
            {
             before(grammarAccess.getOPENAccess().getGroup()); 
            // InternalDomainmodel.g:144:3: ( rule__OPEN__Group__0 )
            // InternalDomainmodel.g:144:4: rule__OPEN__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OPEN__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOPENAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOPEN"


    // $ANTLR start "entryRuleGOTO"
    // InternalDomainmodel.g:153:1: entryRuleGOTO : ruleGOTO EOF ;
    public final void entryRuleGOTO() throws RecognitionException {
        try {
            // InternalDomainmodel.g:154:1: ( ruleGOTO EOF )
            // InternalDomainmodel.g:155:1: ruleGOTO EOF
            {
             before(grammarAccess.getGOTORule()); 
            pushFollow(FOLLOW_1);
            ruleGOTO();

            state._fsp--;

             after(grammarAccess.getGOTORule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGOTO"


    // $ANTLR start "ruleGOTO"
    // InternalDomainmodel.g:162:1: ruleGOTO : ( ( rule__GOTO__Group__0 ) ) ;
    public final void ruleGOTO() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:166:2: ( ( ( rule__GOTO__Group__0 ) ) )
            // InternalDomainmodel.g:167:2: ( ( rule__GOTO__Group__0 ) )
            {
            // InternalDomainmodel.g:167:2: ( ( rule__GOTO__Group__0 ) )
            // InternalDomainmodel.g:168:3: ( rule__GOTO__Group__0 )
            {
             before(grammarAccess.getGOTOAccess().getGroup()); 
            // InternalDomainmodel.g:169:3: ( rule__GOTO__Group__0 )
            // InternalDomainmodel.g:169:4: rule__GOTO__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GOTO__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGOTOAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGOTO"


    // $ANTLR start "entryRuleCLICK"
    // InternalDomainmodel.g:178:1: entryRuleCLICK : ruleCLICK EOF ;
    public final void entryRuleCLICK() throws RecognitionException {
        try {
            // InternalDomainmodel.g:179:1: ( ruleCLICK EOF )
            // InternalDomainmodel.g:180:1: ruleCLICK EOF
            {
             before(grammarAccess.getCLICKRule()); 
            pushFollow(FOLLOW_1);
            ruleCLICK();

            state._fsp--;

             after(grammarAccess.getCLICKRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCLICK"


    // $ANTLR start "ruleCLICK"
    // InternalDomainmodel.g:187:1: ruleCLICK : ( ( rule__CLICK__Group__0 ) ) ;
    public final void ruleCLICK() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:191:2: ( ( ( rule__CLICK__Group__0 ) ) )
            // InternalDomainmodel.g:192:2: ( ( rule__CLICK__Group__0 ) )
            {
            // InternalDomainmodel.g:192:2: ( ( rule__CLICK__Group__0 ) )
            // InternalDomainmodel.g:193:3: ( rule__CLICK__Group__0 )
            {
             before(grammarAccess.getCLICKAccess().getGroup()); 
            // InternalDomainmodel.g:194:3: ( rule__CLICK__Group__0 )
            // InternalDomainmodel.g:194:4: rule__CLICK__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CLICK__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCLICKAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCLICK"


    // $ANTLR start "entryRuleFILL"
    // InternalDomainmodel.g:203:1: entryRuleFILL : ruleFILL EOF ;
    public final void entryRuleFILL() throws RecognitionException {
        try {
            // InternalDomainmodel.g:204:1: ( ruleFILL EOF )
            // InternalDomainmodel.g:205:1: ruleFILL EOF
            {
             before(grammarAccess.getFILLRule()); 
            pushFollow(FOLLOW_1);
            ruleFILL();

            state._fsp--;

             after(grammarAccess.getFILLRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFILL"


    // $ANTLR start "ruleFILL"
    // InternalDomainmodel.g:212:1: ruleFILL : ( ( rule__FILL__Group__0 ) ) ;
    public final void ruleFILL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:216:2: ( ( ( rule__FILL__Group__0 ) ) )
            // InternalDomainmodel.g:217:2: ( ( rule__FILL__Group__0 ) )
            {
            // InternalDomainmodel.g:217:2: ( ( rule__FILL__Group__0 ) )
            // InternalDomainmodel.g:218:3: ( rule__FILL__Group__0 )
            {
             before(grammarAccess.getFILLAccess().getGroup()); 
            // InternalDomainmodel.g:219:3: ( rule__FILL__Group__0 )
            // InternalDomainmodel.g:219:4: rule__FILL__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FILL__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFILLAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFILL"


    // $ANTLR start "entryRuleCHECK"
    // InternalDomainmodel.g:228:1: entryRuleCHECK : ruleCHECK EOF ;
    public final void entryRuleCHECK() throws RecognitionException {
        try {
            // InternalDomainmodel.g:229:1: ( ruleCHECK EOF )
            // InternalDomainmodel.g:230:1: ruleCHECK EOF
            {
             before(grammarAccess.getCHECKRule()); 
            pushFollow(FOLLOW_1);
            ruleCHECK();

            state._fsp--;

             after(grammarAccess.getCHECKRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCHECK"


    // $ANTLR start "ruleCHECK"
    // InternalDomainmodel.g:237:1: ruleCHECK : ( ( rule__CHECK__Group__0 ) ) ;
    public final void ruleCHECK() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:241:2: ( ( ( rule__CHECK__Group__0 ) ) )
            // InternalDomainmodel.g:242:2: ( ( rule__CHECK__Group__0 ) )
            {
            // InternalDomainmodel.g:242:2: ( ( rule__CHECK__Group__0 ) )
            // InternalDomainmodel.g:243:3: ( rule__CHECK__Group__0 )
            {
             before(grammarAccess.getCHECKAccess().getGroup()); 
            // InternalDomainmodel.g:244:3: ( rule__CHECK__Group__0 )
            // InternalDomainmodel.g:244:4: rule__CHECK__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CHECK__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCHECKAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCHECK"


    // $ANTLR start "entryRuleUNCHECK"
    // InternalDomainmodel.g:253:1: entryRuleUNCHECK : ruleUNCHECK EOF ;
    public final void entryRuleUNCHECK() throws RecognitionException {
        try {
            // InternalDomainmodel.g:254:1: ( ruleUNCHECK EOF )
            // InternalDomainmodel.g:255:1: ruleUNCHECK EOF
            {
             before(grammarAccess.getUNCHECKRule()); 
            pushFollow(FOLLOW_1);
            ruleUNCHECK();

            state._fsp--;

             after(grammarAccess.getUNCHECKRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUNCHECK"


    // $ANTLR start "ruleUNCHECK"
    // InternalDomainmodel.g:262:1: ruleUNCHECK : ( ( rule__UNCHECK__Group__0 ) ) ;
    public final void ruleUNCHECK() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:266:2: ( ( ( rule__UNCHECK__Group__0 ) ) )
            // InternalDomainmodel.g:267:2: ( ( rule__UNCHECK__Group__0 ) )
            {
            // InternalDomainmodel.g:267:2: ( ( rule__UNCHECK__Group__0 ) )
            // InternalDomainmodel.g:268:3: ( rule__UNCHECK__Group__0 )
            {
             before(grammarAccess.getUNCHECKAccess().getGroup()); 
            // InternalDomainmodel.g:269:3: ( rule__UNCHECK__Group__0 )
            // InternalDomainmodel.g:269:4: rule__UNCHECK__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__UNCHECK__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUNCHECKAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUNCHECK"


    // $ANTLR start "entryRuleSELECT"
    // InternalDomainmodel.g:278:1: entryRuleSELECT : ruleSELECT EOF ;
    public final void entryRuleSELECT() throws RecognitionException {
        try {
            // InternalDomainmodel.g:279:1: ( ruleSELECT EOF )
            // InternalDomainmodel.g:280:1: ruleSELECT EOF
            {
             before(grammarAccess.getSELECTRule()); 
            pushFollow(FOLLOW_1);
            ruleSELECT();

            state._fsp--;

             after(grammarAccess.getSELECTRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSELECT"


    // $ANTLR start "ruleSELECT"
    // InternalDomainmodel.g:287:1: ruleSELECT : ( ( rule__SELECT__Group__0 ) ) ;
    public final void ruleSELECT() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:291:2: ( ( ( rule__SELECT__Group__0 ) ) )
            // InternalDomainmodel.g:292:2: ( ( rule__SELECT__Group__0 ) )
            {
            // InternalDomainmodel.g:292:2: ( ( rule__SELECT__Group__0 ) )
            // InternalDomainmodel.g:293:3: ( rule__SELECT__Group__0 )
            {
             before(grammarAccess.getSELECTAccess().getGroup()); 
            // InternalDomainmodel.g:294:3: ( rule__SELECT__Group__0 )
            // InternalDomainmodel.g:294:4: rule__SELECT__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SELECT__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSELECTAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSELECT"


    // $ANTLR start "entryRuleREAD"
    // InternalDomainmodel.g:303:1: entryRuleREAD : ruleREAD EOF ;
    public final void entryRuleREAD() throws RecognitionException {
        try {
            // InternalDomainmodel.g:304:1: ( ruleREAD EOF )
            // InternalDomainmodel.g:305:1: ruleREAD EOF
            {
             before(grammarAccess.getREADRule()); 
            pushFollow(FOLLOW_1);
            ruleREAD();

            state._fsp--;

             after(grammarAccess.getREADRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleREAD"


    // $ANTLR start "ruleREAD"
    // InternalDomainmodel.g:312:1: ruleREAD : ( ( rule__READ__Group__0 ) ) ;
    public final void ruleREAD() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:316:2: ( ( ( rule__READ__Group__0 ) ) )
            // InternalDomainmodel.g:317:2: ( ( rule__READ__Group__0 ) )
            {
            // InternalDomainmodel.g:317:2: ( ( rule__READ__Group__0 ) )
            // InternalDomainmodel.g:318:3: ( rule__READ__Group__0 )
            {
             before(grammarAccess.getREADAccess().getGroup()); 
            // InternalDomainmodel.g:319:3: ( rule__READ__Group__0 )
            // InternalDomainmodel.g:319:4: rule__READ__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__READ__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getREADAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleREAD"


    // $ANTLR start "entryRuleELEMENTIDENTIFIER"
    // InternalDomainmodel.g:328:1: entryRuleELEMENTIDENTIFIER : ruleELEMENTIDENTIFIER EOF ;
    public final void entryRuleELEMENTIDENTIFIER() throws RecognitionException {
        try {
            // InternalDomainmodel.g:329:1: ( ruleELEMENTIDENTIFIER EOF )
            // InternalDomainmodel.g:330:1: ruleELEMENTIDENTIFIER EOF
            {
             before(grammarAccess.getELEMENTIDENTIFIERRule()); 
            pushFollow(FOLLOW_1);
            ruleELEMENTIDENTIFIER();

            state._fsp--;

             after(grammarAccess.getELEMENTIDENTIFIERRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleELEMENTIDENTIFIER"


    // $ANTLR start "ruleELEMENTIDENTIFIER"
    // InternalDomainmodel.g:337:1: ruleELEMENTIDENTIFIER : ( ( rule__ELEMENTIDENTIFIER__Group__0 ) ) ;
    public final void ruleELEMENTIDENTIFIER() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:341:2: ( ( ( rule__ELEMENTIDENTIFIER__Group__0 ) ) )
            // InternalDomainmodel.g:342:2: ( ( rule__ELEMENTIDENTIFIER__Group__0 ) )
            {
            // InternalDomainmodel.g:342:2: ( ( rule__ELEMENTIDENTIFIER__Group__0 ) )
            // InternalDomainmodel.g:343:3: ( rule__ELEMENTIDENTIFIER__Group__0 )
            {
             before(grammarAccess.getELEMENTIDENTIFIERAccess().getGroup()); 
            // InternalDomainmodel.g:344:3: ( rule__ELEMENTIDENTIFIER__Group__0 )
            // InternalDomainmodel.g:344:4: rule__ELEMENTIDENTIFIER__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ELEMENTIDENTIFIER__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getELEMENTIDENTIFIERAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleELEMENTIDENTIFIER"


    // $ANTLR start "entryRuleVERIFY"
    // InternalDomainmodel.g:353:1: entryRuleVERIFY : ruleVERIFY EOF ;
    public final void entryRuleVERIFY() throws RecognitionException {
        try {
            // InternalDomainmodel.g:354:1: ( ruleVERIFY EOF )
            // InternalDomainmodel.g:355:1: ruleVERIFY EOF
            {
             before(grammarAccess.getVERIFYRule()); 
            pushFollow(FOLLOW_1);
            ruleVERIFY();

            state._fsp--;

             after(grammarAccess.getVERIFYRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVERIFY"


    // $ANTLR start "ruleVERIFY"
    // InternalDomainmodel.g:362:1: ruleVERIFY : ( ( rule__VERIFY__Group__0 ) ) ;
    public final void ruleVERIFY() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:366:2: ( ( ( rule__VERIFY__Group__0 ) ) )
            // InternalDomainmodel.g:367:2: ( ( rule__VERIFY__Group__0 ) )
            {
            // InternalDomainmodel.g:367:2: ( ( rule__VERIFY__Group__0 ) )
            // InternalDomainmodel.g:368:3: ( rule__VERIFY__Group__0 )
            {
             before(grammarAccess.getVERIFYAccess().getGroup()); 
            // InternalDomainmodel.g:369:3: ( rule__VERIFY__Group__0 )
            // InternalDomainmodel.g:369:4: rule__VERIFY__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VERIFY__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVERIFYAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVERIFY"


    // $ANTLR start "entryRuleCOUNT"
    // InternalDomainmodel.g:378:1: entryRuleCOUNT : ruleCOUNT EOF ;
    public final void entryRuleCOUNT() throws RecognitionException {
        try {
            // InternalDomainmodel.g:379:1: ( ruleCOUNT EOF )
            // InternalDomainmodel.g:380:1: ruleCOUNT EOF
            {
             before(grammarAccess.getCOUNTRule()); 
            pushFollow(FOLLOW_1);
            ruleCOUNT();

            state._fsp--;

             after(grammarAccess.getCOUNTRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCOUNT"


    // $ANTLR start "ruleCOUNT"
    // InternalDomainmodel.g:387:1: ruleCOUNT : ( ( rule__COUNT__Group__0 ) ) ;
    public final void ruleCOUNT() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:391:2: ( ( ( rule__COUNT__Group__0 ) ) )
            // InternalDomainmodel.g:392:2: ( ( rule__COUNT__Group__0 ) )
            {
            // InternalDomainmodel.g:392:2: ( ( rule__COUNT__Group__0 ) )
            // InternalDomainmodel.g:393:3: ( rule__COUNT__Group__0 )
            {
             before(grammarAccess.getCOUNTAccess().getGroup()); 
            // InternalDomainmodel.g:394:3: ( rule__COUNT__Group__0 )
            // InternalDomainmodel.g:394:4: rule__COUNT__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__COUNT__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCOUNTAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCOUNT"


    // $ANTLR start "entryRuleSAVEVAR"
    // InternalDomainmodel.g:403:1: entryRuleSAVEVAR : ruleSAVEVAR EOF ;
    public final void entryRuleSAVEVAR() throws RecognitionException {
        try {
            // InternalDomainmodel.g:404:1: ( ruleSAVEVAR EOF )
            // InternalDomainmodel.g:405:1: ruleSAVEVAR EOF
            {
             before(grammarAccess.getSAVEVARRule()); 
            pushFollow(FOLLOW_1);
            ruleSAVEVAR();

            state._fsp--;

             after(grammarAccess.getSAVEVARRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSAVEVAR"


    // $ANTLR start "ruleSAVEVAR"
    // InternalDomainmodel.g:412:1: ruleSAVEVAR : ( ( rule__SAVEVAR__Group__0 ) ) ;
    public final void ruleSAVEVAR() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:416:2: ( ( ( rule__SAVEVAR__Group__0 ) ) )
            // InternalDomainmodel.g:417:2: ( ( rule__SAVEVAR__Group__0 ) )
            {
            // InternalDomainmodel.g:417:2: ( ( rule__SAVEVAR__Group__0 ) )
            // InternalDomainmodel.g:418:3: ( rule__SAVEVAR__Group__0 )
            {
             before(grammarAccess.getSAVEVARAccess().getGroup()); 
            // InternalDomainmodel.g:419:3: ( rule__SAVEVAR__Group__0 )
            // InternalDomainmodel.g:419:4: rule__SAVEVAR__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SAVEVAR__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSAVEVARAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSAVEVAR"


    // $ANTLR start "entryRulePLAY"
    // InternalDomainmodel.g:428:1: entryRulePLAY : rulePLAY EOF ;
    public final void entryRulePLAY() throws RecognitionException {
        try {
            // InternalDomainmodel.g:429:1: ( rulePLAY EOF )
            // InternalDomainmodel.g:430:1: rulePLAY EOF
            {
             before(grammarAccess.getPLAYRule()); 
            pushFollow(FOLLOW_1);
            rulePLAY();

            state._fsp--;

             after(grammarAccess.getPLAYRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePLAY"


    // $ANTLR start "rulePLAY"
    // InternalDomainmodel.g:437:1: rulePLAY : ( ( rule__PLAY__Group__0 ) ) ;
    public final void rulePLAY() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:441:2: ( ( ( rule__PLAY__Group__0 ) ) )
            // InternalDomainmodel.g:442:2: ( ( rule__PLAY__Group__0 ) )
            {
            // InternalDomainmodel.g:442:2: ( ( rule__PLAY__Group__0 ) )
            // InternalDomainmodel.g:443:3: ( rule__PLAY__Group__0 )
            {
             before(grammarAccess.getPLAYAccess().getGroup()); 
            // InternalDomainmodel.g:444:3: ( rule__PLAY__Group__0 )
            // InternalDomainmodel.g:444:4: rule__PLAY__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PLAY__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPLAYAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePLAY"


    // $ANTLR start "rule__INSTRUCTION__Alternatives"
    // InternalDomainmodel.g:452:1: rule__INSTRUCTION__Alternatives : ( ( ruleOPEN ) | ( ruleCLICK ) | ( ruleCHECK ) | ( ruleUNCHECK ) | ( ruleREAD ) | ( ruleCOUNT ) | ( ruleVERIFY ) | ( ruleSELECT ) | ( ruleGOTO ) | ( ruleFILL ) | ( rulePLAY ) );
    public final void rule__INSTRUCTION__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:456:1: ( ( ruleOPEN ) | ( ruleCLICK ) | ( ruleCHECK ) | ( ruleUNCHECK ) | ( ruleREAD ) | ( ruleCOUNT ) | ( ruleVERIFY ) | ( ruleSELECT ) | ( ruleGOTO ) | ( ruleFILL ) | ( rulePLAY ) )
            int alt2=11;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt2=1;
                }
                break;
            case 46:
                {
                alt2=2;
                }
                break;
            case 48:
                {
                alt2=3;
                }
                break;
            case 49:
                {
                alt2=4;
                }
                break;
            case 51:
                {
                alt2=5;
                }
                break;
            case 53:
                {
                alt2=6;
                }
                break;
            case 52:
                {
                alt2=7;
                }
                break;
            case 50:
                {
                alt2=8;
                }
                break;
            case 45:
                {
                alt2=9;
                }
                break;
            case 47:
                {
                alt2=10;
                }
                break;
            case 54:
                {
                alt2=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalDomainmodel.g:457:2: ( ruleOPEN )
                    {
                    // InternalDomainmodel.g:457:2: ( ruleOPEN )
                    // InternalDomainmodel.g:458:3: ruleOPEN
                    {
                     before(grammarAccess.getINSTRUCTIONAccess().getOPENParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleOPEN();

                    state._fsp--;

                     after(grammarAccess.getINSTRUCTIONAccess().getOPENParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDomainmodel.g:463:2: ( ruleCLICK )
                    {
                    // InternalDomainmodel.g:463:2: ( ruleCLICK )
                    // InternalDomainmodel.g:464:3: ruleCLICK
                    {
                     before(grammarAccess.getINSTRUCTIONAccess().getCLICKParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleCLICK();

                    state._fsp--;

                     after(grammarAccess.getINSTRUCTIONAccess().getCLICKParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDomainmodel.g:469:2: ( ruleCHECK )
                    {
                    // InternalDomainmodel.g:469:2: ( ruleCHECK )
                    // InternalDomainmodel.g:470:3: ruleCHECK
                    {
                     before(grammarAccess.getINSTRUCTIONAccess().getCHECKParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleCHECK();

                    state._fsp--;

                     after(grammarAccess.getINSTRUCTIONAccess().getCHECKParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDomainmodel.g:475:2: ( ruleUNCHECK )
                    {
                    // InternalDomainmodel.g:475:2: ( ruleUNCHECK )
                    // InternalDomainmodel.g:476:3: ruleUNCHECK
                    {
                     before(grammarAccess.getINSTRUCTIONAccess().getUNCHECKParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleUNCHECK();

                    state._fsp--;

                     after(grammarAccess.getINSTRUCTIONAccess().getUNCHECKParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalDomainmodel.g:481:2: ( ruleREAD )
                    {
                    // InternalDomainmodel.g:481:2: ( ruleREAD )
                    // InternalDomainmodel.g:482:3: ruleREAD
                    {
                     before(grammarAccess.getINSTRUCTIONAccess().getREADParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleREAD();

                    state._fsp--;

                     after(grammarAccess.getINSTRUCTIONAccess().getREADParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalDomainmodel.g:487:2: ( ruleCOUNT )
                    {
                    // InternalDomainmodel.g:487:2: ( ruleCOUNT )
                    // InternalDomainmodel.g:488:3: ruleCOUNT
                    {
                     before(grammarAccess.getINSTRUCTIONAccess().getCOUNTParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleCOUNT();

                    state._fsp--;

                     after(grammarAccess.getINSTRUCTIONAccess().getCOUNTParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalDomainmodel.g:493:2: ( ruleVERIFY )
                    {
                    // InternalDomainmodel.g:493:2: ( ruleVERIFY )
                    // InternalDomainmodel.g:494:3: ruleVERIFY
                    {
                     before(grammarAccess.getINSTRUCTIONAccess().getVERIFYParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleVERIFY();

                    state._fsp--;

                     after(grammarAccess.getINSTRUCTIONAccess().getVERIFYParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalDomainmodel.g:499:2: ( ruleSELECT )
                    {
                    // InternalDomainmodel.g:499:2: ( ruleSELECT )
                    // InternalDomainmodel.g:500:3: ruleSELECT
                    {
                     before(grammarAccess.getINSTRUCTIONAccess().getSELECTParserRuleCall_7()); 
                    pushFollow(FOLLOW_2);
                    ruleSELECT();

                    state._fsp--;

                     after(grammarAccess.getINSTRUCTIONAccess().getSELECTParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalDomainmodel.g:505:2: ( ruleGOTO )
                    {
                    // InternalDomainmodel.g:505:2: ( ruleGOTO )
                    // InternalDomainmodel.g:506:3: ruleGOTO
                    {
                     before(grammarAccess.getINSTRUCTIONAccess().getGOTOParserRuleCall_8()); 
                    pushFollow(FOLLOW_2);
                    ruleGOTO();

                    state._fsp--;

                     after(grammarAccess.getINSTRUCTIONAccess().getGOTOParserRuleCall_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalDomainmodel.g:511:2: ( ruleFILL )
                    {
                    // InternalDomainmodel.g:511:2: ( ruleFILL )
                    // InternalDomainmodel.g:512:3: ruleFILL
                    {
                     before(grammarAccess.getINSTRUCTIONAccess().getFILLParserRuleCall_9()); 
                    pushFollow(FOLLOW_2);
                    ruleFILL();

                    state._fsp--;

                     after(grammarAccess.getINSTRUCTIONAccess().getFILLParserRuleCall_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalDomainmodel.g:517:2: ( rulePLAY )
                    {
                    // InternalDomainmodel.g:517:2: ( rulePLAY )
                    // InternalDomainmodel.g:518:3: rulePLAY
                    {
                     before(grammarAccess.getINSTRUCTIONAccess().getPLAYParserRuleCall_10()); 
                    pushFollow(FOLLOW_2);
                    rulePLAY();

                    state._fsp--;

                     after(grammarAccess.getINSTRUCTIONAccess().getPLAYParserRuleCall_10()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__INSTRUCTION__Alternatives"


    // $ANTLR start "rule__OPEN__ValueAlternatives_1_0"
    // InternalDomainmodel.g:527:1: rule__OPEN__ValueAlternatives_1_0 : ( ( 'FIREFOX' ) | ( 'CHROME' ) );
    public final void rule__OPEN__ValueAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:531:1: ( ( 'FIREFOX' ) | ( 'CHROME' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            else if ( (LA3_0==13) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalDomainmodel.g:532:2: ( 'FIREFOX' )
                    {
                    // InternalDomainmodel.g:532:2: ( 'FIREFOX' )
                    // InternalDomainmodel.g:533:3: 'FIREFOX'
                    {
                     before(grammarAccess.getOPENAccess().getValueFIREFOXKeyword_1_0_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getOPENAccess().getValueFIREFOXKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDomainmodel.g:538:2: ( 'CHROME' )
                    {
                    // InternalDomainmodel.g:538:2: ( 'CHROME' )
                    // InternalDomainmodel.g:539:3: 'CHROME'
                    {
                     before(grammarAccess.getOPENAccess().getValueCHROMEKeyword_1_0_1()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getOPENAccess().getValueCHROMEKeyword_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OPEN__ValueAlternatives_1_0"


    // $ANTLR start "rule__CLICK__TypeAlternatives_2_0"
    // InternalDomainmodel.g:548:1: rule__CLICK__TypeAlternatives_2_0 : ( ( 'BUTTON' ) | ( 'LINK' ) | ( 'IMAGE' ) | ( 'TEXT' ) );
    public final void rule__CLICK__TypeAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:552:1: ( ( 'BUTTON' ) | ( 'LINK' ) | ( 'IMAGE' ) | ( 'TEXT' ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt4=1;
                }
                break;
            case 15:
                {
                alt4=2;
                }
                break;
            case 16:
                {
                alt4=3;
                }
                break;
            case 17:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalDomainmodel.g:553:2: ( 'BUTTON' )
                    {
                    // InternalDomainmodel.g:553:2: ( 'BUTTON' )
                    // InternalDomainmodel.g:554:3: 'BUTTON'
                    {
                     before(grammarAccess.getCLICKAccess().getTypeBUTTONKeyword_2_0_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getCLICKAccess().getTypeBUTTONKeyword_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDomainmodel.g:559:2: ( 'LINK' )
                    {
                    // InternalDomainmodel.g:559:2: ( 'LINK' )
                    // InternalDomainmodel.g:560:3: 'LINK'
                    {
                     before(grammarAccess.getCLICKAccess().getTypeLINKKeyword_2_0_1()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getCLICKAccess().getTypeLINKKeyword_2_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDomainmodel.g:565:2: ( 'IMAGE' )
                    {
                    // InternalDomainmodel.g:565:2: ( 'IMAGE' )
                    // InternalDomainmodel.g:566:3: 'IMAGE'
                    {
                     before(grammarAccess.getCLICKAccess().getTypeIMAGEKeyword_2_0_2()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getCLICKAccess().getTypeIMAGEKeyword_2_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDomainmodel.g:571:2: ( 'TEXT' )
                    {
                    // InternalDomainmodel.g:571:2: ( 'TEXT' )
                    // InternalDomainmodel.g:572:3: 'TEXT'
                    {
                     before(grammarAccess.getCLICKAccess().getTypeTEXTKeyword_2_0_3()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getCLICKAccess().getTypeTEXTKeyword_2_0_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CLICK__TypeAlternatives_2_0"


    // $ANTLR start "rule__FILL__Alternatives_1"
    // InternalDomainmodel.g:581:1: rule__FILL__Alternatives_1 : ( ( 'TEXTFIELD' ) | ( 'SEARCHFIELD' ) );
    public final void rule__FILL__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:585:1: ( ( 'TEXTFIELD' ) | ( 'SEARCHFIELD' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            else if ( (LA5_0==19) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalDomainmodel.g:586:2: ( 'TEXTFIELD' )
                    {
                    // InternalDomainmodel.g:586:2: ( 'TEXTFIELD' )
                    // InternalDomainmodel.g:587:3: 'TEXTFIELD'
                    {
                     before(grammarAccess.getFILLAccess().getTEXTFIELDKeyword_1_0()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getFILLAccess().getTEXTFIELDKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDomainmodel.g:592:2: ( 'SEARCHFIELD' )
                    {
                    // InternalDomainmodel.g:592:2: ( 'SEARCHFIELD' )
                    // InternalDomainmodel.g:593:3: 'SEARCHFIELD'
                    {
                     before(grammarAccess.getFILLAccess().getSEARCHFIELDKeyword_1_1()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getFILLAccess().getSEARCHFIELDKeyword_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FILL__Alternatives_1"


    // $ANTLR start "rule__FILL__Alternatives_4"
    // InternalDomainmodel.g:602:1: rule__FILL__Alternatives_4 : ( ( ( rule__FILL__Group_4_0__0 ) ) | ( ( rule__FILL__ValueAssignment_4_1 ) ) );
    public final void rule__FILL__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:606:1: ( ( ( rule__FILL__Group_4_0__0 ) ) | ( ( rule__FILL__ValueAssignment_4_1 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==29) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_STRING) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalDomainmodel.g:607:2: ( ( rule__FILL__Group_4_0__0 ) )
                    {
                    // InternalDomainmodel.g:607:2: ( ( rule__FILL__Group_4_0__0 ) )
                    // InternalDomainmodel.g:608:3: ( rule__FILL__Group_4_0__0 )
                    {
                     before(grammarAccess.getFILLAccess().getGroup_4_0()); 
                    // InternalDomainmodel.g:609:3: ( rule__FILL__Group_4_0__0 )
                    // InternalDomainmodel.g:609:4: rule__FILL__Group_4_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FILL__Group_4_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFILLAccess().getGroup_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDomainmodel.g:613:2: ( ( rule__FILL__ValueAssignment_4_1 ) )
                    {
                    // InternalDomainmodel.g:613:2: ( ( rule__FILL__ValueAssignment_4_1 ) )
                    // InternalDomainmodel.g:614:3: ( rule__FILL__ValueAssignment_4_1 )
                    {
                     before(grammarAccess.getFILLAccess().getValueAssignment_4_1()); 
                    // InternalDomainmodel.g:615:3: ( rule__FILL__ValueAssignment_4_1 )
                    // InternalDomainmodel.g:615:4: rule__FILL__ValueAssignment_4_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__FILL__ValueAssignment_4_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getFILLAccess().getValueAssignment_4_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FILL__Alternatives_4"


    // $ANTLR start "rule__READ__Alternatives_3"
    // InternalDomainmodel.g:623:1: rule__READ__Alternatives_3 : ( ( 'BUTTON' ) | ( 'LINK' ) | ( 'IMAGE' ) | ( 'TEXT' ) );
    public final void rule__READ__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:627:1: ( ( 'BUTTON' ) | ( 'LINK' ) | ( 'IMAGE' ) | ( 'TEXT' ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt7=1;
                }
                break;
            case 15:
                {
                alt7=2;
                }
                break;
            case 16:
                {
                alt7=3;
                }
                break;
            case 17:
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalDomainmodel.g:628:2: ( 'BUTTON' )
                    {
                    // InternalDomainmodel.g:628:2: ( 'BUTTON' )
                    // InternalDomainmodel.g:629:3: 'BUTTON'
                    {
                     before(grammarAccess.getREADAccess().getBUTTONKeyword_3_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getREADAccess().getBUTTONKeyword_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDomainmodel.g:634:2: ( 'LINK' )
                    {
                    // InternalDomainmodel.g:634:2: ( 'LINK' )
                    // InternalDomainmodel.g:635:3: 'LINK'
                    {
                     before(grammarAccess.getREADAccess().getLINKKeyword_3_1()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getREADAccess().getLINKKeyword_3_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDomainmodel.g:640:2: ( 'IMAGE' )
                    {
                    // InternalDomainmodel.g:640:2: ( 'IMAGE' )
                    // InternalDomainmodel.g:641:3: 'IMAGE'
                    {
                     before(grammarAccess.getREADAccess().getIMAGEKeyword_3_2()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getREADAccess().getIMAGEKeyword_3_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDomainmodel.g:646:2: ( 'TEXT' )
                    {
                    // InternalDomainmodel.g:646:2: ( 'TEXT' )
                    // InternalDomainmodel.g:647:3: 'TEXT'
                    {
                     before(grammarAccess.getREADAccess().getTEXTKeyword_3_3()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getREADAccess().getTEXTKeyword_3_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__READ__Alternatives_3"


    // $ANTLR start "rule__ELEMENTIDENTIFIER__Alternatives_2"
    // InternalDomainmodel.g:656:1: rule__ELEMENTIDENTIFIER__Alternatives_2 : ( ( 'LABEL' ) | ( 'CLASS' ) | ( 'ID' ) | ( 'ALT' ) );
    public final void rule__ELEMENTIDENTIFIER__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:660:1: ( ( 'LABEL' ) | ( 'CLASS' ) | ( 'ID' ) | ( 'ALT' ) )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt8=1;
                }
                break;
            case 21:
                {
                alt8=2;
                }
                break;
            case 22:
                {
                alt8=3;
                }
                break;
            case 23:
                {
                alt8=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalDomainmodel.g:661:2: ( 'LABEL' )
                    {
                    // InternalDomainmodel.g:661:2: ( 'LABEL' )
                    // InternalDomainmodel.g:662:3: 'LABEL'
                    {
                     before(grammarAccess.getELEMENTIDENTIFIERAccess().getLABELKeyword_2_0()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getELEMENTIDENTIFIERAccess().getLABELKeyword_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDomainmodel.g:667:2: ( 'CLASS' )
                    {
                    // InternalDomainmodel.g:667:2: ( 'CLASS' )
                    // InternalDomainmodel.g:668:3: 'CLASS'
                    {
                     before(grammarAccess.getELEMENTIDENTIFIERAccess().getCLASSKeyword_2_1()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getELEMENTIDENTIFIERAccess().getCLASSKeyword_2_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDomainmodel.g:673:2: ( 'ID' )
                    {
                    // InternalDomainmodel.g:673:2: ( 'ID' )
                    // InternalDomainmodel.g:674:3: 'ID'
                    {
                     before(grammarAccess.getELEMENTIDENTIFIERAccess().getIDKeyword_2_2()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getELEMENTIDENTIFIERAccess().getIDKeyword_2_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDomainmodel.g:679:2: ( 'ALT' )
                    {
                    // InternalDomainmodel.g:679:2: ( 'ALT' )
                    // InternalDomainmodel.g:680:3: 'ALT'
                    {
                     before(grammarAccess.getELEMENTIDENTIFIERAccess().getALTKeyword_2_3()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getELEMENTIDENTIFIERAccess().getALTKeyword_2_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ELEMENTIDENTIFIER__Alternatives_2"


    // $ANTLR start "rule__ELEMENTIDENTIFIER__Alternatives_3"
    // InternalDomainmodel.g:689:1: rule__ELEMENTIDENTIFIER__Alternatives_3 : ( ( RULE_STRING ) | ( ( rule__ELEMENTIDENTIFIER__Group_3_1__0 ) ) );
    public final void rule__ELEMENTIDENTIFIER__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:693:1: ( ( RULE_STRING ) | ( ( rule__ELEMENTIDENTIFIER__Group_3_1__0 ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            else if ( (LA9_0==27) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalDomainmodel.g:694:2: ( RULE_STRING )
                    {
                    // InternalDomainmodel.g:694:2: ( RULE_STRING )
                    // InternalDomainmodel.g:695:3: RULE_STRING
                    {
                     before(grammarAccess.getELEMENTIDENTIFIERAccess().getSTRINGTerminalRuleCall_3_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getELEMENTIDENTIFIERAccess().getSTRINGTerminalRuleCall_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDomainmodel.g:700:2: ( ( rule__ELEMENTIDENTIFIER__Group_3_1__0 ) )
                    {
                    // InternalDomainmodel.g:700:2: ( ( rule__ELEMENTIDENTIFIER__Group_3_1__0 ) )
                    // InternalDomainmodel.g:701:3: ( rule__ELEMENTIDENTIFIER__Group_3_1__0 )
                    {
                     before(grammarAccess.getELEMENTIDENTIFIERAccess().getGroup_3_1()); 
                    // InternalDomainmodel.g:702:3: ( rule__ELEMENTIDENTIFIER__Group_3_1__0 )
                    // InternalDomainmodel.g:702:4: rule__ELEMENTIDENTIFIER__Group_3_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ELEMENTIDENTIFIER__Group_3_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getELEMENTIDENTIFIERAccess().getGroup_3_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ELEMENTIDENTIFIER__Alternatives_3"


    // $ANTLR start "rule__VERIFY__Alternatives_2"
    // InternalDomainmodel.g:710:1: rule__VERIFY__Alternatives_2 : ( ( ( rule__VERIFY__CountAssignment_2_0 ) ) | ( ( rule__VERIFY__Group_2_1__0 ) ) );
    public final void rule__VERIFY__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:714:1: ( ( ( rule__VERIFY__CountAssignment_2_0 ) ) | ( ( rule__VERIFY__Group_2_1__0 ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==53) ) {
                alt10=1;
            }
            else if ( (LA10_0==17||LA10_0==24) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalDomainmodel.g:715:2: ( ( rule__VERIFY__CountAssignment_2_0 ) )
                    {
                    // InternalDomainmodel.g:715:2: ( ( rule__VERIFY__CountAssignment_2_0 ) )
                    // InternalDomainmodel.g:716:3: ( rule__VERIFY__CountAssignment_2_0 )
                    {
                     before(grammarAccess.getVERIFYAccess().getCountAssignment_2_0()); 
                    // InternalDomainmodel.g:717:3: ( rule__VERIFY__CountAssignment_2_0 )
                    // InternalDomainmodel.g:717:4: rule__VERIFY__CountAssignment_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VERIFY__CountAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getVERIFYAccess().getCountAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDomainmodel.g:721:2: ( ( rule__VERIFY__Group_2_1__0 ) )
                    {
                    // InternalDomainmodel.g:721:2: ( ( rule__VERIFY__Group_2_1__0 ) )
                    // InternalDomainmodel.g:722:3: ( rule__VERIFY__Group_2_1__0 )
                    {
                     before(grammarAccess.getVERIFYAccess().getGroup_2_1()); 
                    // InternalDomainmodel.g:723:3: ( rule__VERIFY__Group_2_1__0 )
                    // InternalDomainmodel.g:723:4: rule__VERIFY__Group_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VERIFY__Group_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getVERIFYAccess().getGroup_2_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VERIFY__Alternatives_2"


    // $ANTLR start "rule__VERIFY__Alternatives_2_1_0"
    // InternalDomainmodel.g:731:1: rule__VERIFY__Alternatives_2_1_0 : ( ( 'PAGE' ) | ( 'TEXT' ) );
    public final void rule__VERIFY__Alternatives_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:735:1: ( ( 'PAGE' ) | ( 'TEXT' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==24) ) {
                alt11=1;
            }
            else if ( (LA11_0==17) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalDomainmodel.g:736:2: ( 'PAGE' )
                    {
                    // InternalDomainmodel.g:736:2: ( 'PAGE' )
                    // InternalDomainmodel.g:737:3: 'PAGE'
                    {
                     before(grammarAccess.getVERIFYAccess().getPAGEKeyword_2_1_0_0()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getVERIFYAccess().getPAGEKeyword_2_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDomainmodel.g:742:2: ( 'TEXT' )
                    {
                    // InternalDomainmodel.g:742:2: ( 'TEXT' )
                    // InternalDomainmodel.g:743:3: 'TEXT'
                    {
                     before(grammarAccess.getVERIFYAccess().getTEXTKeyword_2_1_0_1()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getVERIFYAccess().getTEXTKeyword_2_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VERIFY__Alternatives_2_1_0"


    // $ANTLR start "rule__VERIFY__Alternatives_3"
    // InternalDomainmodel.g:752:1: rule__VERIFY__Alternatives_3 : ( ( ( rule__VERIFY__Group_3_0__0 ) ) | ( ( rule__VERIFY__Group_3_1__0 ) ) );
    public final void rule__VERIFY__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:756:1: ( ( ( rule__VERIFY__Group_3_0__0 ) ) | ( ( rule__VERIFY__Group_3_1__0 ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==39) ) {
                alt12=1;
            }
            else if ( (LA12_0==40) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalDomainmodel.g:757:2: ( ( rule__VERIFY__Group_3_0__0 ) )
                    {
                    // InternalDomainmodel.g:757:2: ( ( rule__VERIFY__Group_3_0__0 ) )
                    // InternalDomainmodel.g:758:3: ( rule__VERIFY__Group_3_0__0 )
                    {
                     before(grammarAccess.getVERIFYAccess().getGroup_3_0()); 
                    // InternalDomainmodel.g:759:3: ( rule__VERIFY__Group_3_0__0 )
                    // InternalDomainmodel.g:759:4: rule__VERIFY__Group_3_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VERIFY__Group_3_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getVERIFYAccess().getGroup_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDomainmodel.g:763:2: ( ( rule__VERIFY__Group_3_1__0 ) )
                    {
                    // InternalDomainmodel.g:763:2: ( ( rule__VERIFY__Group_3_1__0 ) )
                    // InternalDomainmodel.g:764:3: ( rule__VERIFY__Group_3_1__0 )
                    {
                     before(grammarAccess.getVERIFYAccess().getGroup_3_1()); 
                    // InternalDomainmodel.g:765:3: ( rule__VERIFY__Group_3_1__0 )
                    // InternalDomainmodel.g:765:4: rule__VERIFY__Group_3_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VERIFY__Group_3_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getVERIFYAccess().getGroup_3_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VERIFY__Alternatives_3"


    // $ANTLR start "rule__VERIFY__Alternatives_3_0_1"
    // InternalDomainmodel.g:773:1: rule__VERIFY__Alternatives_3_0_1 : ( ( ( rule__VERIFY__Group_3_0_1_0__0 ) ) | ( ( rule__VERIFY__ValueAssignment_3_0_1_1 ) ) | ( ( rule__VERIFY__Group_3_0_1_2__0 ) ) );
    public final void rule__VERIFY__Alternatives_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:777:1: ( ( ( rule__VERIFY__Group_3_0_1_0__0 ) ) | ( ( rule__VERIFY__ValueAssignment_3_0_1_1 ) ) | ( ( rule__VERIFY__Group_3_0_1_2__0 ) ) )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 15:
            case 16:
                {
                alt13=1;
                }
                break;
            case RULE_STRING:
                {
                alt13=2;
                }
                break;
            case 29:
                {
                alt13=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalDomainmodel.g:778:2: ( ( rule__VERIFY__Group_3_0_1_0__0 ) )
                    {
                    // InternalDomainmodel.g:778:2: ( ( rule__VERIFY__Group_3_0_1_0__0 ) )
                    // InternalDomainmodel.g:779:3: ( rule__VERIFY__Group_3_0_1_0__0 )
                    {
                     before(grammarAccess.getVERIFYAccess().getGroup_3_0_1_0()); 
                    // InternalDomainmodel.g:780:3: ( rule__VERIFY__Group_3_0_1_0__0 )
                    // InternalDomainmodel.g:780:4: rule__VERIFY__Group_3_0_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VERIFY__Group_3_0_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getVERIFYAccess().getGroup_3_0_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDomainmodel.g:784:2: ( ( rule__VERIFY__ValueAssignment_3_0_1_1 ) )
                    {
                    // InternalDomainmodel.g:784:2: ( ( rule__VERIFY__ValueAssignment_3_0_1_1 ) )
                    // InternalDomainmodel.g:785:3: ( rule__VERIFY__ValueAssignment_3_0_1_1 )
                    {
                     before(grammarAccess.getVERIFYAccess().getValueAssignment_3_0_1_1()); 
                    // InternalDomainmodel.g:786:3: ( rule__VERIFY__ValueAssignment_3_0_1_1 )
                    // InternalDomainmodel.g:786:4: rule__VERIFY__ValueAssignment_3_0_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__VERIFY__ValueAssignment_3_0_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getVERIFYAccess().getValueAssignment_3_0_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDomainmodel.g:790:2: ( ( rule__VERIFY__Group_3_0_1_2__0 ) )
                    {
                    // InternalDomainmodel.g:790:2: ( ( rule__VERIFY__Group_3_0_1_2__0 ) )
                    // InternalDomainmodel.g:791:3: ( rule__VERIFY__Group_3_0_1_2__0 )
                    {
                     before(grammarAccess.getVERIFYAccess().getGroup_3_0_1_2()); 
                    // InternalDomainmodel.g:792:3: ( rule__VERIFY__Group_3_0_1_2__0 )
                    // InternalDomainmodel.g:792:4: rule__VERIFY__Group_3_0_1_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VERIFY__Group_3_0_1_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getVERIFYAccess().getGroup_3_0_1_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VERIFY__Alternatives_3_0_1"


    // $ANTLR start "rule__VERIFY__Alternatives_3_0_1_0_0"
    // InternalDomainmodel.g:800:1: rule__VERIFY__Alternatives_3_0_1_0_0 : ( ( 'LINK' ) | ( 'IMAGE' ) );
    public final void rule__VERIFY__Alternatives_3_0_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:804:1: ( ( 'LINK' ) | ( 'IMAGE' ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==15) ) {
                alt14=1;
            }
            else if ( (LA14_0==16) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalDomainmodel.g:805:2: ( 'LINK' )
                    {
                    // InternalDomainmodel.g:805:2: ( 'LINK' )
                    // InternalDomainmodel.g:806:3: 'LINK'
                    {
                     before(grammarAccess.getVERIFYAccess().getLINKKeyword_3_0_1_0_0_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getVERIFYAccess().getLINKKeyword_3_0_1_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDomainmodel.g:811:2: ( 'IMAGE' )
                    {
                    // InternalDomainmodel.g:811:2: ( 'IMAGE' )
                    // InternalDomainmodel.g:812:3: 'IMAGE'
                    {
                     before(grammarAccess.getVERIFYAccess().getIMAGEKeyword_3_0_1_0_0_1()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getVERIFYAccess().getIMAGEKeyword_3_0_1_0_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VERIFY__Alternatives_3_0_1_0_0"


    // $ANTLR start "rule__VERIFY__Alternatives_3_1_1"
    // InternalDomainmodel.g:821:1: rule__VERIFY__Alternatives_3_1_1 : ( ( ( rule__VERIFY__Group_3_1_1_0__0 ) ) | ( ( rule__VERIFY__ValueAssignment_3_1_1_1 ) ) );
    public final void rule__VERIFY__Alternatives_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:825:1: ( ( ( rule__VERIFY__Group_3_1_1_0__0 ) ) | ( ( rule__VERIFY__ValueAssignment_3_1_1_1 ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==29) ) {
                alt15=1;
            }
            else if ( (LA15_0==RULE_STRING) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalDomainmodel.g:826:2: ( ( rule__VERIFY__Group_3_1_1_0__0 ) )
                    {
                    // InternalDomainmodel.g:826:2: ( ( rule__VERIFY__Group_3_1_1_0__0 ) )
                    // InternalDomainmodel.g:827:3: ( rule__VERIFY__Group_3_1_1_0__0 )
                    {
                     before(grammarAccess.getVERIFYAccess().getGroup_3_1_1_0()); 
                    // InternalDomainmodel.g:828:3: ( rule__VERIFY__Group_3_1_1_0__0 )
                    // InternalDomainmodel.g:828:4: rule__VERIFY__Group_3_1_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VERIFY__Group_3_1_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getVERIFYAccess().getGroup_3_1_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDomainmodel.g:832:2: ( ( rule__VERIFY__ValueAssignment_3_1_1_1 ) )
                    {
                    // InternalDomainmodel.g:832:2: ( ( rule__VERIFY__ValueAssignment_3_1_1_1 ) )
                    // InternalDomainmodel.g:833:3: ( rule__VERIFY__ValueAssignment_3_1_1_1 )
                    {
                     before(grammarAccess.getVERIFYAccess().getValueAssignment_3_1_1_1()); 
                    // InternalDomainmodel.g:834:3: ( rule__VERIFY__ValueAssignment_3_1_1_1 )
                    // InternalDomainmodel.g:834:4: rule__VERIFY__ValueAssignment_3_1_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__VERIFY__ValueAssignment_3_1_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getVERIFYAccess().getValueAssignment_3_1_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VERIFY__Alternatives_3_1_1"


    // $ANTLR start "rule__PROCEDURE__Group__0"
    // InternalDomainmodel.g:842:1: rule__PROCEDURE__Group__0 : rule__PROCEDURE__Group__0__Impl rule__PROCEDURE__Group__1 ;
    public final void rule__PROCEDURE__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:846:1: ( rule__PROCEDURE__Group__0__Impl rule__PROCEDURE__Group__1 )
            // InternalDomainmodel.g:847:2: rule__PROCEDURE__Group__0__Impl rule__PROCEDURE__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__PROCEDURE__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PROCEDURE__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PROCEDURE__Group__0"


    // $ANTLR start "rule__PROCEDURE__Group__0__Impl"
    // InternalDomainmodel.g:854:1: rule__PROCEDURE__Group__0__Impl : ( 'procedure' ) ;
    public final void rule__PROCEDURE__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:858:1: ( ( 'procedure' ) )
            // InternalDomainmodel.g:859:1: ( 'procedure' )
            {
            // InternalDomainmodel.g:859:1: ( 'procedure' )
            // InternalDomainmodel.g:860:2: 'procedure'
            {
             before(grammarAccess.getPROCEDUREAccess().getProcedureKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getPROCEDUREAccess().getProcedureKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PROCEDURE__Group__0__Impl"


    // $ANTLR start "rule__PROCEDURE__Group__1"
    // InternalDomainmodel.g:869:1: rule__PROCEDURE__Group__1 : rule__PROCEDURE__Group__1__Impl rule__PROCEDURE__Group__2 ;
    public final void rule__PROCEDURE__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:873:1: ( rule__PROCEDURE__Group__1__Impl rule__PROCEDURE__Group__2 )
            // InternalDomainmodel.g:874:2: rule__PROCEDURE__Group__1__Impl rule__PROCEDURE__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__PROCEDURE__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PROCEDURE__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PROCEDURE__Group__1"


    // $ANTLR start "rule__PROCEDURE__Group__1__Impl"
    // InternalDomainmodel.g:881:1: rule__PROCEDURE__Group__1__Impl : ( ( rule__PROCEDURE__NameAssignment_1 ) ) ;
    public final void rule__PROCEDURE__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:885:1: ( ( ( rule__PROCEDURE__NameAssignment_1 ) ) )
            // InternalDomainmodel.g:886:1: ( ( rule__PROCEDURE__NameAssignment_1 ) )
            {
            // InternalDomainmodel.g:886:1: ( ( rule__PROCEDURE__NameAssignment_1 ) )
            // InternalDomainmodel.g:887:2: ( rule__PROCEDURE__NameAssignment_1 )
            {
             before(grammarAccess.getPROCEDUREAccess().getNameAssignment_1()); 
            // InternalDomainmodel.g:888:2: ( rule__PROCEDURE__NameAssignment_1 )
            // InternalDomainmodel.g:888:3: rule__PROCEDURE__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PROCEDURE__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPROCEDUREAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PROCEDURE__Group__1__Impl"


    // $ANTLR start "rule__PROCEDURE__Group__2"
    // InternalDomainmodel.g:896:1: rule__PROCEDURE__Group__2 : rule__PROCEDURE__Group__2__Impl rule__PROCEDURE__Group__3 ;
    public final void rule__PROCEDURE__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:900:1: ( rule__PROCEDURE__Group__2__Impl rule__PROCEDURE__Group__3 )
            // InternalDomainmodel.g:901:2: rule__PROCEDURE__Group__2__Impl rule__PROCEDURE__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__PROCEDURE__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PROCEDURE__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PROCEDURE__Group__2"


    // $ANTLR start "rule__PROCEDURE__Group__2__Impl"
    // InternalDomainmodel.g:908:1: rule__PROCEDURE__Group__2__Impl : ( ( rule__PROCEDURE__Group_2__0 )? ) ;
    public final void rule__PROCEDURE__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:912:1: ( ( ( rule__PROCEDURE__Group_2__0 )? ) )
            // InternalDomainmodel.g:913:1: ( ( rule__PROCEDURE__Group_2__0 )? )
            {
            // InternalDomainmodel.g:913:1: ( ( rule__PROCEDURE__Group_2__0 )? )
            // InternalDomainmodel.g:914:2: ( rule__PROCEDURE__Group_2__0 )?
            {
             before(grammarAccess.getPROCEDUREAccess().getGroup_2()); 
            // InternalDomainmodel.g:915:2: ( rule__PROCEDURE__Group_2__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==26) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalDomainmodel.g:915:3: rule__PROCEDURE__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PROCEDURE__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPROCEDUREAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PROCEDURE__Group__2__Impl"


    // $ANTLR start "rule__PROCEDURE__Group__3"
    // InternalDomainmodel.g:923:1: rule__PROCEDURE__Group__3 : rule__PROCEDURE__Group__3__Impl ;
    public final void rule__PROCEDURE__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:927:1: ( rule__PROCEDURE__Group__3__Impl )
            // InternalDomainmodel.g:928:2: rule__PROCEDURE__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PROCEDURE__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PROCEDURE__Group__3"


    // $ANTLR start "rule__PROCEDURE__Group__3__Impl"
    // InternalDomainmodel.g:934:1: rule__PROCEDURE__Group__3__Impl : ( ( rule__PROCEDURE__InstAssignment_3 )* ) ;
    public final void rule__PROCEDURE__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:938:1: ( ( ( rule__PROCEDURE__InstAssignment_3 )* ) )
            // InternalDomainmodel.g:939:1: ( ( rule__PROCEDURE__InstAssignment_3 )* )
            {
            // InternalDomainmodel.g:939:1: ( ( rule__PROCEDURE__InstAssignment_3 )* )
            // InternalDomainmodel.g:940:2: ( rule__PROCEDURE__InstAssignment_3 )*
            {
             before(grammarAccess.getPROCEDUREAccess().getInstAssignment_3()); 
            // InternalDomainmodel.g:941:2: ( rule__PROCEDURE__InstAssignment_3 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=44 && LA17_0<=54)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalDomainmodel.g:941:3: rule__PROCEDURE__InstAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__PROCEDURE__InstAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getPROCEDUREAccess().getInstAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PROCEDURE__Group__3__Impl"


    // $ANTLR start "rule__PROCEDURE__Group_2__0"
    // InternalDomainmodel.g:950:1: rule__PROCEDURE__Group_2__0 : rule__PROCEDURE__Group_2__0__Impl rule__PROCEDURE__Group_2__1 ;
    public final void rule__PROCEDURE__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:954:1: ( rule__PROCEDURE__Group_2__0__Impl rule__PROCEDURE__Group_2__1 )
            // InternalDomainmodel.g:955:2: rule__PROCEDURE__Group_2__0__Impl rule__PROCEDURE__Group_2__1
            {
            pushFollow(FOLLOW_4);
            rule__PROCEDURE__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PROCEDURE__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PROCEDURE__Group_2__0"


    // $ANTLR start "rule__PROCEDURE__Group_2__0__Impl"
    // InternalDomainmodel.g:962:1: rule__PROCEDURE__Group_2__0__Impl : ( 'with' ) ;
    public final void rule__PROCEDURE__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:966:1: ( ( 'with' ) )
            // InternalDomainmodel.g:967:1: ( 'with' )
            {
            // InternalDomainmodel.g:967:1: ( 'with' )
            // InternalDomainmodel.g:968:2: 'with'
            {
             before(grammarAccess.getPROCEDUREAccess().getWithKeyword_2_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getPROCEDUREAccess().getWithKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PROCEDURE__Group_2__0__Impl"


    // $ANTLR start "rule__PROCEDURE__Group_2__1"
    // InternalDomainmodel.g:977:1: rule__PROCEDURE__Group_2__1 : rule__PROCEDURE__Group_2__1__Impl rule__PROCEDURE__Group_2__2 ;
    public final void rule__PROCEDURE__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:981:1: ( rule__PROCEDURE__Group_2__1__Impl rule__PROCEDURE__Group_2__2 )
            // InternalDomainmodel.g:982:2: rule__PROCEDURE__Group_2__1__Impl rule__PROCEDURE__Group_2__2
            {
            pushFollow(FOLLOW_4);
            rule__PROCEDURE__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PROCEDURE__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PROCEDURE__Group_2__1"


    // $ANTLR start "rule__PROCEDURE__Group_2__1__Impl"
    // InternalDomainmodel.g:989:1: rule__PROCEDURE__Group_2__1__Impl : ( ( rule__PROCEDURE__ParamAssignment_2_1 ) ) ;
    public final void rule__PROCEDURE__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:993:1: ( ( ( rule__PROCEDURE__ParamAssignment_2_1 ) ) )
            // InternalDomainmodel.g:994:1: ( ( rule__PROCEDURE__ParamAssignment_2_1 ) )
            {
            // InternalDomainmodel.g:994:1: ( ( rule__PROCEDURE__ParamAssignment_2_1 ) )
            // InternalDomainmodel.g:995:2: ( rule__PROCEDURE__ParamAssignment_2_1 )
            {
             before(grammarAccess.getPROCEDUREAccess().getParamAssignment_2_1()); 
            // InternalDomainmodel.g:996:2: ( rule__PROCEDURE__ParamAssignment_2_1 )
            // InternalDomainmodel.g:996:3: rule__PROCEDURE__ParamAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__PROCEDURE__ParamAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getPROCEDUREAccess().getParamAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PROCEDURE__Group_2__1__Impl"


    // $ANTLR start "rule__PROCEDURE__Group_2__2"
    // InternalDomainmodel.g:1004:1: rule__PROCEDURE__Group_2__2 : rule__PROCEDURE__Group_2__2__Impl ;
    public final void rule__PROCEDURE__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1008:1: ( rule__PROCEDURE__Group_2__2__Impl )
            // InternalDomainmodel.g:1009:2: rule__PROCEDURE__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PROCEDURE__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PROCEDURE__Group_2__2"


    // $ANTLR start "rule__PROCEDURE__Group_2__2__Impl"
    // InternalDomainmodel.g:1015:1: rule__PROCEDURE__Group_2__2__Impl : ( ( rule__PROCEDURE__ParamsAssignment_2_2 )* ) ;
    public final void rule__PROCEDURE__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1019:1: ( ( ( rule__PROCEDURE__ParamsAssignment_2_2 )* ) )
            // InternalDomainmodel.g:1020:1: ( ( rule__PROCEDURE__ParamsAssignment_2_2 )* )
            {
            // InternalDomainmodel.g:1020:1: ( ( rule__PROCEDURE__ParamsAssignment_2_2 )* )
            // InternalDomainmodel.g:1021:2: ( rule__PROCEDURE__ParamsAssignment_2_2 )*
            {
             before(grammarAccess.getPROCEDUREAccess().getParamsAssignment_2_2()); 
            // InternalDomainmodel.g:1022:2: ( rule__PROCEDURE__ParamsAssignment_2_2 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_VARTYPE) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalDomainmodel.g:1022:3: rule__PROCEDURE__ParamsAssignment_2_2
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__PROCEDURE__ParamsAssignment_2_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getPROCEDUREAccess().getParamsAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PROCEDURE__Group_2__2__Impl"


    // $ANTLR start "rule__OPEN__Group__0"
    // InternalDomainmodel.g:1031:1: rule__OPEN__Group__0 : rule__OPEN__Group__0__Impl rule__OPEN__Group__1 ;
    public final void rule__OPEN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1035:1: ( rule__OPEN__Group__0__Impl rule__OPEN__Group__1 )
            // InternalDomainmodel.g:1036:2: rule__OPEN__Group__0__Impl rule__OPEN__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__OPEN__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OPEN__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OPEN__Group__0"


    // $ANTLR start "rule__OPEN__Group__0__Impl"
    // InternalDomainmodel.g:1043:1: rule__OPEN__Group__0__Impl : ( ( rule__OPEN__NameAssignment_0 ) ) ;
    public final void rule__OPEN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1047:1: ( ( ( rule__OPEN__NameAssignment_0 ) ) )
            // InternalDomainmodel.g:1048:1: ( ( rule__OPEN__NameAssignment_0 ) )
            {
            // InternalDomainmodel.g:1048:1: ( ( rule__OPEN__NameAssignment_0 ) )
            // InternalDomainmodel.g:1049:2: ( rule__OPEN__NameAssignment_0 )
            {
             before(grammarAccess.getOPENAccess().getNameAssignment_0()); 
            // InternalDomainmodel.g:1050:2: ( rule__OPEN__NameAssignment_0 )
            // InternalDomainmodel.g:1050:3: rule__OPEN__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__OPEN__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getOPENAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OPEN__Group__0__Impl"


    // $ANTLR start "rule__OPEN__Group__1"
    // InternalDomainmodel.g:1058:1: rule__OPEN__Group__1 : rule__OPEN__Group__1__Impl ;
    public final void rule__OPEN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1062:1: ( rule__OPEN__Group__1__Impl )
            // InternalDomainmodel.g:1063:2: rule__OPEN__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OPEN__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OPEN__Group__1"


    // $ANTLR start "rule__OPEN__Group__1__Impl"
    // InternalDomainmodel.g:1069:1: rule__OPEN__Group__1__Impl : ( ( rule__OPEN__ValueAssignment_1 ) ) ;
    public final void rule__OPEN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1073:1: ( ( ( rule__OPEN__ValueAssignment_1 ) ) )
            // InternalDomainmodel.g:1074:1: ( ( rule__OPEN__ValueAssignment_1 ) )
            {
            // InternalDomainmodel.g:1074:1: ( ( rule__OPEN__ValueAssignment_1 ) )
            // InternalDomainmodel.g:1075:2: ( rule__OPEN__ValueAssignment_1 )
            {
             before(grammarAccess.getOPENAccess().getValueAssignment_1()); 
            // InternalDomainmodel.g:1076:2: ( rule__OPEN__ValueAssignment_1 )
            // InternalDomainmodel.g:1076:3: rule__OPEN__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__OPEN__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOPENAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OPEN__Group__1__Impl"


    // $ANTLR start "rule__GOTO__Group__0"
    // InternalDomainmodel.g:1085:1: rule__GOTO__Group__0 : rule__GOTO__Group__0__Impl rule__GOTO__Group__1 ;
    public final void rule__GOTO__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1089:1: ( rule__GOTO__Group__0__Impl rule__GOTO__Group__1 )
            // InternalDomainmodel.g:1090:2: rule__GOTO__Group__0__Impl rule__GOTO__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__GOTO__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GOTO__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GOTO__Group__0"


    // $ANTLR start "rule__GOTO__Group__0__Impl"
    // InternalDomainmodel.g:1097:1: rule__GOTO__Group__0__Impl : ( ( rule__GOTO__NameAssignment_0 ) ) ;
    public final void rule__GOTO__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1101:1: ( ( ( rule__GOTO__NameAssignment_0 ) ) )
            // InternalDomainmodel.g:1102:1: ( ( rule__GOTO__NameAssignment_0 ) )
            {
            // InternalDomainmodel.g:1102:1: ( ( rule__GOTO__NameAssignment_0 ) )
            // InternalDomainmodel.g:1103:2: ( rule__GOTO__NameAssignment_0 )
            {
             before(grammarAccess.getGOTOAccess().getNameAssignment_0()); 
            // InternalDomainmodel.g:1104:2: ( rule__GOTO__NameAssignment_0 )
            // InternalDomainmodel.g:1104:3: rule__GOTO__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__GOTO__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getGOTOAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GOTO__Group__0__Impl"


    // $ANTLR start "rule__GOTO__Group__1"
    // InternalDomainmodel.g:1112:1: rule__GOTO__Group__1 : rule__GOTO__Group__1__Impl rule__GOTO__Group__2 ;
    public final void rule__GOTO__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1116:1: ( rule__GOTO__Group__1__Impl rule__GOTO__Group__2 )
            // InternalDomainmodel.g:1117:2: rule__GOTO__Group__1__Impl rule__GOTO__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__GOTO__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GOTO__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GOTO__Group__1"


    // $ANTLR start "rule__GOTO__Group__1__Impl"
    // InternalDomainmodel.g:1124:1: rule__GOTO__Group__1__Impl : ( ( 'given' )? ) ;
    public final void rule__GOTO__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1128:1: ( ( ( 'given' )? ) )
            // InternalDomainmodel.g:1129:1: ( ( 'given' )? )
            {
            // InternalDomainmodel.g:1129:1: ( ( 'given' )? )
            // InternalDomainmodel.g:1130:2: ( 'given' )?
            {
             before(grammarAccess.getGOTOAccess().getGivenKeyword_1()); 
            // InternalDomainmodel.g:1131:2: ( 'given' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==27) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalDomainmodel.g:1131:3: 'given'
                    {
                    match(input,27,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getGOTOAccess().getGivenKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GOTO__Group__1__Impl"


    // $ANTLR start "rule__GOTO__Group__2"
    // InternalDomainmodel.g:1139:1: rule__GOTO__Group__2 : rule__GOTO__Group__2__Impl ;
    public final void rule__GOTO__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1143:1: ( rule__GOTO__Group__2__Impl )
            // InternalDomainmodel.g:1144:2: rule__GOTO__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GOTO__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GOTO__Group__2"


    // $ANTLR start "rule__GOTO__Group__2__Impl"
    // InternalDomainmodel.g:1150:1: rule__GOTO__Group__2__Impl : ( ( rule__GOTO__ValueAssignment_2 ) ) ;
    public final void rule__GOTO__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1154:1: ( ( ( rule__GOTO__ValueAssignment_2 ) ) )
            // InternalDomainmodel.g:1155:1: ( ( rule__GOTO__ValueAssignment_2 ) )
            {
            // InternalDomainmodel.g:1155:1: ( ( rule__GOTO__ValueAssignment_2 ) )
            // InternalDomainmodel.g:1156:2: ( rule__GOTO__ValueAssignment_2 )
            {
             before(grammarAccess.getGOTOAccess().getValueAssignment_2()); 
            // InternalDomainmodel.g:1157:2: ( rule__GOTO__ValueAssignment_2 )
            // InternalDomainmodel.g:1157:3: rule__GOTO__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__GOTO__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getGOTOAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GOTO__Group__2__Impl"


    // $ANTLR start "rule__CLICK__Group__0"
    // InternalDomainmodel.g:1166:1: rule__CLICK__Group__0 : rule__CLICK__Group__0__Impl rule__CLICK__Group__1 ;
    public final void rule__CLICK__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1170:1: ( rule__CLICK__Group__0__Impl rule__CLICK__Group__1 )
            // InternalDomainmodel.g:1171:2: rule__CLICK__Group__0__Impl rule__CLICK__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__CLICK__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CLICK__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CLICK__Group__0"


    // $ANTLR start "rule__CLICK__Group__0__Impl"
    // InternalDomainmodel.g:1178:1: rule__CLICK__Group__0__Impl : ( ( rule__CLICK__NameAssignment_0 ) ) ;
    public final void rule__CLICK__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1182:1: ( ( ( rule__CLICK__NameAssignment_0 ) ) )
            // InternalDomainmodel.g:1183:1: ( ( rule__CLICK__NameAssignment_0 ) )
            {
            // InternalDomainmodel.g:1183:1: ( ( rule__CLICK__NameAssignment_0 ) )
            // InternalDomainmodel.g:1184:2: ( rule__CLICK__NameAssignment_0 )
            {
             before(grammarAccess.getCLICKAccess().getNameAssignment_0()); 
            // InternalDomainmodel.g:1185:2: ( rule__CLICK__NameAssignment_0 )
            // InternalDomainmodel.g:1185:3: rule__CLICK__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__CLICK__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCLICKAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CLICK__Group__0__Impl"


    // $ANTLR start "rule__CLICK__Group__1"
    // InternalDomainmodel.g:1193:1: rule__CLICK__Group__1 : rule__CLICK__Group__1__Impl rule__CLICK__Group__2 ;
    public final void rule__CLICK__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1197:1: ( rule__CLICK__Group__1__Impl rule__CLICK__Group__2 )
            // InternalDomainmodel.g:1198:2: rule__CLICK__Group__1__Impl rule__CLICK__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__CLICK__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CLICK__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CLICK__Group__1"


    // $ANTLR start "rule__CLICK__Group__1__Impl"
    // InternalDomainmodel.g:1205:1: rule__CLICK__Group__1__Impl : ( 'on' ) ;
    public final void rule__CLICK__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1209:1: ( ( 'on' ) )
            // InternalDomainmodel.g:1210:1: ( 'on' )
            {
            // InternalDomainmodel.g:1210:1: ( 'on' )
            // InternalDomainmodel.g:1211:2: 'on'
            {
             before(grammarAccess.getCLICKAccess().getOnKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getCLICKAccess().getOnKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CLICK__Group__1__Impl"


    // $ANTLR start "rule__CLICK__Group__2"
    // InternalDomainmodel.g:1220:1: rule__CLICK__Group__2 : rule__CLICK__Group__2__Impl rule__CLICK__Group__3 ;
    public final void rule__CLICK__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1224:1: ( rule__CLICK__Group__2__Impl rule__CLICK__Group__3 )
            // InternalDomainmodel.g:1225:2: rule__CLICK__Group__2__Impl rule__CLICK__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__CLICK__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CLICK__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CLICK__Group__2"


    // $ANTLR start "rule__CLICK__Group__2__Impl"
    // InternalDomainmodel.g:1232:1: rule__CLICK__Group__2__Impl : ( ( rule__CLICK__TypeAssignment_2 ) ) ;
    public final void rule__CLICK__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1236:1: ( ( ( rule__CLICK__TypeAssignment_2 ) ) )
            // InternalDomainmodel.g:1237:1: ( ( rule__CLICK__TypeAssignment_2 ) )
            {
            // InternalDomainmodel.g:1237:1: ( ( rule__CLICK__TypeAssignment_2 ) )
            // InternalDomainmodel.g:1238:2: ( rule__CLICK__TypeAssignment_2 )
            {
             before(grammarAccess.getCLICKAccess().getTypeAssignment_2()); 
            // InternalDomainmodel.g:1239:2: ( rule__CLICK__TypeAssignment_2 )
            // InternalDomainmodel.g:1239:3: rule__CLICK__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__CLICK__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCLICKAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CLICK__Group__2__Impl"


    // $ANTLR start "rule__CLICK__Group__3"
    // InternalDomainmodel.g:1247:1: rule__CLICK__Group__3 : rule__CLICK__Group__3__Impl ;
    public final void rule__CLICK__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1251:1: ( rule__CLICK__Group__3__Impl )
            // InternalDomainmodel.g:1252:2: rule__CLICK__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CLICK__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CLICK__Group__3"


    // $ANTLR start "rule__CLICK__Group__3__Impl"
    // InternalDomainmodel.g:1258:1: rule__CLICK__Group__3__Impl : ( ( rule__CLICK__ValueAssignment_3 ) ) ;
    public final void rule__CLICK__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1262:1: ( ( ( rule__CLICK__ValueAssignment_3 ) ) )
            // InternalDomainmodel.g:1263:1: ( ( rule__CLICK__ValueAssignment_3 ) )
            {
            // InternalDomainmodel.g:1263:1: ( ( rule__CLICK__ValueAssignment_3 ) )
            // InternalDomainmodel.g:1264:2: ( rule__CLICK__ValueAssignment_3 )
            {
             before(grammarAccess.getCLICKAccess().getValueAssignment_3()); 
            // InternalDomainmodel.g:1265:2: ( rule__CLICK__ValueAssignment_3 )
            // InternalDomainmodel.g:1265:3: rule__CLICK__ValueAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__CLICK__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCLICKAccess().getValueAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CLICK__Group__3__Impl"


    // $ANTLR start "rule__FILL__Group__0"
    // InternalDomainmodel.g:1274:1: rule__FILL__Group__0 : rule__FILL__Group__0__Impl rule__FILL__Group__1 ;
    public final void rule__FILL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1278:1: ( rule__FILL__Group__0__Impl rule__FILL__Group__1 )
            // InternalDomainmodel.g:1279:2: rule__FILL__Group__0__Impl rule__FILL__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__FILL__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FILL__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FILL__Group__0"


    // $ANTLR start "rule__FILL__Group__0__Impl"
    // InternalDomainmodel.g:1286:1: rule__FILL__Group__0__Impl : ( ( rule__FILL__NameAssignment_0 ) ) ;
    public final void rule__FILL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1290:1: ( ( ( rule__FILL__NameAssignment_0 ) ) )
            // InternalDomainmodel.g:1291:1: ( ( rule__FILL__NameAssignment_0 ) )
            {
            // InternalDomainmodel.g:1291:1: ( ( rule__FILL__NameAssignment_0 ) )
            // InternalDomainmodel.g:1292:2: ( rule__FILL__NameAssignment_0 )
            {
             before(grammarAccess.getFILLAccess().getNameAssignment_0()); 
            // InternalDomainmodel.g:1293:2: ( rule__FILL__NameAssignment_0 )
            // InternalDomainmodel.g:1293:3: rule__FILL__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__FILL__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFILLAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FILL__Group__0__Impl"


    // $ANTLR start "rule__FILL__Group__1"
    // InternalDomainmodel.g:1301:1: rule__FILL__Group__1 : rule__FILL__Group__1__Impl rule__FILL__Group__2 ;
    public final void rule__FILL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1305:1: ( rule__FILL__Group__1__Impl rule__FILL__Group__2 )
            // InternalDomainmodel.g:1306:2: rule__FILL__Group__1__Impl rule__FILL__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__FILL__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FILL__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FILL__Group__1"


    // $ANTLR start "rule__FILL__Group__1__Impl"
    // InternalDomainmodel.g:1313:1: rule__FILL__Group__1__Impl : ( ( rule__FILL__Alternatives_1 ) ) ;
    public final void rule__FILL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1317:1: ( ( ( rule__FILL__Alternatives_1 ) ) )
            // InternalDomainmodel.g:1318:1: ( ( rule__FILL__Alternatives_1 ) )
            {
            // InternalDomainmodel.g:1318:1: ( ( rule__FILL__Alternatives_1 ) )
            // InternalDomainmodel.g:1319:2: ( rule__FILL__Alternatives_1 )
            {
             before(grammarAccess.getFILLAccess().getAlternatives_1()); 
            // InternalDomainmodel.g:1320:2: ( rule__FILL__Alternatives_1 )
            // InternalDomainmodel.g:1320:3: rule__FILL__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__FILL__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getFILLAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FILL__Group__1__Impl"


    // $ANTLR start "rule__FILL__Group__2"
    // InternalDomainmodel.g:1328:1: rule__FILL__Group__2 : rule__FILL__Group__2__Impl rule__FILL__Group__3 ;
    public final void rule__FILL__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1332:1: ( rule__FILL__Group__2__Impl rule__FILL__Group__3 )
            // InternalDomainmodel.g:1333:2: rule__FILL__Group__2__Impl rule__FILL__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__FILL__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FILL__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FILL__Group__2"


    // $ANTLR start "rule__FILL__Group__2__Impl"
    // InternalDomainmodel.g:1340:1: rule__FILL__Group__2__Impl : ( ( ruleELEMENTIDENTIFIER )? ) ;
    public final void rule__FILL__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1344:1: ( ( ( ruleELEMENTIDENTIFIER )? ) )
            // InternalDomainmodel.g:1345:1: ( ( ruleELEMENTIDENTIFIER )? )
            {
            // InternalDomainmodel.g:1345:1: ( ( ruleELEMENTIDENTIFIER )? )
            // InternalDomainmodel.g:1346:2: ( ruleELEMENTIDENTIFIER )?
            {
             before(grammarAccess.getFILLAccess().getELEMENTIDENTIFIERParserRuleCall_2()); 
            // InternalDomainmodel.g:1347:2: ( ruleELEMENTIDENTIFIER )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==36) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalDomainmodel.g:1347:3: ruleELEMENTIDENTIFIER
                    {
                    pushFollow(FOLLOW_2);
                    ruleELEMENTIDENTIFIER();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFILLAccess().getELEMENTIDENTIFIERParserRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FILL__Group__2__Impl"


    // $ANTLR start "rule__FILL__Group__3"
    // InternalDomainmodel.g:1355:1: rule__FILL__Group__3 : rule__FILL__Group__3__Impl rule__FILL__Group__4 ;
    public final void rule__FILL__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1359:1: ( rule__FILL__Group__3__Impl rule__FILL__Group__4 )
            // InternalDomainmodel.g:1360:2: rule__FILL__Group__3__Impl rule__FILL__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__FILL__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FILL__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FILL__Group__3"


    // $ANTLR start "rule__FILL__Group__3__Impl"
    // InternalDomainmodel.g:1367:1: rule__FILL__Group__3__Impl : ( 'with' ) ;
    public final void rule__FILL__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1371:1: ( ( 'with' ) )
            // InternalDomainmodel.g:1372:1: ( 'with' )
            {
            // InternalDomainmodel.g:1372:1: ( 'with' )
            // InternalDomainmodel.g:1373:2: 'with'
            {
             before(grammarAccess.getFILLAccess().getWithKeyword_3()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getFILLAccess().getWithKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FILL__Group__3__Impl"


    // $ANTLR start "rule__FILL__Group__4"
    // InternalDomainmodel.g:1382:1: rule__FILL__Group__4 : rule__FILL__Group__4__Impl ;
    public final void rule__FILL__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1386:1: ( rule__FILL__Group__4__Impl )
            // InternalDomainmodel.g:1387:2: rule__FILL__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FILL__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FILL__Group__4"


    // $ANTLR start "rule__FILL__Group__4__Impl"
    // InternalDomainmodel.g:1393:1: rule__FILL__Group__4__Impl : ( ( rule__FILL__Alternatives_4 ) ) ;
    public final void rule__FILL__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1397:1: ( ( ( rule__FILL__Alternatives_4 ) ) )
            // InternalDomainmodel.g:1398:1: ( ( rule__FILL__Alternatives_4 ) )
            {
            // InternalDomainmodel.g:1398:1: ( ( rule__FILL__Alternatives_4 ) )
            // InternalDomainmodel.g:1399:2: ( rule__FILL__Alternatives_4 )
            {
             before(grammarAccess.getFILLAccess().getAlternatives_4()); 
            // InternalDomainmodel.g:1400:2: ( rule__FILL__Alternatives_4 )
            // InternalDomainmodel.g:1400:3: rule__FILL__Alternatives_4
            {
            pushFollow(FOLLOW_2);
            rule__FILL__Alternatives_4();

            state._fsp--;


            }

             after(grammarAccess.getFILLAccess().getAlternatives_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FILL__Group__4__Impl"


    // $ANTLR start "rule__FILL__Group_4_0__0"
    // InternalDomainmodel.g:1409:1: rule__FILL__Group_4_0__0 : rule__FILL__Group_4_0__0__Impl rule__FILL__Group_4_0__1 ;
    public final void rule__FILL__Group_4_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1413:1: ( rule__FILL__Group_4_0__0__Impl rule__FILL__Group_4_0__1 )
            // InternalDomainmodel.g:1414:2: rule__FILL__Group_4_0__0__Impl rule__FILL__Group_4_0__1
            {
            pushFollow(FOLLOW_4);
            rule__FILL__Group_4_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FILL__Group_4_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FILL__Group_4_0__0"


    // $ANTLR start "rule__FILL__Group_4_0__0__Impl"
    // InternalDomainmodel.g:1421:1: rule__FILL__Group_4_0__0__Impl : ( 'saved' ) ;
    public final void rule__FILL__Group_4_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1425:1: ( ( 'saved' ) )
            // InternalDomainmodel.g:1426:1: ( 'saved' )
            {
            // InternalDomainmodel.g:1426:1: ( 'saved' )
            // InternalDomainmodel.g:1427:2: 'saved'
            {
             before(grammarAccess.getFILLAccess().getSavedKeyword_4_0_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getFILLAccess().getSavedKeyword_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FILL__Group_4_0__0__Impl"


    // $ANTLR start "rule__FILL__Group_4_0__1"
    // InternalDomainmodel.g:1436:1: rule__FILL__Group_4_0__1 : rule__FILL__Group_4_0__1__Impl ;
    public final void rule__FILL__Group_4_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1440:1: ( rule__FILL__Group_4_0__1__Impl )
            // InternalDomainmodel.g:1441:2: rule__FILL__Group_4_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FILL__Group_4_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FILL__Group_4_0__1"


    // $ANTLR start "rule__FILL__Group_4_0__1__Impl"
    // InternalDomainmodel.g:1447:1: rule__FILL__Group_4_0__1__Impl : ( ( rule__FILL__VarAssignment_4_0_1 ) ) ;
    public final void rule__FILL__Group_4_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1451:1: ( ( ( rule__FILL__VarAssignment_4_0_1 ) ) )
            // InternalDomainmodel.g:1452:1: ( ( rule__FILL__VarAssignment_4_0_1 ) )
            {
            // InternalDomainmodel.g:1452:1: ( ( rule__FILL__VarAssignment_4_0_1 ) )
            // InternalDomainmodel.g:1453:2: ( rule__FILL__VarAssignment_4_0_1 )
            {
             before(grammarAccess.getFILLAccess().getVarAssignment_4_0_1()); 
            // InternalDomainmodel.g:1454:2: ( rule__FILL__VarAssignment_4_0_1 )
            // InternalDomainmodel.g:1454:3: rule__FILL__VarAssignment_4_0_1
            {
            pushFollow(FOLLOW_2);
            rule__FILL__VarAssignment_4_0_1();

            state._fsp--;


            }

             after(grammarAccess.getFILLAccess().getVarAssignment_4_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FILL__Group_4_0__1__Impl"


    // $ANTLR start "rule__CHECK__Group__0"
    // InternalDomainmodel.g:1463:1: rule__CHECK__Group__0 : rule__CHECK__Group__0__Impl rule__CHECK__Group__1 ;
    public final void rule__CHECK__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1467:1: ( rule__CHECK__Group__0__Impl rule__CHECK__Group__1 )
            // InternalDomainmodel.g:1468:2: rule__CHECK__Group__0__Impl rule__CHECK__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__CHECK__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CHECK__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CHECK__Group__0"


    // $ANTLR start "rule__CHECK__Group__0__Impl"
    // InternalDomainmodel.g:1475:1: rule__CHECK__Group__0__Impl : ( ( rule__CHECK__NameAssignment_0 ) ) ;
    public final void rule__CHECK__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1479:1: ( ( ( rule__CHECK__NameAssignment_0 ) ) )
            // InternalDomainmodel.g:1480:1: ( ( rule__CHECK__NameAssignment_0 ) )
            {
            // InternalDomainmodel.g:1480:1: ( ( rule__CHECK__NameAssignment_0 ) )
            // InternalDomainmodel.g:1481:2: ( rule__CHECK__NameAssignment_0 )
            {
             before(grammarAccess.getCHECKAccess().getNameAssignment_0()); 
            // InternalDomainmodel.g:1482:2: ( rule__CHECK__NameAssignment_0 )
            // InternalDomainmodel.g:1482:3: rule__CHECK__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__CHECK__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCHECKAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CHECK__Group__0__Impl"


    // $ANTLR start "rule__CHECK__Group__1"
    // InternalDomainmodel.g:1490:1: rule__CHECK__Group__1 : rule__CHECK__Group__1__Impl rule__CHECK__Group__2 ;
    public final void rule__CHECK__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1494:1: ( rule__CHECK__Group__1__Impl rule__CHECK__Group__2 )
            // InternalDomainmodel.g:1495:2: rule__CHECK__Group__1__Impl rule__CHECK__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__CHECK__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CHECK__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CHECK__Group__1"


    // $ANTLR start "rule__CHECK__Group__1__Impl"
    // InternalDomainmodel.g:1502:1: rule__CHECK__Group__1__Impl : ( ( 'all' )? ) ;
    public final void rule__CHECK__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1506:1: ( ( ( 'all' )? ) )
            // InternalDomainmodel.g:1507:1: ( ( 'all' )? )
            {
            // InternalDomainmodel.g:1507:1: ( ( 'all' )? )
            // InternalDomainmodel.g:1508:2: ( 'all' )?
            {
             before(grammarAccess.getCHECKAccess().getAllKeyword_1()); 
            // InternalDomainmodel.g:1509:2: ( 'all' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==30) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalDomainmodel.g:1509:3: 'all'
                    {
                    match(input,30,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getCHECKAccess().getAllKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CHECK__Group__1__Impl"


    // $ANTLR start "rule__CHECK__Group__2"
    // InternalDomainmodel.g:1517:1: rule__CHECK__Group__2 : rule__CHECK__Group__2__Impl rule__CHECK__Group__3 ;
    public final void rule__CHECK__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1521:1: ( rule__CHECK__Group__2__Impl rule__CHECK__Group__3 )
            // InternalDomainmodel.g:1522:2: rule__CHECK__Group__2__Impl rule__CHECK__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__CHECK__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CHECK__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CHECK__Group__2"


    // $ANTLR start "rule__CHECK__Group__2__Impl"
    // InternalDomainmodel.g:1529:1: rule__CHECK__Group__2__Impl : ( 'CHECKBOX' ) ;
    public final void rule__CHECK__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1533:1: ( ( 'CHECKBOX' ) )
            // InternalDomainmodel.g:1534:1: ( 'CHECKBOX' )
            {
            // InternalDomainmodel.g:1534:1: ( 'CHECKBOX' )
            // InternalDomainmodel.g:1535:2: 'CHECKBOX'
            {
             before(grammarAccess.getCHECKAccess().getCHECKBOXKeyword_2()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getCHECKAccess().getCHECKBOXKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CHECK__Group__2__Impl"


    // $ANTLR start "rule__CHECK__Group__3"
    // InternalDomainmodel.g:1544:1: rule__CHECK__Group__3 : rule__CHECK__Group__3__Impl ;
    public final void rule__CHECK__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1548:1: ( rule__CHECK__Group__3__Impl )
            // InternalDomainmodel.g:1549:2: rule__CHECK__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CHECK__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CHECK__Group__3"


    // $ANTLR start "rule__CHECK__Group__3__Impl"
    // InternalDomainmodel.g:1555:1: rule__CHECK__Group__3__Impl : ( ( ruleELEMENTIDENTIFIER )? ) ;
    public final void rule__CHECK__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1559:1: ( ( ( ruleELEMENTIDENTIFIER )? ) )
            // InternalDomainmodel.g:1560:1: ( ( ruleELEMENTIDENTIFIER )? )
            {
            // InternalDomainmodel.g:1560:1: ( ( ruleELEMENTIDENTIFIER )? )
            // InternalDomainmodel.g:1561:2: ( ruleELEMENTIDENTIFIER )?
            {
             before(grammarAccess.getCHECKAccess().getELEMENTIDENTIFIERParserRuleCall_3()); 
            // InternalDomainmodel.g:1562:2: ( ruleELEMENTIDENTIFIER )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==36) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalDomainmodel.g:1562:3: ruleELEMENTIDENTIFIER
                    {
                    pushFollow(FOLLOW_2);
                    ruleELEMENTIDENTIFIER();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCHECKAccess().getELEMENTIDENTIFIERParserRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CHECK__Group__3__Impl"


    // $ANTLR start "rule__UNCHECK__Group__0"
    // InternalDomainmodel.g:1571:1: rule__UNCHECK__Group__0 : rule__UNCHECK__Group__0__Impl rule__UNCHECK__Group__1 ;
    public final void rule__UNCHECK__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1575:1: ( rule__UNCHECK__Group__0__Impl rule__UNCHECK__Group__1 )
            // InternalDomainmodel.g:1576:2: rule__UNCHECK__Group__0__Impl rule__UNCHECK__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__UNCHECK__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UNCHECK__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UNCHECK__Group__0"


    // $ANTLR start "rule__UNCHECK__Group__0__Impl"
    // InternalDomainmodel.g:1583:1: rule__UNCHECK__Group__0__Impl : ( ( rule__UNCHECK__NameAssignment_0 ) ) ;
    public final void rule__UNCHECK__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1587:1: ( ( ( rule__UNCHECK__NameAssignment_0 ) ) )
            // InternalDomainmodel.g:1588:1: ( ( rule__UNCHECK__NameAssignment_0 ) )
            {
            // InternalDomainmodel.g:1588:1: ( ( rule__UNCHECK__NameAssignment_0 ) )
            // InternalDomainmodel.g:1589:2: ( rule__UNCHECK__NameAssignment_0 )
            {
             before(grammarAccess.getUNCHECKAccess().getNameAssignment_0()); 
            // InternalDomainmodel.g:1590:2: ( rule__UNCHECK__NameAssignment_0 )
            // InternalDomainmodel.g:1590:3: rule__UNCHECK__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__UNCHECK__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getUNCHECKAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UNCHECK__Group__0__Impl"


    // $ANTLR start "rule__UNCHECK__Group__1"
    // InternalDomainmodel.g:1598:1: rule__UNCHECK__Group__1 : rule__UNCHECK__Group__1__Impl rule__UNCHECK__Group__2 ;
    public final void rule__UNCHECK__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1602:1: ( rule__UNCHECK__Group__1__Impl rule__UNCHECK__Group__2 )
            // InternalDomainmodel.g:1603:2: rule__UNCHECK__Group__1__Impl rule__UNCHECK__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__UNCHECK__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UNCHECK__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UNCHECK__Group__1"


    // $ANTLR start "rule__UNCHECK__Group__1__Impl"
    // InternalDomainmodel.g:1610:1: rule__UNCHECK__Group__1__Impl : ( ( 'all' )? ) ;
    public final void rule__UNCHECK__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1614:1: ( ( ( 'all' )? ) )
            // InternalDomainmodel.g:1615:1: ( ( 'all' )? )
            {
            // InternalDomainmodel.g:1615:1: ( ( 'all' )? )
            // InternalDomainmodel.g:1616:2: ( 'all' )?
            {
             before(grammarAccess.getUNCHECKAccess().getAllKeyword_1()); 
            // InternalDomainmodel.g:1617:2: ( 'all' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==30) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalDomainmodel.g:1617:3: 'all'
                    {
                    match(input,30,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getUNCHECKAccess().getAllKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UNCHECK__Group__1__Impl"


    // $ANTLR start "rule__UNCHECK__Group__2"
    // InternalDomainmodel.g:1625:1: rule__UNCHECK__Group__2 : rule__UNCHECK__Group__2__Impl rule__UNCHECK__Group__3 ;
    public final void rule__UNCHECK__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1629:1: ( rule__UNCHECK__Group__2__Impl rule__UNCHECK__Group__3 )
            // InternalDomainmodel.g:1630:2: rule__UNCHECK__Group__2__Impl rule__UNCHECK__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__UNCHECK__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UNCHECK__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UNCHECK__Group__2"


    // $ANTLR start "rule__UNCHECK__Group__2__Impl"
    // InternalDomainmodel.g:1637:1: rule__UNCHECK__Group__2__Impl : ( 'CHECKBOX' ) ;
    public final void rule__UNCHECK__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1641:1: ( ( 'CHECKBOX' ) )
            // InternalDomainmodel.g:1642:1: ( 'CHECKBOX' )
            {
            // InternalDomainmodel.g:1642:1: ( 'CHECKBOX' )
            // InternalDomainmodel.g:1643:2: 'CHECKBOX'
            {
             before(grammarAccess.getUNCHECKAccess().getCHECKBOXKeyword_2()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getUNCHECKAccess().getCHECKBOXKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UNCHECK__Group__2__Impl"


    // $ANTLR start "rule__UNCHECK__Group__3"
    // InternalDomainmodel.g:1652:1: rule__UNCHECK__Group__3 : rule__UNCHECK__Group__3__Impl ;
    public final void rule__UNCHECK__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1656:1: ( rule__UNCHECK__Group__3__Impl )
            // InternalDomainmodel.g:1657:2: rule__UNCHECK__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UNCHECK__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UNCHECK__Group__3"


    // $ANTLR start "rule__UNCHECK__Group__3__Impl"
    // InternalDomainmodel.g:1663:1: rule__UNCHECK__Group__3__Impl : ( ( ruleELEMENTIDENTIFIER )? ) ;
    public final void rule__UNCHECK__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1667:1: ( ( ( ruleELEMENTIDENTIFIER )? ) )
            // InternalDomainmodel.g:1668:1: ( ( ruleELEMENTIDENTIFIER )? )
            {
            // InternalDomainmodel.g:1668:1: ( ( ruleELEMENTIDENTIFIER )? )
            // InternalDomainmodel.g:1669:2: ( ruleELEMENTIDENTIFIER )?
            {
             before(grammarAccess.getUNCHECKAccess().getELEMENTIDENTIFIERParserRuleCall_3()); 
            // InternalDomainmodel.g:1670:2: ( ruleELEMENTIDENTIFIER )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==36) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalDomainmodel.g:1670:3: ruleELEMENTIDENTIFIER
                    {
                    pushFollow(FOLLOW_2);
                    ruleELEMENTIDENTIFIER();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUNCHECKAccess().getELEMENTIDENTIFIERParserRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UNCHECK__Group__3__Impl"


    // $ANTLR start "rule__SELECT__Group__0"
    // InternalDomainmodel.g:1679:1: rule__SELECT__Group__0 : rule__SELECT__Group__0__Impl rule__SELECT__Group__1 ;
    public final void rule__SELECT__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1683:1: ( rule__SELECT__Group__0__Impl rule__SELECT__Group__1 )
            // InternalDomainmodel.g:1684:2: rule__SELECT__Group__0__Impl rule__SELECT__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__SELECT__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SELECT__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SELECT__Group__0"


    // $ANTLR start "rule__SELECT__Group__0__Impl"
    // InternalDomainmodel.g:1691:1: rule__SELECT__Group__0__Impl : ( ( rule__SELECT__NameAssignment_0 ) ) ;
    public final void rule__SELECT__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1695:1: ( ( ( rule__SELECT__NameAssignment_0 ) ) )
            // InternalDomainmodel.g:1696:1: ( ( rule__SELECT__NameAssignment_0 ) )
            {
            // InternalDomainmodel.g:1696:1: ( ( rule__SELECT__NameAssignment_0 ) )
            // InternalDomainmodel.g:1697:2: ( rule__SELECT__NameAssignment_0 )
            {
             before(grammarAccess.getSELECTAccess().getNameAssignment_0()); 
            // InternalDomainmodel.g:1698:2: ( rule__SELECT__NameAssignment_0 )
            // InternalDomainmodel.g:1698:3: rule__SELECT__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__SELECT__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSELECTAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SELECT__Group__0__Impl"


    // $ANTLR start "rule__SELECT__Group__1"
    // InternalDomainmodel.g:1706:1: rule__SELECT__Group__1 : rule__SELECT__Group__1__Impl rule__SELECT__Group__2 ;
    public final void rule__SELECT__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1710:1: ( rule__SELECT__Group__1__Impl rule__SELECT__Group__2 )
            // InternalDomainmodel.g:1711:2: rule__SELECT__Group__1__Impl rule__SELECT__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__SELECT__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SELECT__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SELECT__Group__1"


    // $ANTLR start "rule__SELECT__Group__1__Impl"
    // InternalDomainmodel.g:1718:1: rule__SELECT__Group__1__Impl : ( ( rule__SELECT__ElemAssignment_1 ) ) ;
    public final void rule__SELECT__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1722:1: ( ( ( rule__SELECT__ElemAssignment_1 ) ) )
            // InternalDomainmodel.g:1723:1: ( ( rule__SELECT__ElemAssignment_1 ) )
            {
            // InternalDomainmodel.g:1723:1: ( ( rule__SELECT__ElemAssignment_1 ) )
            // InternalDomainmodel.g:1724:2: ( rule__SELECT__ElemAssignment_1 )
            {
             before(grammarAccess.getSELECTAccess().getElemAssignment_1()); 
            // InternalDomainmodel.g:1725:2: ( rule__SELECT__ElemAssignment_1 )
            // InternalDomainmodel.g:1725:3: rule__SELECT__ElemAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SELECT__ElemAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSELECTAccess().getElemAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SELECT__Group__1__Impl"


    // $ANTLR start "rule__SELECT__Group__2"
    // InternalDomainmodel.g:1733:1: rule__SELECT__Group__2 : rule__SELECT__Group__2__Impl rule__SELECT__Group__3 ;
    public final void rule__SELECT__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1737:1: ( rule__SELECT__Group__2__Impl rule__SELECT__Group__3 )
            // InternalDomainmodel.g:1738:2: rule__SELECT__Group__2__Impl rule__SELECT__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__SELECT__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SELECT__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SELECT__Group__2"


    // $ANTLR start "rule__SELECT__Group__2__Impl"
    // InternalDomainmodel.g:1745:1: rule__SELECT__Group__2__Impl : ( 'in' ) ;
    public final void rule__SELECT__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1749:1: ( ( 'in' ) )
            // InternalDomainmodel.g:1750:1: ( 'in' )
            {
            // InternalDomainmodel.g:1750:1: ( 'in' )
            // InternalDomainmodel.g:1751:2: 'in'
            {
             before(grammarAccess.getSELECTAccess().getInKeyword_2()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getSELECTAccess().getInKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SELECT__Group__2__Impl"


    // $ANTLR start "rule__SELECT__Group__3"
    // InternalDomainmodel.g:1760:1: rule__SELECT__Group__3 : rule__SELECT__Group__3__Impl rule__SELECT__Group__4 ;
    public final void rule__SELECT__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1764:1: ( rule__SELECT__Group__3__Impl rule__SELECT__Group__4 )
            // InternalDomainmodel.g:1765:2: rule__SELECT__Group__3__Impl rule__SELECT__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__SELECT__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SELECT__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SELECT__Group__3"


    // $ANTLR start "rule__SELECT__Group__3__Impl"
    // InternalDomainmodel.g:1772:1: rule__SELECT__Group__3__Impl : ( 'COMBOBOX' ) ;
    public final void rule__SELECT__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1776:1: ( ( 'COMBOBOX' ) )
            // InternalDomainmodel.g:1777:1: ( 'COMBOBOX' )
            {
            // InternalDomainmodel.g:1777:1: ( 'COMBOBOX' )
            // InternalDomainmodel.g:1778:2: 'COMBOBOX'
            {
             before(grammarAccess.getSELECTAccess().getCOMBOBOXKeyword_3()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getSELECTAccess().getCOMBOBOXKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SELECT__Group__3__Impl"


    // $ANTLR start "rule__SELECT__Group__4"
    // InternalDomainmodel.g:1787:1: rule__SELECT__Group__4 : rule__SELECT__Group__4__Impl ;
    public final void rule__SELECT__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1791:1: ( rule__SELECT__Group__4__Impl )
            // InternalDomainmodel.g:1792:2: rule__SELECT__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SELECT__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SELECT__Group__4"


    // $ANTLR start "rule__SELECT__Group__4__Impl"
    // InternalDomainmodel.g:1798:1: rule__SELECT__Group__4__Impl : ( ( ruleELEMENTIDENTIFIER )? ) ;
    public final void rule__SELECT__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1802:1: ( ( ( ruleELEMENTIDENTIFIER )? ) )
            // InternalDomainmodel.g:1803:1: ( ( ruleELEMENTIDENTIFIER )? )
            {
            // InternalDomainmodel.g:1803:1: ( ( ruleELEMENTIDENTIFIER )? )
            // InternalDomainmodel.g:1804:2: ( ruleELEMENTIDENTIFIER )?
            {
             before(grammarAccess.getSELECTAccess().getELEMENTIDENTIFIERParserRuleCall_4()); 
            // InternalDomainmodel.g:1805:2: ( ruleELEMENTIDENTIFIER )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==36) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalDomainmodel.g:1805:3: ruleELEMENTIDENTIFIER
                    {
                    pushFollow(FOLLOW_2);
                    ruleELEMENTIDENTIFIER();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSELECTAccess().getELEMENTIDENTIFIERParserRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SELECT__Group__4__Impl"


    // $ANTLR start "rule__READ__Group__0"
    // InternalDomainmodel.g:1814:1: rule__READ__Group__0 : rule__READ__Group__0__Impl rule__READ__Group__1 ;
    public final void rule__READ__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1818:1: ( rule__READ__Group__0__Impl rule__READ__Group__1 )
            // InternalDomainmodel.g:1819:2: rule__READ__Group__0__Impl rule__READ__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__READ__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__READ__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__READ__Group__0"


    // $ANTLR start "rule__READ__Group__0__Impl"
    // InternalDomainmodel.g:1826:1: rule__READ__Group__0__Impl : ( ( rule__READ__NameAssignment_0 ) ) ;
    public final void rule__READ__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1830:1: ( ( ( rule__READ__NameAssignment_0 ) ) )
            // InternalDomainmodel.g:1831:1: ( ( rule__READ__NameAssignment_0 ) )
            {
            // InternalDomainmodel.g:1831:1: ( ( rule__READ__NameAssignment_0 ) )
            // InternalDomainmodel.g:1832:2: ( rule__READ__NameAssignment_0 )
            {
             before(grammarAccess.getREADAccess().getNameAssignment_0()); 
            // InternalDomainmodel.g:1833:2: ( rule__READ__NameAssignment_0 )
            // InternalDomainmodel.g:1833:3: rule__READ__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__READ__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getREADAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__READ__Group__0__Impl"


    // $ANTLR start "rule__READ__Group__1"
    // InternalDomainmodel.g:1841:1: rule__READ__Group__1 : rule__READ__Group__1__Impl rule__READ__Group__2 ;
    public final void rule__READ__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1845:1: ( rule__READ__Group__1__Impl rule__READ__Group__2 )
            // InternalDomainmodel.g:1846:2: rule__READ__Group__1__Impl rule__READ__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__READ__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__READ__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__READ__Group__1"


    // $ANTLR start "rule__READ__Group__1__Impl"
    // InternalDomainmodel.g:1853:1: rule__READ__Group__1__Impl : ( 'url' ) ;
    public final void rule__READ__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1857:1: ( ( 'url' ) )
            // InternalDomainmodel.g:1858:1: ( 'url' )
            {
            // InternalDomainmodel.g:1858:1: ( 'url' )
            // InternalDomainmodel.g:1859:2: 'url'
            {
             before(grammarAccess.getREADAccess().getUrlKeyword_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getREADAccess().getUrlKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__READ__Group__1__Impl"


    // $ANTLR start "rule__READ__Group__2"
    // InternalDomainmodel.g:1868:1: rule__READ__Group__2 : rule__READ__Group__2__Impl rule__READ__Group__3 ;
    public final void rule__READ__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1872:1: ( rule__READ__Group__2__Impl rule__READ__Group__3 )
            // InternalDomainmodel.g:1873:2: rule__READ__Group__2__Impl rule__READ__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__READ__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__READ__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__READ__Group__2"


    // $ANTLR start "rule__READ__Group__2__Impl"
    // InternalDomainmodel.g:1880:1: rule__READ__Group__2__Impl : ( 'from' ) ;
    public final void rule__READ__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1884:1: ( ( 'from' ) )
            // InternalDomainmodel.g:1885:1: ( 'from' )
            {
            // InternalDomainmodel.g:1885:1: ( 'from' )
            // InternalDomainmodel.g:1886:2: 'from'
            {
             before(grammarAccess.getREADAccess().getFromKeyword_2()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getREADAccess().getFromKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__READ__Group__2__Impl"


    // $ANTLR start "rule__READ__Group__3"
    // InternalDomainmodel.g:1895:1: rule__READ__Group__3 : rule__READ__Group__3__Impl rule__READ__Group__4 ;
    public final void rule__READ__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1899:1: ( rule__READ__Group__3__Impl rule__READ__Group__4 )
            // InternalDomainmodel.g:1900:2: rule__READ__Group__3__Impl rule__READ__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__READ__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__READ__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__READ__Group__3"


    // $ANTLR start "rule__READ__Group__3__Impl"
    // InternalDomainmodel.g:1907:1: rule__READ__Group__3__Impl : ( ( rule__READ__Alternatives_3 ) ) ;
    public final void rule__READ__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1911:1: ( ( ( rule__READ__Alternatives_3 ) ) )
            // InternalDomainmodel.g:1912:1: ( ( rule__READ__Alternatives_3 ) )
            {
            // InternalDomainmodel.g:1912:1: ( ( rule__READ__Alternatives_3 ) )
            // InternalDomainmodel.g:1913:2: ( rule__READ__Alternatives_3 )
            {
             before(grammarAccess.getREADAccess().getAlternatives_3()); 
            // InternalDomainmodel.g:1914:2: ( rule__READ__Alternatives_3 )
            // InternalDomainmodel.g:1914:3: rule__READ__Alternatives_3
            {
            pushFollow(FOLLOW_2);
            rule__READ__Alternatives_3();

            state._fsp--;


            }

             after(grammarAccess.getREADAccess().getAlternatives_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__READ__Group__3__Impl"


    // $ANTLR start "rule__READ__Group__4"
    // InternalDomainmodel.g:1922:1: rule__READ__Group__4 : rule__READ__Group__4__Impl rule__READ__Group__5 ;
    public final void rule__READ__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1926:1: ( rule__READ__Group__4__Impl rule__READ__Group__5 )
            // InternalDomainmodel.g:1927:2: rule__READ__Group__4__Impl rule__READ__Group__5
            {
            pushFollow(FOLLOW_22);
            rule__READ__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__READ__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__READ__Group__4"


    // $ANTLR start "rule__READ__Group__4__Impl"
    // InternalDomainmodel.g:1934:1: rule__READ__Group__4__Impl : ( ruleELEMENTIDENTIFIER ) ;
    public final void rule__READ__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1938:1: ( ( ruleELEMENTIDENTIFIER ) )
            // InternalDomainmodel.g:1939:1: ( ruleELEMENTIDENTIFIER )
            {
            // InternalDomainmodel.g:1939:1: ( ruleELEMENTIDENTIFIER )
            // InternalDomainmodel.g:1940:2: ruleELEMENTIDENTIFIER
            {
             before(grammarAccess.getREADAccess().getELEMENTIDENTIFIERParserRuleCall_4()); 
            pushFollow(FOLLOW_2);
            ruleELEMENTIDENTIFIER();

            state._fsp--;

             after(grammarAccess.getREADAccess().getELEMENTIDENTIFIERParserRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__READ__Group__4__Impl"


    // $ANTLR start "rule__READ__Group__5"
    // InternalDomainmodel.g:1949:1: rule__READ__Group__5 : rule__READ__Group__5__Impl ;
    public final void rule__READ__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1953:1: ( rule__READ__Group__5__Impl )
            // InternalDomainmodel.g:1954:2: rule__READ__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__READ__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__READ__Group__5"


    // $ANTLR start "rule__READ__Group__5__Impl"
    // InternalDomainmodel.g:1960:1: rule__READ__Group__5__Impl : ( ( ruleSAVEVAR )? ) ;
    public final void rule__READ__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1964:1: ( ( ( ruleSAVEVAR )? ) )
            // InternalDomainmodel.g:1965:1: ( ( ruleSAVEVAR )? )
            {
            // InternalDomainmodel.g:1965:1: ( ( ruleSAVEVAR )? )
            // InternalDomainmodel.g:1966:2: ( ruleSAVEVAR )?
            {
             before(grammarAccess.getREADAccess().getSAVEVARParserRuleCall_5()); 
            // InternalDomainmodel.g:1967:2: ( ruleSAVEVAR )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==42) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalDomainmodel.g:1967:3: ruleSAVEVAR
                    {
                    pushFollow(FOLLOW_2);
                    ruleSAVEVAR();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getREADAccess().getSAVEVARParserRuleCall_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__READ__Group__5__Impl"


    // $ANTLR start "rule__ELEMENTIDENTIFIER__Group__0"
    // InternalDomainmodel.g:1976:1: rule__ELEMENTIDENTIFIER__Group__0 : rule__ELEMENTIDENTIFIER__Group__0__Impl rule__ELEMENTIDENTIFIER__Group__1 ;
    public final void rule__ELEMENTIDENTIFIER__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1980:1: ( rule__ELEMENTIDENTIFIER__Group__0__Impl rule__ELEMENTIDENTIFIER__Group__1 )
            // InternalDomainmodel.g:1981:2: rule__ELEMENTIDENTIFIER__Group__0__Impl rule__ELEMENTIDENTIFIER__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__ELEMENTIDENTIFIER__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ELEMENTIDENTIFIER__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ELEMENTIDENTIFIER__Group__0"


    // $ANTLR start "rule__ELEMENTIDENTIFIER__Group__0__Impl"
    // InternalDomainmodel.g:1988:1: rule__ELEMENTIDENTIFIER__Group__0__Impl : ( 'identified' ) ;
    public final void rule__ELEMENTIDENTIFIER__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1992:1: ( ( 'identified' ) )
            // InternalDomainmodel.g:1993:1: ( 'identified' )
            {
            // InternalDomainmodel.g:1993:1: ( 'identified' )
            // InternalDomainmodel.g:1994:2: 'identified'
            {
             before(grammarAccess.getELEMENTIDENTIFIERAccess().getIdentifiedKeyword_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getELEMENTIDENTIFIERAccess().getIdentifiedKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ELEMENTIDENTIFIER__Group__0__Impl"


    // $ANTLR start "rule__ELEMENTIDENTIFIER__Group__1"
    // InternalDomainmodel.g:2003:1: rule__ELEMENTIDENTIFIER__Group__1 : rule__ELEMENTIDENTIFIER__Group__1__Impl rule__ELEMENTIDENTIFIER__Group__2 ;
    public final void rule__ELEMENTIDENTIFIER__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2007:1: ( rule__ELEMENTIDENTIFIER__Group__1__Impl rule__ELEMENTIDENTIFIER__Group__2 )
            // InternalDomainmodel.g:2008:2: rule__ELEMENTIDENTIFIER__Group__1__Impl rule__ELEMENTIDENTIFIER__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__ELEMENTIDENTIFIER__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ELEMENTIDENTIFIER__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ELEMENTIDENTIFIER__Group__1"


    // $ANTLR start "rule__ELEMENTIDENTIFIER__Group__1__Impl"
    // InternalDomainmodel.g:2015:1: rule__ELEMENTIDENTIFIER__Group__1__Impl : ( 'by' ) ;
    public final void rule__ELEMENTIDENTIFIER__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2019:1: ( ( 'by' ) )
            // InternalDomainmodel.g:2020:1: ( 'by' )
            {
            // InternalDomainmodel.g:2020:1: ( 'by' )
            // InternalDomainmodel.g:2021:2: 'by'
            {
             before(grammarAccess.getELEMENTIDENTIFIERAccess().getByKeyword_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getELEMENTIDENTIFIERAccess().getByKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ELEMENTIDENTIFIER__Group__1__Impl"


    // $ANTLR start "rule__ELEMENTIDENTIFIER__Group__2"
    // InternalDomainmodel.g:2030:1: rule__ELEMENTIDENTIFIER__Group__2 : rule__ELEMENTIDENTIFIER__Group__2__Impl rule__ELEMENTIDENTIFIER__Group__3 ;
    public final void rule__ELEMENTIDENTIFIER__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2034:1: ( rule__ELEMENTIDENTIFIER__Group__2__Impl rule__ELEMENTIDENTIFIER__Group__3 )
            // InternalDomainmodel.g:2035:2: rule__ELEMENTIDENTIFIER__Group__2__Impl rule__ELEMENTIDENTIFIER__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__ELEMENTIDENTIFIER__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ELEMENTIDENTIFIER__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ELEMENTIDENTIFIER__Group__2"


    // $ANTLR start "rule__ELEMENTIDENTIFIER__Group__2__Impl"
    // InternalDomainmodel.g:2042:1: rule__ELEMENTIDENTIFIER__Group__2__Impl : ( ( rule__ELEMENTIDENTIFIER__Alternatives_2 ) ) ;
    public final void rule__ELEMENTIDENTIFIER__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2046:1: ( ( ( rule__ELEMENTIDENTIFIER__Alternatives_2 ) ) )
            // InternalDomainmodel.g:2047:1: ( ( rule__ELEMENTIDENTIFIER__Alternatives_2 ) )
            {
            // InternalDomainmodel.g:2047:1: ( ( rule__ELEMENTIDENTIFIER__Alternatives_2 ) )
            // InternalDomainmodel.g:2048:2: ( rule__ELEMENTIDENTIFIER__Alternatives_2 )
            {
             before(grammarAccess.getELEMENTIDENTIFIERAccess().getAlternatives_2()); 
            // InternalDomainmodel.g:2049:2: ( rule__ELEMENTIDENTIFIER__Alternatives_2 )
            // InternalDomainmodel.g:2049:3: rule__ELEMENTIDENTIFIER__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__ELEMENTIDENTIFIER__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getELEMENTIDENTIFIERAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ELEMENTIDENTIFIER__Group__2__Impl"


    // $ANTLR start "rule__ELEMENTIDENTIFIER__Group__3"
    // InternalDomainmodel.g:2057:1: rule__ELEMENTIDENTIFIER__Group__3 : rule__ELEMENTIDENTIFIER__Group__3__Impl ;
    public final void rule__ELEMENTIDENTIFIER__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2061:1: ( rule__ELEMENTIDENTIFIER__Group__3__Impl )
            // InternalDomainmodel.g:2062:2: rule__ELEMENTIDENTIFIER__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ELEMENTIDENTIFIER__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ELEMENTIDENTIFIER__Group__3"


    // $ANTLR start "rule__ELEMENTIDENTIFIER__Group__3__Impl"
    // InternalDomainmodel.g:2068:1: rule__ELEMENTIDENTIFIER__Group__3__Impl : ( ( rule__ELEMENTIDENTIFIER__Alternatives_3 ) ) ;
    public final void rule__ELEMENTIDENTIFIER__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2072:1: ( ( ( rule__ELEMENTIDENTIFIER__Alternatives_3 ) ) )
            // InternalDomainmodel.g:2073:1: ( ( rule__ELEMENTIDENTIFIER__Alternatives_3 ) )
            {
            // InternalDomainmodel.g:2073:1: ( ( rule__ELEMENTIDENTIFIER__Alternatives_3 ) )
            // InternalDomainmodel.g:2074:2: ( rule__ELEMENTIDENTIFIER__Alternatives_3 )
            {
             before(grammarAccess.getELEMENTIDENTIFIERAccess().getAlternatives_3()); 
            // InternalDomainmodel.g:2075:2: ( rule__ELEMENTIDENTIFIER__Alternatives_3 )
            // InternalDomainmodel.g:2075:3: rule__ELEMENTIDENTIFIER__Alternatives_3
            {
            pushFollow(FOLLOW_2);
            rule__ELEMENTIDENTIFIER__Alternatives_3();

            state._fsp--;


            }

             after(grammarAccess.getELEMENTIDENTIFIERAccess().getAlternatives_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ELEMENTIDENTIFIER__Group__3__Impl"


    // $ANTLR start "rule__ELEMENTIDENTIFIER__Group_3_1__0"
    // InternalDomainmodel.g:2084:1: rule__ELEMENTIDENTIFIER__Group_3_1__0 : rule__ELEMENTIDENTIFIER__Group_3_1__0__Impl rule__ELEMENTIDENTIFIER__Group_3_1__1 ;
    public final void rule__ELEMENTIDENTIFIER__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2088:1: ( rule__ELEMENTIDENTIFIER__Group_3_1__0__Impl rule__ELEMENTIDENTIFIER__Group_3_1__1 )
            // InternalDomainmodel.g:2089:2: rule__ELEMENTIDENTIFIER__Group_3_1__0__Impl rule__ELEMENTIDENTIFIER__Group_3_1__1
            {
            pushFollow(FOLLOW_4);
            rule__ELEMENTIDENTIFIER__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ELEMENTIDENTIFIER__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ELEMENTIDENTIFIER__Group_3_1__0"


    // $ANTLR start "rule__ELEMENTIDENTIFIER__Group_3_1__0__Impl"
    // InternalDomainmodel.g:2096:1: rule__ELEMENTIDENTIFIER__Group_3_1__0__Impl : ( 'given' ) ;
    public final void rule__ELEMENTIDENTIFIER__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2100:1: ( ( 'given' ) )
            // InternalDomainmodel.g:2101:1: ( 'given' )
            {
            // InternalDomainmodel.g:2101:1: ( 'given' )
            // InternalDomainmodel.g:2102:2: 'given'
            {
             before(grammarAccess.getELEMENTIDENTIFIERAccess().getGivenKeyword_3_1_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getELEMENTIDENTIFIERAccess().getGivenKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ELEMENTIDENTIFIER__Group_3_1__0__Impl"


    // $ANTLR start "rule__ELEMENTIDENTIFIER__Group_3_1__1"
    // InternalDomainmodel.g:2111:1: rule__ELEMENTIDENTIFIER__Group_3_1__1 : rule__ELEMENTIDENTIFIER__Group_3_1__1__Impl ;
    public final void rule__ELEMENTIDENTIFIER__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2115:1: ( rule__ELEMENTIDENTIFIER__Group_3_1__1__Impl )
            // InternalDomainmodel.g:2116:2: rule__ELEMENTIDENTIFIER__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ELEMENTIDENTIFIER__Group_3_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ELEMENTIDENTIFIER__Group_3_1__1"


    // $ANTLR start "rule__ELEMENTIDENTIFIER__Group_3_1__1__Impl"
    // InternalDomainmodel.g:2122:1: rule__ELEMENTIDENTIFIER__Group_3_1__1__Impl : ( RULE_VARTYPE ) ;
    public final void rule__ELEMENTIDENTIFIER__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2126:1: ( ( RULE_VARTYPE ) )
            // InternalDomainmodel.g:2127:1: ( RULE_VARTYPE )
            {
            // InternalDomainmodel.g:2127:1: ( RULE_VARTYPE )
            // InternalDomainmodel.g:2128:2: RULE_VARTYPE
            {
             before(grammarAccess.getELEMENTIDENTIFIERAccess().getVARTYPETerminalRuleCall_3_1_1()); 
            match(input,RULE_VARTYPE,FOLLOW_2); 
             after(grammarAccess.getELEMENTIDENTIFIERAccess().getVARTYPETerminalRuleCall_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ELEMENTIDENTIFIER__Group_3_1__1__Impl"


    // $ANTLR start "rule__VERIFY__Group__0"
    // InternalDomainmodel.g:2138:1: rule__VERIFY__Group__0 : rule__VERIFY__Group__0__Impl rule__VERIFY__Group__1 ;
    public final void rule__VERIFY__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2142:1: ( rule__VERIFY__Group__0__Impl rule__VERIFY__Group__1 )
            // InternalDomainmodel.g:2143:2: rule__VERIFY__Group__0__Impl rule__VERIFY__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__VERIFY__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VERIFY__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VERIFY__Group__0"


    // $ANTLR start "rule__VERIFY__Group__0__Impl"
    // InternalDomainmodel.g:2150:1: rule__VERIFY__Group__0__Impl : ( ( rule__VERIFY__NameAssignment_0 ) ) ;
    public final void rule__VERIFY__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2154:1: ( ( ( rule__VERIFY__NameAssignment_0 ) ) )
            // InternalDomainmodel.g:2155:1: ( ( rule__VERIFY__NameAssignment_0 ) )
            {
            // InternalDomainmodel.g:2155:1: ( ( rule__VERIFY__NameAssignment_0 ) )
            // InternalDomainmodel.g:2156:2: ( rule__VERIFY__NameAssignment_0 )
            {
             before(grammarAccess.getVERIFYAccess().getNameAssignment_0()); 
            // InternalDomainmodel.g:2157:2: ( rule__VERIFY__NameAssignment_0 )
            // InternalDomainmodel.g:2157:3: rule__VERIFY__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__VERIFY__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getVERIFYAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VERIFY__Group__0__Impl"


    // $ANTLR start "rule__VERIFY__Group__1"
    // InternalDomainmodel.g:2165:1: rule__VERIFY__Group__1 : rule__VERIFY__Group__1__Impl rule__VERIFY__Group__2 ;
    public final void rule__VERIFY__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2169:1: ( rule__VERIFY__Group__1__Impl rule__VERIFY__Group__2 )
            // InternalDomainmodel.g:2170:2: rule__VERIFY__Group__1__Impl rule__VERIFY__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__VERIFY__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VERIFY__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VERIFY__Group__1"


    // $ANTLR start "rule__VERIFY__Group__1__Impl"
    // InternalDomainmodel.g:2177:1: rule__VERIFY__Group__1__Impl : ( 'that' ) ;
    public final void rule__VERIFY__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2181:1: ( ( 'that' ) )
            // InternalDomainmodel.g:2182:1: ( 'that' )
            {
            // InternalDomainmodel.g:2182:1: ( 'that' )
            // InternalDomainmodel.g:2183:2: 'that'
            {
             before(grammarAccess.getVERIFYAccess().getThatKeyword_1()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getVERIFYAccess().getThatKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VERIFY__Group__1__Impl"


    // $ANTLR start "rule__VERIFY__Group__2"
    // InternalDomainmodel.g:2192:1: rule__VERIFY__Group__2 : rule__VERIFY__Group__2__Impl rule__VERIFY__Group__3 ;
    public final void rule__VERIFY__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2196:1: ( rule__VERIFY__Group__2__Impl rule__VERIFY__Group__3 )
            // InternalDomainmodel.g:2197:2: rule__VERIFY__Group__2__Impl rule__VERIFY__Group__3
            {
            pushFollow(FOLLOW_27);
            rule__VERIFY__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VERIFY__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VERIFY__Group__2"


    // $ANTLR start "rule__VERIFY__Group__2__Impl"
    // InternalDomainmodel.g:2204:1: rule__VERIFY__Group__2__Impl : ( ( rule__VERIFY__Alternatives_2 ) ) ;
    public final void rule__VERIFY__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2208:1: ( ( ( rule__VERIFY__Alternatives_2 ) ) )
            // InternalDomainmodel.g:2209:1: ( ( rule__VERIFY__Alternatives_2 ) )
            {
            // InternalDomainmodel.g:2209:1: ( ( rule__VERIFY__Alternatives_2 ) )
            // InternalDomainmodel.g:2210:2: ( rule__VERIFY__Alternatives_2 )
            {
             before(grammarAccess.getVERIFYAccess().getAlternatives_2()); 
            // InternalDomainmodel.g:2211:2: ( rule__VERIFY__Alternatives_2 )
            // InternalDomainmodel.g:2211:3: rule__VERIFY__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__VERIFY__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getVERIFYAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VERIFY__Group__2__Impl"


    // $ANTLR start "rule__VERIFY__Group__3"
    // InternalDomainmodel.g:2219:1: rule__VERIFY__Group__3 : rule__VERIFY__Group__3__Impl ;
    public final void rule__VERIFY__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2223:1: ( rule__VERIFY__Group__3__Impl )
            // InternalDomainmodel.g:2224:2: rule__VERIFY__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VERIFY__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VERIFY__Group__3"


    // $ANTLR start "rule__VERIFY__Group__3__Impl"
    // InternalDomainmodel.g:2230:1: rule__VERIFY__Group__3__Impl : ( ( rule__VERIFY__Alternatives_3 ) ) ;
    public final void rule__VERIFY__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2234:1: ( ( ( rule__VERIFY__Alternatives_3 ) ) )
            // InternalDomainmodel.g:2235:1: ( ( rule__VERIFY__Alternatives_3 ) )
            {
            // InternalDomainmodel.g:2235:1: ( ( rule__VERIFY__Alternatives_3 ) )
            // InternalDomainmodel.g:2236:2: ( rule__VERIFY__Alternatives_3 )
            {
             before(grammarAccess.getVERIFYAccess().getAlternatives_3()); 
            // InternalDomainmodel.g:2237:2: ( rule__VERIFY__Alternatives_3 )
            // InternalDomainmodel.g:2237:3: rule__VERIFY__Alternatives_3
            {
            pushFollow(FOLLOW_2);
            rule__VERIFY__Alternatives_3();

            state._fsp--;


            }

             after(grammarAccess.getVERIFYAccess().getAlternatives_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VERIFY__Group__3__Impl"


    // $ANTLR start "rule__VERIFY__Group_2_1__0"
    // InternalDomainmodel.g:2246:1: rule__VERIFY__Group_2_1__0 : rule__VERIFY__Group_2_1__0__Impl rule__VERIFY__Group_2_1__1 ;
    public final void rule__VERIFY__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2250:1: ( rule__VERIFY__Group_2_1__0__Impl rule__VERIFY__Group_2_1__1 )
            // InternalDomainmodel.g:2251:2: rule__VERIFY__Group_2_1__0__Impl rule__VERIFY__Group_2_1__1
            {
            pushFollow(FOLLOW_12);
            rule__VERIFY__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VERIFY__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VERIFY__Group_2_1__0"


    // $ANTLR start "rule__VERIFY__Group_2_1__0__Impl"
    // InternalDomainmodel.g:2258:1: rule__VERIFY__Group_2_1__0__Impl : ( ( rule__VERIFY__Alternatives_2_1_0 ) ) ;
    public final void rule__VERIFY__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2262:1: ( ( ( rule__VERIFY__Alternatives_2_1_0 ) ) )
            // InternalDomainmodel.g:2263:1: ( ( rule__VERIFY__Alternatives_2_1_0 ) )
            {
            // InternalDomainmodel.g:2263:1: ( ( rule__VERIFY__Alternatives_2_1_0 ) )
            // InternalDomainmodel.g:2264:2: ( rule__VERIFY__Alternatives_2_1_0 )
            {
             before(grammarAccess.getVERIFYAccess().getAlternatives_2_1_0()); 
            // InternalDomainmodel.g:2265:2: ( rule__VERIFY__Alternatives_2_1_0 )
            // InternalDomainmodel.g:2265:3: rule__VERIFY__Alternatives_2_1_0
            {
            pushFollow(FOLLOW_2);
            rule__VERIFY__Alternatives_2_1_0();

            state._fsp--;


            }

             after(grammarAccess.getVERIFYAccess().getAlternatives_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VERIFY__Group_2_1__0__Impl"


    // $ANTLR start "rule__VERIFY__Group_2_1__1"
    // InternalDomainmodel.g:2273:1: rule__VERIFY__Group_2_1__1 : rule__VERIFY__Group_2_1__1__Impl ;
    public final void rule__VERIFY__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2277:1: ( rule__VERIFY__Group_2_1__1__Impl )
            // InternalDomainmodel.g:2278:2: rule__VERIFY__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VERIFY__Group_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VERIFY__Group_2_1__1"


    // $ANTLR start "rule__VERIFY__Group_2_1__1__Impl"
    // InternalDomainmodel.g:2284:1: rule__VERIFY__Group_2_1__1__Impl : ( ( ruleELEMENTIDENTIFIER )? ) ;
    public final void rule__VERIFY__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2288:1: ( ( ( ruleELEMENTIDENTIFIER )? ) )
            // InternalDomainmodel.g:2289:1: ( ( ruleELEMENTIDENTIFIER )? )
            {
            // InternalDomainmodel.g:2289:1: ( ( ruleELEMENTIDENTIFIER )? )
            // InternalDomainmodel.g:2290:2: ( ruleELEMENTIDENTIFIER )?
            {
             before(grammarAccess.getVERIFYAccess().getELEMENTIDENTIFIERParserRuleCall_2_1_1()); 
            // InternalDomainmodel.g:2291:2: ( ruleELEMENTIDENTIFIER )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==36) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalDomainmodel.g:2291:3: ruleELEMENTIDENTIFIER
                    {
                    pushFollow(FOLLOW_2);
                    ruleELEMENTIDENTIFIER();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVERIFYAccess().getELEMENTIDENTIFIERParserRuleCall_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VERIFY__Group_2_1__1__Impl"


    // $ANTLR start "rule__VERIFY__Group_3_0__0"
    // InternalDomainmodel.g:2300:1: rule__VERIFY__Group_3_0__0 : rule__VERIFY__Group_3_0__0__Impl rule__VERIFY__Group_3_0__1 ;
    public final void rule__VERIFY__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2304:1: ( rule__VERIFY__Group_3_0__0__Impl rule__VERIFY__Group_3_0__1 )
            // InternalDomainmodel.g:2305:2: rule__VERIFY__Group_3_0__0__Impl rule__VERIFY__Group_3_0__1
            {
            pushFollow(FOLLOW_28);
            rule__VERIFY__Group_3_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VERIFY__Group_3_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VERIFY__Group_3_0__0"


    // $ANTLR start "rule__VERIFY__Group_3_0__0__Impl"
    // InternalDomainmodel.g:2312:1: rule__VERIFY__Group_3_0__0__Impl : ( 'contains' ) ;
    public final void rule__VERIFY__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2316:1: ( ( 'contains' ) )
            // InternalDomainmodel.g:2317:1: ( 'contains' )
            {
            // InternalDomainmodel.g:2317:1: ( 'contains' )
            // InternalDomainmodel.g:2318:2: 'contains'
            {
             before(grammarAccess.getVERIFYAccess().getContainsKeyword_3_0_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getVERIFYAccess().getContainsKeyword_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VERIFY__Group_3_0__0__Impl"


    // $ANTLR start "rule__VERIFY__Group_3_0__1"
    // InternalDomainmodel.g:2327:1: rule__VERIFY__Group_3_0__1 : rule__VERIFY__Group_3_0__1__Impl ;
    public final void rule__VERIFY__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2331:1: ( rule__VERIFY__Group_3_0__1__Impl )
            // InternalDomainmodel.g:2332:2: rule__VERIFY__Group_3_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VERIFY__Group_3_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VERIFY__Group_3_0__1"


    // $ANTLR start "rule__VERIFY__Group_3_0__1__Impl"
    // InternalDomainmodel.g:2338:1: rule__VERIFY__Group_3_0__1__Impl : ( ( rule__VERIFY__Alternatives_3_0_1 ) ) ;
    public final void rule__VERIFY__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2342:1: ( ( ( rule__VERIFY__Alternatives_3_0_1 ) ) )
            // InternalDomainmodel.g:2343:1: ( ( rule__VERIFY__Alternatives_3_0_1 ) )
            {
            // InternalDomainmodel.g:2343:1: ( ( rule__VERIFY__Alternatives_3_0_1 ) )
            // InternalDomainmodel.g:2344:2: ( rule__VERIFY__Alternatives_3_0_1 )
            {
             before(grammarAccess.getVERIFYAccess().getAlternatives_3_0_1()); 
            // InternalDomainmodel.g:2345:2: ( rule__VERIFY__Alternatives_3_0_1 )
            // InternalDomainmodel.g:2345:3: rule__VERIFY__Alternatives_3_0_1
            {
            pushFollow(FOLLOW_2);
            rule__VERIFY__Alternatives_3_0_1();

            state._fsp--;


            }

             after(grammarAccess.getVERIFYAccess().getAlternatives_3_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VERIFY__Group_3_0__1__Impl"


    // $ANTLR start "rule__VERIFY__Group_3_0_1_0__0"
    // InternalDomainmodel.g:2354:1: rule__VERIFY__Group_3_0_1_0__0 : rule__VERIFY__Group_3_0_1_0__0__Impl rule__VERIFY__Group_3_0_1_0__1 ;
    public final void rule__VERIFY__Group_3_0_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2358:1: ( rule__VERIFY__Group_3_0_1_0__0__Impl rule__VERIFY__Group_3_0_1_0__1 )
            // InternalDomainmodel.g:2359:2: rule__VERIFY__Group_3_0_1_0__0__Impl rule__VERIFY__Group_3_0_1_0__1
            {
            pushFollow(FOLLOW_12);
            rule__VERIFY__Group_3_0_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VERIFY__Group_3_0_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VERIFY__Group_3_0_1_0__0"


    // $ANTLR start "rule__VERIFY__Group_3_0_1_0__0__Impl"
    // InternalDomainmodel.g:2366:1: rule__VERIFY__Group_3_0_1_0__0__Impl : ( ( rule__VERIFY__Alternatives_3_0_1_0_0 ) ) ;
    public final void rule__VERIFY__Group_3_0_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2370:1: ( ( ( rule__VERIFY__Alternatives_3_0_1_0_0 ) ) )
            // InternalDomainmodel.g:2371:1: ( ( rule__VERIFY__Alternatives_3_0_1_0_0 ) )
            {
            // InternalDomainmodel.g:2371:1: ( ( rule__VERIFY__Alternatives_3_0_1_0_0 ) )
            // InternalDomainmodel.g:2372:2: ( rule__VERIFY__Alternatives_3_0_1_0_0 )
            {
             before(grammarAccess.getVERIFYAccess().getAlternatives_3_0_1_0_0()); 
            // InternalDomainmodel.g:2373:2: ( rule__VERIFY__Alternatives_3_0_1_0_0 )
            // InternalDomainmodel.g:2373:3: rule__VERIFY__Alternatives_3_0_1_0_0
            {
            pushFollow(FOLLOW_2);
            rule__VERIFY__Alternatives_3_0_1_0_0();

            state._fsp--;


            }

             after(grammarAccess.getVERIFYAccess().getAlternatives_3_0_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VERIFY__Group_3_0_1_0__0__Impl"


    // $ANTLR start "rule__VERIFY__Group_3_0_1_0__1"
    // InternalDomainmodel.g:2381:1: rule__VERIFY__Group_3_0_1_0__1 : rule__VERIFY__Group_3_0_1_0__1__Impl ;
    public final void rule__VERIFY__Group_3_0_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2385:1: ( rule__VERIFY__Group_3_0_1_0__1__Impl )
            // InternalDomainmodel.g:2386:2: rule__VERIFY__Group_3_0_1_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VERIFY__Group_3_0_1_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VERIFY__Group_3_0_1_0__1"


    // $ANTLR start "rule__VERIFY__Group_3_0_1_0__1__Impl"
    // InternalDomainmodel.g:2392:1: rule__VERIFY__Group_3_0_1_0__1__Impl : ( ruleELEMENTIDENTIFIER ) ;
    public final void rule__VERIFY__Group_3_0_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2396:1: ( ( ruleELEMENTIDENTIFIER ) )
            // InternalDomainmodel.g:2397:1: ( ruleELEMENTIDENTIFIER )
            {
            // InternalDomainmodel.g:2397:1: ( ruleELEMENTIDENTIFIER )
            // InternalDomainmodel.g:2398:2: ruleELEMENTIDENTIFIER
            {
             before(grammarAccess.getVERIFYAccess().getELEMENTIDENTIFIERParserRuleCall_3_0_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleELEMENTIDENTIFIER();

            state._fsp--;

             after(grammarAccess.getVERIFYAccess().getELEMENTIDENTIFIERParserRuleCall_3_0_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VERIFY__Group_3_0_1_0__1__Impl"


    // $ANTLR start "rule__VERIFY__Group_3_0_1_2__0"
    // InternalDomainmodel.g:2408:1: rule__VERIFY__Group_3_0_1_2__0 : rule__VERIFY__Group_3_0_1_2__0__Impl rule__VERIFY__Group_3_0_1_2__1 ;
    public final void rule__VERIFY__Group_3_0_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2412:1: ( rule__VERIFY__Group_3_0_1_2__0__Impl rule__VERIFY__Group_3_0_1_2__1 )
            // InternalDomainmodel.g:2413:2: rule__VERIFY__Group_3_0_1_2__0__Impl rule__VERIFY__Group_3_0_1_2__1
            {
            pushFollow(FOLLOW_4);
            rule__VERIFY__Group_3_0_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VERIFY__Group_3_0_1_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VERIFY__Group_3_0_1_2__0"


    // $ANTLR start "rule__VERIFY__Group_3_0_1_2__0__Impl"
    // InternalDomainmodel.g:2420:1: rule__VERIFY__Group_3_0_1_2__0__Impl : ( 'saved' ) ;
    public final void rule__VERIFY__Group_3_0_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2424:1: ( ( 'saved' ) )
            // InternalDomainmodel.g:2425:1: ( 'saved' )
            {
            // InternalDomainmodel.g:2425:1: ( 'saved' )
            // InternalDomainmodel.g:2426:2: 'saved'
            {
             before(grammarAccess.getVERIFYAccess().getSavedKeyword_3_0_1_2_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getVERIFYAccess().getSavedKeyword_3_0_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VERIFY__Group_3_0_1_2__0__Impl"


    // $ANTLR start "rule__VERIFY__Group_3_0_1_2__1"
    // InternalDomainmodel.g:2435:1: rule__VERIFY__Group_3_0_1_2__1 : rule__VERIFY__Group_3_0_1_2__1__Impl ;
    public final void rule__VERIFY__Group_3_0_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2439:1: ( rule__VERIFY__Group_3_0_1_2__1__Impl )
            // InternalDomainmodel.g:2440:2: rule__VERIFY__Group_3_0_1_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VERIFY__Group_3_0_1_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VERIFY__Group_3_0_1_2__1"


    // $ANTLR start "rule__VERIFY__Group_3_0_1_2__1__Impl"
    // InternalDomainmodel.g:2446:1: rule__VERIFY__Group_3_0_1_2__1__Impl : ( ( rule__VERIFY__VarAssignment_3_0_1_2_1 ) ) ;
    public final void rule__VERIFY__Group_3_0_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2450:1: ( ( ( rule__VERIFY__VarAssignment_3_0_1_2_1 ) ) )
            // InternalDomainmodel.g:2451:1: ( ( rule__VERIFY__VarAssignment_3_0_1_2_1 ) )
            {
            // InternalDomainmodel.g:2451:1: ( ( rule__VERIFY__VarAssignment_3_0_1_2_1 ) )
            // InternalDomainmodel.g:2452:2: ( rule__VERIFY__VarAssignment_3_0_1_2_1 )
            {
             before(grammarAccess.getVERIFYAccess().getVarAssignment_3_0_1_2_1()); 
            // InternalDomainmodel.g:2453:2: ( rule__VERIFY__VarAssignment_3_0_1_2_1 )
            // InternalDomainmodel.g:2453:3: rule__VERIFY__VarAssignment_3_0_1_2_1
            {
            pushFollow(FOLLOW_2);
            rule__VERIFY__VarAssignment_3_0_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getVERIFYAccess().getVarAssignment_3_0_1_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VERIFY__Group_3_0_1_2__1__Impl"


    // $ANTLR start "rule__VERIFY__Group_3_1__0"
    // InternalDomainmodel.g:2462:1: rule__VERIFY__Group_3_1__0 : rule__VERIFY__Group_3_1__0__Impl rule__VERIFY__Group_3_1__1 ;
    public final void rule__VERIFY__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2466:1: ( rule__VERIFY__Group_3_1__0__Impl rule__VERIFY__Group_3_1__1 )
            // InternalDomainmodel.g:2467:2: rule__VERIFY__Group_3_1__0__Impl rule__VERIFY__Group_3_1__1
            {
            pushFollow(FOLLOW_15);
            rule__VERIFY__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VERIFY__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VERIFY__Group_3_1__0"


    // $ANTLR start "rule__VERIFY__Group_3_1__0__Impl"
    // InternalDomainmodel.g:2474:1: rule__VERIFY__Group_3_1__0__Impl : ( 'equals' ) ;
    public final void rule__VERIFY__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2478:1: ( ( 'equals' ) )
            // InternalDomainmodel.g:2479:1: ( 'equals' )
            {
            // InternalDomainmodel.g:2479:1: ( 'equals' )
            // InternalDomainmodel.g:2480:2: 'equals'
            {
             before(grammarAccess.getVERIFYAccess().getEqualsKeyword_3_1_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getVERIFYAccess().getEqualsKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VERIFY__Group_3_1__0__Impl"


    // $ANTLR start "rule__VERIFY__Group_3_1__1"
    // InternalDomainmodel.g:2489:1: rule__VERIFY__Group_3_1__1 : rule__VERIFY__Group_3_1__1__Impl ;
    public final void rule__VERIFY__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2493:1: ( rule__VERIFY__Group_3_1__1__Impl )
            // InternalDomainmodel.g:2494:2: rule__VERIFY__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VERIFY__Group_3_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VERIFY__Group_3_1__1"


    // $ANTLR start "rule__VERIFY__Group_3_1__1__Impl"
    // InternalDomainmodel.g:2500:1: rule__VERIFY__Group_3_1__1__Impl : ( ( rule__VERIFY__Alternatives_3_1_1 ) ) ;
    public final void rule__VERIFY__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2504:1: ( ( ( rule__VERIFY__Alternatives_3_1_1 ) ) )
            // InternalDomainmodel.g:2505:1: ( ( rule__VERIFY__Alternatives_3_1_1 ) )
            {
            // InternalDomainmodel.g:2505:1: ( ( rule__VERIFY__Alternatives_3_1_1 ) )
            // InternalDomainmodel.g:2506:2: ( rule__VERIFY__Alternatives_3_1_1 )
            {
             before(grammarAccess.getVERIFYAccess().getAlternatives_3_1_1()); 
            // InternalDomainmodel.g:2507:2: ( rule__VERIFY__Alternatives_3_1_1 )
            // InternalDomainmodel.g:2507:3: rule__VERIFY__Alternatives_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__VERIFY__Alternatives_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getVERIFYAccess().getAlternatives_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VERIFY__Group_3_1__1__Impl"


    // $ANTLR start "rule__VERIFY__Group_3_1_1_0__0"
    // InternalDomainmodel.g:2516:1: rule__VERIFY__Group_3_1_1_0__0 : rule__VERIFY__Group_3_1_1_0__0__Impl rule__VERIFY__Group_3_1_1_0__1 ;
    public final void rule__VERIFY__Group_3_1_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2520:1: ( rule__VERIFY__Group_3_1_1_0__0__Impl rule__VERIFY__Group_3_1_1_0__1 )
            // InternalDomainmodel.g:2521:2: rule__VERIFY__Group_3_1_1_0__0__Impl rule__VERIFY__Group_3_1_1_0__1
            {
            pushFollow(FOLLOW_4);
            rule__VERIFY__Group_3_1_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VERIFY__Group_3_1_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VERIFY__Group_3_1_1_0__0"


    // $ANTLR start "rule__VERIFY__Group_3_1_1_0__0__Impl"
    // InternalDomainmodel.g:2528:1: rule__VERIFY__Group_3_1_1_0__0__Impl : ( 'saved' ) ;
    public final void rule__VERIFY__Group_3_1_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2532:1: ( ( 'saved' ) )
            // InternalDomainmodel.g:2533:1: ( 'saved' )
            {
            // InternalDomainmodel.g:2533:1: ( 'saved' )
            // InternalDomainmodel.g:2534:2: 'saved'
            {
             before(grammarAccess.getVERIFYAccess().getSavedKeyword_3_1_1_0_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getVERIFYAccess().getSavedKeyword_3_1_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VERIFY__Group_3_1_1_0__0__Impl"


    // $ANTLR start "rule__VERIFY__Group_3_1_1_0__1"
    // InternalDomainmodel.g:2543:1: rule__VERIFY__Group_3_1_1_0__1 : rule__VERIFY__Group_3_1_1_0__1__Impl ;
    public final void rule__VERIFY__Group_3_1_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2547:1: ( rule__VERIFY__Group_3_1_1_0__1__Impl )
            // InternalDomainmodel.g:2548:2: rule__VERIFY__Group_3_1_1_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VERIFY__Group_3_1_1_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VERIFY__Group_3_1_1_0__1"


    // $ANTLR start "rule__VERIFY__Group_3_1_1_0__1__Impl"
    // InternalDomainmodel.g:2554:1: rule__VERIFY__Group_3_1_1_0__1__Impl : ( ( rule__VERIFY__VarAssignment_3_1_1_0_1 ) ) ;
    public final void rule__VERIFY__Group_3_1_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2558:1: ( ( ( rule__VERIFY__VarAssignment_3_1_1_0_1 ) ) )
            // InternalDomainmodel.g:2559:1: ( ( rule__VERIFY__VarAssignment_3_1_1_0_1 ) )
            {
            // InternalDomainmodel.g:2559:1: ( ( rule__VERIFY__VarAssignment_3_1_1_0_1 ) )
            // InternalDomainmodel.g:2560:2: ( rule__VERIFY__VarAssignment_3_1_1_0_1 )
            {
             before(grammarAccess.getVERIFYAccess().getVarAssignment_3_1_1_0_1()); 
            // InternalDomainmodel.g:2561:2: ( rule__VERIFY__VarAssignment_3_1_1_0_1 )
            // InternalDomainmodel.g:2561:3: rule__VERIFY__VarAssignment_3_1_1_0_1
            {
            pushFollow(FOLLOW_2);
            rule__VERIFY__VarAssignment_3_1_1_0_1();

            state._fsp--;


            }

             after(grammarAccess.getVERIFYAccess().getVarAssignment_3_1_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VERIFY__Group_3_1_1_0__1__Impl"


    // $ANTLR start "rule__COUNT__Group__0"
    // InternalDomainmodel.g:2570:1: rule__COUNT__Group__0 : rule__COUNT__Group__0__Impl rule__COUNT__Group__1 ;
    public final void rule__COUNT__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2574:1: ( rule__COUNT__Group__0__Impl rule__COUNT__Group__1 )
            // InternalDomainmodel.g:2575:2: rule__COUNT__Group__0__Impl rule__COUNT__Group__1
            {
            pushFollow(FOLLOW_29);
            rule__COUNT__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__COUNT__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__COUNT__Group__0"


    // $ANTLR start "rule__COUNT__Group__0__Impl"
    // InternalDomainmodel.g:2582:1: rule__COUNT__Group__0__Impl : ( ( rule__COUNT__NameAssignment_0 ) ) ;
    public final void rule__COUNT__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2586:1: ( ( ( rule__COUNT__NameAssignment_0 ) ) )
            // InternalDomainmodel.g:2587:1: ( ( rule__COUNT__NameAssignment_0 ) )
            {
            // InternalDomainmodel.g:2587:1: ( ( rule__COUNT__NameAssignment_0 ) )
            // InternalDomainmodel.g:2588:2: ( rule__COUNT__NameAssignment_0 )
            {
             before(grammarAccess.getCOUNTAccess().getNameAssignment_0()); 
            // InternalDomainmodel.g:2589:2: ( rule__COUNT__NameAssignment_0 )
            // InternalDomainmodel.g:2589:3: rule__COUNT__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__COUNT__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCOUNTAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__COUNT__Group__0__Impl"


    // $ANTLR start "rule__COUNT__Group__1"
    // InternalDomainmodel.g:2597:1: rule__COUNT__Group__1 : rule__COUNT__Group__1__Impl rule__COUNT__Group__2 ;
    public final void rule__COUNT__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2601:1: ( rule__COUNT__Group__1__Impl rule__COUNT__Group__2 )
            // InternalDomainmodel.g:2602:2: rule__COUNT__Group__1__Impl rule__COUNT__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__COUNT__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__COUNT__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__COUNT__Group__1"


    // $ANTLR start "rule__COUNT__Group__1__Impl"
    // InternalDomainmodel.g:2609:1: rule__COUNT__Group__1__Impl : ( 'ELEMENT' ) ;
    public final void rule__COUNT__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2613:1: ( ( 'ELEMENT' ) )
            // InternalDomainmodel.g:2614:1: ( 'ELEMENT' )
            {
            // InternalDomainmodel.g:2614:1: ( 'ELEMENT' )
            // InternalDomainmodel.g:2615:2: 'ELEMENT'
            {
             before(grammarAccess.getCOUNTAccess().getELEMENTKeyword_1()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getCOUNTAccess().getELEMENTKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__COUNT__Group__1__Impl"


    // $ANTLR start "rule__COUNT__Group__2"
    // InternalDomainmodel.g:2624:1: rule__COUNT__Group__2 : rule__COUNT__Group__2__Impl rule__COUNT__Group__3 ;
    public final void rule__COUNT__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2628:1: ( rule__COUNT__Group__2__Impl rule__COUNT__Group__3 )
            // InternalDomainmodel.g:2629:2: rule__COUNT__Group__2__Impl rule__COUNT__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__COUNT__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__COUNT__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__COUNT__Group__2"


    // $ANTLR start "rule__COUNT__Group__2__Impl"
    // InternalDomainmodel.g:2636:1: rule__COUNT__Group__2__Impl : ( ruleELEMENTIDENTIFIER ) ;
    public final void rule__COUNT__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2640:1: ( ( ruleELEMENTIDENTIFIER ) )
            // InternalDomainmodel.g:2641:1: ( ruleELEMENTIDENTIFIER )
            {
            // InternalDomainmodel.g:2641:1: ( ruleELEMENTIDENTIFIER )
            // InternalDomainmodel.g:2642:2: ruleELEMENTIDENTIFIER
            {
             before(grammarAccess.getCOUNTAccess().getELEMENTIDENTIFIERParserRuleCall_2()); 
            pushFollow(FOLLOW_2);
            ruleELEMENTIDENTIFIER();

            state._fsp--;

             after(grammarAccess.getCOUNTAccess().getELEMENTIDENTIFIERParserRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__COUNT__Group__2__Impl"


    // $ANTLR start "rule__COUNT__Group__3"
    // InternalDomainmodel.g:2651:1: rule__COUNT__Group__3 : rule__COUNT__Group__3__Impl ;
    public final void rule__COUNT__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2655:1: ( rule__COUNT__Group__3__Impl )
            // InternalDomainmodel.g:2656:2: rule__COUNT__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__COUNT__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__COUNT__Group__3"


    // $ANTLR start "rule__COUNT__Group__3__Impl"
    // InternalDomainmodel.g:2662:1: rule__COUNT__Group__3__Impl : ( ( ruleSAVEVAR )? ) ;
    public final void rule__COUNT__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2666:1: ( ( ( ruleSAVEVAR )? ) )
            // InternalDomainmodel.g:2667:1: ( ( ruleSAVEVAR )? )
            {
            // InternalDomainmodel.g:2667:1: ( ( ruleSAVEVAR )? )
            // InternalDomainmodel.g:2668:2: ( ruleSAVEVAR )?
            {
             before(grammarAccess.getCOUNTAccess().getSAVEVARParserRuleCall_3()); 
            // InternalDomainmodel.g:2669:2: ( ruleSAVEVAR )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==42) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalDomainmodel.g:2669:3: ruleSAVEVAR
                    {
                    pushFollow(FOLLOW_2);
                    ruleSAVEVAR();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCOUNTAccess().getSAVEVARParserRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__COUNT__Group__3__Impl"


    // $ANTLR start "rule__SAVEVAR__Group__0"
    // InternalDomainmodel.g:2678:1: rule__SAVEVAR__Group__0 : rule__SAVEVAR__Group__0__Impl rule__SAVEVAR__Group__1 ;
    public final void rule__SAVEVAR__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2682:1: ( rule__SAVEVAR__Group__0__Impl rule__SAVEVAR__Group__1 )
            // InternalDomainmodel.g:2683:2: rule__SAVEVAR__Group__0__Impl rule__SAVEVAR__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__SAVEVAR__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SAVEVAR__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAVEVAR__Group__0"


    // $ANTLR start "rule__SAVEVAR__Group__0__Impl"
    // InternalDomainmodel.g:2690:1: rule__SAVEVAR__Group__0__Impl : ( 'and' ) ;
    public final void rule__SAVEVAR__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2694:1: ( ( 'and' ) )
            // InternalDomainmodel.g:2695:1: ( 'and' )
            {
            // InternalDomainmodel.g:2695:1: ( 'and' )
            // InternalDomainmodel.g:2696:2: 'and'
            {
             before(grammarAccess.getSAVEVARAccess().getAndKeyword_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getSAVEVARAccess().getAndKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAVEVAR__Group__0__Impl"


    // $ANTLR start "rule__SAVEVAR__Group__1"
    // InternalDomainmodel.g:2705:1: rule__SAVEVAR__Group__1 : rule__SAVEVAR__Group__1__Impl rule__SAVEVAR__Group__2 ;
    public final void rule__SAVEVAR__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2709:1: ( rule__SAVEVAR__Group__1__Impl rule__SAVEVAR__Group__2 )
            // InternalDomainmodel.g:2710:2: rule__SAVEVAR__Group__1__Impl rule__SAVEVAR__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__SAVEVAR__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SAVEVAR__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAVEVAR__Group__1"


    // $ANTLR start "rule__SAVEVAR__Group__1__Impl"
    // InternalDomainmodel.g:2717:1: rule__SAVEVAR__Group__1__Impl : ( 'save' ) ;
    public final void rule__SAVEVAR__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2721:1: ( ( 'save' ) )
            // InternalDomainmodel.g:2722:1: ( 'save' )
            {
            // InternalDomainmodel.g:2722:1: ( 'save' )
            // InternalDomainmodel.g:2723:2: 'save'
            {
             before(grammarAccess.getSAVEVARAccess().getSaveKeyword_1()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getSAVEVARAccess().getSaveKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAVEVAR__Group__1__Impl"


    // $ANTLR start "rule__SAVEVAR__Group__2"
    // InternalDomainmodel.g:2732:1: rule__SAVEVAR__Group__2 : rule__SAVEVAR__Group__2__Impl rule__SAVEVAR__Group__3 ;
    public final void rule__SAVEVAR__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2736:1: ( rule__SAVEVAR__Group__2__Impl rule__SAVEVAR__Group__3 )
            // InternalDomainmodel.g:2737:2: rule__SAVEVAR__Group__2__Impl rule__SAVEVAR__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__SAVEVAR__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SAVEVAR__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAVEVAR__Group__2"


    // $ANTLR start "rule__SAVEVAR__Group__2__Impl"
    // InternalDomainmodel.g:2744:1: rule__SAVEVAR__Group__2__Impl : ( 'in' ) ;
    public final void rule__SAVEVAR__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2748:1: ( ( 'in' ) )
            // InternalDomainmodel.g:2749:1: ( 'in' )
            {
            // InternalDomainmodel.g:2749:1: ( 'in' )
            // InternalDomainmodel.g:2750:2: 'in'
            {
             before(grammarAccess.getSAVEVARAccess().getInKeyword_2()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getSAVEVARAccess().getInKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAVEVAR__Group__2__Impl"


    // $ANTLR start "rule__SAVEVAR__Group__3"
    // InternalDomainmodel.g:2759:1: rule__SAVEVAR__Group__3 : rule__SAVEVAR__Group__3__Impl ;
    public final void rule__SAVEVAR__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2763:1: ( rule__SAVEVAR__Group__3__Impl )
            // InternalDomainmodel.g:2764:2: rule__SAVEVAR__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SAVEVAR__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAVEVAR__Group__3"


    // $ANTLR start "rule__SAVEVAR__Group__3__Impl"
    // InternalDomainmodel.g:2770:1: rule__SAVEVAR__Group__3__Impl : ( ( rule__SAVEVAR__VarAssignment_3 ) ) ;
    public final void rule__SAVEVAR__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2774:1: ( ( ( rule__SAVEVAR__VarAssignment_3 ) ) )
            // InternalDomainmodel.g:2775:1: ( ( rule__SAVEVAR__VarAssignment_3 ) )
            {
            // InternalDomainmodel.g:2775:1: ( ( rule__SAVEVAR__VarAssignment_3 ) )
            // InternalDomainmodel.g:2776:2: ( rule__SAVEVAR__VarAssignment_3 )
            {
             before(grammarAccess.getSAVEVARAccess().getVarAssignment_3()); 
            // InternalDomainmodel.g:2777:2: ( rule__SAVEVAR__VarAssignment_3 )
            // InternalDomainmodel.g:2777:3: rule__SAVEVAR__VarAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__SAVEVAR__VarAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSAVEVARAccess().getVarAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAVEVAR__Group__3__Impl"


    // $ANTLR start "rule__PLAY__Group__0"
    // InternalDomainmodel.g:2786:1: rule__PLAY__Group__0 : rule__PLAY__Group__0__Impl rule__PLAY__Group__1 ;
    public final void rule__PLAY__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2790:1: ( rule__PLAY__Group__0__Impl rule__PLAY__Group__1 )
            // InternalDomainmodel.g:2791:2: rule__PLAY__Group__0__Impl rule__PLAY__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__PLAY__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PLAY__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PLAY__Group__0"


    // $ANTLR start "rule__PLAY__Group__0__Impl"
    // InternalDomainmodel.g:2798:1: rule__PLAY__Group__0__Impl : ( ( rule__PLAY__NameAssignment_0 ) ) ;
    public final void rule__PLAY__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2802:1: ( ( ( rule__PLAY__NameAssignment_0 ) ) )
            // InternalDomainmodel.g:2803:1: ( ( rule__PLAY__NameAssignment_0 ) )
            {
            // InternalDomainmodel.g:2803:1: ( ( rule__PLAY__NameAssignment_0 ) )
            // InternalDomainmodel.g:2804:2: ( rule__PLAY__NameAssignment_0 )
            {
             before(grammarAccess.getPLAYAccess().getNameAssignment_0()); 
            // InternalDomainmodel.g:2805:2: ( rule__PLAY__NameAssignment_0 )
            // InternalDomainmodel.g:2805:3: rule__PLAY__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__PLAY__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPLAYAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PLAY__Group__0__Impl"


    // $ANTLR start "rule__PLAY__Group__1"
    // InternalDomainmodel.g:2813:1: rule__PLAY__Group__1 : rule__PLAY__Group__1__Impl rule__PLAY__Group__2 ;
    public final void rule__PLAY__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2817:1: ( rule__PLAY__Group__1__Impl rule__PLAY__Group__2 )
            // InternalDomainmodel.g:2818:2: rule__PLAY__Group__1__Impl rule__PLAY__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__PLAY__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PLAY__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PLAY__Group__1"


    // $ANTLR start "rule__PLAY__Group__1__Impl"
    // InternalDomainmodel.g:2825:1: rule__PLAY__Group__1__Impl : ( 'procedure' ) ;
    public final void rule__PLAY__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2829:1: ( ( 'procedure' ) )
            // InternalDomainmodel.g:2830:1: ( 'procedure' )
            {
            // InternalDomainmodel.g:2830:1: ( 'procedure' )
            // InternalDomainmodel.g:2831:2: 'procedure'
            {
             before(grammarAccess.getPLAYAccess().getProcedureKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getPLAYAccess().getProcedureKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PLAY__Group__1__Impl"


    // $ANTLR start "rule__PLAY__Group__2"
    // InternalDomainmodel.g:2840:1: rule__PLAY__Group__2 : rule__PLAY__Group__2__Impl rule__PLAY__Group__3 ;
    public final void rule__PLAY__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2844:1: ( rule__PLAY__Group__2__Impl rule__PLAY__Group__3 )
            // InternalDomainmodel.g:2845:2: rule__PLAY__Group__2__Impl rule__PLAY__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__PLAY__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PLAY__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PLAY__Group__2"


    // $ANTLR start "rule__PLAY__Group__2__Impl"
    // InternalDomainmodel.g:2852:1: rule__PLAY__Group__2__Impl : ( RULE_VARTYPE ) ;
    public final void rule__PLAY__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2856:1: ( ( RULE_VARTYPE ) )
            // InternalDomainmodel.g:2857:1: ( RULE_VARTYPE )
            {
            // InternalDomainmodel.g:2857:1: ( RULE_VARTYPE )
            // InternalDomainmodel.g:2858:2: RULE_VARTYPE
            {
             before(grammarAccess.getPLAYAccess().getVARTYPETerminalRuleCall_2()); 
            match(input,RULE_VARTYPE,FOLLOW_2); 
             after(grammarAccess.getPLAYAccess().getVARTYPETerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PLAY__Group__2__Impl"


    // $ANTLR start "rule__PLAY__Group__3"
    // InternalDomainmodel.g:2867:1: rule__PLAY__Group__3 : rule__PLAY__Group__3__Impl ;
    public final void rule__PLAY__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2871:1: ( rule__PLAY__Group__3__Impl )
            // InternalDomainmodel.g:2872:2: rule__PLAY__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PLAY__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PLAY__Group__3"


    // $ANTLR start "rule__PLAY__Group__3__Impl"
    // InternalDomainmodel.g:2878:1: rule__PLAY__Group__3__Impl : ( ( rule__PLAY__ParamsAssignment_3 )* ) ;
    public final void rule__PLAY__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2882:1: ( ( ( rule__PLAY__ParamsAssignment_3 )* ) )
            // InternalDomainmodel.g:2883:1: ( ( rule__PLAY__ParamsAssignment_3 )* )
            {
            // InternalDomainmodel.g:2883:1: ( ( rule__PLAY__ParamsAssignment_3 )* )
            // InternalDomainmodel.g:2884:2: ( rule__PLAY__ParamsAssignment_3 )*
            {
             before(grammarAccess.getPLAYAccess().getParamsAssignment_3()); 
            // InternalDomainmodel.g:2885:2: ( rule__PLAY__ParamsAssignment_3 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_STRING) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalDomainmodel.g:2885:3: rule__PLAY__ParamsAssignment_3
            	    {
            	    pushFollow(FOLLOW_32);
            	    rule__PLAY__ParamsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getPLAYAccess().getParamsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PLAY__Group__3__Impl"


    // $ANTLR start "rule__PROGRAMME__ProceduresAssignment"
    // InternalDomainmodel.g:2894:1: rule__PROGRAMME__ProceduresAssignment : ( rulePROCEDURE ) ;
    public final void rule__PROGRAMME__ProceduresAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2898:1: ( ( rulePROCEDURE ) )
            // InternalDomainmodel.g:2899:2: ( rulePROCEDURE )
            {
            // InternalDomainmodel.g:2899:2: ( rulePROCEDURE )
            // InternalDomainmodel.g:2900:3: rulePROCEDURE
            {
             before(grammarAccess.getPROGRAMMEAccess().getProceduresPROCEDUREParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulePROCEDURE();

            state._fsp--;

             after(grammarAccess.getPROGRAMMEAccess().getProceduresPROCEDUREParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PROGRAMME__ProceduresAssignment"


    // $ANTLR start "rule__PROCEDURE__NameAssignment_1"
    // InternalDomainmodel.g:2909:1: rule__PROCEDURE__NameAssignment_1 : ( RULE_VARTYPE ) ;
    public final void rule__PROCEDURE__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2913:1: ( ( RULE_VARTYPE ) )
            // InternalDomainmodel.g:2914:2: ( RULE_VARTYPE )
            {
            // InternalDomainmodel.g:2914:2: ( RULE_VARTYPE )
            // InternalDomainmodel.g:2915:3: RULE_VARTYPE
            {
             before(grammarAccess.getPROCEDUREAccess().getNameVARTYPETerminalRuleCall_1_0()); 
            match(input,RULE_VARTYPE,FOLLOW_2); 
             after(grammarAccess.getPROCEDUREAccess().getNameVARTYPETerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PROCEDURE__NameAssignment_1"


    // $ANTLR start "rule__PROCEDURE__ParamAssignment_2_1"
    // InternalDomainmodel.g:2924:1: rule__PROCEDURE__ParamAssignment_2_1 : ( RULE_VARTYPE ) ;
    public final void rule__PROCEDURE__ParamAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2928:1: ( ( RULE_VARTYPE ) )
            // InternalDomainmodel.g:2929:2: ( RULE_VARTYPE )
            {
            // InternalDomainmodel.g:2929:2: ( RULE_VARTYPE )
            // InternalDomainmodel.g:2930:3: RULE_VARTYPE
            {
             before(grammarAccess.getPROCEDUREAccess().getParamVARTYPETerminalRuleCall_2_1_0()); 
            match(input,RULE_VARTYPE,FOLLOW_2); 
             after(grammarAccess.getPROCEDUREAccess().getParamVARTYPETerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PROCEDURE__ParamAssignment_2_1"


    // $ANTLR start "rule__PROCEDURE__ParamsAssignment_2_2"
    // InternalDomainmodel.g:2939:1: rule__PROCEDURE__ParamsAssignment_2_2 : ( RULE_VARTYPE ) ;
    public final void rule__PROCEDURE__ParamsAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2943:1: ( ( RULE_VARTYPE ) )
            // InternalDomainmodel.g:2944:2: ( RULE_VARTYPE )
            {
            // InternalDomainmodel.g:2944:2: ( RULE_VARTYPE )
            // InternalDomainmodel.g:2945:3: RULE_VARTYPE
            {
             before(grammarAccess.getPROCEDUREAccess().getParamsVARTYPETerminalRuleCall_2_2_0()); 
            match(input,RULE_VARTYPE,FOLLOW_2); 
             after(grammarAccess.getPROCEDUREAccess().getParamsVARTYPETerminalRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PROCEDURE__ParamsAssignment_2_2"


    // $ANTLR start "rule__PROCEDURE__InstAssignment_3"
    // InternalDomainmodel.g:2954:1: rule__PROCEDURE__InstAssignment_3 : ( ruleINSTRUCTION ) ;
    public final void rule__PROCEDURE__InstAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2958:1: ( ( ruleINSTRUCTION ) )
            // InternalDomainmodel.g:2959:2: ( ruleINSTRUCTION )
            {
            // InternalDomainmodel.g:2959:2: ( ruleINSTRUCTION )
            // InternalDomainmodel.g:2960:3: ruleINSTRUCTION
            {
             before(grammarAccess.getPROCEDUREAccess().getInstINSTRUCTIONParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleINSTRUCTION();

            state._fsp--;

             after(grammarAccess.getPROCEDUREAccess().getInstINSTRUCTIONParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PROCEDURE__InstAssignment_3"


    // $ANTLR start "rule__OPEN__NameAssignment_0"
    // InternalDomainmodel.g:2969:1: rule__OPEN__NameAssignment_0 : ( ( 'open' ) ) ;
    public final void rule__OPEN__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2973:1: ( ( ( 'open' ) ) )
            // InternalDomainmodel.g:2974:2: ( ( 'open' ) )
            {
            // InternalDomainmodel.g:2974:2: ( ( 'open' ) )
            // InternalDomainmodel.g:2975:3: ( 'open' )
            {
             before(grammarAccess.getOPENAccess().getNameOpenKeyword_0_0()); 
            // InternalDomainmodel.g:2976:3: ( 'open' )
            // InternalDomainmodel.g:2977:4: 'open'
            {
             before(grammarAccess.getOPENAccess().getNameOpenKeyword_0_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getOPENAccess().getNameOpenKeyword_0_0()); 

            }

             after(grammarAccess.getOPENAccess().getNameOpenKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OPEN__NameAssignment_0"


    // $ANTLR start "rule__OPEN__ValueAssignment_1"
    // InternalDomainmodel.g:2988:1: rule__OPEN__ValueAssignment_1 : ( ( rule__OPEN__ValueAlternatives_1_0 ) ) ;
    public final void rule__OPEN__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2992:1: ( ( ( rule__OPEN__ValueAlternatives_1_0 ) ) )
            // InternalDomainmodel.g:2993:2: ( ( rule__OPEN__ValueAlternatives_1_0 ) )
            {
            // InternalDomainmodel.g:2993:2: ( ( rule__OPEN__ValueAlternatives_1_0 ) )
            // InternalDomainmodel.g:2994:3: ( rule__OPEN__ValueAlternatives_1_0 )
            {
             before(grammarAccess.getOPENAccess().getValueAlternatives_1_0()); 
            // InternalDomainmodel.g:2995:3: ( rule__OPEN__ValueAlternatives_1_0 )
            // InternalDomainmodel.g:2995:4: rule__OPEN__ValueAlternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__OPEN__ValueAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getOPENAccess().getValueAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OPEN__ValueAssignment_1"


    // $ANTLR start "rule__GOTO__NameAssignment_0"
    // InternalDomainmodel.g:3003:1: rule__GOTO__NameAssignment_0 : ( ( 'go to' ) ) ;
    public final void rule__GOTO__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:3007:1: ( ( ( 'go to' ) ) )
            // InternalDomainmodel.g:3008:2: ( ( 'go to' ) )
            {
            // InternalDomainmodel.g:3008:2: ( ( 'go to' ) )
            // InternalDomainmodel.g:3009:3: ( 'go to' )
            {
             before(grammarAccess.getGOTOAccess().getNameGoToKeyword_0_0()); 
            // InternalDomainmodel.g:3010:3: ( 'go to' )
            // InternalDomainmodel.g:3011:4: 'go to'
            {
             before(grammarAccess.getGOTOAccess().getNameGoToKeyword_0_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getGOTOAccess().getNameGoToKeyword_0_0()); 

            }

             after(grammarAccess.getGOTOAccess().getNameGoToKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GOTO__NameAssignment_0"


    // $ANTLR start "rule__GOTO__ValueAssignment_2"
    // InternalDomainmodel.g:3022:1: rule__GOTO__ValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__GOTO__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:3026:1: ( ( RULE_STRING ) )
            // InternalDomainmodel.g:3027:2: ( RULE_STRING )
            {
            // InternalDomainmodel.g:3027:2: ( RULE_STRING )
            // InternalDomainmodel.g:3028:3: RULE_STRING
            {
             before(grammarAccess.getGOTOAccess().getValueSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getGOTOAccess().getValueSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GOTO__ValueAssignment_2"


    // $ANTLR start "rule__CLICK__NameAssignment_0"
    // InternalDomainmodel.g:3037:1: rule__CLICK__NameAssignment_0 : ( ( 'click' ) ) ;
    public final void rule__CLICK__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:3041:1: ( ( ( 'click' ) ) )
            // InternalDomainmodel.g:3042:2: ( ( 'click' ) )
            {
            // InternalDomainmodel.g:3042:2: ( ( 'click' ) )
            // InternalDomainmodel.g:3043:3: ( 'click' )
            {
             before(grammarAccess.getCLICKAccess().getNameClickKeyword_0_0()); 
            // InternalDomainmodel.g:3044:3: ( 'click' )
            // InternalDomainmodel.g:3045:4: 'click'
            {
             before(grammarAccess.getCLICKAccess().getNameClickKeyword_0_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getCLICKAccess().getNameClickKeyword_0_0()); 

            }

             after(grammarAccess.getCLICKAccess().getNameClickKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CLICK__NameAssignment_0"


    // $ANTLR start "rule__CLICK__TypeAssignment_2"
    // InternalDomainmodel.g:3056:1: rule__CLICK__TypeAssignment_2 : ( ( rule__CLICK__TypeAlternatives_2_0 ) ) ;
    public final void rule__CLICK__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:3060:1: ( ( ( rule__CLICK__TypeAlternatives_2_0 ) ) )
            // InternalDomainmodel.g:3061:2: ( ( rule__CLICK__TypeAlternatives_2_0 ) )
            {
            // InternalDomainmodel.g:3061:2: ( ( rule__CLICK__TypeAlternatives_2_0 ) )
            // InternalDomainmodel.g:3062:3: ( rule__CLICK__TypeAlternatives_2_0 )
            {
             before(grammarAccess.getCLICKAccess().getTypeAlternatives_2_0()); 
            // InternalDomainmodel.g:3063:3: ( rule__CLICK__TypeAlternatives_2_0 )
            // InternalDomainmodel.g:3063:4: rule__CLICK__TypeAlternatives_2_0
            {
            pushFollow(FOLLOW_2);
            rule__CLICK__TypeAlternatives_2_0();

            state._fsp--;


            }

             after(grammarAccess.getCLICKAccess().getTypeAlternatives_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CLICK__TypeAssignment_2"


    // $ANTLR start "rule__CLICK__ValueAssignment_3"
    // InternalDomainmodel.g:3071:1: rule__CLICK__ValueAssignment_3 : ( ruleELEMENTIDENTIFIER ) ;
    public final void rule__CLICK__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:3075:1: ( ( ruleELEMENTIDENTIFIER ) )
            // InternalDomainmodel.g:3076:2: ( ruleELEMENTIDENTIFIER )
            {
            // InternalDomainmodel.g:3076:2: ( ruleELEMENTIDENTIFIER )
            // InternalDomainmodel.g:3077:3: ruleELEMENTIDENTIFIER
            {
             before(grammarAccess.getCLICKAccess().getValueELEMENTIDENTIFIERParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleELEMENTIDENTIFIER();

            state._fsp--;

             after(grammarAccess.getCLICKAccess().getValueELEMENTIDENTIFIERParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CLICK__ValueAssignment_3"


    // $ANTLR start "rule__FILL__NameAssignment_0"
    // InternalDomainmodel.g:3086:1: rule__FILL__NameAssignment_0 : ( ( 'fill' ) ) ;
    public final void rule__FILL__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:3090:1: ( ( ( 'fill' ) ) )
            // InternalDomainmodel.g:3091:2: ( ( 'fill' ) )
            {
            // InternalDomainmodel.g:3091:2: ( ( 'fill' ) )
            // InternalDomainmodel.g:3092:3: ( 'fill' )
            {
             before(grammarAccess.getFILLAccess().getNameFillKeyword_0_0()); 
            // InternalDomainmodel.g:3093:3: ( 'fill' )
            // InternalDomainmodel.g:3094:4: 'fill'
            {
             before(grammarAccess.getFILLAccess().getNameFillKeyword_0_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getFILLAccess().getNameFillKeyword_0_0()); 

            }

             after(grammarAccess.getFILLAccess().getNameFillKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FILL__NameAssignment_0"


    // $ANTLR start "rule__FILL__VarAssignment_4_0_1"
    // InternalDomainmodel.g:3105:1: rule__FILL__VarAssignment_4_0_1 : ( RULE_VARTYPE ) ;
    public final void rule__FILL__VarAssignment_4_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:3109:1: ( ( RULE_VARTYPE ) )
            // InternalDomainmodel.g:3110:2: ( RULE_VARTYPE )
            {
            // InternalDomainmodel.g:3110:2: ( RULE_VARTYPE )
            // InternalDomainmodel.g:3111:3: RULE_VARTYPE
            {
             before(grammarAccess.getFILLAccess().getVarVARTYPETerminalRuleCall_4_0_1_0()); 
            match(input,RULE_VARTYPE,FOLLOW_2); 
             after(grammarAccess.getFILLAccess().getVarVARTYPETerminalRuleCall_4_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FILL__VarAssignment_4_0_1"


    // $ANTLR start "rule__FILL__ValueAssignment_4_1"
    // InternalDomainmodel.g:3120:1: rule__FILL__ValueAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__FILL__ValueAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:3124:1: ( ( RULE_STRING ) )
            // InternalDomainmodel.g:3125:2: ( RULE_STRING )
            {
            // InternalDomainmodel.g:3125:2: ( RULE_STRING )
            // InternalDomainmodel.g:3126:3: RULE_STRING
            {
             before(grammarAccess.getFILLAccess().getValueSTRINGTerminalRuleCall_4_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getFILLAccess().getValueSTRINGTerminalRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FILL__ValueAssignment_4_1"


    // $ANTLR start "rule__CHECK__NameAssignment_0"
    // InternalDomainmodel.g:3135:1: rule__CHECK__NameAssignment_0 : ( ( 'check' ) ) ;
    public final void rule__CHECK__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:3139:1: ( ( ( 'check' ) ) )
            // InternalDomainmodel.g:3140:2: ( ( 'check' ) )
            {
            // InternalDomainmodel.g:3140:2: ( ( 'check' ) )
            // InternalDomainmodel.g:3141:3: ( 'check' )
            {
             before(grammarAccess.getCHECKAccess().getNameCheckKeyword_0_0()); 
            // InternalDomainmodel.g:3142:3: ( 'check' )
            // InternalDomainmodel.g:3143:4: 'check'
            {
             before(grammarAccess.getCHECKAccess().getNameCheckKeyword_0_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getCHECKAccess().getNameCheckKeyword_0_0()); 

            }

             after(grammarAccess.getCHECKAccess().getNameCheckKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CHECK__NameAssignment_0"


    // $ANTLR start "rule__UNCHECK__NameAssignment_0"
    // InternalDomainmodel.g:3154:1: rule__UNCHECK__NameAssignment_0 : ( ( 'uncheck' ) ) ;
    public final void rule__UNCHECK__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:3158:1: ( ( ( 'uncheck' ) ) )
            // InternalDomainmodel.g:3159:2: ( ( 'uncheck' ) )
            {
            // InternalDomainmodel.g:3159:2: ( ( 'uncheck' ) )
            // InternalDomainmodel.g:3160:3: ( 'uncheck' )
            {
             before(grammarAccess.getUNCHECKAccess().getNameUncheckKeyword_0_0()); 
            // InternalDomainmodel.g:3161:3: ( 'uncheck' )
            // InternalDomainmodel.g:3162:4: 'uncheck'
            {
             before(grammarAccess.getUNCHECKAccess().getNameUncheckKeyword_0_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getUNCHECKAccess().getNameUncheckKeyword_0_0()); 

            }

             after(grammarAccess.getUNCHECKAccess().getNameUncheckKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UNCHECK__NameAssignment_0"


    // $ANTLR start "rule__SELECT__NameAssignment_0"
    // InternalDomainmodel.g:3173:1: rule__SELECT__NameAssignment_0 : ( ( 'select' ) ) ;
    public final void rule__SELECT__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:3177:1: ( ( ( 'select' ) ) )
            // InternalDomainmodel.g:3178:2: ( ( 'select' ) )
            {
            // InternalDomainmodel.g:3178:2: ( ( 'select' ) )
            // InternalDomainmodel.g:3179:3: ( 'select' )
            {
             before(grammarAccess.getSELECTAccess().getNameSelectKeyword_0_0()); 
            // InternalDomainmodel.g:3180:3: ( 'select' )
            // InternalDomainmodel.g:3181:4: 'select'
            {
             before(grammarAccess.getSELECTAccess().getNameSelectKeyword_0_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getSELECTAccess().getNameSelectKeyword_0_0()); 

            }

             after(grammarAccess.getSELECTAccess().getNameSelectKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SELECT__NameAssignment_0"


    // $ANTLR start "rule__SELECT__ElemAssignment_1"
    // InternalDomainmodel.g:3192:1: rule__SELECT__ElemAssignment_1 : ( RULE_STRING ) ;
    public final void rule__SELECT__ElemAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:3196:1: ( ( RULE_STRING ) )
            // InternalDomainmodel.g:3197:2: ( RULE_STRING )
            {
            // InternalDomainmodel.g:3197:2: ( RULE_STRING )
            // InternalDomainmodel.g:3198:3: RULE_STRING
            {
             before(grammarAccess.getSELECTAccess().getElemSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSELECTAccess().getElemSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SELECT__ElemAssignment_1"


    // $ANTLR start "rule__READ__NameAssignment_0"
    // InternalDomainmodel.g:3207:1: rule__READ__NameAssignment_0 : ( ( 'read' ) ) ;
    public final void rule__READ__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:3211:1: ( ( ( 'read' ) ) )
            // InternalDomainmodel.g:3212:2: ( ( 'read' ) )
            {
            // InternalDomainmodel.g:3212:2: ( ( 'read' ) )
            // InternalDomainmodel.g:3213:3: ( 'read' )
            {
             before(grammarAccess.getREADAccess().getNameReadKeyword_0_0()); 
            // InternalDomainmodel.g:3214:3: ( 'read' )
            // InternalDomainmodel.g:3215:4: 'read'
            {
             before(grammarAccess.getREADAccess().getNameReadKeyword_0_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getREADAccess().getNameReadKeyword_0_0()); 

            }

             after(grammarAccess.getREADAccess().getNameReadKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__READ__NameAssignment_0"


    // $ANTLR start "rule__VERIFY__NameAssignment_0"
    // InternalDomainmodel.g:3226:1: rule__VERIFY__NameAssignment_0 : ( ( 'verify' ) ) ;
    public final void rule__VERIFY__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:3230:1: ( ( ( 'verify' ) ) )
            // InternalDomainmodel.g:3231:2: ( ( 'verify' ) )
            {
            // InternalDomainmodel.g:3231:2: ( ( 'verify' ) )
            // InternalDomainmodel.g:3232:3: ( 'verify' )
            {
             before(grammarAccess.getVERIFYAccess().getNameVerifyKeyword_0_0()); 
            // InternalDomainmodel.g:3233:3: ( 'verify' )
            // InternalDomainmodel.g:3234:4: 'verify'
            {
             before(grammarAccess.getVERIFYAccess().getNameVerifyKeyword_0_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getVERIFYAccess().getNameVerifyKeyword_0_0()); 

            }

             after(grammarAccess.getVERIFYAccess().getNameVerifyKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VERIFY__NameAssignment_0"


    // $ANTLR start "rule__VERIFY__CountAssignment_2_0"
    // InternalDomainmodel.g:3245:1: rule__VERIFY__CountAssignment_2_0 : ( ruleCOUNT ) ;
    public final void rule__VERIFY__CountAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:3249:1: ( ( ruleCOUNT ) )
            // InternalDomainmodel.g:3250:2: ( ruleCOUNT )
            {
            // InternalDomainmodel.g:3250:2: ( ruleCOUNT )
            // InternalDomainmodel.g:3251:3: ruleCOUNT
            {
             before(grammarAccess.getVERIFYAccess().getCountCOUNTParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleCOUNT();

            state._fsp--;

             after(grammarAccess.getVERIFYAccess().getCountCOUNTParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VERIFY__CountAssignment_2_0"


    // $ANTLR start "rule__VERIFY__ValueAssignment_3_0_1_1"
    // InternalDomainmodel.g:3260:1: rule__VERIFY__ValueAssignment_3_0_1_1 : ( RULE_STRING ) ;
    public final void rule__VERIFY__ValueAssignment_3_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:3264:1: ( ( RULE_STRING ) )
            // InternalDomainmodel.g:3265:2: ( RULE_STRING )
            {
            // InternalDomainmodel.g:3265:2: ( RULE_STRING )
            // InternalDomainmodel.g:3266:3: RULE_STRING
            {
             before(grammarAccess.getVERIFYAccess().getValueSTRINGTerminalRuleCall_3_0_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getVERIFYAccess().getValueSTRINGTerminalRuleCall_3_0_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VERIFY__ValueAssignment_3_0_1_1"


    // $ANTLR start "rule__VERIFY__VarAssignment_3_0_1_2_1"
    // InternalDomainmodel.g:3275:1: rule__VERIFY__VarAssignment_3_0_1_2_1 : ( RULE_VARTYPE ) ;
    public final void rule__VERIFY__VarAssignment_3_0_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:3279:1: ( ( RULE_VARTYPE ) )
            // InternalDomainmodel.g:3280:2: ( RULE_VARTYPE )
            {
            // InternalDomainmodel.g:3280:2: ( RULE_VARTYPE )
            // InternalDomainmodel.g:3281:3: RULE_VARTYPE
            {
             before(grammarAccess.getVERIFYAccess().getVarVARTYPETerminalRuleCall_3_0_1_2_1_0()); 
            match(input,RULE_VARTYPE,FOLLOW_2); 
             after(grammarAccess.getVERIFYAccess().getVarVARTYPETerminalRuleCall_3_0_1_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VERIFY__VarAssignment_3_0_1_2_1"


    // $ANTLR start "rule__VERIFY__VarAssignment_3_1_1_0_1"
    // InternalDomainmodel.g:3290:1: rule__VERIFY__VarAssignment_3_1_1_0_1 : ( RULE_VARTYPE ) ;
    public final void rule__VERIFY__VarAssignment_3_1_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:3294:1: ( ( RULE_VARTYPE ) )
            // InternalDomainmodel.g:3295:2: ( RULE_VARTYPE )
            {
            // InternalDomainmodel.g:3295:2: ( RULE_VARTYPE )
            // InternalDomainmodel.g:3296:3: RULE_VARTYPE
            {
             before(grammarAccess.getVERIFYAccess().getVarVARTYPETerminalRuleCall_3_1_1_0_1_0()); 
            match(input,RULE_VARTYPE,FOLLOW_2); 
             after(grammarAccess.getVERIFYAccess().getVarVARTYPETerminalRuleCall_3_1_1_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VERIFY__VarAssignment_3_1_1_0_1"


    // $ANTLR start "rule__VERIFY__ValueAssignment_3_1_1_1"
    // InternalDomainmodel.g:3305:1: rule__VERIFY__ValueAssignment_3_1_1_1 : ( RULE_STRING ) ;
    public final void rule__VERIFY__ValueAssignment_3_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:3309:1: ( ( RULE_STRING ) )
            // InternalDomainmodel.g:3310:2: ( RULE_STRING )
            {
            // InternalDomainmodel.g:3310:2: ( RULE_STRING )
            // InternalDomainmodel.g:3311:3: RULE_STRING
            {
             before(grammarAccess.getVERIFYAccess().getValueSTRINGTerminalRuleCall_3_1_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getVERIFYAccess().getValueSTRINGTerminalRuleCall_3_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VERIFY__ValueAssignment_3_1_1_1"


    // $ANTLR start "rule__COUNT__NameAssignment_0"
    // InternalDomainmodel.g:3320:1: rule__COUNT__NameAssignment_0 : ( ( 'count' ) ) ;
    public final void rule__COUNT__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:3324:1: ( ( ( 'count' ) ) )
            // InternalDomainmodel.g:3325:2: ( ( 'count' ) )
            {
            // InternalDomainmodel.g:3325:2: ( ( 'count' ) )
            // InternalDomainmodel.g:3326:3: ( 'count' )
            {
             before(grammarAccess.getCOUNTAccess().getNameCountKeyword_0_0()); 
            // InternalDomainmodel.g:3327:3: ( 'count' )
            // InternalDomainmodel.g:3328:4: 'count'
            {
             before(grammarAccess.getCOUNTAccess().getNameCountKeyword_0_0()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getCOUNTAccess().getNameCountKeyword_0_0()); 

            }

             after(grammarAccess.getCOUNTAccess().getNameCountKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__COUNT__NameAssignment_0"


    // $ANTLR start "rule__SAVEVAR__VarAssignment_3"
    // InternalDomainmodel.g:3339:1: rule__SAVEVAR__VarAssignment_3 : ( RULE_VARTYPE ) ;
    public final void rule__SAVEVAR__VarAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:3343:1: ( ( RULE_VARTYPE ) )
            // InternalDomainmodel.g:3344:2: ( RULE_VARTYPE )
            {
            // InternalDomainmodel.g:3344:2: ( RULE_VARTYPE )
            // InternalDomainmodel.g:3345:3: RULE_VARTYPE
            {
             before(grammarAccess.getSAVEVARAccess().getVarVARTYPETerminalRuleCall_3_0()); 
            match(input,RULE_VARTYPE,FOLLOW_2); 
             after(grammarAccess.getSAVEVARAccess().getVarVARTYPETerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAVEVAR__VarAssignment_3"


    // $ANTLR start "rule__PLAY__NameAssignment_0"
    // InternalDomainmodel.g:3354:1: rule__PLAY__NameAssignment_0 : ( ( 'play' ) ) ;
    public final void rule__PLAY__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:3358:1: ( ( ( 'play' ) ) )
            // InternalDomainmodel.g:3359:2: ( ( 'play' ) )
            {
            // InternalDomainmodel.g:3359:2: ( ( 'play' ) )
            // InternalDomainmodel.g:3360:3: ( 'play' )
            {
             before(grammarAccess.getPLAYAccess().getNamePlayKeyword_0_0()); 
            // InternalDomainmodel.g:3361:3: ( 'play' )
            // InternalDomainmodel.g:3362:4: 'play'
            {
             before(grammarAccess.getPLAYAccess().getNamePlayKeyword_0_0()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getPLAYAccess().getNamePlayKeyword_0_0()); 

            }

             after(grammarAccess.getPLAYAccess().getNamePlayKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PLAY__NameAssignment_0"


    // $ANTLR start "rule__PLAY__ParamsAssignment_3"
    // InternalDomainmodel.g:3373:1: rule__PLAY__ParamsAssignment_3 : ( RULE_STRING ) ;
    public final void rule__PLAY__ParamsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:3377:1: ( ( RULE_STRING ) )
            // InternalDomainmodel.g:3378:2: ( RULE_STRING )
            {
            // InternalDomainmodel.g:3378:2: ( RULE_STRING )
            // InternalDomainmodel.g:3379:3: RULE_STRING
            {
             before(grammarAccess.getPLAYAccess().getParamsSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPLAYAccess().getParamsSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PLAY__ParamsAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x007FF00004000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x007FF00000000002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000000000003C000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000001004000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000F00000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0020000001020000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000020018010L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000012L});

}