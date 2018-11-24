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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_VARTYPE", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'FIREFOX'", "'CHROME'", "'BUTTON'", "'LINK'", "'IMAGE'", "'TEXT'", "'TEXTFIELD'", "'SEARCHFIELD'", "'LABEL'", "'CLASS'", "'ID'", "'ALT'", "'PAGE'", "'procedure'", "'with'", "'given'", "'on'", "'saved'", "'CHECKBOX'", "'in'", "'COMBOBOX'", "'url'", "'from'", "'by'", "'verify'", "'that'", "'contains'", "'equals'", "'ELEMENT'", "'and'", "'save'", "'open'", "'go to'", "'click'", "'fill'", "'check'", "'all'", "'uncheck'", "'select'", "'read'", "'identified'", "'count'", "'play'"
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
    // InternalDomainmodel.g:362:1: ruleVERIFY : ( ( rule__VERIFY__Alternatives ) ) ;
    public final void ruleVERIFY() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:366:2: ( ( ( rule__VERIFY__Alternatives ) ) )
            // InternalDomainmodel.g:367:2: ( ( rule__VERIFY__Alternatives ) )
            {
            // InternalDomainmodel.g:367:2: ( ( rule__VERIFY__Alternatives ) )
            // InternalDomainmodel.g:368:3: ( rule__VERIFY__Alternatives )
            {
             before(grammarAccess.getVERIFYAccess().getAlternatives()); 
            // InternalDomainmodel.g:369:3: ( rule__VERIFY__Alternatives )
            // InternalDomainmodel.g:369:4: rule__VERIFY__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__VERIFY__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getVERIFYAccess().getAlternatives()); 

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


    // $ANTLR start "entryRuleVERIFY_CONTAINS"
    // InternalDomainmodel.g:378:1: entryRuleVERIFY_CONTAINS : ruleVERIFY_CONTAINS EOF ;
    public final void entryRuleVERIFY_CONTAINS() throws RecognitionException {
        try {
            // InternalDomainmodel.g:379:1: ( ruleVERIFY_CONTAINS EOF )
            // InternalDomainmodel.g:380:1: ruleVERIFY_CONTAINS EOF
            {
             before(grammarAccess.getVERIFY_CONTAINSRule()); 
            pushFollow(FOLLOW_1);
            ruleVERIFY_CONTAINS();

            state._fsp--;

             after(grammarAccess.getVERIFY_CONTAINSRule()); 
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
    // $ANTLR end "entryRuleVERIFY_CONTAINS"


    // $ANTLR start "ruleVERIFY_CONTAINS"
    // InternalDomainmodel.g:387:1: ruleVERIFY_CONTAINS : ( ( rule__VERIFY_CONTAINS__Group__0 ) ) ;
    public final void ruleVERIFY_CONTAINS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:391:2: ( ( ( rule__VERIFY_CONTAINS__Group__0 ) ) )
            // InternalDomainmodel.g:392:2: ( ( rule__VERIFY_CONTAINS__Group__0 ) )
            {
            // InternalDomainmodel.g:392:2: ( ( rule__VERIFY_CONTAINS__Group__0 ) )
            // InternalDomainmodel.g:393:3: ( rule__VERIFY_CONTAINS__Group__0 )
            {
             before(grammarAccess.getVERIFY_CONTAINSAccess().getGroup()); 
            // InternalDomainmodel.g:394:3: ( rule__VERIFY_CONTAINS__Group__0 )
            // InternalDomainmodel.g:394:4: rule__VERIFY_CONTAINS__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VERIFY_CONTAINS__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVERIFY_CONTAINSAccess().getGroup()); 

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
    // $ANTLR end "ruleVERIFY_CONTAINS"


    // $ANTLR start "entryRuleVERIFY_EQUALS"
    // InternalDomainmodel.g:403:1: entryRuleVERIFY_EQUALS : ruleVERIFY_EQUALS EOF ;
    public final void entryRuleVERIFY_EQUALS() throws RecognitionException {
        try {
            // InternalDomainmodel.g:404:1: ( ruleVERIFY_EQUALS EOF )
            // InternalDomainmodel.g:405:1: ruleVERIFY_EQUALS EOF
            {
             before(grammarAccess.getVERIFY_EQUALSRule()); 
            pushFollow(FOLLOW_1);
            ruleVERIFY_EQUALS();

            state._fsp--;

             after(grammarAccess.getVERIFY_EQUALSRule()); 
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
    // $ANTLR end "entryRuleVERIFY_EQUALS"


    // $ANTLR start "ruleVERIFY_EQUALS"
    // InternalDomainmodel.g:412:1: ruleVERIFY_EQUALS : ( ( rule__VERIFY_EQUALS__Group__0 ) ) ;
    public final void ruleVERIFY_EQUALS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:416:2: ( ( ( rule__VERIFY_EQUALS__Group__0 ) ) )
            // InternalDomainmodel.g:417:2: ( ( rule__VERIFY_EQUALS__Group__0 ) )
            {
            // InternalDomainmodel.g:417:2: ( ( rule__VERIFY_EQUALS__Group__0 ) )
            // InternalDomainmodel.g:418:3: ( rule__VERIFY_EQUALS__Group__0 )
            {
             before(grammarAccess.getVERIFY_EQUALSAccess().getGroup()); 
            // InternalDomainmodel.g:419:3: ( rule__VERIFY_EQUALS__Group__0 )
            // InternalDomainmodel.g:419:4: rule__VERIFY_EQUALS__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VERIFY_EQUALS__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVERIFY_EQUALSAccess().getGroup()); 

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
    // $ANTLR end "ruleVERIFY_EQUALS"


    // $ANTLR start "entryRuleREGISTERED_VALUE"
    // InternalDomainmodel.g:428:1: entryRuleREGISTERED_VALUE : ruleREGISTERED_VALUE EOF ;
    public final void entryRuleREGISTERED_VALUE() throws RecognitionException {
        try {
            // InternalDomainmodel.g:429:1: ( ruleREGISTERED_VALUE EOF )
            // InternalDomainmodel.g:430:1: ruleREGISTERED_VALUE EOF
            {
             before(grammarAccess.getREGISTERED_VALUERule()); 
            pushFollow(FOLLOW_1);
            ruleREGISTERED_VALUE();

            state._fsp--;

             after(grammarAccess.getREGISTERED_VALUERule()); 
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
    // $ANTLR end "entryRuleREGISTERED_VALUE"


    // $ANTLR start "ruleREGISTERED_VALUE"
    // InternalDomainmodel.g:437:1: ruleREGISTERED_VALUE : ( ( rule__REGISTERED_VALUE__Group__0 ) ) ;
    public final void ruleREGISTERED_VALUE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:441:2: ( ( ( rule__REGISTERED_VALUE__Group__0 ) ) )
            // InternalDomainmodel.g:442:2: ( ( rule__REGISTERED_VALUE__Group__0 ) )
            {
            // InternalDomainmodel.g:442:2: ( ( rule__REGISTERED_VALUE__Group__0 ) )
            // InternalDomainmodel.g:443:3: ( rule__REGISTERED_VALUE__Group__0 )
            {
             before(grammarAccess.getREGISTERED_VALUEAccess().getGroup()); 
            // InternalDomainmodel.g:444:3: ( rule__REGISTERED_VALUE__Group__0 )
            // InternalDomainmodel.g:444:4: rule__REGISTERED_VALUE__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__REGISTERED_VALUE__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getREGISTERED_VALUEAccess().getGroup()); 

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
    // $ANTLR end "ruleREGISTERED_VALUE"


    // $ANTLR start "entryRuleCOUNT"
    // InternalDomainmodel.g:453:1: entryRuleCOUNT : ruleCOUNT EOF ;
    public final void entryRuleCOUNT() throws RecognitionException {
        try {
            // InternalDomainmodel.g:454:1: ( ruleCOUNT EOF )
            // InternalDomainmodel.g:455:1: ruleCOUNT EOF
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
    // InternalDomainmodel.g:462:1: ruleCOUNT : ( ( rule__COUNT__Group__0 ) ) ;
    public final void ruleCOUNT() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:466:2: ( ( ( rule__COUNT__Group__0 ) ) )
            // InternalDomainmodel.g:467:2: ( ( rule__COUNT__Group__0 ) )
            {
            // InternalDomainmodel.g:467:2: ( ( rule__COUNT__Group__0 ) )
            // InternalDomainmodel.g:468:3: ( rule__COUNT__Group__0 )
            {
             before(grammarAccess.getCOUNTAccess().getGroup()); 
            // InternalDomainmodel.g:469:3: ( rule__COUNT__Group__0 )
            // InternalDomainmodel.g:469:4: rule__COUNT__Group__0
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
    // InternalDomainmodel.g:478:1: entryRuleSAVEVAR : ruleSAVEVAR EOF ;
    public final void entryRuleSAVEVAR() throws RecognitionException {
        try {
            // InternalDomainmodel.g:479:1: ( ruleSAVEVAR EOF )
            // InternalDomainmodel.g:480:1: ruleSAVEVAR EOF
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
    // InternalDomainmodel.g:487:1: ruleSAVEVAR : ( ( rule__SAVEVAR__Group__0 ) ) ;
    public final void ruleSAVEVAR() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:491:2: ( ( ( rule__SAVEVAR__Group__0 ) ) )
            // InternalDomainmodel.g:492:2: ( ( rule__SAVEVAR__Group__0 ) )
            {
            // InternalDomainmodel.g:492:2: ( ( rule__SAVEVAR__Group__0 ) )
            // InternalDomainmodel.g:493:3: ( rule__SAVEVAR__Group__0 )
            {
             before(grammarAccess.getSAVEVARAccess().getGroup()); 
            // InternalDomainmodel.g:494:3: ( rule__SAVEVAR__Group__0 )
            // InternalDomainmodel.g:494:4: rule__SAVEVAR__Group__0
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
    // InternalDomainmodel.g:503:1: entryRulePLAY : rulePLAY EOF ;
    public final void entryRulePLAY() throws RecognitionException {
        try {
            // InternalDomainmodel.g:504:1: ( rulePLAY EOF )
            // InternalDomainmodel.g:505:1: rulePLAY EOF
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
    // InternalDomainmodel.g:512:1: rulePLAY : ( ( rule__PLAY__Group__0 ) ) ;
    public final void rulePLAY() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:516:2: ( ( ( rule__PLAY__Group__0 ) ) )
            // InternalDomainmodel.g:517:2: ( ( rule__PLAY__Group__0 ) )
            {
            // InternalDomainmodel.g:517:2: ( ( rule__PLAY__Group__0 ) )
            // InternalDomainmodel.g:518:3: ( rule__PLAY__Group__0 )
            {
             before(grammarAccess.getPLAYAccess().getGroup()); 
            // InternalDomainmodel.g:519:3: ( rule__PLAY__Group__0 )
            // InternalDomainmodel.g:519:4: rule__PLAY__Group__0
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
    // InternalDomainmodel.g:527:1: rule__INSTRUCTION__Alternatives : ( ( ruleOPEN ) | ( ruleCLICK ) | ( ruleCHECK ) | ( ruleUNCHECK ) | ( ruleREAD ) | ( ruleCOUNT ) | ( ruleVERIFY ) | ( ruleSELECT ) | ( ruleGOTO ) | ( ruleFILL ) | ( rulePLAY ) );
    public final void rule__INSTRUCTION__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:531:1: ( ( ruleOPEN ) | ( ruleCLICK ) | ( ruleCHECK ) | ( ruleUNCHECK ) | ( ruleREAD ) | ( ruleCOUNT ) | ( ruleVERIFY ) | ( ruleSELECT ) | ( ruleGOTO ) | ( ruleFILL ) | ( rulePLAY ) )
            int alt2=11;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt2=1;
                }
                break;
            case 45:
                {
                alt2=2;
                }
                break;
            case 47:
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
            case 36:
                {
                alt2=7;
                }
                break;
            case 50:
                {
                alt2=8;
                }
                break;
            case 44:
                {
                alt2=9;
                }
                break;
            case 46:
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
                    // InternalDomainmodel.g:532:2: ( ruleOPEN )
                    {
                    // InternalDomainmodel.g:532:2: ( ruleOPEN )
                    // InternalDomainmodel.g:533:3: ruleOPEN
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
                    // InternalDomainmodel.g:538:2: ( ruleCLICK )
                    {
                    // InternalDomainmodel.g:538:2: ( ruleCLICK )
                    // InternalDomainmodel.g:539:3: ruleCLICK
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
                    // InternalDomainmodel.g:544:2: ( ruleCHECK )
                    {
                    // InternalDomainmodel.g:544:2: ( ruleCHECK )
                    // InternalDomainmodel.g:545:3: ruleCHECK
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
                    // InternalDomainmodel.g:550:2: ( ruleUNCHECK )
                    {
                    // InternalDomainmodel.g:550:2: ( ruleUNCHECK )
                    // InternalDomainmodel.g:551:3: ruleUNCHECK
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
                    // InternalDomainmodel.g:556:2: ( ruleREAD )
                    {
                    // InternalDomainmodel.g:556:2: ( ruleREAD )
                    // InternalDomainmodel.g:557:3: ruleREAD
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
                    // InternalDomainmodel.g:562:2: ( ruleCOUNT )
                    {
                    // InternalDomainmodel.g:562:2: ( ruleCOUNT )
                    // InternalDomainmodel.g:563:3: ruleCOUNT
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
                    // InternalDomainmodel.g:568:2: ( ruleVERIFY )
                    {
                    // InternalDomainmodel.g:568:2: ( ruleVERIFY )
                    // InternalDomainmodel.g:569:3: ruleVERIFY
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
                    // InternalDomainmodel.g:574:2: ( ruleSELECT )
                    {
                    // InternalDomainmodel.g:574:2: ( ruleSELECT )
                    // InternalDomainmodel.g:575:3: ruleSELECT
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
                    // InternalDomainmodel.g:580:2: ( ruleGOTO )
                    {
                    // InternalDomainmodel.g:580:2: ( ruleGOTO )
                    // InternalDomainmodel.g:581:3: ruleGOTO
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
                    // InternalDomainmodel.g:586:2: ( ruleFILL )
                    {
                    // InternalDomainmodel.g:586:2: ( ruleFILL )
                    // InternalDomainmodel.g:587:3: ruleFILL
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
                    // InternalDomainmodel.g:592:2: ( rulePLAY )
                    {
                    // InternalDomainmodel.g:592:2: ( rulePLAY )
                    // InternalDomainmodel.g:593:3: rulePLAY
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
    // InternalDomainmodel.g:602:1: rule__OPEN__ValueAlternatives_1_0 : ( ( 'FIREFOX' ) | ( 'CHROME' ) );
    public final void rule__OPEN__ValueAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:606:1: ( ( 'FIREFOX' ) | ( 'CHROME' ) )
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
                    // InternalDomainmodel.g:607:2: ( 'FIREFOX' )
                    {
                    // InternalDomainmodel.g:607:2: ( 'FIREFOX' )
                    // InternalDomainmodel.g:608:3: 'FIREFOX'
                    {
                     before(grammarAccess.getOPENAccess().getValueFIREFOXKeyword_1_0_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getOPENAccess().getValueFIREFOXKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDomainmodel.g:613:2: ( 'CHROME' )
                    {
                    // InternalDomainmodel.g:613:2: ( 'CHROME' )
                    // InternalDomainmodel.g:614:3: 'CHROME'
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
    // InternalDomainmodel.g:623:1: rule__CLICK__TypeAlternatives_2_0 : ( ( 'BUTTON' ) | ( 'LINK' ) | ( 'IMAGE' ) | ( 'TEXT' ) );
    public final void rule__CLICK__TypeAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:627:1: ( ( 'BUTTON' ) | ( 'LINK' ) | ( 'IMAGE' ) | ( 'TEXT' ) )
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
                    // InternalDomainmodel.g:628:2: ( 'BUTTON' )
                    {
                    // InternalDomainmodel.g:628:2: ( 'BUTTON' )
                    // InternalDomainmodel.g:629:3: 'BUTTON'
                    {
                     before(grammarAccess.getCLICKAccess().getTypeBUTTONKeyword_2_0_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getCLICKAccess().getTypeBUTTONKeyword_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDomainmodel.g:634:2: ( 'LINK' )
                    {
                    // InternalDomainmodel.g:634:2: ( 'LINK' )
                    // InternalDomainmodel.g:635:3: 'LINK'
                    {
                     before(grammarAccess.getCLICKAccess().getTypeLINKKeyword_2_0_1()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getCLICKAccess().getTypeLINKKeyword_2_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDomainmodel.g:640:2: ( 'IMAGE' )
                    {
                    // InternalDomainmodel.g:640:2: ( 'IMAGE' )
                    // InternalDomainmodel.g:641:3: 'IMAGE'
                    {
                     before(grammarAccess.getCLICKAccess().getTypeIMAGEKeyword_2_0_2()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getCLICKAccess().getTypeIMAGEKeyword_2_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDomainmodel.g:646:2: ( 'TEXT' )
                    {
                    // InternalDomainmodel.g:646:2: ( 'TEXT' )
                    // InternalDomainmodel.g:647:3: 'TEXT'
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


    // $ANTLR start "rule__FILL__FieldTypeAlternatives_1_0"
    // InternalDomainmodel.g:656:1: rule__FILL__FieldTypeAlternatives_1_0 : ( ( 'TEXTFIELD' ) | ( 'SEARCHFIELD' ) );
    public final void rule__FILL__FieldTypeAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:660:1: ( ( 'TEXTFIELD' ) | ( 'SEARCHFIELD' ) )
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
                    // InternalDomainmodel.g:661:2: ( 'TEXTFIELD' )
                    {
                    // InternalDomainmodel.g:661:2: ( 'TEXTFIELD' )
                    // InternalDomainmodel.g:662:3: 'TEXTFIELD'
                    {
                     before(grammarAccess.getFILLAccess().getFieldTypeTEXTFIELDKeyword_1_0_0()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getFILLAccess().getFieldTypeTEXTFIELDKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDomainmodel.g:667:2: ( 'SEARCHFIELD' )
                    {
                    // InternalDomainmodel.g:667:2: ( 'SEARCHFIELD' )
                    // InternalDomainmodel.g:668:3: 'SEARCHFIELD'
                    {
                     before(grammarAccess.getFILLAccess().getFieldTypeSEARCHFIELDKeyword_1_0_1()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getFILLAccess().getFieldTypeSEARCHFIELDKeyword_1_0_1()); 

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
    // $ANTLR end "rule__FILL__FieldTypeAlternatives_1_0"


    // $ANTLR start "rule__FILL__Alternatives_4"
    // InternalDomainmodel.g:677:1: rule__FILL__Alternatives_4 : ( ( ( rule__FILL__Group_4_0__0 ) ) | ( ( rule__FILL__ValueAssignment_4_1 ) ) );
    public final void rule__FILL__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:681:1: ( ( ( rule__FILL__Group_4_0__0 ) ) | ( ( rule__FILL__ValueAssignment_4_1 ) ) )
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
                    // InternalDomainmodel.g:682:2: ( ( rule__FILL__Group_4_0__0 ) )
                    {
                    // InternalDomainmodel.g:682:2: ( ( rule__FILL__Group_4_0__0 ) )
                    // InternalDomainmodel.g:683:3: ( rule__FILL__Group_4_0__0 )
                    {
                     before(grammarAccess.getFILLAccess().getGroup_4_0()); 
                    // InternalDomainmodel.g:684:3: ( rule__FILL__Group_4_0__0 )
                    // InternalDomainmodel.g:684:4: rule__FILL__Group_4_0__0
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
                    // InternalDomainmodel.g:688:2: ( ( rule__FILL__ValueAssignment_4_1 ) )
                    {
                    // InternalDomainmodel.g:688:2: ( ( rule__FILL__ValueAssignment_4_1 ) )
                    // InternalDomainmodel.g:689:3: ( rule__FILL__ValueAssignment_4_1 )
                    {
                     before(grammarAccess.getFILLAccess().getValueAssignment_4_1()); 
                    // InternalDomainmodel.g:690:3: ( rule__FILL__ValueAssignment_4_1 )
                    // InternalDomainmodel.g:690:4: rule__FILL__ValueAssignment_4_1
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
    // InternalDomainmodel.g:698:1: rule__READ__Alternatives_3 : ( ( 'BUTTON' ) | ( 'LINK' ) | ( 'IMAGE' ) | ( 'TEXT' ) );
    public final void rule__READ__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:702:1: ( ( 'BUTTON' ) | ( 'LINK' ) | ( 'IMAGE' ) | ( 'TEXT' ) )
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
                    // InternalDomainmodel.g:703:2: ( 'BUTTON' )
                    {
                    // InternalDomainmodel.g:703:2: ( 'BUTTON' )
                    // InternalDomainmodel.g:704:3: 'BUTTON'
                    {
                     before(grammarAccess.getREADAccess().getBUTTONKeyword_3_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getREADAccess().getBUTTONKeyword_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDomainmodel.g:709:2: ( 'LINK' )
                    {
                    // InternalDomainmodel.g:709:2: ( 'LINK' )
                    // InternalDomainmodel.g:710:3: 'LINK'
                    {
                     before(grammarAccess.getREADAccess().getLINKKeyword_3_1()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getREADAccess().getLINKKeyword_3_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDomainmodel.g:715:2: ( 'IMAGE' )
                    {
                    // InternalDomainmodel.g:715:2: ( 'IMAGE' )
                    // InternalDomainmodel.g:716:3: 'IMAGE'
                    {
                     before(grammarAccess.getREADAccess().getIMAGEKeyword_3_2()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getREADAccess().getIMAGEKeyword_3_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDomainmodel.g:721:2: ( 'TEXT' )
                    {
                    // InternalDomainmodel.g:721:2: ( 'TEXT' )
                    // InternalDomainmodel.g:722:3: 'TEXT'
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


    // $ANTLR start "rule__ELEMENTIDENTIFIER__TypeAlternatives_2_0"
    // InternalDomainmodel.g:731:1: rule__ELEMENTIDENTIFIER__TypeAlternatives_2_0 : ( ( 'LABEL' ) | ( 'CLASS' ) | ( 'ID' ) | ( 'ALT' ) );
    public final void rule__ELEMENTIDENTIFIER__TypeAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:735:1: ( ( 'LABEL' ) | ( 'CLASS' ) | ( 'ID' ) | ( 'ALT' ) )
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
                    // InternalDomainmodel.g:736:2: ( 'LABEL' )
                    {
                    // InternalDomainmodel.g:736:2: ( 'LABEL' )
                    // InternalDomainmodel.g:737:3: 'LABEL'
                    {
                     before(grammarAccess.getELEMENTIDENTIFIERAccess().getTypeLABELKeyword_2_0_0()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getELEMENTIDENTIFIERAccess().getTypeLABELKeyword_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDomainmodel.g:742:2: ( 'CLASS' )
                    {
                    // InternalDomainmodel.g:742:2: ( 'CLASS' )
                    // InternalDomainmodel.g:743:3: 'CLASS'
                    {
                     before(grammarAccess.getELEMENTIDENTIFIERAccess().getTypeCLASSKeyword_2_0_1()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getELEMENTIDENTIFIERAccess().getTypeCLASSKeyword_2_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDomainmodel.g:748:2: ( 'ID' )
                    {
                    // InternalDomainmodel.g:748:2: ( 'ID' )
                    // InternalDomainmodel.g:749:3: 'ID'
                    {
                     before(grammarAccess.getELEMENTIDENTIFIERAccess().getTypeIDKeyword_2_0_2()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getELEMENTIDENTIFIERAccess().getTypeIDKeyword_2_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDomainmodel.g:754:2: ( 'ALT' )
                    {
                    // InternalDomainmodel.g:754:2: ( 'ALT' )
                    // InternalDomainmodel.g:755:3: 'ALT'
                    {
                     before(grammarAccess.getELEMENTIDENTIFIERAccess().getTypeALTKeyword_2_0_3()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getELEMENTIDENTIFIERAccess().getTypeALTKeyword_2_0_3()); 

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
    // $ANTLR end "rule__ELEMENTIDENTIFIER__TypeAlternatives_2_0"


    // $ANTLR start "rule__ELEMENTIDENTIFIER__Alternatives_3"
    // InternalDomainmodel.g:764:1: rule__ELEMENTIDENTIFIER__Alternatives_3 : ( ( ( rule__ELEMENTIDENTIFIER__ValueAssignment_3_0 ) ) | ( ( rule__ELEMENTIDENTIFIER__Group_3_1__0 ) ) );
    public final void rule__ELEMENTIDENTIFIER__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:768:1: ( ( ( rule__ELEMENTIDENTIFIER__ValueAssignment_3_0 ) ) | ( ( rule__ELEMENTIDENTIFIER__Group_3_1__0 ) ) )
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
                    // InternalDomainmodel.g:769:2: ( ( rule__ELEMENTIDENTIFIER__ValueAssignment_3_0 ) )
                    {
                    // InternalDomainmodel.g:769:2: ( ( rule__ELEMENTIDENTIFIER__ValueAssignment_3_0 ) )
                    // InternalDomainmodel.g:770:3: ( rule__ELEMENTIDENTIFIER__ValueAssignment_3_0 )
                    {
                     before(grammarAccess.getELEMENTIDENTIFIERAccess().getValueAssignment_3_0()); 
                    // InternalDomainmodel.g:771:3: ( rule__ELEMENTIDENTIFIER__ValueAssignment_3_0 )
                    // InternalDomainmodel.g:771:4: rule__ELEMENTIDENTIFIER__ValueAssignment_3_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ELEMENTIDENTIFIER__ValueAssignment_3_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getELEMENTIDENTIFIERAccess().getValueAssignment_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDomainmodel.g:775:2: ( ( rule__ELEMENTIDENTIFIER__Group_3_1__0 ) )
                    {
                    // InternalDomainmodel.g:775:2: ( ( rule__ELEMENTIDENTIFIER__Group_3_1__0 ) )
                    // InternalDomainmodel.g:776:3: ( rule__ELEMENTIDENTIFIER__Group_3_1__0 )
                    {
                     before(grammarAccess.getELEMENTIDENTIFIERAccess().getGroup_3_1()); 
                    // InternalDomainmodel.g:777:3: ( rule__ELEMENTIDENTIFIER__Group_3_1__0 )
                    // InternalDomainmodel.g:777:4: rule__ELEMENTIDENTIFIER__Group_3_1__0
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


    // $ANTLR start "rule__VERIFY__Alternatives"
    // InternalDomainmodel.g:785:1: rule__VERIFY__Alternatives : ( ( ruleVERIFY_CONTAINS ) | ( ruleVERIFY_EQUALS ) );
    public final void rule__VERIFY__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:789:1: ( ( ruleVERIFY_CONTAINS ) | ( ruleVERIFY_EQUALS ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==36) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==37) ) {
                    int LA10_2 = input.LA(3);

                    if ( (LA10_2==17||LA10_2==24) ) {
                        alt10=1;
                    }
                    else if ( (LA10_2==53) ) {
                        alt10=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalDomainmodel.g:790:2: ( ruleVERIFY_CONTAINS )
                    {
                    // InternalDomainmodel.g:790:2: ( ruleVERIFY_CONTAINS )
                    // InternalDomainmodel.g:791:3: ruleVERIFY_CONTAINS
                    {
                     before(grammarAccess.getVERIFYAccess().getVERIFY_CONTAINSParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleVERIFY_CONTAINS();

                    state._fsp--;

                     after(grammarAccess.getVERIFYAccess().getVERIFY_CONTAINSParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDomainmodel.g:796:2: ( ruleVERIFY_EQUALS )
                    {
                    // InternalDomainmodel.g:796:2: ( ruleVERIFY_EQUALS )
                    // InternalDomainmodel.g:797:3: ruleVERIFY_EQUALS
                    {
                     before(grammarAccess.getVERIFYAccess().getVERIFY_EQUALSParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleVERIFY_EQUALS();

                    state._fsp--;

                     after(grammarAccess.getVERIFYAccess().getVERIFY_EQUALSParserRuleCall_1()); 

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
    // $ANTLR end "rule__VERIFY__Alternatives"


    // $ANTLR start "rule__VERIFY_CONTAINS__TypeAlternatives_2_0"
    // InternalDomainmodel.g:806:1: rule__VERIFY_CONTAINS__TypeAlternatives_2_0 : ( ( 'PAGE' ) | ( 'TEXT' ) );
    public final void rule__VERIFY_CONTAINS__TypeAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:810:1: ( ( 'PAGE' ) | ( 'TEXT' ) )
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
                    // InternalDomainmodel.g:811:2: ( 'PAGE' )
                    {
                    // InternalDomainmodel.g:811:2: ( 'PAGE' )
                    // InternalDomainmodel.g:812:3: 'PAGE'
                    {
                     before(grammarAccess.getVERIFY_CONTAINSAccess().getTypePAGEKeyword_2_0_0()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getVERIFY_CONTAINSAccess().getTypePAGEKeyword_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDomainmodel.g:817:2: ( 'TEXT' )
                    {
                    // InternalDomainmodel.g:817:2: ( 'TEXT' )
                    // InternalDomainmodel.g:818:3: 'TEXT'
                    {
                     before(grammarAccess.getVERIFY_CONTAINSAccess().getTypeTEXTKeyword_2_0_1()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getVERIFY_CONTAINSAccess().getTypeTEXTKeyword_2_0_1()); 

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
    // $ANTLR end "rule__VERIFY_CONTAINS__TypeAlternatives_2_0"


    // $ANTLR start "rule__VERIFY_CONTAINS__Alternatives_5"
    // InternalDomainmodel.g:827:1: rule__VERIFY_CONTAINS__Alternatives_5 : ( ( ( rule__VERIFY_CONTAINS__Group_5_0__0 ) ) | ( ( rule__VERIFY_CONTAINS__Alternatives_5_1 ) ) );
    public final void rule__VERIFY_CONTAINS__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:831:1: ( ( ( rule__VERIFY_CONTAINS__Group_5_0__0 ) ) | ( ( rule__VERIFY_CONTAINS__Alternatives_5_1 ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=15 && LA12_0<=16)) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_STRING||LA12_0==29) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalDomainmodel.g:832:2: ( ( rule__VERIFY_CONTAINS__Group_5_0__0 ) )
                    {
                    // InternalDomainmodel.g:832:2: ( ( rule__VERIFY_CONTAINS__Group_5_0__0 ) )
                    // InternalDomainmodel.g:833:3: ( rule__VERIFY_CONTAINS__Group_5_0__0 )
                    {
                     before(grammarAccess.getVERIFY_CONTAINSAccess().getGroup_5_0()); 
                    // InternalDomainmodel.g:834:3: ( rule__VERIFY_CONTAINS__Group_5_0__0 )
                    // InternalDomainmodel.g:834:4: rule__VERIFY_CONTAINS__Group_5_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VERIFY_CONTAINS__Group_5_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getVERIFY_CONTAINSAccess().getGroup_5_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDomainmodel.g:838:2: ( ( rule__VERIFY_CONTAINS__Alternatives_5_1 ) )
                    {
                    // InternalDomainmodel.g:838:2: ( ( rule__VERIFY_CONTAINS__Alternatives_5_1 ) )
                    // InternalDomainmodel.g:839:3: ( rule__VERIFY_CONTAINS__Alternatives_5_1 )
                    {
                     before(grammarAccess.getVERIFY_CONTAINSAccess().getAlternatives_5_1()); 
                    // InternalDomainmodel.g:840:3: ( rule__VERIFY_CONTAINS__Alternatives_5_1 )
                    // InternalDomainmodel.g:840:4: rule__VERIFY_CONTAINS__Alternatives_5_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__VERIFY_CONTAINS__Alternatives_5_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getVERIFY_CONTAINSAccess().getAlternatives_5_1()); 

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
    // $ANTLR end "rule__VERIFY_CONTAINS__Alternatives_5"


    // $ANTLR start "rule__VERIFY_CONTAINS__Alternatives_5_0_0"
    // InternalDomainmodel.g:848:1: rule__VERIFY_CONTAINS__Alternatives_5_0_0 : ( ( 'LINK' ) | ( 'IMAGE' ) );
    public final void rule__VERIFY_CONTAINS__Alternatives_5_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:852:1: ( ( 'LINK' ) | ( 'IMAGE' ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==15) ) {
                alt13=1;
            }
            else if ( (LA13_0==16) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalDomainmodel.g:853:2: ( 'LINK' )
                    {
                    // InternalDomainmodel.g:853:2: ( 'LINK' )
                    // InternalDomainmodel.g:854:3: 'LINK'
                    {
                     before(grammarAccess.getVERIFY_CONTAINSAccess().getLINKKeyword_5_0_0_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getVERIFY_CONTAINSAccess().getLINKKeyword_5_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDomainmodel.g:859:2: ( 'IMAGE' )
                    {
                    // InternalDomainmodel.g:859:2: ( 'IMAGE' )
                    // InternalDomainmodel.g:860:3: 'IMAGE'
                    {
                     before(grammarAccess.getVERIFY_CONTAINSAccess().getIMAGEKeyword_5_0_0_1()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getVERIFY_CONTAINSAccess().getIMAGEKeyword_5_0_0_1()); 

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
    // $ANTLR end "rule__VERIFY_CONTAINS__Alternatives_5_0_0"


    // $ANTLR start "rule__VERIFY_CONTAINS__Alternatives_5_1"
    // InternalDomainmodel.g:869:1: rule__VERIFY_CONTAINS__Alternatives_5_1 : ( ( ( rule__VERIFY_CONTAINS__ValueAssignment_5_1_0 ) ) | ( ( rule__VERIFY_CONTAINS__VariableAssignment_5_1_1 ) ) );
    public final void rule__VERIFY_CONTAINS__Alternatives_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:873:1: ( ( ( rule__VERIFY_CONTAINS__ValueAssignment_5_1_0 ) ) | ( ( rule__VERIFY_CONTAINS__VariableAssignment_5_1_1 ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_STRING) ) {
                alt14=1;
            }
            else if ( (LA14_0==29) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalDomainmodel.g:874:2: ( ( rule__VERIFY_CONTAINS__ValueAssignment_5_1_0 ) )
                    {
                    // InternalDomainmodel.g:874:2: ( ( rule__VERIFY_CONTAINS__ValueAssignment_5_1_0 ) )
                    // InternalDomainmodel.g:875:3: ( rule__VERIFY_CONTAINS__ValueAssignment_5_1_0 )
                    {
                     before(grammarAccess.getVERIFY_CONTAINSAccess().getValueAssignment_5_1_0()); 
                    // InternalDomainmodel.g:876:3: ( rule__VERIFY_CONTAINS__ValueAssignment_5_1_0 )
                    // InternalDomainmodel.g:876:4: rule__VERIFY_CONTAINS__ValueAssignment_5_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VERIFY_CONTAINS__ValueAssignment_5_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getVERIFY_CONTAINSAccess().getValueAssignment_5_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDomainmodel.g:880:2: ( ( rule__VERIFY_CONTAINS__VariableAssignment_5_1_1 ) )
                    {
                    // InternalDomainmodel.g:880:2: ( ( rule__VERIFY_CONTAINS__VariableAssignment_5_1_1 ) )
                    // InternalDomainmodel.g:881:3: ( rule__VERIFY_CONTAINS__VariableAssignment_5_1_1 )
                    {
                     before(grammarAccess.getVERIFY_CONTAINSAccess().getVariableAssignment_5_1_1()); 
                    // InternalDomainmodel.g:882:3: ( rule__VERIFY_CONTAINS__VariableAssignment_5_1_1 )
                    // InternalDomainmodel.g:882:4: rule__VERIFY_CONTAINS__VariableAssignment_5_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__VERIFY_CONTAINS__VariableAssignment_5_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getVERIFY_CONTAINSAccess().getVariableAssignment_5_1_1()); 

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
    // $ANTLR end "rule__VERIFY_CONTAINS__Alternatives_5_1"


    // $ANTLR start "rule__VERIFY_EQUALS__Alternatives_4"
    // InternalDomainmodel.g:890:1: rule__VERIFY_EQUALS__Alternatives_4 : ( ( ( rule__VERIFY_EQUALS__ValueAssignment_4_0 ) ) | ( ( rule__VERIFY_EQUALS__RegisteredValueAssignment_4_1 ) ) );
    public final void rule__VERIFY_EQUALS__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:894:1: ( ( ( rule__VERIFY_EQUALS__ValueAssignment_4_0 ) ) | ( ( rule__VERIFY_EQUALS__RegisteredValueAssignment_4_1 ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_STRING) ) {
                alt15=1;
            }
            else if ( (LA15_0==29) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalDomainmodel.g:895:2: ( ( rule__VERIFY_EQUALS__ValueAssignment_4_0 ) )
                    {
                    // InternalDomainmodel.g:895:2: ( ( rule__VERIFY_EQUALS__ValueAssignment_4_0 ) )
                    // InternalDomainmodel.g:896:3: ( rule__VERIFY_EQUALS__ValueAssignment_4_0 )
                    {
                     before(grammarAccess.getVERIFY_EQUALSAccess().getValueAssignment_4_0()); 
                    // InternalDomainmodel.g:897:3: ( rule__VERIFY_EQUALS__ValueAssignment_4_0 )
                    // InternalDomainmodel.g:897:4: rule__VERIFY_EQUALS__ValueAssignment_4_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VERIFY_EQUALS__ValueAssignment_4_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getVERIFY_EQUALSAccess().getValueAssignment_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDomainmodel.g:901:2: ( ( rule__VERIFY_EQUALS__RegisteredValueAssignment_4_1 ) )
                    {
                    // InternalDomainmodel.g:901:2: ( ( rule__VERIFY_EQUALS__RegisteredValueAssignment_4_1 ) )
                    // InternalDomainmodel.g:902:3: ( rule__VERIFY_EQUALS__RegisteredValueAssignment_4_1 )
                    {
                     before(grammarAccess.getVERIFY_EQUALSAccess().getRegisteredValueAssignment_4_1()); 
                    // InternalDomainmodel.g:903:3: ( rule__VERIFY_EQUALS__RegisteredValueAssignment_4_1 )
                    // InternalDomainmodel.g:903:4: rule__VERIFY_EQUALS__RegisteredValueAssignment_4_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__VERIFY_EQUALS__RegisteredValueAssignment_4_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getVERIFY_EQUALSAccess().getRegisteredValueAssignment_4_1()); 

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
    // $ANTLR end "rule__VERIFY_EQUALS__Alternatives_4"


    // $ANTLR start "rule__PROCEDURE__Group__0"
    // InternalDomainmodel.g:911:1: rule__PROCEDURE__Group__0 : rule__PROCEDURE__Group__0__Impl rule__PROCEDURE__Group__1 ;
    public final void rule__PROCEDURE__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:915:1: ( rule__PROCEDURE__Group__0__Impl rule__PROCEDURE__Group__1 )
            // InternalDomainmodel.g:916:2: rule__PROCEDURE__Group__0__Impl rule__PROCEDURE__Group__1
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
    // InternalDomainmodel.g:923:1: rule__PROCEDURE__Group__0__Impl : ( 'procedure' ) ;
    public final void rule__PROCEDURE__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:927:1: ( ( 'procedure' ) )
            // InternalDomainmodel.g:928:1: ( 'procedure' )
            {
            // InternalDomainmodel.g:928:1: ( 'procedure' )
            // InternalDomainmodel.g:929:2: 'procedure'
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
    // InternalDomainmodel.g:938:1: rule__PROCEDURE__Group__1 : rule__PROCEDURE__Group__1__Impl rule__PROCEDURE__Group__2 ;
    public final void rule__PROCEDURE__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:942:1: ( rule__PROCEDURE__Group__1__Impl rule__PROCEDURE__Group__2 )
            // InternalDomainmodel.g:943:2: rule__PROCEDURE__Group__1__Impl rule__PROCEDURE__Group__2
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
    // InternalDomainmodel.g:950:1: rule__PROCEDURE__Group__1__Impl : ( ( rule__PROCEDURE__NameAssignment_1 ) ) ;
    public final void rule__PROCEDURE__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:954:1: ( ( ( rule__PROCEDURE__NameAssignment_1 ) ) )
            // InternalDomainmodel.g:955:1: ( ( rule__PROCEDURE__NameAssignment_1 ) )
            {
            // InternalDomainmodel.g:955:1: ( ( rule__PROCEDURE__NameAssignment_1 ) )
            // InternalDomainmodel.g:956:2: ( rule__PROCEDURE__NameAssignment_1 )
            {
             before(grammarAccess.getPROCEDUREAccess().getNameAssignment_1()); 
            // InternalDomainmodel.g:957:2: ( rule__PROCEDURE__NameAssignment_1 )
            // InternalDomainmodel.g:957:3: rule__PROCEDURE__NameAssignment_1
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
    // InternalDomainmodel.g:965:1: rule__PROCEDURE__Group__2 : rule__PROCEDURE__Group__2__Impl rule__PROCEDURE__Group__3 ;
    public final void rule__PROCEDURE__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:969:1: ( rule__PROCEDURE__Group__2__Impl rule__PROCEDURE__Group__3 )
            // InternalDomainmodel.g:970:2: rule__PROCEDURE__Group__2__Impl rule__PROCEDURE__Group__3
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
    // InternalDomainmodel.g:977:1: rule__PROCEDURE__Group__2__Impl : ( ( rule__PROCEDURE__Group_2__0 )? ) ;
    public final void rule__PROCEDURE__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:981:1: ( ( ( rule__PROCEDURE__Group_2__0 )? ) )
            // InternalDomainmodel.g:982:1: ( ( rule__PROCEDURE__Group_2__0 )? )
            {
            // InternalDomainmodel.g:982:1: ( ( rule__PROCEDURE__Group_2__0 )? )
            // InternalDomainmodel.g:983:2: ( rule__PROCEDURE__Group_2__0 )?
            {
             before(grammarAccess.getPROCEDUREAccess().getGroup_2()); 
            // InternalDomainmodel.g:984:2: ( rule__PROCEDURE__Group_2__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==26) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalDomainmodel.g:984:3: rule__PROCEDURE__Group_2__0
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
    // InternalDomainmodel.g:992:1: rule__PROCEDURE__Group__3 : rule__PROCEDURE__Group__3__Impl ;
    public final void rule__PROCEDURE__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:996:1: ( rule__PROCEDURE__Group__3__Impl )
            // InternalDomainmodel.g:997:2: rule__PROCEDURE__Group__3__Impl
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
    // InternalDomainmodel.g:1003:1: rule__PROCEDURE__Group__3__Impl : ( ( rule__PROCEDURE__InstAssignment_3 )* ) ;
    public final void rule__PROCEDURE__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1007:1: ( ( ( rule__PROCEDURE__InstAssignment_3 )* ) )
            // InternalDomainmodel.g:1008:1: ( ( rule__PROCEDURE__InstAssignment_3 )* )
            {
            // InternalDomainmodel.g:1008:1: ( ( rule__PROCEDURE__InstAssignment_3 )* )
            // InternalDomainmodel.g:1009:2: ( rule__PROCEDURE__InstAssignment_3 )*
            {
             before(grammarAccess.getPROCEDUREAccess().getInstAssignment_3()); 
            // InternalDomainmodel.g:1010:2: ( rule__PROCEDURE__InstAssignment_3 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==36||(LA17_0>=43 && LA17_0<=47)||(LA17_0>=49 && LA17_0<=51)||(LA17_0>=53 && LA17_0<=54)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalDomainmodel.g:1010:3: rule__PROCEDURE__InstAssignment_3
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
    // InternalDomainmodel.g:1019:1: rule__PROCEDURE__Group_2__0 : rule__PROCEDURE__Group_2__0__Impl rule__PROCEDURE__Group_2__1 ;
    public final void rule__PROCEDURE__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1023:1: ( rule__PROCEDURE__Group_2__0__Impl rule__PROCEDURE__Group_2__1 )
            // InternalDomainmodel.g:1024:2: rule__PROCEDURE__Group_2__0__Impl rule__PROCEDURE__Group_2__1
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
    // InternalDomainmodel.g:1031:1: rule__PROCEDURE__Group_2__0__Impl : ( 'with' ) ;
    public final void rule__PROCEDURE__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1035:1: ( ( 'with' ) )
            // InternalDomainmodel.g:1036:1: ( 'with' )
            {
            // InternalDomainmodel.g:1036:1: ( 'with' )
            // InternalDomainmodel.g:1037:2: 'with'
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
    // InternalDomainmodel.g:1046:1: rule__PROCEDURE__Group_2__1 : rule__PROCEDURE__Group_2__1__Impl rule__PROCEDURE__Group_2__2 ;
    public final void rule__PROCEDURE__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1050:1: ( rule__PROCEDURE__Group_2__1__Impl rule__PROCEDURE__Group_2__2 )
            // InternalDomainmodel.g:1051:2: rule__PROCEDURE__Group_2__1__Impl rule__PROCEDURE__Group_2__2
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
    // InternalDomainmodel.g:1058:1: rule__PROCEDURE__Group_2__1__Impl : ( ( rule__PROCEDURE__ParamAssignment_2_1 ) ) ;
    public final void rule__PROCEDURE__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1062:1: ( ( ( rule__PROCEDURE__ParamAssignment_2_1 ) ) )
            // InternalDomainmodel.g:1063:1: ( ( rule__PROCEDURE__ParamAssignment_2_1 ) )
            {
            // InternalDomainmodel.g:1063:1: ( ( rule__PROCEDURE__ParamAssignment_2_1 ) )
            // InternalDomainmodel.g:1064:2: ( rule__PROCEDURE__ParamAssignment_2_1 )
            {
             before(grammarAccess.getPROCEDUREAccess().getParamAssignment_2_1()); 
            // InternalDomainmodel.g:1065:2: ( rule__PROCEDURE__ParamAssignment_2_1 )
            // InternalDomainmodel.g:1065:3: rule__PROCEDURE__ParamAssignment_2_1
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
    // InternalDomainmodel.g:1073:1: rule__PROCEDURE__Group_2__2 : rule__PROCEDURE__Group_2__2__Impl ;
    public final void rule__PROCEDURE__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1077:1: ( rule__PROCEDURE__Group_2__2__Impl )
            // InternalDomainmodel.g:1078:2: rule__PROCEDURE__Group_2__2__Impl
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
    // InternalDomainmodel.g:1084:1: rule__PROCEDURE__Group_2__2__Impl : ( ( rule__PROCEDURE__ParamsAssignment_2_2 )* ) ;
    public final void rule__PROCEDURE__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1088:1: ( ( ( rule__PROCEDURE__ParamsAssignment_2_2 )* ) )
            // InternalDomainmodel.g:1089:1: ( ( rule__PROCEDURE__ParamsAssignment_2_2 )* )
            {
            // InternalDomainmodel.g:1089:1: ( ( rule__PROCEDURE__ParamsAssignment_2_2 )* )
            // InternalDomainmodel.g:1090:2: ( rule__PROCEDURE__ParamsAssignment_2_2 )*
            {
             before(grammarAccess.getPROCEDUREAccess().getParamsAssignment_2_2()); 
            // InternalDomainmodel.g:1091:2: ( rule__PROCEDURE__ParamsAssignment_2_2 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_VARTYPE) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalDomainmodel.g:1091:3: rule__PROCEDURE__ParamsAssignment_2_2
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
    // InternalDomainmodel.g:1100:1: rule__OPEN__Group__0 : rule__OPEN__Group__0__Impl rule__OPEN__Group__1 ;
    public final void rule__OPEN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1104:1: ( rule__OPEN__Group__0__Impl rule__OPEN__Group__1 )
            // InternalDomainmodel.g:1105:2: rule__OPEN__Group__0__Impl rule__OPEN__Group__1
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
    // InternalDomainmodel.g:1112:1: rule__OPEN__Group__0__Impl : ( ( rule__OPEN__NameAssignment_0 ) ) ;
    public final void rule__OPEN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1116:1: ( ( ( rule__OPEN__NameAssignment_0 ) ) )
            // InternalDomainmodel.g:1117:1: ( ( rule__OPEN__NameAssignment_0 ) )
            {
            // InternalDomainmodel.g:1117:1: ( ( rule__OPEN__NameAssignment_0 ) )
            // InternalDomainmodel.g:1118:2: ( rule__OPEN__NameAssignment_0 )
            {
             before(grammarAccess.getOPENAccess().getNameAssignment_0()); 
            // InternalDomainmodel.g:1119:2: ( rule__OPEN__NameAssignment_0 )
            // InternalDomainmodel.g:1119:3: rule__OPEN__NameAssignment_0
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
    // InternalDomainmodel.g:1127:1: rule__OPEN__Group__1 : rule__OPEN__Group__1__Impl ;
    public final void rule__OPEN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1131:1: ( rule__OPEN__Group__1__Impl )
            // InternalDomainmodel.g:1132:2: rule__OPEN__Group__1__Impl
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
    // InternalDomainmodel.g:1138:1: rule__OPEN__Group__1__Impl : ( ( rule__OPEN__ValueAssignment_1 ) ) ;
    public final void rule__OPEN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1142:1: ( ( ( rule__OPEN__ValueAssignment_1 ) ) )
            // InternalDomainmodel.g:1143:1: ( ( rule__OPEN__ValueAssignment_1 ) )
            {
            // InternalDomainmodel.g:1143:1: ( ( rule__OPEN__ValueAssignment_1 ) )
            // InternalDomainmodel.g:1144:2: ( rule__OPEN__ValueAssignment_1 )
            {
             before(grammarAccess.getOPENAccess().getValueAssignment_1()); 
            // InternalDomainmodel.g:1145:2: ( rule__OPEN__ValueAssignment_1 )
            // InternalDomainmodel.g:1145:3: rule__OPEN__ValueAssignment_1
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
    // InternalDomainmodel.g:1154:1: rule__GOTO__Group__0 : rule__GOTO__Group__0__Impl rule__GOTO__Group__1 ;
    public final void rule__GOTO__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1158:1: ( rule__GOTO__Group__0__Impl rule__GOTO__Group__1 )
            // InternalDomainmodel.g:1159:2: rule__GOTO__Group__0__Impl rule__GOTO__Group__1
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
    // InternalDomainmodel.g:1166:1: rule__GOTO__Group__0__Impl : ( ( rule__GOTO__NameAssignment_0 ) ) ;
    public final void rule__GOTO__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1170:1: ( ( ( rule__GOTO__NameAssignment_0 ) ) )
            // InternalDomainmodel.g:1171:1: ( ( rule__GOTO__NameAssignment_0 ) )
            {
            // InternalDomainmodel.g:1171:1: ( ( rule__GOTO__NameAssignment_0 ) )
            // InternalDomainmodel.g:1172:2: ( rule__GOTO__NameAssignment_0 )
            {
             before(grammarAccess.getGOTOAccess().getNameAssignment_0()); 
            // InternalDomainmodel.g:1173:2: ( rule__GOTO__NameAssignment_0 )
            // InternalDomainmodel.g:1173:3: rule__GOTO__NameAssignment_0
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
    // InternalDomainmodel.g:1181:1: rule__GOTO__Group__1 : rule__GOTO__Group__1__Impl rule__GOTO__Group__2 ;
    public final void rule__GOTO__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1185:1: ( rule__GOTO__Group__1__Impl rule__GOTO__Group__2 )
            // InternalDomainmodel.g:1186:2: rule__GOTO__Group__1__Impl rule__GOTO__Group__2
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
    // InternalDomainmodel.g:1193:1: rule__GOTO__Group__1__Impl : ( ( 'given' )? ) ;
    public final void rule__GOTO__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1197:1: ( ( ( 'given' )? ) )
            // InternalDomainmodel.g:1198:1: ( ( 'given' )? )
            {
            // InternalDomainmodel.g:1198:1: ( ( 'given' )? )
            // InternalDomainmodel.g:1199:2: ( 'given' )?
            {
             before(grammarAccess.getGOTOAccess().getGivenKeyword_1()); 
            // InternalDomainmodel.g:1200:2: ( 'given' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==27) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalDomainmodel.g:1200:3: 'given'
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
    // InternalDomainmodel.g:1208:1: rule__GOTO__Group__2 : rule__GOTO__Group__2__Impl ;
    public final void rule__GOTO__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1212:1: ( rule__GOTO__Group__2__Impl )
            // InternalDomainmodel.g:1213:2: rule__GOTO__Group__2__Impl
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
    // InternalDomainmodel.g:1219:1: rule__GOTO__Group__2__Impl : ( ( rule__GOTO__ValueAssignment_2 ) ) ;
    public final void rule__GOTO__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1223:1: ( ( ( rule__GOTO__ValueAssignment_2 ) ) )
            // InternalDomainmodel.g:1224:1: ( ( rule__GOTO__ValueAssignment_2 ) )
            {
            // InternalDomainmodel.g:1224:1: ( ( rule__GOTO__ValueAssignment_2 ) )
            // InternalDomainmodel.g:1225:2: ( rule__GOTO__ValueAssignment_2 )
            {
             before(grammarAccess.getGOTOAccess().getValueAssignment_2()); 
            // InternalDomainmodel.g:1226:2: ( rule__GOTO__ValueAssignment_2 )
            // InternalDomainmodel.g:1226:3: rule__GOTO__ValueAssignment_2
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
    // InternalDomainmodel.g:1235:1: rule__CLICK__Group__0 : rule__CLICK__Group__0__Impl rule__CLICK__Group__1 ;
    public final void rule__CLICK__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1239:1: ( rule__CLICK__Group__0__Impl rule__CLICK__Group__1 )
            // InternalDomainmodel.g:1240:2: rule__CLICK__Group__0__Impl rule__CLICK__Group__1
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
    // InternalDomainmodel.g:1247:1: rule__CLICK__Group__0__Impl : ( ( rule__CLICK__NameAssignment_0 ) ) ;
    public final void rule__CLICK__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1251:1: ( ( ( rule__CLICK__NameAssignment_0 ) ) )
            // InternalDomainmodel.g:1252:1: ( ( rule__CLICK__NameAssignment_0 ) )
            {
            // InternalDomainmodel.g:1252:1: ( ( rule__CLICK__NameAssignment_0 ) )
            // InternalDomainmodel.g:1253:2: ( rule__CLICK__NameAssignment_0 )
            {
             before(grammarAccess.getCLICKAccess().getNameAssignment_0()); 
            // InternalDomainmodel.g:1254:2: ( rule__CLICK__NameAssignment_0 )
            // InternalDomainmodel.g:1254:3: rule__CLICK__NameAssignment_0
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
    // InternalDomainmodel.g:1262:1: rule__CLICK__Group__1 : rule__CLICK__Group__1__Impl rule__CLICK__Group__2 ;
    public final void rule__CLICK__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1266:1: ( rule__CLICK__Group__1__Impl rule__CLICK__Group__2 )
            // InternalDomainmodel.g:1267:2: rule__CLICK__Group__1__Impl rule__CLICK__Group__2
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
    // InternalDomainmodel.g:1274:1: rule__CLICK__Group__1__Impl : ( 'on' ) ;
    public final void rule__CLICK__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1278:1: ( ( 'on' ) )
            // InternalDomainmodel.g:1279:1: ( 'on' )
            {
            // InternalDomainmodel.g:1279:1: ( 'on' )
            // InternalDomainmodel.g:1280:2: 'on'
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
    // InternalDomainmodel.g:1289:1: rule__CLICK__Group__2 : rule__CLICK__Group__2__Impl rule__CLICK__Group__3 ;
    public final void rule__CLICK__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1293:1: ( rule__CLICK__Group__2__Impl rule__CLICK__Group__3 )
            // InternalDomainmodel.g:1294:2: rule__CLICK__Group__2__Impl rule__CLICK__Group__3
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
    // InternalDomainmodel.g:1301:1: rule__CLICK__Group__2__Impl : ( ( rule__CLICK__TypeAssignment_2 ) ) ;
    public final void rule__CLICK__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1305:1: ( ( ( rule__CLICK__TypeAssignment_2 ) ) )
            // InternalDomainmodel.g:1306:1: ( ( rule__CLICK__TypeAssignment_2 ) )
            {
            // InternalDomainmodel.g:1306:1: ( ( rule__CLICK__TypeAssignment_2 ) )
            // InternalDomainmodel.g:1307:2: ( rule__CLICK__TypeAssignment_2 )
            {
             before(grammarAccess.getCLICKAccess().getTypeAssignment_2()); 
            // InternalDomainmodel.g:1308:2: ( rule__CLICK__TypeAssignment_2 )
            // InternalDomainmodel.g:1308:3: rule__CLICK__TypeAssignment_2
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
    // InternalDomainmodel.g:1316:1: rule__CLICK__Group__3 : rule__CLICK__Group__3__Impl ;
    public final void rule__CLICK__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1320:1: ( rule__CLICK__Group__3__Impl )
            // InternalDomainmodel.g:1321:2: rule__CLICK__Group__3__Impl
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
    // InternalDomainmodel.g:1327:1: rule__CLICK__Group__3__Impl : ( ( rule__CLICK__IdentifierAssignment_3 ) ) ;
    public final void rule__CLICK__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1331:1: ( ( ( rule__CLICK__IdentifierAssignment_3 ) ) )
            // InternalDomainmodel.g:1332:1: ( ( rule__CLICK__IdentifierAssignment_3 ) )
            {
            // InternalDomainmodel.g:1332:1: ( ( rule__CLICK__IdentifierAssignment_3 ) )
            // InternalDomainmodel.g:1333:2: ( rule__CLICK__IdentifierAssignment_3 )
            {
             before(grammarAccess.getCLICKAccess().getIdentifierAssignment_3()); 
            // InternalDomainmodel.g:1334:2: ( rule__CLICK__IdentifierAssignment_3 )
            // InternalDomainmodel.g:1334:3: rule__CLICK__IdentifierAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__CLICK__IdentifierAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCLICKAccess().getIdentifierAssignment_3()); 

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
    // InternalDomainmodel.g:1343:1: rule__FILL__Group__0 : rule__FILL__Group__0__Impl rule__FILL__Group__1 ;
    public final void rule__FILL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1347:1: ( rule__FILL__Group__0__Impl rule__FILL__Group__1 )
            // InternalDomainmodel.g:1348:2: rule__FILL__Group__0__Impl rule__FILL__Group__1
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
    // InternalDomainmodel.g:1355:1: rule__FILL__Group__0__Impl : ( ( rule__FILL__NameAssignment_0 ) ) ;
    public final void rule__FILL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1359:1: ( ( ( rule__FILL__NameAssignment_0 ) ) )
            // InternalDomainmodel.g:1360:1: ( ( rule__FILL__NameAssignment_0 ) )
            {
            // InternalDomainmodel.g:1360:1: ( ( rule__FILL__NameAssignment_0 ) )
            // InternalDomainmodel.g:1361:2: ( rule__FILL__NameAssignment_0 )
            {
             before(grammarAccess.getFILLAccess().getNameAssignment_0()); 
            // InternalDomainmodel.g:1362:2: ( rule__FILL__NameAssignment_0 )
            // InternalDomainmodel.g:1362:3: rule__FILL__NameAssignment_0
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
    // InternalDomainmodel.g:1370:1: rule__FILL__Group__1 : rule__FILL__Group__1__Impl rule__FILL__Group__2 ;
    public final void rule__FILL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1374:1: ( rule__FILL__Group__1__Impl rule__FILL__Group__2 )
            // InternalDomainmodel.g:1375:2: rule__FILL__Group__1__Impl rule__FILL__Group__2
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
    // InternalDomainmodel.g:1382:1: rule__FILL__Group__1__Impl : ( ( rule__FILL__FieldTypeAssignment_1 ) ) ;
    public final void rule__FILL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1386:1: ( ( ( rule__FILL__FieldTypeAssignment_1 ) ) )
            // InternalDomainmodel.g:1387:1: ( ( rule__FILL__FieldTypeAssignment_1 ) )
            {
            // InternalDomainmodel.g:1387:1: ( ( rule__FILL__FieldTypeAssignment_1 ) )
            // InternalDomainmodel.g:1388:2: ( rule__FILL__FieldTypeAssignment_1 )
            {
             before(grammarAccess.getFILLAccess().getFieldTypeAssignment_1()); 
            // InternalDomainmodel.g:1389:2: ( rule__FILL__FieldTypeAssignment_1 )
            // InternalDomainmodel.g:1389:3: rule__FILL__FieldTypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__FILL__FieldTypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFILLAccess().getFieldTypeAssignment_1()); 

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
    // InternalDomainmodel.g:1397:1: rule__FILL__Group__2 : rule__FILL__Group__2__Impl rule__FILL__Group__3 ;
    public final void rule__FILL__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1401:1: ( rule__FILL__Group__2__Impl rule__FILL__Group__3 )
            // InternalDomainmodel.g:1402:2: rule__FILL__Group__2__Impl rule__FILL__Group__3
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
    // InternalDomainmodel.g:1409:1: rule__FILL__Group__2__Impl : ( ( rule__FILL__IdentifierAssignment_2 )? ) ;
    public final void rule__FILL__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1413:1: ( ( ( rule__FILL__IdentifierAssignment_2 )? ) )
            // InternalDomainmodel.g:1414:1: ( ( rule__FILL__IdentifierAssignment_2 )? )
            {
            // InternalDomainmodel.g:1414:1: ( ( rule__FILL__IdentifierAssignment_2 )? )
            // InternalDomainmodel.g:1415:2: ( rule__FILL__IdentifierAssignment_2 )?
            {
             before(grammarAccess.getFILLAccess().getIdentifierAssignment_2()); 
            // InternalDomainmodel.g:1416:2: ( rule__FILL__IdentifierAssignment_2 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==52) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalDomainmodel.g:1416:3: rule__FILL__IdentifierAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__FILL__IdentifierAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFILLAccess().getIdentifierAssignment_2()); 

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
    // InternalDomainmodel.g:1424:1: rule__FILL__Group__3 : rule__FILL__Group__3__Impl rule__FILL__Group__4 ;
    public final void rule__FILL__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1428:1: ( rule__FILL__Group__3__Impl rule__FILL__Group__4 )
            // InternalDomainmodel.g:1429:2: rule__FILL__Group__3__Impl rule__FILL__Group__4
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
    // InternalDomainmodel.g:1436:1: rule__FILL__Group__3__Impl : ( 'with' ) ;
    public final void rule__FILL__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1440:1: ( ( 'with' ) )
            // InternalDomainmodel.g:1441:1: ( 'with' )
            {
            // InternalDomainmodel.g:1441:1: ( 'with' )
            // InternalDomainmodel.g:1442:2: 'with'
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
    // InternalDomainmodel.g:1451:1: rule__FILL__Group__4 : rule__FILL__Group__4__Impl ;
    public final void rule__FILL__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1455:1: ( rule__FILL__Group__4__Impl )
            // InternalDomainmodel.g:1456:2: rule__FILL__Group__4__Impl
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
    // InternalDomainmodel.g:1462:1: rule__FILL__Group__4__Impl : ( ( rule__FILL__Alternatives_4 ) ) ;
    public final void rule__FILL__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1466:1: ( ( ( rule__FILL__Alternatives_4 ) ) )
            // InternalDomainmodel.g:1467:1: ( ( rule__FILL__Alternatives_4 ) )
            {
            // InternalDomainmodel.g:1467:1: ( ( rule__FILL__Alternatives_4 ) )
            // InternalDomainmodel.g:1468:2: ( rule__FILL__Alternatives_4 )
            {
             before(grammarAccess.getFILLAccess().getAlternatives_4()); 
            // InternalDomainmodel.g:1469:2: ( rule__FILL__Alternatives_4 )
            // InternalDomainmodel.g:1469:3: rule__FILL__Alternatives_4
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
    // InternalDomainmodel.g:1478:1: rule__FILL__Group_4_0__0 : rule__FILL__Group_4_0__0__Impl rule__FILL__Group_4_0__1 ;
    public final void rule__FILL__Group_4_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1482:1: ( rule__FILL__Group_4_0__0__Impl rule__FILL__Group_4_0__1 )
            // InternalDomainmodel.g:1483:2: rule__FILL__Group_4_0__0__Impl rule__FILL__Group_4_0__1
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
    // InternalDomainmodel.g:1490:1: rule__FILL__Group_4_0__0__Impl : ( 'saved' ) ;
    public final void rule__FILL__Group_4_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1494:1: ( ( 'saved' ) )
            // InternalDomainmodel.g:1495:1: ( 'saved' )
            {
            // InternalDomainmodel.g:1495:1: ( 'saved' )
            // InternalDomainmodel.g:1496:2: 'saved'
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
    // InternalDomainmodel.g:1505:1: rule__FILL__Group_4_0__1 : rule__FILL__Group_4_0__1__Impl ;
    public final void rule__FILL__Group_4_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1509:1: ( rule__FILL__Group_4_0__1__Impl )
            // InternalDomainmodel.g:1510:2: rule__FILL__Group_4_0__1__Impl
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
    // InternalDomainmodel.g:1516:1: rule__FILL__Group_4_0__1__Impl : ( ( rule__FILL__VarAssignment_4_0_1 ) ) ;
    public final void rule__FILL__Group_4_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1520:1: ( ( ( rule__FILL__VarAssignment_4_0_1 ) ) )
            // InternalDomainmodel.g:1521:1: ( ( rule__FILL__VarAssignment_4_0_1 ) )
            {
            // InternalDomainmodel.g:1521:1: ( ( rule__FILL__VarAssignment_4_0_1 ) )
            // InternalDomainmodel.g:1522:2: ( rule__FILL__VarAssignment_4_0_1 )
            {
             before(grammarAccess.getFILLAccess().getVarAssignment_4_0_1()); 
            // InternalDomainmodel.g:1523:2: ( rule__FILL__VarAssignment_4_0_1 )
            // InternalDomainmodel.g:1523:3: rule__FILL__VarAssignment_4_0_1
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
    // InternalDomainmodel.g:1532:1: rule__CHECK__Group__0 : rule__CHECK__Group__0__Impl rule__CHECK__Group__1 ;
    public final void rule__CHECK__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1536:1: ( rule__CHECK__Group__0__Impl rule__CHECK__Group__1 )
            // InternalDomainmodel.g:1537:2: rule__CHECK__Group__0__Impl rule__CHECK__Group__1
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
    // InternalDomainmodel.g:1544:1: rule__CHECK__Group__0__Impl : ( ( rule__CHECK__NameAssignment_0 ) ) ;
    public final void rule__CHECK__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1548:1: ( ( ( rule__CHECK__NameAssignment_0 ) ) )
            // InternalDomainmodel.g:1549:1: ( ( rule__CHECK__NameAssignment_0 ) )
            {
            // InternalDomainmodel.g:1549:1: ( ( rule__CHECK__NameAssignment_0 ) )
            // InternalDomainmodel.g:1550:2: ( rule__CHECK__NameAssignment_0 )
            {
             before(grammarAccess.getCHECKAccess().getNameAssignment_0()); 
            // InternalDomainmodel.g:1551:2: ( rule__CHECK__NameAssignment_0 )
            // InternalDomainmodel.g:1551:3: rule__CHECK__NameAssignment_0
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
    // InternalDomainmodel.g:1559:1: rule__CHECK__Group__1 : rule__CHECK__Group__1__Impl rule__CHECK__Group__2 ;
    public final void rule__CHECK__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1563:1: ( rule__CHECK__Group__1__Impl rule__CHECK__Group__2 )
            // InternalDomainmodel.g:1564:2: rule__CHECK__Group__1__Impl rule__CHECK__Group__2
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
    // InternalDomainmodel.g:1571:1: rule__CHECK__Group__1__Impl : ( ( rule__CHECK__AllAssignment_1 )? ) ;
    public final void rule__CHECK__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1575:1: ( ( ( rule__CHECK__AllAssignment_1 )? ) )
            // InternalDomainmodel.g:1576:1: ( ( rule__CHECK__AllAssignment_1 )? )
            {
            // InternalDomainmodel.g:1576:1: ( ( rule__CHECK__AllAssignment_1 )? )
            // InternalDomainmodel.g:1577:2: ( rule__CHECK__AllAssignment_1 )?
            {
             before(grammarAccess.getCHECKAccess().getAllAssignment_1()); 
            // InternalDomainmodel.g:1578:2: ( rule__CHECK__AllAssignment_1 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==48) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalDomainmodel.g:1578:3: rule__CHECK__AllAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__CHECK__AllAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCHECKAccess().getAllAssignment_1()); 

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
    // InternalDomainmodel.g:1586:1: rule__CHECK__Group__2 : rule__CHECK__Group__2__Impl rule__CHECK__Group__3 ;
    public final void rule__CHECK__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1590:1: ( rule__CHECK__Group__2__Impl rule__CHECK__Group__3 )
            // InternalDomainmodel.g:1591:2: rule__CHECK__Group__2__Impl rule__CHECK__Group__3
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
    // InternalDomainmodel.g:1598:1: rule__CHECK__Group__2__Impl : ( 'CHECKBOX' ) ;
    public final void rule__CHECK__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1602:1: ( ( 'CHECKBOX' ) )
            // InternalDomainmodel.g:1603:1: ( 'CHECKBOX' )
            {
            // InternalDomainmodel.g:1603:1: ( 'CHECKBOX' )
            // InternalDomainmodel.g:1604:2: 'CHECKBOX'
            {
             before(grammarAccess.getCHECKAccess().getCHECKBOXKeyword_2()); 
            match(input,30,FOLLOW_2); 
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
    // InternalDomainmodel.g:1613:1: rule__CHECK__Group__3 : rule__CHECK__Group__3__Impl ;
    public final void rule__CHECK__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1617:1: ( rule__CHECK__Group__3__Impl )
            // InternalDomainmodel.g:1618:2: rule__CHECK__Group__3__Impl
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
    // InternalDomainmodel.g:1624:1: rule__CHECK__Group__3__Impl : ( ( rule__CHECK__IdentifierAssignment_3 ) ) ;
    public final void rule__CHECK__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1628:1: ( ( ( rule__CHECK__IdentifierAssignment_3 ) ) )
            // InternalDomainmodel.g:1629:1: ( ( rule__CHECK__IdentifierAssignment_3 ) )
            {
            // InternalDomainmodel.g:1629:1: ( ( rule__CHECK__IdentifierAssignment_3 ) )
            // InternalDomainmodel.g:1630:2: ( rule__CHECK__IdentifierAssignment_3 )
            {
             before(grammarAccess.getCHECKAccess().getIdentifierAssignment_3()); 
            // InternalDomainmodel.g:1631:2: ( rule__CHECK__IdentifierAssignment_3 )
            // InternalDomainmodel.g:1631:3: rule__CHECK__IdentifierAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__CHECK__IdentifierAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCHECKAccess().getIdentifierAssignment_3()); 

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
    // InternalDomainmodel.g:1640:1: rule__UNCHECK__Group__0 : rule__UNCHECK__Group__0__Impl rule__UNCHECK__Group__1 ;
    public final void rule__UNCHECK__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1644:1: ( rule__UNCHECK__Group__0__Impl rule__UNCHECK__Group__1 )
            // InternalDomainmodel.g:1645:2: rule__UNCHECK__Group__0__Impl rule__UNCHECK__Group__1
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
    // InternalDomainmodel.g:1652:1: rule__UNCHECK__Group__0__Impl : ( ( rule__UNCHECK__NameAssignment_0 ) ) ;
    public final void rule__UNCHECK__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1656:1: ( ( ( rule__UNCHECK__NameAssignment_0 ) ) )
            // InternalDomainmodel.g:1657:1: ( ( rule__UNCHECK__NameAssignment_0 ) )
            {
            // InternalDomainmodel.g:1657:1: ( ( rule__UNCHECK__NameAssignment_0 ) )
            // InternalDomainmodel.g:1658:2: ( rule__UNCHECK__NameAssignment_0 )
            {
             before(grammarAccess.getUNCHECKAccess().getNameAssignment_0()); 
            // InternalDomainmodel.g:1659:2: ( rule__UNCHECK__NameAssignment_0 )
            // InternalDomainmodel.g:1659:3: rule__UNCHECK__NameAssignment_0
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
    // InternalDomainmodel.g:1667:1: rule__UNCHECK__Group__1 : rule__UNCHECK__Group__1__Impl rule__UNCHECK__Group__2 ;
    public final void rule__UNCHECK__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1671:1: ( rule__UNCHECK__Group__1__Impl rule__UNCHECK__Group__2 )
            // InternalDomainmodel.g:1672:2: rule__UNCHECK__Group__1__Impl rule__UNCHECK__Group__2
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
    // InternalDomainmodel.g:1679:1: rule__UNCHECK__Group__1__Impl : ( ( rule__UNCHECK__AllAssignment_1 )? ) ;
    public final void rule__UNCHECK__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1683:1: ( ( ( rule__UNCHECK__AllAssignment_1 )? ) )
            // InternalDomainmodel.g:1684:1: ( ( rule__UNCHECK__AllAssignment_1 )? )
            {
            // InternalDomainmodel.g:1684:1: ( ( rule__UNCHECK__AllAssignment_1 )? )
            // InternalDomainmodel.g:1685:2: ( rule__UNCHECK__AllAssignment_1 )?
            {
             before(grammarAccess.getUNCHECKAccess().getAllAssignment_1()); 
            // InternalDomainmodel.g:1686:2: ( rule__UNCHECK__AllAssignment_1 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==48) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalDomainmodel.g:1686:3: rule__UNCHECK__AllAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__UNCHECK__AllAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUNCHECKAccess().getAllAssignment_1()); 

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
    // InternalDomainmodel.g:1694:1: rule__UNCHECK__Group__2 : rule__UNCHECK__Group__2__Impl rule__UNCHECK__Group__3 ;
    public final void rule__UNCHECK__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1698:1: ( rule__UNCHECK__Group__2__Impl rule__UNCHECK__Group__3 )
            // InternalDomainmodel.g:1699:2: rule__UNCHECK__Group__2__Impl rule__UNCHECK__Group__3
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
    // InternalDomainmodel.g:1706:1: rule__UNCHECK__Group__2__Impl : ( 'CHECKBOX' ) ;
    public final void rule__UNCHECK__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1710:1: ( ( 'CHECKBOX' ) )
            // InternalDomainmodel.g:1711:1: ( 'CHECKBOX' )
            {
            // InternalDomainmodel.g:1711:1: ( 'CHECKBOX' )
            // InternalDomainmodel.g:1712:2: 'CHECKBOX'
            {
             before(grammarAccess.getUNCHECKAccess().getCHECKBOXKeyword_2()); 
            match(input,30,FOLLOW_2); 
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
    // InternalDomainmodel.g:1721:1: rule__UNCHECK__Group__3 : rule__UNCHECK__Group__3__Impl ;
    public final void rule__UNCHECK__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1725:1: ( rule__UNCHECK__Group__3__Impl )
            // InternalDomainmodel.g:1726:2: rule__UNCHECK__Group__3__Impl
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
    // InternalDomainmodel.g:1732:1: rule__UNCHECK__Group__3__Impl : ( ( rule__UNCHECK__IdentifierAssignment_3 ) ) ;
    public final void rule__UNCHECK__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1736:1: ( ( ( rule__UNCHECK__IdentifierAssignment_3 ) ) )
            // InternalDomainmodel.g:1737:1: ( ( rule__UNCHECK__IdentifierAssignment_3 ) )
            {
            // InternalDomainmodel.g:1737:1: ( ( rule__UNCHECK__IdentifierAssignment_3 ) )
            // InternalDomainmodel.g:1738:2: ( rule__UNCHECK__IdentifierAssignment_3 )
            {
             before(grammarAccess.getUNCHECKAccess().getIdentifierAssignment_3()); 
            // InternalDomainmodel.g:1739:2: ( rule__UNCHECK__IdentifierAssignment_3 )
            // InternalDomainmodel.g:1739:3: rule__UNCHECK__IdentifierAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__UNCHECK__IdentifierAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getUNCHECKAccess().getIdentifierAssignment_3()); 

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
    // InternalDomainmodel.g:1748:1: rule__SELECT__Group__0 : rule__SELECT__Group__0__Impl rule__SELECT__Group__1 ;
    public final void rule__SELECT__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1752:1: ( rule__SELECT__Group__0__Impl rule__SELECT__Group__1 )
            // InternalDomainmodel.g:1753:2: rule__SELECT__Group__0__Impl rule__SELECT__Group__1
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
    // InternalDomainmodel.g:1760:1: rule__SELECT__Group__0__Impl : ( ( rule__SELECT__NameAssignment_0 ) ) ;
    public final void rule__SELECT__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1764:1: ( ( ( rule__SELECT__NameAssignment_0 ) ) )
            // InternalDomainmodel.g:1765:1: ( ( rule__SELECT__NameAssignment_0 ) )
            {
            // InternalDomainmodel.g:1765:1: ( ( rule__SELECT__NameAssignment_0 ) )
            // InternalDomainmodel.g:1766:2: ( rule__SELECT__NameAssignment_0 )
            {
             before(grammarAccess.getSELECTAccess().getNameAssignment_0()); 
            // InternalDomainmodel.g:1767:2: ( rule__SELECT__NameAssignment_0 )
            // InternalDomainmodel.g:1767:3: rule__SELECT__NameAssignment_0
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
    // InternalDomainmodel.g:1775:1: rule__SELECT__Group__1 : rule__SELECT__Group__1__Impl rule__SELECT__Group__2 ;
    public final void rule__SELECT__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1779:1: ( rule__SELECT__Group__1__Impl rule__SELECT__Group__2 )
            // InternalDomainmodel.g:1780:2: rule__SELECT__Group__1__Impl rule__SELECT__Group__2
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
    // InternalDomainmodel.g:1787:1: rule__SELECT__Group__1__Impl : ( ( rule__SELECT__ElemAssignment_1 ) ) ;
    public final void rule__SELECT__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1791:1: ( ( ( rule__SELECT__ElemAssignment_1 ) ) )
            // InternalDomainmodel.g:1792:1: ( ( rule__SELECT__ElemAssignment_1 ) )
            {
            // InternalDomainmodel.g:1792:1: ( ( rule__SELECT__ElemAssignment_1 ) )
            // InternalDomainmodel.g:1793:2: ( rule__SELECT__ElemAssignment_1 )
            {
             before(grammarAccess.getSELECTAccess().getElemAssignment_1()); 
            // InternalDomainmodel.g:1794:2: ( rule__SELECT__ElemAssignment_1 )
            // InternalDomainmodel.g:1794:3: rule__SELECT__ElemAssignment_1
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
    // InternalDomainmodel.g:1802:1: rule__SELECT__Group__2 : rule__SELECT__Group__2__Impl rule__SELECT__Group__3 ;
    public final void rule__SELECT__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1806:1: ( rule__SELECT__Group__2__Impl rule__SELECT__Group__3 )
            // InternalDomainmodel.g:1807:2: rule__SELECT__Group__2__Impl rule__SELECT__Group__3
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
    // InternalDomainmodel.g:1814:1: rule__SELECT__Group__2__Impl : ( 'in' ) ;
    public final void rule__SELECT__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1818:1: ( ( 'in' ) )
            // InternalDomainmodel.g:1819:1: ( 'in' )
            {
            // InternalDomainmodel.g:1819:1: ( 'in' )
            // InternalDomainmodel.g:1820:2: 'in'
            {
             before(grammarAccess.getSELECTAccess().getInKeyword_2()); 
            match(input,31,FOLLOW_2); 
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
    // InternalDomainmodel.g:1829:1: rule__SELECT__Group__3 : rule__SELECT__Group__3__Impl rule__SELECT__Group__4 ;
    public final void rule__SELECT__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1833:1: ( rule__SELECT__Group__3__Impl rule__SELECT__Group__4 )
            // InternalDomainmodel.g:1834:2: rule__SELECT__Group__3__Impl rule__SELECT__Group__4
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
    // InternalDomainmodel.g:1841:1: rule__SELECT__Group__3__Impl : ( 'COMBOBOX' ) ;
    public final void rule__SELECT__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1845:1: ( ( 'COMBOBOX' ) )
            // InternalDomainmodel.g:1846:1: ( 'COMBOBOX' )
            {
            // InternalDomainmodel.g:1846:1: ( 'COMBOBOX' )
            // InternalDomainmodel.g:1847:2: 'COMBOBOX'
            {
             before(grammarAccess.getSELECTAccess().getCOMBOBOXKeyword_3()); 
            match(input,32,FOLLOW_2); 
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
    // InternalDomainmodel.g:1856:1: rule__SELECT__Group__4 : rule__SELECT__Group__4__Impl ;
    public final void rule__SELECT__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1860:1: ( rule__SELECT__Group__4__Impl )
            // InternalDomainmodel.g:1861:2: rule__SELECT__Group__4__Impl
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
    // InternalDomainmodel.g:1867:1: rule__SELECT__Group__4__Impl : ( ( rule__SELECT__IdentifierAssignment_4 ) ) ;
    public final void rule__SELECT__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1871:1: ( ( ( rule__SELECT__IdentifierAssignment_4 ) ) )
            // InternalDomainmodel.g:1872:1: ( ( rule__SELECT__IdentifierAssignment_4 ) )
            {
            // InternalDomainmodel.g:1872:1: ( ( rule__SELECT__IdentifierAssignment_4 ) )
            // InternalDomainmodel.g:1873:2: ( rule__SELECT__IdentifierAssignment_4 )
            {
             before(grammarAccess.getSELECTAccess().getIdentifierAssignment_4()); 
            // InternalDomainmodel.g:1874:2: ( rule__SELECT__IdentifierAssignment_4 )
            // InternalDomainmodel.g:1874:3: rule__SELECT__IdentifierAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__SELECT__IdentifierAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSELECTAccess().getIdentifierAssignment_4()); 

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
    // InternalDomainmodel.g:1883:1: rule__READ__Group__0 : rule__READ__Group__0__Impl rule__READ__Group__1 ;
    public final void rule__READ__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1887:1: ( rule__READ__Group__0__Impl rule__READ__Group__1 )
            // InternalDomainmodel.g:1888:2: rule__READ__Group__0__Impl rule__READ__Group__1
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
    // InternalDomainmodel.g:1895:1: rule__READ__Group__0__Impl : ( ( rule__READ__NameAssignment_0 ) ) ;
    public final void rule__READ__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1899:1: ( ( ( rule__READ__NameAssignment_0 ) ) )
            // InternalDomainmodel.g:1900:1: ( ( rule__READ__NameAssignment_0 ) )
            {
            // InternalDomainmodel.g:1900:1: ( ( rule__READ__NameAssignment_0 ) )
            // InternalDomainmodel.g:1901:2: ( rule__READ__NameAssignment_0 )
            {
             before(grammarAccess.getREADAccess().getNameAssignment_0()); 
            // InternalDomainmodel.g:1902:2: ( rule__READ__NameAssignment_0 )
            // InternalDomainmodel.g:1902:3: rule__READ__NameAssignment_0
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
    // InternalDomainmodel.g:1910:1: rule__READ__Group__1 : rule__READ__Group__1__Impl rule__READ__Group__2 ;
    public final void rule__READ__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1914:1: ( rule__READ__Group__1__Impl rule__READ__Group__2 )
            // InternalDomainmodel.g:1915:2: rule__READ__Group__1__Impl rule__READ__Group__2
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
    // InternalDomainmodel.g:1922:1: rule__READ__Group__1__Impl : ( 'url' ) ;
    public final void rule__READ__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1926:1: ( ( 'url' ) )
            // InternalDomainmodel.g:1927:1: ( 'url' )
            {
            // InternalDomainmodel.g:1927:1: ( 'url' )
            // InternalDomainmodel.g:1928:2: 'url'
            {
             before(grammarAccess.getREADAccess().getUrlKeyword_1()); 
            match(input,33,FOLLOW_2); 
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
    // InternalDomainmodel.g:1937:1: rule__READ__Group__2 : rule__READ__Group__2__Impl rule__READ__Group__3 ;
    public final void rule__READ__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1941:1: ( rule__READ__Group__2__Impl rule__READ__Group__3 )
            // InternalDomainmodel.g:1942:2: rule__READ__Group__2__Impl rule__READ__Group__3
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
    // InternalDomainmodel.g:1949:1: rule__READ__Group__2__Impl : ( 'from' ) ;
    public final void rule__READ__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1953:1: ( ( 'from' ) )
            // InternalDomainmodel.g:1954:1: ( 'from' )
            {
            // InternalDomainmodel.g:1954:1: ( 'from' )
            // InternalDomainmodel.g:1955:2: 'from'
            {
             before(grammarAccess.getREADAccess().getFromKeyword_2()); 
            match(input,34,FOLLOW_2); 
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
    // InternalDomainmodel.g:1964:1: rule__READ__Group__3 : rule__READ__Group__3__Impl rule__READ__Group__4 ;
    public final void rule__READ__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1968:1: ( rule__READ__Group__3__Impl rule__READ__Group__4 )
            // InternalDomainmodel.g:1969:2: rule__READ__Group__3__Impl rule__READ__Group__4
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
    // InternalDomainmodel.g:1976:1: rule__READ__Group__3__Impl : ( ( rule__READ__Alternatives_3 ) ) ;
    public final void rule__READ__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1980:1: ( ( ( rule__READ__Alternatives_3 ) ) )
            // InternalDomainmodel.g:1981:1: ( ( rule__READ__Alternatives_3 ) )
            {
            // InternalDomainmodel.g:1981:1: ( ( rule__READ__Alternatives_3 ) )
            // InternalDomainmodel.g:1982:2: ( rule__READ__Alternatives_3 )
            {
             before(grammarAccess.getREADAccess().getAlternatives_3()); 
            // InternalDomainmodel.g:1983:2: ( rule__READ__Alternatives_3 )
            // InternalDomainmodel.g:1983:3: rule__READ__Alternatives_3
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
    // InternalDomainmodel.g:1991:1: rule__READ__Group__4 : rule__READ__Group__4__Impl rule__READ__Group__5 ;
    public final void rule__READ__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1995:1: ( rule__READ__Group__4__Impl rule__READ__Group__5 )
            // InternalDomainmodel.g:1996:2: rule__READ__Group__4__Impl rule__READ__Group__5
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
    // InternalDomainmodel.g:2003:1: rule__READ__Group__4__Impl : ( ( rule__READ__IdentifierAssignment_4 ) ) ;
    public final void rule__READ__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2007:1: ( ( ( rule__READ__IdentifierAssignment_4 ) ) )
            // InternalDomainmodel.g:2008:1: ( ( rule__READ__IdentifierAssignment_4 ) )
            {
            // InternalDomainmodel.g:2008:1: ( ( rule__READ__IdentifierAssignment_4 ) )
            // InternalDomainmodel.g:2009:2: ( rule__READ__IdentifierAssignment_4 )
            {
             before(grammarAccess.getREADAccess().getIdentifierAssignment_4()); 
            // InternalDomainmodel.g:2010:2: ( rule__READ__IdentifierAssignment_4 )
            // InternalDomainmodel.g:2010:3: rule__READ__IdentifierAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__READ__IdentifierAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getREADAccess().getIdentifierAssignment_4()); 

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
    // InternalDomainmodel.g:2018:1: rule__READ__Group__5 : rule__READ__Group__5__Impl ;
    public final void rule__READ__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2022:1: ( rule__READ__Group__5__Impl )
            // InternalDomainmodel.g:2023:2: rule__READ__Group__5__Impl
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
    // InternalDomainmodel.g:2029:1: rule__READ__Group__5__Impl : ( ( rule__READ__SavePathAssignment_5 )? ) ;
    public final void rule__READ__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2033:1: ( ( ( rule__READ__SavePathAssignment_5 )? ) )
            // InternalDomainmodel.g:2034:1: ( ( rule__READ__SavePathAssignment_5 )? )
            {
            // InternalDomainmodel.g:2034:1: ( ( rule__READ__SavePathAssignment_5 )? )
            // InternalDomainmodel.g:2035:2: ( rule__READ__SavePathAssignment_5 )?
            {
             before(grammarAccess.getREADAccess().getSavePathAssignment_5()); 
            // InternalDomainmodel.g:2036:2: ( rule__READ__SavePathAssignment_5 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==41) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalDomainmodel.g:2036:3: rule__READ__SavePathAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__READ__SavePathAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getREADAccess().getSavePathAssignment_5()); 

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
    // InternalDomainmodel.g:2045:1: rule__ELEMENTIDENTIFIER__Group__0 : rule__ELEMENTIDENTIFIER__Group__0__Impl rule__ELEMENTIDENTIFIER__Group__1 ;
    public final void rule__ELEMENTIDENTIFIER__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2049:1: ( rule__ELEMENTIDENTIFIER__Group__0__Impl rule__ELEMENTIDENTIFIER__Group__1 )
            // InternalDomainmodel.g:2050:2: rule__ELEMENTIDENTIFIER__Group__0__Impl rule__ELEMENTIDENTIFIER__Group__1
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
    // InternalDomainmodel.g:2057:1: rule__ELEMENTIDENTIFIER__Group__0__Impl : ( ( rule__ELEMENTIDENTIFIER__NameAssignment_0 ) ) ;
    public final void rule__ELEMENTIDENTIFIER__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2061:1: ( ( ( rule__ELEMENTIDENTIFIER__NameAssignment_0 ) ) )
            // InternalDomainmodel.g:2062:1: ( ( rule__ELEMENTIDENTIFIER__NameAssignment_0 ) )
            {
            // InternalDomainmodel.g:2062:1: ( ( rule__ELEMENTIDENTIFIER__NameAssignment_0 ) )
            // InternalDomainmodel.g:2063:2: ( rule__ELEMENTIDENTIFIER__NameAssignment_0 )
            {
             before(grammarAccess.getELEMENTIDENTIFIERAccess().getNameAssignment_0()); 
            // InternalDomainmodel.g:2064:2: ( rule__ELEMENTIDENTIFIER__NameAssignment_0 )
            // InternalDomainmodel.g:2064:3: rule__ELEMENTIDENTIFIER__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ELEMENTIDENTIFIER__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getELEMENTIDENTIFIERAccess().getNameAssignment_0()); 

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
    // InternalDomainmodel.g:2072:1: rule__ELEMENTIDENTIFIER__Group__1 : rule__ELEMENTIDENTIFIER__Group__1__Impl rule__ELEMENTIDENTIFIER__Group__2 ;
    public final void rule__ELEMENTIDENTIFIER__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2076:1: ( rule__ELEMENTIDENTIFIER__Group__1__Impl rule__ELEMENTIDENTIFIER__Group__2 )
            // InternalDomainmodel.g:2077:2: rule__ELEMENTIDENTIFIER__Group__1__Impl rule__ELEMENTIDENTIFIER__Group__2
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
    // InternalDomainmodel.g:2084:1: rule__ELEMENTIDENTIFIER__Group__1__Impl : ( 'by' ) ;
    public final void rule__ELEMENTIDENTIFIER__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2088:1: ( ( 'by' ) )
            // InternalDomainmodel.g:2089:1: ( 'by' )
            {
            // InternalDomainmodel.g:2089:1: ( 'by' )
            // InternalDomainmodel.g:2090:2: 'by'
            {
             before(grammarAccess.getELEMENTIDENTIFIERAccess().getByKeyword_1()); 
            match(input,35,FOLLOW_2); 
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
    // InternalDomainmodel.g:2099:1: rule__ELEMENTIDENTIFIER__Group__2 : rule__ELEMENTIDENTIFIER__Group__2__Impl rule__ELEMENTIDENTIFIER__Group__3 ;
    public final void rule__ELEMENTIDENTIFIER__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2103:1: ( rule__ELEMENTIDENTIFIER__Group__2__Impl rule__ELEMENTIDENTIFIER__Group__3 )
            // InternalDomainmodel.g:2104:2: rule__ELEMENTIDENTIFIER__Group__2__Impl rule__ELEMENTIDENTIFIER__Group__3
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
    // InternalDomainmodel.g:2111:1: rule__ELEMENTIDENTIFIER__Group__2__Impl : ( ( rule__ELEMENTIDENTIFIER__TypeAssignment_2 ) ) ;
    public final void rule__ELEMENTIDENTIFIER__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2115:1: ( ( ( rule__ELEMENTIDENTIFIER__TypeAssignment_2 ) ) )
            // InternalDomainmodel.g:2116:1: ( ( rule__ELEMENTIDENTIFIER__TypeAssignment_2 ) )
            {
            // InternalDomainmodel.g:2116:1: ( ( rule__ELEMENTIDENTIFIER__TypeAssignment_2 ) )
            // InternalDomainmodel.g:2117:2: ( rule__ELEMENTIDENTIFIER__TypeAssignment_2 )
            {
             before(grammarAccess.getELEMENTIDENTIFIERAccess().getTypeAssignment_2()); 
            // InternalDomainmodel.g:2118:2: ( rule__ELEMENTIDENTIFIER__TypeAssignment_2 )
            // InternalDomainmodel.g:2118:3: rule__ELEMENTIDENTIFIER__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ELEMENTIDENTIFIER__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getELEMENTIDENTIFIERAccess().getTypeAssignment_2()); 

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
    // InternalDomainmodel.g:2126:1: rule__ELEMENTIDENTIFIER__Group__3 : rule__ELEMENTIDENTIFIER__Group__3__Impl ;
    public final void rule__ELEMENTIDENTIFIER__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2130:1: ( rule__ELEMENTIDENTIFIER__Group__3__Impl )
            // InternalDomainmodel.g:2131:2: rule__ELEMENTIDENTIFIER__Group__3__Impl
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
    // InternalDomainmodel.g:2137:1: rule__ELEMENTIDENTIFIER__Group__3__Impl : ( ( rule__ELEMENTIDENTIFIER__Alternatives_3 ) ) ;
    public final void rule__ELEMENTIDENTIFIER__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2141:1: ( ( ( rule__ELEMENTIDENTIFIER__Alternatives_3 ) ) )
            // InternalDomainmodel.g:2142:1: ( ( rule__ELEMENTIDENTIFIER__Alternatives_3 ) )
            {
            // InternalDomainmodel.g:2142:1: ( ( rule__ELEMENTIDENTIFIER__Alternatives_3 ) )
            // InternalDomainmodel.g:2143:2: ( rule__ELEMENTIDENTIFIER__Alternatives_3 )
            {
             before(grammarAccess.getELEMENTIDENTIFIERAccess().getAlternatives_3()); 
            // InternalDomainmodel.g:2144:2: ( rule__ELEMENTIDENTIFIER__Alternatives_3 )
            // InternalDomainmodel.g:2144:3: rule__ELEMENTIDENTIFIER__Alternatives_3
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
    // InternalDomainmodel.g:2153:1: rule__ELEMENTIDENTIFIER__Group_3_1__0 : rule__ELEMENTIDENTIFIER__Group_3_1__0__Impl rule__ELEMENTIDENTIFIER__Group_3_1__1 ;
    public final void rule__ELEMENTIDENTIFIER__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2157:1: ( rule__ELEMENTIDENTIFIER__Group_3_1__0__Impl rule__ELEMENTIDENTIFIER__Group_3_1__1 )
            // InternalDomainmodel.g:2158:2: rule__ELEMENTIDENTIFIER__Group_3_1__0__Impl rule__ELEMENTIDENTIFIER__Group_3_1__1
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
    // InternalDomainmodel.g:2165:1: rule__ELEMENTIDENTIFIER__Group_3_1__0__Impl : ( ( rule__ELEMENTIDENTIFIER__InfoAssignment_3_1_0 ) ) ;
    public final void rule__ELEMENTIDENTIFIER__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2169:1: ( ( ( rule__ELEMENTIDENTIFIER__InfoAssignment_3_1_0 ) ) )
            // InternalDomainmodel.g:2170:1: ( ( rule__ELEMENTIDENTIFIER__InfoAssignment_3_1_0 ) )
            {
            // InternalDomainmodel.g:2170:1: ( ( rule__ELEMENTIDENTIFIER__InfoAssignment_3_1_0 ) )
            // InternalDomainmodel.g:2171:2: ( rule__ELEMENTIDENTIFIER__InfoAssignment_3_1_0 )
            {
             before(grammarAccess.getELEMENTIDENTIFIERAccess().getInfoAssignment_3_1_0()); 
            // InternalDomainmodel.g:2172:2: ( rule__ELEMENTIDENTIFIER__InfoAssignment_3_1_0 )
            // InternalDomainmodel.g:2172:3: rule__ELEMENTIDENTIFIER__InfoAssignment_3_1_0
            {
            pushFollow(FOLLOW_2);
            rule__ELEMENTIDENTIFIER__InfoAssignment_3_1_0();

            state._fsp--;


            }

             after(grammarAccess.getELEMENTIDENTIFIERAccess().getInfoAssignment_3_1_0()); 

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
    // InternalDomainmodel.g:2180:1: rule__ELEMENTIDENTIFIER__Group_3_1__1 : rule__ELEMENTIDENTIFIER__Group_3_1__1__Impl ;
    public final void rule__ELEMENTIDENTIFIER__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2184:1: ( rule__ELEMENTIDENTIFIER__Group_3_1__1__Impl )
            // InternalDomainmodel.g:2185:2: rule__ELEMENTIDENTIFIER__Group_3_1__1__Impl
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
    // InternalDomainmodel.g:2191:1: rule__ELEMENTIDENTIFIER__Group_3_1__1__Impl : ( ( rule__ELEMENTIDENTIFIER__VarAssignment_3_1_1 ) ) ;
    public final void rule__ELEMENTIDENTIFIER__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2195:1: ( ( ( rule__ELEMENTIDENTIFIER__VarAssignment_3_1_1 ) ) )
            // InternalDomainmodel.g:2196:1: ( ( rule__ELEMENTIDENTIFIER__VarAssignment_3_1_1 ) )
            {
            // InternalDomainmodel.g:2196:1: ( ( rule__ELEMENTIDENTIFIER__VarAssignment_3_1_1 ) )
            // InternalDomainmodel.g:2197:2: ( rule__ELEMENTIDENTIFIER__VarAssignment_3_1_1 )
            {
             before(grammarAccess.getELEMENTIDENTIFIERAccess().getVarAssignment_3_1_1()); 
            // InternalDomainmodel.g:2198:2: ( rule__ELEMENTIDENTIFIER__VarAssignment_3_1_1 )
            // InternalDomainmodel.g:2198:3: rule__ELEMENTIDENTIFIER__VarAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ELEMENTIDENTIFIER__VarAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getELEMENTIDENTIFIERAccess().getVarAssignment_3_1_1()); 

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


    // $ANTLR start "rule__VERIFY_CONTAINS__Group__0"
    // InternalDomainmodel.g:2207:1: rule__VERIFY_CONTAINS__Group__0 : rule__VERIFY_CONTAINS__Group__0__Impl rule__VERIFY_CONTAINS__Group__1 ;
    public final void rule__VERIFY_CONTAINS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2211:1: ( rule__VERIFY_CONTAINS__Group__0__Impl rule__VERIFY_CONTAINS__Group__1 )
            // InternalDomainmodel.g:2212:2: rule__VERIFY_CONTAINS__Group__0__Impl rule__VERIFY_CONTAINS__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__VERIFY_CONTAINS__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VERIFY_CONTAINS__Group__1();

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
    // $ANTLR end "rule__VERIFY_CONTAINS__Group__0"


    // $ANTLR start "rule__VERIFY_CONTAINS__Group__0__Impl"
    // InternalDomainmodel.g:2219:1: rule__VERIFY_CONTAINS__Group__0__Impl : ( 'verify' ) ;
    public final void rule__VERIFY_CONTAINS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2223:1: ( ( 'verify' ) )
            // InternalDomainmodel.g:2224:1: ( 'verify' )
            {
            // InternalDomainmodel.g:2224:1: ( 'verify' )
            // InternalDomainmodel.g:2225:2: 'verify'
            {
             before(grammarAccess.getVERIFY_CONTAINSAccess().getVerifyKeyword_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getVERIFY_CONTAINSAccess().getVerifyKeyword_0()); 

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
    // $ANTLR end "rule__VERIFY_CONTAINS__Group__0__Impl"


    // $ANTLR start "rule__VERIFY_CONTAINS__Group__1"
    // InternalDomainmodel.g:2234:1: rule__VERIFY_CONTAINS__Group__1 : rule__VERIFY_CONTAINS__Group__1__Impl rule__VERIFY_CONTAINS__Group__2 ;
    public final void rule__VERIFY_CONTAINS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2238:1: ( rule__VERIFY_CONTAINS__Group__1__Impl rule__VERIFY_CONTAINS__Group__2 )
            // InternalDomainmodel.g:2239:2: rule__VERIFY_CONTAINS__Group__1__Impl rule__VERIFY_CONTAINS__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__VERIFY_CONTAINS__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VERIFY_CONTAINS__Group__2();

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
    // $ANTLR end "rule__VERIFY_CONTAINS__Group__1"


    // $ANTLR start "rule__VERIFY_CONTAINS__Group__1__Impl"
    // InternalDomainmodel.g:2246:1: rule__VERIFY_CONTAINS__Group__1__Impl : ( 'that' ) ;
    public final void rule__VERIFY_CONTAINS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2250:1: ( ( 'that' ) )
            // InternalDomainmodel.g:2251:1: ( 'that' )
            {
            // InternalDomainmodel.g:2251:1: ( 'that' )
            // InternalDomainmodel.g:2252:2: 'that'
            {
             before(grammarAccess.getVERIFY_CONTAINSAccess().getThatKeyword_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getVERIFY_CONTAINSAccess().getThatKeyword_1()); 

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
    // $ANTLR end "rule__VERIFY_CONTAINS__Group__1__Impl"


    // $ANTLR start "rule__VERIFY_CONTAINS__Group__2"
    // InternalDomainmodel.g:2261:1: rule__VERIFY_CONTAINS__Group__2 : rule__VERIFY_CONTAINS__Group__2__Impl rule__VERIFY_CONTAINS__Group__3 ;
    public final void rule__VERIFY_CONTAINS__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2265:1: ( rule__VERIFY_CONTAINS__Group__2__Impl rule__VERIFY_CONTAINS__Group__3 )
            // InternalDomainmodel.g:2266:2: rule__VERIFY_CONTAINS__Group__2__Impl rule__VERIFY_CONTAINS__Group__3
            {
            pushFollow(FOLLOW_27);
            rule__VERIFY_CONTAINS__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VERIFY_CONTAINS__Group__3();

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
    // $ANTLR end "rule__VERIFY_CONTAINS__Group__2"


    // $ANTLR start "rule__VERIFY_CONTAINS__Group__2__Impl"
    // InternalDomainmodel.g:2273:1: rule__VERIFY_CONTAINS__Group__2__Impl : ( ( rule__VERIFY_CONTAINS__TypeAssignment_2 ) ) ;
    public final void rule__VERIFY_CONTAINS__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2277:1: ( ( ( rule__VERIFY_CONTAINS__TypeAssignment_2 ) ) )
            // InternalDomainmodel.g:2278:1: ( ( rule__VERIFY_CONTAINS__TypeAssignment_2 ) )
            {
            // InternalDomainmodel.g:2278:1: ( ( rule__VERIFY_CONTAINS__TypeAssignment_2 ) )
            // InternalDomainmodel.g:2279:2: ( rule__VERIFY_CONTAINS__TypeAssignment_2 )
            {
             before(grammarAccess.getVERIFY_CONTAINSAccess().getTypeAssignment_2()); 
            // InternalDomainmodel.g:2280:2: ( rule__VERIFY_CONTAINS__TypeAssignment_2 )
            // InternalDomainmodel.g:2280:3: rule__VERIFY_CONTAINS__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__VERIFY_CONTAINS__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getVERIFY_CONTAINSAccess().getTypeAssignment_2()); 

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
    // $ANTLR end "rule__VERIFY_CONTAINS__Group__2__Impl"


    // $ANTLR start "rule__VERIFY_CONTAINS__Group__3"
    // InternalDomainmodel.g:2288:1: rule__VERIFY_CONTAINS__Group__3 : rule__VERIFY_CONTAINS__Group__3__Impl rule__VERIFY_CONTAINS__Group__4 ;
    public final void rule__VERIFY_CONTAINS__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2292:1: ( rule__VERIFY_CONTAINS__Group__3__Impl rule__VERIFY_CONTAINS__Group__4 )
            // InternalDomainmodel.g:2293:2: rule__VERIFY_CONTAINS__Group__3__Impl rule__VERIFY_CONTAINS__Group__4
            {
            pushFollow(FOLLOW_27);
            rule__VERIFY_CONTAINS__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VERIFY_CONTAINS__Group__4();

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
    // $ANTLR end "rule__VERIFY_CONTAINS__Group__3"


    // $ANTLR start "rule__VERIFY_CONTAINS__Group__3__Impl"
    // InternalDomainmodel.g:2300:1: rule__VERIFY_CONTAINS__Group__3__Impl : ( ( rule__VERIFY_CONTAINS__IdentifierAssignment_3 )? ) ;
    public final void rule__VERIFY_CONTAINS__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2304:1: ( ( ( rule__VERIFY_CONTAINS__IdentifierAssignment_3 )? ) )
            // InternalDomainmodel.g:2305:1: ( ( rule__VERIFY_CONTAINS__IdentifierAssignment_3 )? )
            {
            // InternalDomainmodel.g:2305:1: ( ( rule__VERIFY_CONTAINS__IdentifierAssignment_3 )? )
            // InternalDomainmodel.g:2306:2: ( rule__VERIFY_CONTAINS__IdentifierAssignment_3 )?
            {
             before(grammarAccess.getVERIFY_CONTAINSAccess().getIdentifierAssignment_3()); 
            // InternalDomainmodel.g:2307:2: ( rule__VERIFY_CONTAINS__IdentifierAssignment_3 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==52) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalDomainmodel.g:2307:3: rule__VERIFY_CONTAINS__IdentifierAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__VERIFY_CONTAINS__IdentifierAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVERIFY_CONTAINSAccess().getIdentifierAssignment_3()); 

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
    // $ANTLR end "rule__VERIFY_CONTAINS__Group__3__Impl"


    // $ANTLR start "rule__VERIFY_CONTAINS__Group__4"
    // InternalDomainmodel.g:2315:1: rule__VERIFY_CONTAINS__Group__4 : rule__VERIFY_CONTAINS__Group__4__Impl rule__VERIFY_CONTAINS__Group__5 ;
    public final void rule__VERIFY_CONTAINS__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2319:1: ( rule__VERIFY_CONTAINS__Group__4__Impl rule__VERIFY_CONTAINS__Group__5 )
            // InternalDomainmodel.g:2320:2: rule__VERIFY_CONTAINS__Group__4__Impl rule__VERIFY_CONTAINS__Group__5
            {
            pushFollow(FOLLOW_28);
            rule__VERIFY_CONTAINS__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VERIFY_CONTAINS__Group__5();

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
    // $ANTLR end "rule__VERIFY_CONTAINS__Group__4"


    // $ANTLR start "rule__VERIFY_CONTAINS__Group__4__Impl"
    // InternalDomainmodel.g:2327:1: rule__VERIFY_CONTAINS__Group__4__Impl : ( 'contains' ) ;
    public final void rule__VERIFY_CONTAINS__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2331:1: ( ( 'contains' ) )
            // InternalDomainmodel.g:2332:1: ( 'contains' )
            {
            // InternalDomainmodel.g:2332:1: ( 'contains' )
            // InternalDomainmodel.g:2333:2: 'contains'
            {
             before(grammarAccess.getVERIFY_CONTAINSAccess().getContainsKeyword_4()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getVERIFY_CONTAINSAccess().getContainsKeyword_4()); 

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
    // $ANTLR end "rule__VERIFY_CONTAINS__Group__4__Impl"


    // $ANTLR start "rule__VERIFY_CONTAINS__Group__5"
    // InternalDomainmodel.g:2342:1: rule__VERIFY_CONTAINS__Group__5 : rule__VERIFY_CONTAINS__Group__5__Impl ;
    public final void rule__VERIFY_CONTAINS__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2346:1: ( rule__VERIFY_CONTAINS__Group__5__Impl )
            // InternalDomainmodel.g:2347:2: rule__VERIFY_CONTAINS__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VERIFY_CONTAINS__Group__5__Impl();

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
    // $ANTLR end "rule__VERIFY_CONTAINS__Group__5"


    // $ANTLR start "rule__VERIFY_CONTAINS__Group__5__Impl"
    // InternalDomainmodel.g:2353:1: rule__VERIFY_CONTAINS__Group__5__Impl : ( ( rule__VERIFY_CONTAINS__Alternatives_5 ) ) ;
    public final void rule__VERIFY_CONTAINS__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2357:1: ( ( ( rule__VERIFY_CONTAINS__Alternatives_5 ) ) )
            // InternalDomainmodel.g:2358:1: ( ( rule__VERIFY_CONTAINS__Alternatives_5 ) )
            {
            // InternalDomainmodel.g:2358:1: ( ( rule__VERIFY_CONTAINS__Alternatives_5 ) )
            // InternalDomainmodel.g:2359:2: ( rule__VERIFY_CONTAINS__Alternatives_5 )
            {
             before(grammarAccess.getVERIFY_CONTAINSAccess().getAlternatives_5()); 
            // InternalDomainmodel.g:2360:2: ( rule__VERIFY_CONTAINS__Alternatives_5 )
            // InternalDomainmodel.g:2360:3: rule__VERIFY_CONTAINS__Alternatives_5
            {
            pushFollow(FOLLOW_2);
            rule__VERIFY_CONTAINS__Alternatives_5();

            state._fsp--;


            }

             after(grammarAccess.getVERIFY_CONTAINSAccess().getAlternatives_5()); 

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
    // $ANTLR end "rule__VERIFY_CONTAINS__Group__5__Impl"


    // $ANTLR start "rule__VERIFY_CONTAINS__Group_5_0__0"
    // InternalDomainmodel.g:2369:1: rule__VERIFY_CONTAINS__Group_5_0__0 : rule__VERIFY_CONTAINS__Group_5_0__0__Impl rule__VERIFY_CONTAINS__Group_5_0__1 ;
    public final void rule__VERIFY_CONTAINS__Group_5_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2373:1: ( rule__VERIFY_CONTAINS__Group_5_0__0__Impl rule__VERIFY_CONTAINS__Group_5_0__1 )
            // InternalDomainmodel.g:2374:2: rule__VERIFY_CONTAINS__Group_5_0__0__Impl rule__VERIFY_CONTAINS__Group_5_0__1
            {
            pushFollow(FOLLOW_12);
            rule__VERIFY_CONTAINS__Group_5_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VERIFY_CONTAINS__Group_5_0__1();

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
    // $ANTLR end "rule__VERIFY_CONTAINS__Group_5_0__0"


    // $ANTLR start "rule__VERIFY_CONTAINS__Group_5_0__0__Impl"
    // InternalDomainmodel.g:2381:1: rule__VERIFY_CONTAINS__Group_5_0__0__Impl : ( ( rule__VERIFY_CONTAINS__Alternatives_5_0_0 ) ) ;
    public final void rule__VERIFY_CONTAINS__Group_5_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2385:1: ( ( ( rule__VERIFY_CONTAINS__Alternatives_5_0_0 ) ) )
            // InternalDomainmodel.g:2386:1: ( ( rule__VERIFY_CONTAINS__Alternatives_5_0_0 ) )
            {
            // InternalDomainmodel.g:2386:1: ( ( rule__VERIFY_CONTAINS__Alternatives_5_0_0 ) )
            // InternalDomainmodel.g:2387:2: ( rule__VERIFY_CONTAINS__Alternatives_5_0_0 )
            {
             before(grammarAccess.getVERIFY_CONTAINSAccess().getAlternatives_5_0_0()); 
            // InternalDomainmodel.g:2388:2: ( rule__VERIFY_CONTAINS__Alternatives_5_0_0 )
            // InternalDomainmodel.g:2388:3: rule__VERIFY_CONTAINS__Alternatives_5_0_0
            {
            pushFollow(FOLLOW_2);
            rule__VERIFY_CONTAINS__Alternatives_5_0_0();

            state._fsp--;


            }

             after(grammarAccess.getVERIFY_CONTAINSAccess().getAlternatives_5_0_0()); 

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
    // $ANTLR end "rule__VERIFY_CONTAINS__Group_5_0__0__Impl"


    // $ANTLR start "rule__VERIFY_CONTAINS__Group_5_0__1"
    // InternalDomainmodel.g:2396:1: rule__VERIFY_CONTAINS__Group_5_0__1 : rule__VERIFY_CONTAINS__Group_5_0__1__Impl ;
    public final void rule__VERIFY_CONTAINS__Group_5_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2400:1: ( rule__VERIFY_CONTAINS__Group_5_0__1__Impl )
            // InternalDomainmodel.g:2401:2: rule__VERIFY_CONTAINS__Group_5_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VERIFY_CONTAINS__Group_5_0__1__Impl();

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
    // $ANTLR end "rule__VERIFY_CONTAINS__Group_5_0__1"


    // $ANTLR start "rule__VERIFY_CONTAINS__Group_5_0__1__Impl"
    // InternalDomainmodel.g:2407:1: rule__VERIFY_CONTAINS__Group_5_0__1__Impl : ( ( rule__VERIFY_CONTAINS__ContainedIdentifierAssignment_5_0_1 ) ) ;
    public final void rule__VERIFY_CONTAINS__Group_5_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2411:1: ( ( ( rule__VERIFY_CONTAINS__ContainedIdentifierAssignment_5_0_1 ) ) )
            // InternalDomainmodel.g:2412:1: ( ( rule__VERIFY_CONTAINS__ContainedIdentifierAssignment_5_0_1 ) )
            {
            // InternalDomainmodel.g:2412:1: ( ( rule__VERIFY_CONTAINS__ContainedIdentifierAssignment_5_0_1 ) )
            // InternalDomainmodel.g:2413:2: ( rule__VERIFY_CONTAINS__ContainedIdentifierAssignment_5_0_1 )
            {
             before(grammarAccess.getVERIFY_CONTAINSAccess().getContainedIdentifierAssignment_5_0_1()); 
            // InternalDomainmodel.g:2414:2: ( rule__VERIFY_CONTAINS__ContainedIdentifierAssignment_5_0_1 )
            // InternalDomainmodel.g:2414:3: rule__VERIFY_CONTAINS__ContainedIdentifierAssignment_5_0_1
            {
            pushFollow(FOLLOW_2);
            rule__VERIFY_CONTAINS__ContainedIdentifierAssignment_5_0_1();

            state._fsp--;


            }

             after(grammarAccess.getVERIFY_CONTAINSAccess().getContainedIdentifierAssignment_5_0_1()); 

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
    // $ANTLR end "rule__VERIFY_CONTAINS__Group_5_0__1__Impl"


    // $ANTLR start "rule__VERIFY_EQUALS__Group__0"
    // InternalDomainmodel.g:2423:1: rule__VERIFY_EQUALS__Group__0 : rule__VERIFY_EQUALS__Group__0__Impl rule__VERIFY_EQUALS__Group__1 ;
    public final void rule__VERIFY_EQUALS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2427:1: ( rule__VERIFY_EQUALS__Group__0__Impl rule__VERIFY_EQUALS__Group__1 )
            // InternalDomainmodel.g:2428:2: rule__VERIFY_EQUALS__Group__0__Impl rule__VERIFY_EQUALS__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__VERIFY_EQUALS__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VERIFY_EQUALS__Group__1();

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
    // $ANTLR end "rule__VERIFY_EQUALS__Group__0"


    // $ANTLR start "rule__VERIFY_EQUALS__Group__0__Impl"
    // InternalDomainmodel.g:2435:1: rule__VERIFY_EQUALS__Group__0__Impl : ( 'verify' ) ;
    public final void rule__VERIFY_EQUALS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2439:1: ( ( 'verify' ) )
            // InternalDomainmodel.g:2440:1: ( 'verify' )
            {
            // InternalDomainmodel.g:2440:1: ( 'verify' )
            // InternalDomainmodel.g:2441:2: 'verify'
            {
             before(grammarAccess.getVERIFY_EQUALSAccess().getVerifyKeyword_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getVERIFY_EQUALSAccess().getVerifyKeyword_0()); 

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
    // $ANTLR end "rule__VERIFY_EQUALS__Group__0__Impl"


    // $ANTLR start "rule__VERIFY_EQUALS__Group__1"
    // InternalDomainmodel.g:2450:1: rule__VERIFY_EQUALS__Group__1 : rule__VERIFY_EQUALS__Group__1__Impl rule__VERIFY_EQUALS__Group__2 ;
    public final void rule__VERIFY_EQUALS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2454:1: ( rule__VERIFY_EQUALS__Group__1__Impl rule__VERIFY_EQUALS__Group__2 )
            // InternalDomainmodel.g:2455:2: rule__VERIFY_EQUALS__Group__1__Impl rule__VERIFY_EQUALS__Group__2
            {
            pushFollow(FOLLOW_29);
            rule__VERIFY_EQUALS__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VERIFY_EQUALS__Group__2();

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
    // $ANTLR end "rule__VERIFY_EQUALS__Group__1"


    // $ANTLR start "rule__VERIFY_EQUALS__Group__1__Impl"
    // InternalDomainmodel.g:2462:1: rule__VERIFY_EQUALS__Group__1__Impl : ( 'that' ) ;
    public final void rule__VERIFY_EQUALS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2466:1: ( ( 'that' ) )
            // InternalDomainmodel.g:2467:1: ( 'that' )
            {
            // InternalDomainmodel.g:2467:1: ( 'that' )
            // InternalDomainmodel.g:2468:2: 'that'
            {
             before(grammarAccess.getVERIFY_EQUALSAccess().getThatKeyword_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getVERIFY_EQUALSAccess().getThatKeyword_1()); 

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
    // $ANTLR end "rule__VERIFY_EQUALS__Group__1__Impl"


    // $ANTLR start "rule__VERIFY_EQUALS__Group__2"
    // InternalDomainmodel.g:2477:1: rule__VERIFY_EQUALS__Group__2 : rule__VERIFY_EQUALS__Group__2__Impl rule__VERIFY_EQUALS__Group__3 ;
    public final void rule__VERIFY_EQUALS__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2481:1: ( rule__VERIFY_EQUALS__Group__2__Impl rule__VERIFY_EQUALS__Group__3 )
            // InternalDomainmodel.g:2482:2: rule__VERIFY_EQUALS__Group__2__Impl rule__VERIFY_EQUALS__Group__3
            {
            pushFollow(FOLLOW_30);
            rule__VERIFY_EQUALS__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VERIFY_EQUALS__Group__3();

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
    // $ANTLR end "rule__VERIFY_EQUALS__Group__2"


    // $ANTLR start "rule__VERIFY_EQUALS__Group__2__Impl"
    // InternalDomainmodel.g:2489:1: rule__VERIFY_EQUALS__Group__2__Impl : ( ( rule__VERIFY_EQUALS__OperationAssignment_2 ) ) ;
    public final void rule__VERIFY_EQUALS__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2493:1: ( ( ( rule__VERIFY_EQUALS__OperationAssignment_2 ) ) )
            // InternalDomainmodel.g:2494:1: ( ( rule__VERIFY_EQUALS__OperationAssignment_2 ) )
            {
            // InternalDomainmodel.g:2494:1: ( ( rule__VERIFY_EQUALS__OperationAssignment_2 ) )
            // InternalDomainmodel.g:2495:2: ( rule__VERIFY_EQUALS__OperationAssignment_2 )
            {
             before(grammarAccess.getVERIFY_EQUALSAccess().getOperationAssignment_2()); 
            // InternalDomainmodel.g:2496:2: ( rule__VERIFY_EQUALS__OperationAssignment_2 )
            // InternalDomainmodel.g:2496:3: rule__VERIFY_EQUALS__OperationAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__VERIFY_EQUALS__OperationAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getVERIFY_EQUALSAccess().getOperationAssignment_2()); 

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
    // $ANTLR end "rule__VERIFY_EQUALS__Group__2__Impl"


    // $ANTLR start "rule__VERIFY_EQUALS__Group__3"
    // InternalDomainmodel.g:2504:1: rule__VERIFY_EQUALS__Group__3 : rule__VERIFY_EQUALS__Group__3__Impl rule__VERIFY_EQUALS__Group__4 ;
    public final void rule__VERIFY_EQUALS__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2508:1: ( rule__VERIFY_EQUALS__Group__3__Impl rule__VERIFY_EQUALS__Group__4 )
            // InternalDomainmodel.g:2509:2: rule__VERIFY_EQUALS__Group__3__Impl rule__VERIFY_EQUALS__Group__4
            {
            pushFollow(FOLLOW_28);
            rule__VERIFY_EQUALS__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VERIFY_EQUALS__Group__4();

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
    // $ANTLR end "rule__VERIFY_EQUALS__Group__3"


    // $ANTLR start "rule__VERIFY_EQUALS__Group__3__Impl"
    // InternalDomainmodel.g:2516:1: rule__VERIFY_EQUALS__Group__3__Impl : ( 'equals' ) ;
    public final void rule__VERIFY_EQUALS__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2520:1: ( ( 'equals' ) )
            // InternalDomainmodel.g:2521:1: ( 'equals' )
            {
            // InternalDomainmodel.g:2521:1: ( 'equals' )
            // InternalDomainmodel.g:2522:2: 'equals'
            {
             before(grammarAccess.getVERIFY_EQUALSAccess().getEqualsKeyword_3()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getVERIFY_EQUALSAccess().getEqualsKeyword_3()); 

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
    // $ANTLR end "rule__VERIFY_EQUALS__Group__3__Impl"


    // $ANTLR start "rule__VERIFY_EQUALS__Group__4"
    // InternalDomainmodel.g:2531:1: rule__VERIFY_EQUALS__Group__4 : rule__VERIFY_EQUALS__Group__4__Impl ;
    public final void rule__VERIFY_EQUALS__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2535:1: ( rule__VERIFY_EQUALS__Group__4__Impl )
            // InternalDomainmodel.g:2536:2: rule__VERIFY_EQUALS__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VERIFY_EQUALS__Group__4__Impl();

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
    // $ANTLR end "rule__VERIFY_EQUALS__Group__4"


    // $ANTLR start "rule__VERIFY_EQUALS__Group__4__Impl"
    // InternalDomainmodel.g:2542:1: rule__VERIFY_EQUALS__Group__4__Impl : ( ( rule__VERIFY_EQUALS__Alternatives_4 ) ) ;
    public final void rule__VERIFY_EQUALS__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2546:1: ( ( ( rule__VERIFY_EQUALS__Alternatives_4 ) ) )
            // InternalDomainmodel.g:2547:1: ( ( rule__VERIFY_EQUALS__Alternatives_4 ) )
            {
            // InternalDomainmodel.g:2547:1: ( ( rule__VERIFY_EQUALS__Alternatives_4 ) )
            // InternalDomainmodel.g:2548:2: ( rule__VERIFY_EQUALS__Alternatives_4 )
            {
             before(grammarAccess.getVERIFY_EQUALSAccess().getAlternatives_4()); 
            // InternalDomainmodel.g:2549:2: ( rule__VERIFY_EQUALS__Alternatives_4 )
            // InternalDomainmodel.g:2549:3: rule__VERIFY_EQUALS__Alternatives_4
            {
            pushFollow(FOLLOW_2);
            rule__VERIFY_EQUALS__Alternatives_4();

            state._fsp--;


            }

             after(grammarAccess.getVERIFY_EQUALSAccess().getAlternatives_4()); 

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
    // $ANTLR end "rule__VERIFY_EQUALS__Group__4__Impl"


    // $ANTLR start "rule__REGISTERED_VALUE__Group__0"
    // InternalDomainmodel.g:2558:1: rule__REGISTERED_VALUE__Group__0 : rule__REGISTERED_VALUE__Group__0__Impl rule__REGISTERED_VALUE__Group__1 ;
    public final void rule__REGISTERED_VALUE__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2562:1: ( rule__REGISTERED_VALUE__Group__0__Impl rule__REGISTERED_VALUE__Group__1 )
            // InternalDomainmodel.g:2563:2: rule__REGISTERED_VALUE__Group__0__Impl rule__REGISTERED_VALUE__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__REGISTERED_VALUE__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__REGISTERED_VALUE__Group__1();

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
    // $ANTLR end "rule__REGISTERED_VALUE__Group__0"


    // $ANTLR start "rule__REGISTERED_VALUE__Group__0__Impl"
    // InternalDomainmodel.g:2570:1: rule__REGISTERED_VALUE__Group__0__Impl : ( 'saved' ) ;
    public final void rule__REGISTERED_VALUE__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2574:1: ( ( 'saved' ) )
            // InternalDomainmodel.g:2575:1: ( 'saved' )
            {
            // InternalDomainmodel.g:2575:1: ( 'saved' )
            // InternalDomainmodel.g:2576:2: 'saved'
            {
             before(grammarAccess.getREGISTERED_VALUEAccess().getSavedKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getREGISTERED_VALUEAccess().getSavedKeyword_0()); 

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
    // $ANTLR end "rule__REGISTERED_VALUE__Group__0__Impl"


    // $ANTLR start "rule__REGISTERED_VALUE__Group__1"
    // InternalDomainmodel.g:2585:1: rule__REGISTERED_VALUE__Group__1 : rule__REGISTERED_VALUE__Group__1__Impl ;
    public final void rule__REGISTERED_VALUE__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2589:1: ( rule__REGISTERED_VALUE__Group__1__Impl )
            // InternalDomainmodel.g:2590:2: rule__REGISTERED_VALUE__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__REGISTERED_VALUE__Group__1__Impl();

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
    // $ANTLR end "rule__REGISTERED_VALUE__Group__1"


    // $ANTLR start "rule__REGISTERED_VALUE__Group__1__Impl"
    // InternalDomainmodel.g:2596:1: rule__REGISTERED_VALUE__Group__1__Impl : ( ( rule__REGISTERED_VALUE__VarAssignment_1 ) ) ;
    public final void rule__REGISTERED_VALUE__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2600:1: ( ( ( rule__REGISTERED_VALUE__VarAssignment_1 ) ) )
            // InternalDomainmodel.g:2601:1: ( ( rule__REGISTERED_VALUE__VarAssignment_1 ) )
            {
            // InternalDomainmodel.g:2601:1: ( ( rule__REGISTERED_VALUE__VarAssignment_1 ) )
            // InternalDomainmodel.g:2602:2: ( rule__REGISTERED_VALUE__VarAssignment_1 )
            {
             before(grammarAccess.getREGISTERED_VALUEAccess().getVarAssignment_1()); 
            // InternalDomainmodel.g:2603:2: ( rule__REGISTERED_VALUE__VarAssignment_1 )
            // InternalDomainmodel.g:2603:3: rule__REGISTERED_VALUE__VarAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__REGISTERED_VALUE__VarAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getREGISTERED_VALUEAccess().getVarAssignment_1()); 

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
    // $ANTLR end "rule__REGISTERED_VALUE__Group__1__Impl"


    // $ANTLR start "rule__COUNT__Group__0"
    // InternalDomainmodel.g:2612:1: rule__COUNT__Group__0 : rule__COUNT__Group__0__Impl rule__COUNT__Group__1 ;
    public final void rule__COUNT__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2616:1: ( rule__COUNT__Group__0__Impl rule__COUNT__Group__1 )
            // InternalDomainmodel.g:2617:2: rule__COUNT__Group__0__Impl rule__COUNT__Group__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalDomainmodel.g:2624:1: rule__COUNT__Group__0__Impl : ( ( rule__COUNT__NameAssignment_0 ) ) ;
    public final void rule__COUNT__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2628:1: ( ( ( rule__COUNT__NameAssignment_0 ) ) )
            // InternalDomainmodel.g:2629:1: ( ( rule__COUNT__NameAssignment_0 ) )
            {
            // InternalDomainmodel.g:2629:1: ( ( rule__COUNT__NameAssignment_0 ) )
            // InternalDomainmodel.g:2630:2: ( rule__COUNT__NameAssignment_0 )
            {
             before(grammarAccess.getCOUNTAccess().getNameAssignment_0()); 
            // InternalDomainmodel.g:2631:2: ( rule__COUNT__NameAssignment_0 )
            // InternalDomainmodel.g:2631:3: rule__COUNT__NameAssignment_0
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
    // InternalDomainmodel.g:2639:1: rule__COUNT__Group__1 : rule__COUNT__Group__1__Impl rule__COUNT__Group__2 ;
    public final void rule__COUNT__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2643:1: ( rule__COUNT__Group__1__Impl rule__COUNT__Group__2 )
            // InternalDomainmodel.g:2644:2: rule__COUNT__Group__1__Impl rule__COUNT__Group__2
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
    // InternalDomainmodel.g:2651:1: rule__COUNT__Group__1__Impl : ( 'ELEMENT' ) ;
    public final void rule__COUNT__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2655:1: ( ( 'ELEMENT' ) )
            // InternalDomainmodel.g:2656:1: ( 'ELEMENT' )
            {
            // InternalDomainmodel.g:2656:1: ( 'ELEMENT' )
            // InternalDomainmodel.g:2657:2: 'ELEMENT'
            {
             before(grammarAccess.getCOUNTAccess().getELEMENTKeyword_1()); 
            match(input,40,FOLLOW_2); 
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
    // InternalDomainmodel.g:2666:1: rule__COUNT__Group__2 : rule__COUNT__Group__2__Impl rule__COUNT__Group__3 ;
    public final void rule__COUNT__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2670:1: ( rule__COUNT__Group__2__Impl rule__COUNT__Group__3 )
            // InternalDomainmodel.g:2671:2: rule__COUNT__Group__2__Impl rule__COUNT__Group__3
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
    // InternalDomainmodel.g:2678:1: rule__COUNT__Group__2__Impl : ( ( rule__COUNT__IdentifierAssignment_2 ) ) ;
    public final void rule__COUNT__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2682:1: ( ( ( rule__COUNT__IdentifierAssignment_2 ) ) )
            // InternalDomainmodel.g:2683:1: ( ( rule__COUNT__IdentifierAssignment_2 ) )
            {
            // InternalDomainmodel.g:2683:1: ( ( rule__COUNT__IdentifierAssignment_2 ) )
            // InternalDomainmodel.g:2684:2: ( rule__COUNT__IdentifierAssignment_2 )
            {
             before(grammarAccess.getCOUNTAccess().getIdentifierAssignment_2()); 
            // InternalDomainmodel.g:2685:2: ( rule__COUNT__IdentifierAssignment_2 )
            // InternalDomainmodel.g:2685:3: rule__COUNT__IdentifierAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__COUNT__IdentifierAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCOUNTAccess().getIdentifierAssignment_2()); 

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
    // InternalDomainmodel.g:2693:1: rule__COUNT__Group__3 : rule__COUNT__Group__3__Impl ;
    public final void rule__COUNT__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2697:1: ( rule__COUNT__Group__3__Impl )
            // InternalDomainmodel.g:2698:2: rule__COUNT__Group__3__Impl
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
    // InternalDomainmodel.g:2704:1: rule__COUNT__Group__3__Impl : ( ( rule__COUNT__SaveVariableAssignment_3 )? ) ;
    public final void rule__COUNT__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2708:1: ( ( ( rule__COUNT__SaveVariableAssignment_3 )? ) )
            // InternalDomainmodel.g:2709:1: ( ( rule__COUNT__SaveVariableAssignment_3 )? )
            {
            // InternalDomainmodel.g:2709:1: ( ( rule__COUNT__SaveVariableAssignment_3 )? )
            // InternalDomainmodel.g:2710:2: ( rule__COUNT__SaveVariableAssignment_3 )?
            {
             before(grammarAccess.getCOUNTAccess().getSaveVariableAssignment_3()); 
            // InternalDomainmodel.g:2711:2: ( rule__COUNT__SaveVariableAssignment_3 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==41) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalDomainmodel.g:2711:3: rule__COUNT__SaveVariableAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__COUNT__SaveVariableAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCOUNTAccess().getSaveVariableAssignment_3()); 

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
    // InternalDomainmodel.g:2720:1: rule__SAVEVAR__Group__0 : rule__SAVEVAR__Group__0__Impl rule__SAVEVAR__Group__1 ;
    public final void rule__SAVEVAR__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2724:1: ( rule__SAVEVAR__Group__0__Impl rule__SAVEVAR__Group__1 )
            // InternalDomainmodel.g:2725:2: rule__SAVEVAR__Group__0__Impl rule__SAVEVAR__Group__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalDomainmodel.g:2732:1: rule__SAVEVAR__Group__0__Impl : ( 'and' ) ;
    public final void rule__SAVEVAR__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2736:1: ( ( 'and' ) )
            // InternalDomainmodel.g:2737:1: ( 'and' )
            {
            // InternalDomainmodel.g:2737:1: ( 'and' )
            // InternalDomainmodel.g:2738:2: 'and'
            {
             before(grammarAccess.getSAVEVARAccess().getAndKeyword_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalDomainmodel.g:2747:1: rule__SAVEVAR__Group__1 : rule__SAVEVAR__Group__1__Impl rule__SAVEVAR__Group__2 ;
    public final void rule__SAVEVAR__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2751:1: ( rule__SAVEVAR__Group__1__Impl rule__SAVEVAR__Group__2 )
            // InternalDomainmodel.g:2752:2: rule__SAVEVAR__Group__1__Impl rule__SAVEVAR__Group__2
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
    // InternalDomainmodel.g:2759:1: rule__SAVEVAR__Group__1__Impl : ( 'save' ) ;
    public final void rule__SAVEVAR__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2763:1: ( ( 'save' ) )
            // InternalDomainmodel.g:2764:1: ( 'save' )
            {
            // InternalDomainmodel.g:2764:1: ( 'save' )
            // InternalDomainmodel.g:2765:2: 'save'
            {
             before(grammarAccess.getSAVEVARAccess().getSaveKeyword_1()); 
            match(input,42,FOLLOW_2); 
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
    // InternalDomainmodel.g:2774:1: rule__SAVEVAR__Group__2 : rule__SAVEVAR__Group__2__Impl rule__SAVEVAR__Group__3 ;
    public final void rule__SAVEVAR__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2778:1: ( rule__SAVEVAR__Group__2__Impl rule__SAVEVAR__Group__3 )
            // InternalDomainmodel.g:2779:2: rule__SAVEVAR__Group__2__Impl rule__SAVEVAR__Group__3
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
    // InternalDomainmodel.g:2786:1: rule__SAVEVAR__Group__2__Impl : ( 'in' ) ;
    public final void rule__SAVEVAR__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2790:1: ( ( 'in' ) )
            // InternalDomainmodel.g:2791:1: ( 'in' )
            {
            // InternalDomainmodel.g:2791:1: ( 'in' )
            // InternalDomainmodel.g:2792:2: 'in'
            {
             before(grammarAccess.getSAVEVARAccess().getInKeyword_2()); 
            match(input,31,FOLLOW_2); 
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
    // InternalDomainmodel.g:2801:1: rule__SAVEVAR__Group__3 : rule__SAVEVAR__Group__3__Impl ;
    public final void rule__SAVEVAR__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2805:1: ( rule__SAVEVAR__Group__3__Impl )
            // InternalDomainmodel.g:2806:2: rule__SAVEVAR__Group__3__Impl
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
    // InternalDomainmodel.g:2812:1: rule__SAVEVAR__Group__3__Impl : ( ( rule__SAVEVAR__VarAssignment_3 ) ) ;
    public final void rule__SAVEVAR__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2816:1: ( ( ( rule__SAVEVAR__VarAssignment_3 ) ) )
            // InternalDomainmodel.g:2817:1: ( ( rule__SAVEVAR__VarAssignment_3 ) )
            {
            // InternalDomainmodel.g:2817:1: ( ( rule__SAVEVAR__VarAssignment_3 ) )
            // InternalDomainmodel.g:2818:2: ( rule__SAVEVAR__VarAssignment_3 )
            {
             before(grammarAccess.getSAVEVARAccess().getVarAssignment_3()); 
            // InternalDomainmodel.g:2819:2: ( rule__SAVEVAR__VarAssignment_3 )
            // InternalDomainmodel.g:2819:3: rule__SAVEVAR__VarAssignment_3
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
    // InternalDomainmodel.g:2828:1: rule__PLAY__Group__0 : rule__PLAY__Group__0__Impl rule__PLAY__Group__1 ;
    public final void rule__PLAY__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2832:1: ( rule__PLAY__Group__0__Impl rule__PLAY__Group__1 )
            // InternalDomainmodel.g:2833:2: rule__PLAY__Group__0__Impl rule__PLAY__Group__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalDomainmodel.g:2840:1: rule__PLAY__Group__0__Impl : ( ( rule__PLAY__NameAssignment_0 ) ) ;
    public final void rule__PLAY__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2844:1: ( ( ( rule__PLAY__NameAssignment_0 ) ) )
            // InternalDomainmodel.g:2845:1: ( ( rule__PLAY__NameAssignment_0 ) )
            {
            // InternalDomainmodel.g:2845:1: ( ( rule__PLAY__NameAssignment_0 ) )
            // InternalDomainmodel.g:2846:2: ( rule__PLAY__NameAssignment_0 )
            {
             before(grammarAccess.getPLAYAccess().getNameAssignment_0()); 
            // InternalDomainmodel.g:2847:2: ( rule__PLAY__NameAssignment_0 )
            // InternalDomainmodel.g:2847:3: rule__PLAY__NameAssignment_0
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
    // InternalDomainmodel.g:2855:1: rule__PLAY__Group__1 : rule__PLAY__Group__1__Impl rule__PLAY__Group__2 ;
    public final void rule__PLAY__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2859:1: ( rule__PLAY__Group__1__Impl rule__PLAY__Group__2 )
            // InternalDomainmodel.g:2860:2: rule__PLAY__Group__1__Impl rule__PLAY__Group__2
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
    // InternalDomainmodel.g:2867:1: rule__PLAY__Group__1__Impl : ( 'procedure' ) ;
    public final void rule__PLAY__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2871:1: ( ( 'procedure' ) )
            // InternalDomainmodel.g:2872:1: ( 'procedure' )
            {
            // InternalDomainmodel.g:2872:1: ( 'procedure' )
            // InternalDomainmodel.g:2873:2: 'procedure'
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
    // InternalDomainmodel.g:2882:1: rule__PLAY__Group__2 : rule__PLAY__Group__2__Impl rule__PLAY__Group__3 ;
    public final void rule__PLAY__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2886:1: ( rule__PLAY__Group__2__Impl rule__PLAY__Group__3 )
            // InternalDomainmodel.g:2887:2: rule__PLAY__Group__2__Impl rule__PLAY__Group__3
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
    // InternalDomainmodel.g:2894:1: rule__PLAY__Group__2__Impl : ( ( rule__PLAY__PreocedureAssignment_2 ) ) ;
    public final void rule__PLAY__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2898:1: ( ( ( rule__PLAY__PreocedureAssignment_2 ) ) )
            // InternalDomainmodel.g:2899:1: ( ( rule__PLAY__PreocedureAssignment_2 ) )
            {
            // InternalDomainmodel.g:2899:1: ( ( rule__PLAY__PreocedureAssignment_2 ) )
            // InternalDomainmodel.g:2900:2: ( rule__PLAY__PreocedureAssignment_2 )
            {
             before(grammarAccess.getPLAYAccess().getPreocedureAssignment_2()); 
            // InternalDomainmodel.g:2901:2: ( rule__PLAY__PreocedureAssignment_2 )
            // InternalDomainmodel.g:2901:3: rule__PLAY__PreocedureAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__PLAY__PreocedureAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPLAYAccess().getPreocedureAssignment_2()); 

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
    // InternalDomainmodel.g:2909:1: rule__PLAY__Group__3 : rule__PLAY__Group__3__Impl ;
    public final void rule__PLAY__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2913:1: ( rule__PLAY__Group__3__Impl )
            // InternalDomainmodel.g:2914:2: rule__PLAY__Group__3__Impl
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
    // InternalDomainmodel.g:2920:1: rule__PLAY__Group__3__Impl : ( ( rule__PLAY__ParamsAssignment_3 )* ) ;
    public final void rule__PLAY__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2924:1: ( ( ( rule__PLAY__ParamsAssignment_3 )* ) )
            // InternalDomainmodel.g:2925:1: ( ( rule__PLAY__ParamsAssignment_3 )* )
            {
            // InternalDomainmodel.g:2925:1: ( ( rule__PLAY__ParamsAssignment_3 )* )
            // InternalDomainmodel.g:2926:2: ( rule__PLAY__ParamsAssignment_3 )*
            {
             before(grammarAccess.getPLAYAccess().getParamsAssignment_3()); 
            // InternalDomainmodel.g:2927:2: ( rule__PLAY__ParamsAssignment_3 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_STRING) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalDomainmodel.g:2927:3: rule__PLAY__ParamsAssignment_3
            	    {
            	    pushFollow(FOLLOW_34);
            	    rule__PLAY__ParamsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
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
    // InternalDomainmodel.g:2936:1: rule__PROGRAMME__ProceduresAssignment : ( rulePROCEDURE ) ;
    public final void rule__PROGRAMME__ProceduresAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2940:1: ( ( rulePROCEDURE ) )
            // InternalDomainmodel.g:2941:2: ( rulePROCEDURE )
            {
            // InternalDomainmodel.g:2941:2: ( rulePROCEDURE )
            // InternalDomainmodel.g:2942:3: rulePROCEDURE
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
    // InternalDomainmodel.g:2951:1: rule__PROCEDURE__NameAssignment_1 : ( RULE_VARTYPE ) ;
    public final void rule__PROCEDURE__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2955:1: ( ( RULE_VARTYPE ) )
            // InternalDomainmodel.g:2956:2: ( RULE_VARTYPE )
            {
            // InternalDomainmodel.g:2956:2: ( RULE_VARTYPE )
            // InternalDomainmodel.g:2957:3: RULE_VARTYPE
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
    // InternalDomainmodel.g:2966:1: rule__PROCEDURE__ParamAssignment_2_1 : ( RULE_VARTYPE ) ;
    public final void rule__PROCEDURE__ParamAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2970:1: ( ( RULE_VARTYPE ) )
            // InternalDomainmodel.g:2971:2: ( RULE_VARTYPE )
            {
            // InternalDomainmodel.g:2971:2: ( RULE_VARTYPE )
            // InternalDomainmodel.g:2972:3: RULE_VARTYPE
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
    // InternalDomainmodel.g:2981:1: rule__PROCEDURE__ParamsAssignment_2_2 : ( RULE_VARTYPE ) ;
    public final void rule__PROCEDURE__ParamsAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2985:1: ( ( RULE_VARTYPE ) )
            // InternalDomainmodel.g:2986:2: ( RULE_VARTYPE )
            {
            // InternalDomainmodel.g:2986:2: ( RULE_VARTYPE )
            // InternalDomainmodel.g:2987:3: RULE_VARTYPE
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
    // InternalDomainmodel.g:2996:1: rule__PROCEDURE__InstAssignment_3 : ( ruleINSTRUCTION ) ;
    public final void rule__PROCEDURE__InstAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:3000:1: ( ( ruleINSTRUCTION ) )
            // InternalDomainmodel.g:3001:2: ( ruleINSTRUCTION )
            {
            // InternalDomainmodel.g:3001:2: ( ruleINSTRUCTION )
            // InternalDomainmodel.g:3002:3: ruleINSTRUCTION
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
    // InternalDomainmodel.g:3011:1: rule__OPEN__NameAssignment_0 : ( ( 'open' ) ) ;
    public final void rule__OPEN__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:3015:1: ( ( ( 'open' ) ) )
            // InternalDomainmodel.g:3016:2: ( ( 'open' ) )
            {
            // InternalDomainmodel.g:3016:2: ( ( 'open' ) )
            // InternalDomainmodel.g:3017:3: ( 'open' )
            {
             before(grammarAccess.getOPENAccess().getNameOpenKeyword_0_0()); 
            // InternalDomainmodel.g:3018:3: ( 'open' )
            // InternalDomainmodel.g:3019:4: 'open'
            {
             before(grammarAccess.getOPENAccess().getNameOpenKeyword_0_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalDomainmodel.g:3030:1: rule__OPEN__ValueAssignment_1 : ( ( rule__OPEN__ValueAlternatives_1_0 ) ) ;
    public final void rule__OPEN__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:3034:1: ( ( ( rule__OPEN__ValueAlternatives_1_0 ) ) )
            // InternalDomainmodel.g:3035:2: ( ( rule__OPEN__ValueAlternatives_1_0 ) )
            {
            // InternalDomainmodel.g:3035:2: ( ( rule__OPEN__ValueAlternatives_1_0 ) )
            // InternalDomainmodel.g:3036:3: ( rule__OPEN__ValueAlternatives_1_0 )
            {
             before(grammarAccess.getOPENAccess().getValueAlternatives_1_0()); 
            // InternalDomainmodel.g:3037:3: ( rule__OPEN__ValueAlternatives_1_0 )
            // InternalDomainmodel.g:3037:4: rule__OPEN__ValueAlternatives_1_0
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
    // InternalDomainmodel.g:3045:1: rule__GOTO__NameAssignment_0 : ( ( 'go to' ) ) ;
    public final void rule__GOTO__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:3049:1: ( ( ( 'go to' ) ) )
            // InternalDomainmodel.g:3050:2: ( ( 'go to' ) )
            {
            // InternalDomainmodel.g:3050:2: ( ( 'go to' ) )
            // InternalDomainmodel.g:3051:3: ( 'go to' )
            {
             before(grammarAccess.getGOTOAccess().getNameGoToKeyword_0_0()); 
            // InternalDomainmodel.g:3052:3: ( 'go to' )
            // InternalDomainmodel.g:3053:4: 'go to'
            {
             before(grammarAccess.getGOTOAccess().getNameGoToKeyword_0_0()); 
            match(input,44,FOLLOW_2); 
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
    // InternalDomainmodel.g:3064:1: rule__GOTO__ValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__GOTO__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:3068:1: ( ( RULE_STRING ) )
            // InternalDomainmodel.g:3069:2: ( RULE_STRING )
            {
            // InternalDomainmodel.g:3069:2: ( RULE_STRING )
            // InternalDomainmodel.g:3070:3: RULE_STRING
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
    // InternalDomainmodel.g:3079:1: rule__CLICK__NameAssignment_0 : ( ( 'click' ) ) ;
    public final void rule__CLICK__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:3083:1: ( ( ( 'click' ) ) )
            // InternalDomainmodel.g:3084:2: ( ( 'click' ) )
            {
            // InternalDomainmodel.g:3084:2: ( ( 'click' ) )
            // InternalDomainmodel.g:3085:3: ( 'click' )
            {
             before(grammarAccess.getCLICKAccess().getNameClickKeyword_0_0()); 
            // InternalDomainmodel.g:3086:3: ( 'click' )
            // InternalDomainmodel.g:3087:4: 'click'
            {
             before(grammarAccess.getCLICKAccess().getNameClickKeyword_0_0()); 
            match(input,45,FOLLOW_2); 
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
    // InternalDomainmodel.g:3098:1: rule__CLICK__TypeAssignment_2 : ( ( rule__CLICK__TypeAlternatives_2_0 ) ) ;
    public final void rule__CLICK__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:3102:1: ( ( ( rule__CLICK__TypeAlternatives_2_0 ) ) )
            // InternalDomainmodel.g:3103:2: ( ( rule__CLICK__TypeAlternatives_2_0 ) )
            {
            // InternalDomainmodel.g:3103:2: ( ( rule__CLICK__TypeAlternatives_2_0 ) )
            // InternalDomainmodel.g:3104:3: ( rule__CLICK__TypeAlternatives_2_0 )
            {
             before(grammarAccess.getCLICKAccess().getTypeAlternatives_2_0()); 
            // InternalDomainmodel.g:3105:3: ( rule__CLICK__TypeAlternatives_2_0 )
            // InternalDomainmodel.g:3105:4: rule__CLICK__TypeAlternatives_2_0
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


    // $ANTLR start "rule__CLICK__IdentifierAssignment_3"
    // InternalDomainmodel.g:3113:1: rule__CLICK__IdentifierAssignment_3 : ( ruleELEMENTIDENTIFIER ) ;
    public final void rule__CLICK__IdentifierAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:3117:1: ( ( ruleELEMENTIDENTIFIER ) )
            // InternalDomainmodel.g:3118:2: ( ruleELEMENTIDENTIFIER )
            {
            // InternalDomainmodel.g:3118:2: ( ruleELEMENTIDENTIFIER )
            // InternalDomainmodel.g:3119:3: ruleELEMENTIDENTIFIER
            {
             before(grammarAccess.getCLICKAccess().getIdentifierELEMENTIDENTIFIERParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleELEMENTIDENTIFIER();

            state._fsp--;

             after(grammarAccess.getCLICKAccess().getIdentifierELEMENTIDENTIFIERParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__CLICK__IdentifierAssignment_3"


    // $ANTLR start "rule__FILL__NameAssignment_0"
    // InternalDomainmodel.g:3128:1: rule__FILL__NameAssignment_0 : ( ( 'fill' ) ) ;
    public final void rule__FILL__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:3132:1: ( ( ( 'fill' ) ) )
            // InternalDomainmodel.g:3133:2: ( ( 'fill' ) )
            {
            // InternalDomainmodel.g:3133:2: ( ( 'fill' ) )
            // InternalDomainmodel.g:3134:3: ( 'fill' )
            {
             before(grammarAccess.getFILLAccess().getNameFillKeyword_0_0()); 
            // InternalDomainmodel.g:3135:3: ( 'fill' )
            // InternalDomainmodel.g:3136:4: 'fill'
            {
             before(grammarAccess.getFILLAccess().getNameFillKeyword_0_0()); 
            match(input,46,FOLLOW_2); 
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


    // $ANTLR start "rule__FILL__FieldTypeAssignment_1"
    // InternalDomainmodel.g:3147:1: rule__FILL__FieldTypeAssignment_1 : ( ( rule__FILL__FieldTypeAlternatives_1_0 ) ) ;
    public final void rule__FILL__FieldTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:3151:1: ( ( ( rule__FILL__FieldTypeAlternatives_1_0 ) ) )
            // InternalDomainmodel.g:3152:2: ( ( rule__FILL__FieldTypeAlternatives_1_0 ) )
            {
            // InternalDomainmodel.g:3152:2: ( ( rule__FILL__FieldTypeAlternatives_1_0 ) )
            // InternalDomainmodel.g:3153:3: ( rule__FILL__FieldTypeAlternatives_1_0 )
            {
             before(grammarAccess.getFILLAccess().getFieldTypeAlternatives_1_0()); 
            // InternalDomainmodel.g:3154:3: ( rule__FILL__FieldTypeAlternatives_1_0 )
            // InternalDomainmodel.g:3154:4: rule__FILL__FieldTypeAlternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__FILL__FieldTypeAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getFILLAccess().getFieldTypeAlternatives_1_0()); 

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
    // $ANTLR end "rule__FILL__FieldTypeAssignment_1"


    // $ANTLR start "rule__FILL__IdentifierAssignment_2"
    // InternalDomainmodel.g:3162:1: rule__FILL__IdentifierAssignment_2 : ( ruleELEMENTIDENTIFIER ) ;
    public final void rule__FILL__IdentifierAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:3166:1: ( ( ruleELEMENTIDENTIFIER ) )
            // InternalDomainmodel.g:3167:2: ( ruleELEMENTIDENTIFIER )
            {
            // InternalDomainmodel.g:3167:2: ( ruleELEMENTIDENTIFIER )
            // InternalDomainmodel.g:3168:3: ruleELEMENTIDENTIFIER
            {
             before(grammarAccess.getFILLAccess().getIdentifierELEMENTIDENTIFIERParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleELEMENTIDENTIFIER();

            state._fsp--;

             after(grammarAccess.getFILLAccess().getIdentifierELEMENTIDENTIFIERParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__FILL__IdentifierAssignment_2"


    // $ANTLR start "rule__FILL__VarAssignment_4_0_1"
    // InternalDomainmodel.g:3177:1: rule__FILL__VarAssignment_4_0_1 : ( RULE_VARTYPE ) ;
    public final void rule__FILL__VarAssignment_4_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:3181:1: ( ( RULE_VARTYPE ) )
            // InternalDomainmodel.g:3182:2: ( RULE_VARTYPE )
            {
            // InternalDomainmodel.g:3182:2: ( RULE_VARTYPE )
            // InternalDomainmodel.g:3183:3: RULE_VARTYPE
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
    // InternalDomainmodel.g:3192:1: rule__FILL__ValueAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__FILL__ValueAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:3196:1: ( ( RULE_STRING ) )
            // InternalDomainmodel.g:3197:2: ( RULE_STRING )
            {
            // InternalDomainmodel.g:3197:2: ( RULE_STRING )
            // InternalDomainmodel.g:3198:3: RULE_STRING
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
    // InternalDomainmodel.g:3207:1: rule__CHECK__NameAssignment_0 : ( ( 'check' ) ) ;
    public final void rule__CHECK__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:3211:1: ( ( ( 'check' ) ) )
            // InternalDomainmodel.g:3212:2: ( ( 'check' ) )
            {
            // InternalDomainmodel.g:3212:2: ( ( 'check' ) )
            // InternalDomainmodel.g:3213:3: ( 'check' )
            {
             before(grammarAccess.getCHECKAccess().getNameCheckKeyword_0_0()); 
            // InternalDomainmodel.g:3214:3: ( 'check' )
            // InternalDomainmodel.g:3215:4: 'check'
            {
             before(grammarAccess.getCHECKAccess().getNameCheckKeyword_0_0()); 
            match(input,47,FOLLOW_2); 
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


    // $ANTLR start "rule__CHECK__AllAssignment_1"
    // InternalDomainmodel.g:3226:1: rule__CHECK__AllAssignment_1 : ( ( 'all' ) ) ;
    public final void rule__CHECK__AllAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:3230:1: ( ( ( 'all' ) ) )
            // InternalDomainmodel.g:3231:2: ( ( 'all' ) )
            {
            // InternalDomainmodel.g:3231:2: ( ( 'all' ) )
            // InternalDomainmodel.g:3232:3: ( 'all' )
            {
             before(grammarAccess.getCHECKAccess().getAllAllKeyword_1_0()); 
            // InternalDomainmodel.g:3233:3: ( 'all' )
            // InternalDomainmodel.g:3234:4: 'all'
            {
             before(grammarAccess.getCHECKAccess().getAllAllKeyword_1_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getCHECKAccess().getAllAllKeyword_1_0()); 

            }

             after(grammarAccess.getCHECKAccess().getAllAllKeyword_1_0()); 

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
    // $ANTLR end "rule__CHECK__AllAssignment_1"


    // $ANTLR start "rule__CHECK__IdentifierAssignment_3"
    // InternalDomainmodel.g:3245:1: rule__CHECK__IdentifierAssignment_3 : ( ruleELEMENTIDENTIFIER ) ;
    public final void rule__CHECK__IdentifierAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:3249:1: ( ( ruleELEMENTIDENTIFIER ) )
            // InternalDomainmodel.g:3250:2: ( ruleELEMENTIDENTIFIER )
            {
            // InternalDomainmodel.g:3250:2: ( ruleELEMENTIDENTIFIER )
            // InternalDomainmodel.g:3251:3: ruleELEMENTIDENTIFIER
            {
             before(grammarAccess.getCHECKAccess().getIdentifierELEMENTIDENTIFIERParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleELEMENTIDENTIFIER();

            state._fsp--;

             after(grammarAccess.getCHECKAccess().getIdentifierELEMENTIDENTIFIERParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__CHECK__IdentifierAssignment_3"


    // $ANTLR start "rule__UNCHECK__NameAssignment_0"
    // InternalDomainmodel.g:3260:1: rule__UNCHECK__NameAssignment_0 : ( ( 'uncheck' ) ) ;
    public final void rule__UNCHECK__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:3264:1: ( ( ( 'uncheck' ) ) )
            // InternalDomainmodel.g:3265:2: ( ( 'uncheck' ) )
            {
            // InternalDomainmodel.g:3265:2: ( ( 'uncheck' ) )
            // InternalDomainmodel.g:3266:3: ( 'uncheck' )
            {
             before(grammarAccess.getUNCHECKAccess().getNameUncheckKeyword_0_0()); 
            // InternalDomainmodel.g:3267:3: ( 'uncheck' )
            // InternalDomainmodel.g:3268:4: 'uncheck'
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


    // $ANTLR start "rule__UNCHECK__AllAssignment_1"
    // InternalDomainmodel.g:3279:1: rule__UNCHECK__AllAssignment_1 : ( ( 'all' ) ) ;
    public final void rule__UNCHECK__AllAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:3283:1: ( ( ( 'all' ) ) )
            // InternalDomainmodel.g:3284:2: ( ( 'all' ) )
            {
            // InternalDomainmodel.g:3284:2: ( ( 'all' ) )
            // InternalDomainmodel.g:3285:3: ( 'all' )
            {
             before(grammarAccess.getUNCHECKAccess().getAllAllKeyword_1_0()); 
            // InternalDomainmodel.g:3286:3: ( 'all' )
            // InternalDomainmodel.g:3287:4: 'all'
            {
             before(grammarAccess.getUNCHECKAccess().getAllAllKeyword_1_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getUNCHECKAccess().getAllAllKeyword_1_0()); 

            }

             after(grammarAccess.getUNCHECKAccess().getAllAllKeyword_1_0()); 

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
    // $ANTLR end "rule__UNCHECK__AllAssignment_1"


    // $ANTLR start "rule__UNCHECK__IdentifierAssignment_3"
    // InternalDomainmodel.g:3298:1: rule__UNCHECK__IdentifierAssignment_3 : ( ruleELEMENTIDENTIFIER ) ;
    public final void rule__UNCHECK__IdentifierAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:3302:1: ( ( ruleELEMENTIDENTIFIER ) )
            // InternalDomainmodel.g:3303:2: ( ruleELEMENTIDENTIFIER )
            {
            // InternalDomainmodel.g:3303:2: ( ruleELEMENTIDENTIFIER )
            // InternalDomainmodel.g:3304:3: ruleELEMENTIDENTIFIER
            {
             before(grammarAccess.getUNCHECKAccess().getIdentifierELEMENTIDENTIFIERParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleELEMENTIDENTIFIER();

            state._fsp--;

             after(grammarAccess.getUNCHECKAccess().getIdentifierELEMENTIDENTIFIERParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__UNCHECK__IdentifierAssignment_3"


    // $ANTLR start "rule__SELECT__NameAssignment_0"
    // InternalDomainmodel.g:3313:1: rule__SELECT__NameAssignment_0 : ( ( 'select' ) ) ;
    public final void rule__SELECT__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:3317:1: ( ( ( 'select' ) ) )
            // InternalDomainmodel.g:3318:2: ( ( 'select' ) )
            {
            // InternalDomainmodel.g:3318:2: ( ( 'select' ) )
            // InternalDomainmodel.g:3319:3: ( 'select' )
            {
             before(grammarAccess.getSELECTAccess().getNameSelectKeyword_0_0()); 
            // InternalDomainmodel.g:3320:3: ( 'select' )
            // InternalDomainmodel.g:3321:4: 'select'
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
    // InternalDomainmodel.g:3332:1: rule__SELECT__ElemAssignment_1 : ( RULE_STRING ) ;
    public final void rule__SELECT__ElemAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:3336:1: ( ( RULE_STRING ) )
            // InternalDomainmodel.g:3337:2: ( RULE_STRING )
            {
            // InternalDomainmodel.g:3337:2: ( RULE_STRING )
            // InternalDomainmodel.g:3338:3: RULE_STRING
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


    // $ANTLR start "rule__SELECT__IdentifierAssignment_4"
    // InternalDomainmodel.g:3347:1: rule__SELECT__IdentifierAssignment_4 : ( ruleELEMENTIDENTIFIER ) ;
    public final void rule__SELECT__IdentifierAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:3351:1: ( ( ruleELEMENTIDENTIFIER ) )
            // InternalDomainmodel.g:3352:2: ( ruleELEMENTIDENTIFIER )
            {
            // InternalDomainmodel.g:3352:2: ( ruleELEMENTIDENTIFIER )
            // InternalDomainmodel.g:3353:3: ruleELEMENTIDENTIFIER
            {
             before(grammarAccess.getSELECTAccess().getIdentifierELEMENTIDENTIFIERParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleELEMENTIDENTIFIER();

            state._fsp--;

             after(grammarAccess.getSELECTAccess().getIdentifierELEMENTIDENTIFIERParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__SELECT__IdentifierAssignment_4"


    // $ANTLR start "rule__READ__NameAssignment_0"
    // InternalDomainmodel.g:3362:1: rule__READ__NameAssignment_0 : ( ( 'read' ) ) ;
    public final void rule__READ__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:3366:1: ( ( ( 'read' ) ) )
            // InternalDomainmodel.g:3367:2: ( ( 'read' ) )
            {
            // InternalDomainmodel.g:3367:2: ( ( 'read' ) )
            // InternalDomainmodel.g:3368:3: ( 'read' )
            {
             before(grammarAccess.getREADAccess().getNameReadKeyword_0_0()); 
            // InternalDomainmodel.g:3369:3: ( 'read' )
            // InternalDomainmodel.g:3370:4: 'read'
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


    // $ANTLR start "rule__READ__IdentifierAssignment_4"
    // InternalDomainmodel.g:3381:1: rule__READ__IdentifierAssignment_4 : ( ruleELEMENTIDENTIFIER ) ;
    public final void rule__READ__IdentifierAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:3385:1: ( ( ruleELEMENTIDENTIFIER ) )
            // InternalDomainmodel.g:3386:2: ( ruleELEMENTIDENTIFIER )
            {
            // InternalDomainmodel.g:3386:2: ( ruleELEMENTIDENTIFIER )
            // InternalDomainmodel.g:3387:3: ruleELEMENTIDENTIFIER
            {
             before(grammarAccess.getREADAccess().getIdentifierELEMENTIDENTIFIERParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleELEMENTIDENTIFIER();

            state._fsp--;

             after(grammarAccess.getREADAccess().getIdentifierELEMENTIDENTIFIERParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__READ__IdentifierAssignment_4"


    // $ANTLR start "rule__READ__SavePathAssignment_5"
    // InternalDomainmodel.g:3396:1: rule__READ__SavePathAssignment_5 : ( ruleSAVEVAR ) ;
    public final void rule__READ__SavePathAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:3400:1: ( ( ruleSAVEVAR ) )
            // InternalDomainmodel.g:3401:2: ( ruleSAVEVAR )
            {
            // InternalDomainmodel.g:3401:2: ( ruleSAVEVAR )
            // InternalDomainmodel.g:3402:3: ruleSAVEVAR
            {
             before(grammarAccess.getREADAccess().getSavePathSAVEVARParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleSAVEVAR();

            state._fsp--;

             after(grammarAccess.getREADAccess().getSavePathSAVEVARParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__READ__SavePathAssignment_5"


    // $ANTLR start "rule__ELEMENTIDENTIFIER__NameAssignment_0"
    // InternalDomainmodel.g:3411:1: rule__ELEMENTIDENTIFIER__NameAssignment_0 : ( ( 'identified' ) ) ;
    public final void rule__ELEMENTIDENTIFIER__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:3415:1: ( ( ( 'identified' ) ) )
            // InternalDomainmodel.g:3416:2: ( ( 'identified' ) )
            {
            // InternalDomainmodel.g:3416:2: ( ( 'identified' ) )
            // InternalDomainmodel.g:3417:3: ( 'identified' )
            {
             before(grammarAccess.getELEMENTIDENTIFIERAccess().getNameIdentifiedKeyword_0_0()); 
            // InternalDomainmodel.g:3418:3: ( 'identified' )
            // InternalDomainmodel.g:3419:4: 'identified'
            {
             before(grammarAccess.getELEMENTIDENTIFIERAccess().getNameIdentifiedKeyword_0_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getELEMENTIDENTIFIERAccess().getNameIdentifiedKeyword_0_0()); 

            }

             after(grammarAccess.getELEMENTIDENTIFIERAccess().getNameIdentifiedKeyword_0_0()); 

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
    // $ANTLR end "rule__ELEMENTIDENTIFIER__NameAssignment_0"


    // $ANTLR start "rule__ELEMENTIDENTIFIER__TypeAssignment_2"
    // InternalDomainmodel.g:3430:1: rule__ELEMENTIDENTIFIER__TypeAssignment_2 : ( ( rule__ELEMENTIDENTIFIER__TypeAlternatives_2_0 ) ) ;
    public final void rule__ELEMENTIDENTIFIER__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:3434:1: ( ( ( rule__ELEMENTIDENTIFIER__TypeAlternatives_2_0 ) ) )
            // InternalDomainmodel.g:3435:2: ( ( rule__ELEMENTIDENTIFIER__TypeAlternatives_2_0 ) )
            {
            // InternalDomainmodel.g:3435:2: ( ( rule__ELEMENTIDENTIFIER__TypeAlternatives_2_0 ) )
            // InternalDomainmodel.g:3436:3: ( rule__ELEMENTIDENTIFIER__TypeAlternatives_2_0 )
            {
             before(grammarAccess.getELEMENTIDENTIFIERAccess().getTypeAlternatives_2_0()); 
            // InternalDomainmodel.g:3437:3: ( rule__ELEMENTIDENTIFIER__TypeAlternatives_2_0 )
            // InternalDomainmodel.g:3437:4: rule__ELEMENTIDENTIFIER__TypeAlternatives_2_0
            {
            pushFollow(FOLLOW_2);
            rule__ELEMENTIDENTIFIER__TypeAlternatives_2_0();

            state._fsp--;


            }

             after(grammarAccess.getELEMENTIDENTIFIERAccess().getTypeAlternatives_2_0()); 

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
    // $ANTLR end "rule__ELEMENTIDENTIFIER__TypeAssignment_2"


    // $ANTLR start "rule__ELEMENTIDENTIFIER__ValueAssignment_3_0"
    // InternalDomainmodel.g:3445:1: rule__ELEMENTIDENTIFIER__ValueAssignment_3_0 : ( RULE_STRING ) ;
    public final void rule__ELEMENTIDENTIFIER__ValueAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:3449:1: ( ( RULE_STRING ) )
            // InternalDomainmodel.g:3450:2: ( RULE_STRING )
            {
            // InternalDomainmodel.g:3450:2: ( RULE_STRING )
            // InternalDomainmodel.g:3451:3: RULE_STRING
            {
             before(grammarAccess.getELEMENTIDENTIFIERAccess().getValueSTRINGTerminalRuleCall_3_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getELEMENTIDENTIFIERAccess().getValueSTRINGTerminalRuleCall_3_0_0()); 

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
    // $ANTLR end "rule__ELEMENTIDENTIFIER__ValueAssignment_3_0"


    // $ANTLR start "rule__ELEMENTIDENTIFIER__InfoAssignment_3_1_0"
    // InternalDomainmodel.g:3460:1: rule__ELEMENTIDENTIFIER__InfoAssignment_3_1_0 : ( ( 'given' ) ) ;
    public final void rule__ELEMENTIDENTIFIER__InfoAssignment_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:3464:1: ( ( ( 'given' ) ) )
            // InternalDomainmodel.g:3465:2: ( ( 'given' ) )
            {
            // InternalDomainmodel.g:3465:2: ( ( 'given' ) )
            // InternalDomainmodel.g:3466:3: ( 'given' )
            {
             before(grammarAccess.getELEMENTIDENTIFIERAccess().getInfoGivenKeyword_3_1_0_0()); 
            // InternalDomainmodel.g:3467:3: ( 'given' )
            // InternalDomainmodel.g:3468:4: 'given'
            {
             before(grammarAccess.getELEMENTIDENTIFIERAccess().getInfoGivenKeyword_3_1_0_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getELEMENTIDENTIFIERAccess().getInfoGivenKeyword_3_1_0_0()); 

            }

             after(grammarAccess.getELEMENTIDENTIFIERAccess().getInfoGivenKeyword_3_1_0_0()); 

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
    // $ANTLR end "rule__ELEMENTIDENTIFIER__InfoAssignment_3_1_0"


    // $ANTLR start "rule__ELEMENTIDENTIFIER__VarAssignment_3_1_1"
    // InternalDomainmodel.g:3479:1: rule__ELEMENTIDENTIFIER__VarAssignment_3_1_1 : ( RULE_VARTYPE ) ;
    public final void rule__ELEMENTIDENTIFIER__VarAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:3483:1: ( ( RULE_VARTYPE ) )
            // InternalDomainmodel.g:3484:2: ( RULE_VARTYPE )
            {
            // InternalDomainmodel.g:3484:2: ( RULE_VARTYPE )
            // InternalDomainmodel.g:3485:3: RULE_VARTYPE
            {
             before(grammarAccess.getELEMENTIDENTIFIERAccess().getVarVARTYPETerminalRuleCall_3_1_1_0()); 
            match(input,RULE_VARTYPE,FOLLOW_2); 
             after(grammarAccess.getELEMENTIDENTIFIERAccess().getVarVARTYPETerminalRuleCall_3_1_1_0()); 

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
    // $ANTLR end "rule__ELEMENTIDENTIFIER__VarAssignment_3_1_1"


    // $ANTLR start "rule__VERIFY_CONTAINS__TypeAssignment_2"
    // InternalDomainmodel.g:3494:1: rule__VERIFY_CONTAINS__TypeAssignment_2 : ( ( rule__VERIFY_CONTAINS__TypeAlternatives_2_0 ) ) ;
    public final void rule__VERIFY_CONTAINS__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:3498:1: ( ( ( rule__VERIFY_CONTAINS__TypeAlternatives_2_0 ) ) )
            // InternalDomainmodel.g:3499:2: ( ( rule__VERIFY_CONTAINS__TypeAlternatives_2_0 ) )
            {
            // InternalDomainmodel.g:3499:2: ( ( rule__VERIFY_CONTAINS__TypeAlternatives_2_0 ) )
            // InternalDomainmodel.g:3500:3: ( rule__VERIFY_CONTAINS__TypeAlternatives_2_0 )
            {
             before(grammarAccess.getVERIFY_CONTAINSAccess().getTypeAlternatives_2_0()); 
            // InternalDomainmodel.g:3501:3: ( rule__VERIFY_CONTAINS__TypeAlternatives_2_0 )
            // InternalDomainmodel.g:3501:4: rule__VERIFY_CONTAINS__TypeAlternatives_2_0
            {
            pushFollow(FOLLOW_2);
            rule__VERIFY_CONTAINS__TypeAlternatives_2_0();

            state._fsp--;


            }

             after(grammarAccess.getVERIFY_CONTAINSAccess().getTypeAlternatives_2_0()); 

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
    // $ANTLR end "rule__VERIFY_CONTAINS__TypeAssignment_2"


    // $ANTLR start "rule__VERIFY_CONTAINS__IdentifierAssignment_3"
    // InternalDomainmodel.g:3509:1: rule__VERIFY_CONTAINS__IdentifierAssignment_3 : ( ruleELEMENTIDENTIFIER ) ;
    public final void rule__VERIFY_CONTAINS__IdentifierAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:3513:1: ( ( ruleELEMENTIDENTIFIER ) )
            // InternalDomainmodel.g:3514:2: ( ruleELEMENTIDENTIFIER )
            {
            // InternalDomainmodel.g:3514:2: ( ruleELEMENTIDENTIFIER )
            // InternalDomainmodel.g:3515:3: ruleELEMENTIDENTIFIER
            {
             before(grammarAccess.getVERIFY_CONTAINSAccess().getIdentifierELEMENTIDENTIFIERParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleELEMENTIDENTIFIER();

            state._fsp--;

             after(grammarAccess.getVERIFY_CONTAINSAccess().getIdentifierELEMENTIDENTIFIERParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__VERIFY_CONTAINS__IdentifierAssignment_3"


    // $ANTLR start "rule__VERIFY_CONTAINS__ContainedIdentifierAssignment_5_0_1"
    // InternalDomainmodel.g:3524:1: rule__VERIFY_CONTAINS__ContainedIdentifierAssignment_5_0_1 : ( ruleELEMENTIDENTIFIER ) ;
    public final void rule__VERIFY_CONTAINS__ContainedIdentifierAssignment_5_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:3528:1: ( ( ruleELEMENTIDENTIFIER ) )
            // InternalDomainmodel.g:3529:2: ( ruleELEMENTIDENTIFIER )
            {
            // InternalDomainmodel.g:3529:2: ( ruleELEMENTIDENTIFIER )
            // InternalDomainmodel.g:3530:3: ruleELEMENTIDENTIFIER
            {
             before(grammarAccess.getVERIFY_CONTAINSAccess().getContainedIdentifierELEMENTIDENTIFIERParserRuleCall_5_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleELEMENTIDENTIFIER();

            state._fsp--;

             after(grammarAccess.getVERIFY_CONTAINSAccess().getContainedIdentifierELEMENTIDENTIFIERParserRuleCall_5_0_1_0()); 

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
    // $ANTLR end "rule__VERIFY_CONTAINS__ContainedIdentifierAssignment_5_0_1"


    // $ANTLR start "rule__VERIFY_CONTAINS__ValueAssignment_5_1_0"
    // InternalDomainmodel.g:3539:1: rule__VERIFY_CONTAINS__ValueAssignment_5_1_0 : ( RULE_STRING ) ;
    public final void rule__VERIFY_CONTAINS__ValueAssignment_5_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:3543:1: ( ( RULE_STRING ) )
            // InternalDomainmodel.g:3544:2: ( RULE_STRING )
            {
            // InternalDomainmodel.g:3544:2: ( RULE_STRING )
            // InternalDomainmodel.g:3545:3: RULE_STRING
            {
             before(grammarAccess.getVERIFY_CONTAINSAccess().getValueSTRINGTerminalRuleCall_5_1_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getVERIFY_CONTAINSAccess().getValueSTRINGTerminalRuleCall_5_1_0_0()); 

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
    // $ANTLR end "rule__VERIFY_CONTAINS__ValueAssignment_5_1_0"


    // $ANTLR start "rule__VERIFY_CONTAINS__VariableAssignment_5_1_1"
    // InternalDomainmodel.g:3554:1: rule__VERIFY_CONTAINS__VariableAssignment_5_1_1 : ( ruleREGISTERED_VALUE ) ;
    public final void rule__VERIFY_CONTAINS__VariableAssignment_5_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:3558:1: ( ( ruleREGISTERED_VALUE ) )
            // InternalDomainmodel.g:3559:2: ( ruleREGISTERED_VALUE )
            {
            // InternalDomainmodel.g:3559:2: ( ruleREGISTERED_VALUE )
            // InternalDomainmodel.g:3560:3: ruleREGISTERED_VALUE
            {
             before(grammarAccess.getVERIFY_CONTAINSAccess().getVariableREGISTERED_VALUEParserRuleCall_5_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleREGISTERED_VALUE();

            state._fsp--;

             after(grammarAccess.getVERIFY_CONTAINSAccess().getVariableREGISTERED_VALUEParserRuleCall_5_1_1_0()); 

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
    // $ANTLR end "rule__VERIFY_CONTAINS__VariableAssignment_5_1_1"


    // $ANTLR start "rule__VERIFY_EQUALS__OperationAssignment_2"
    // InternalDomainmodel.g:3569:1: rule__VERIFY_EQUALS__OperationAssignment_2 : ( ruleCOUNT ) ;
    public final void rule__VERIFY_EQUALS__OperationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:3573:1: ( ( ruleCOUNT ) )
            // InternalDomainmodel.g:3574:2: ( ruleCOUNT )
            {
            // InternalDomainmodel.g:3574:2: ( ruleCOUNT )
            // InternalDomainmodel.g:3575:3: ruleCOUNT
            {
             before(grammarAccess.getVERIFY_EQUALSAccess().getOperationCOUNTParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCOUNT();

            state._fsp--;

             after(grammarAccess.getVERIFY_EQUALSAccess().getOperationCOUNTParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__VERIFY_EQUALS__OperationAssignment_2"


    // $ANTLR start "rule__VERIFY_EQUALS__ValueAssignment_4_0"
    // InternalDomainmodel.g:3584:1: rule__VERIFY_EQUALS__ValueAssignment_4_0 : ( RULE_STRING ) ;
    public final void rule__VERIFY_EQUALS__ValueAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:3588:1: ( ( RULE_STRING ) )
            // InternalDomainmodel.g:3589:2: ( RULE_STRING )
            {
            // InternalDomainmodel.g:3589:2: ( RULE_STRING )
            // InternalDomainmodel.g:3590:3: RULE_STRING
            {
             before(grammarAccess.getVERIFY_EQUALSAccess().getValueSTRINGTerminalRuleCall_4_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getVERIFY_EQUALSAccess().getValueSTRINGTerminalRuleCall_4_0_0()); 

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
    // $ANTLR end "rule__VERIFY_EQUALS__ValueAssignment_4_0"


    // $ANTLR start "rule__VERIFY_EQUALS__RegisteredValueAssignment_4_1"
    // InternalDomainmodel.g:3599:1: rule__VERIFY_EQUALS__RegisteredValueAssignment_4_1 : ( ruleREGISTERED_VALUE ) ;
    public final void rule__VERIFY_EQUALS__RegisteredValueAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:3603:1: ( ( ruleREGISTERED_VALUE ) )
            // InternalDomainmodel.g:3604:2: ( ruleREGISTERED_VALUE )
            {
            // InternalDomainmodel.g:3604:2: ( ruleREGISTERED_VALUE )
            // InternalDomainmodel.g:3605:3: ruleREGISTERED_VALUE
            {
             before(grammarAccess.getVERIFY_EQUALSAccess().getRegisteredValueREGISTERED_VALUEParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleREGISTERED_VALUE();

            state._fsp--;

             after(grammarAccess.getVERIFY_EQUALSAccess().getRegisteredValueREGISTERED_VALUEParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__VERIFY_EQUALS__RegisteredValueAssignment_4_1"


    // $ANTLR start "rule__REGISTERED_VALUE__VarAssignment_1"
    // InternalDomainmodel.g:3614:1: rule__REGISTERED_VALUE__VarAssignment_1 : ( RULE_VARTYPE ) ;
    public final void rule__REGISTERED_VALUE__VarAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:3618:1: ( ( RULE_VARTYPE ) )
            // InternalDomainmodel.g:3619:2: ( RULE_VARTYPE )
            {
            // InternalDomainmodel.g:3619:2: ( RULE_VARTYPE )
            // InternalDomainmodel.g:3620:3: RULE_VARTYPE
            {
             before(grammarAccess.getREGISTERED_VALUEAccess().getVarVARTYPETerminalRuleCall_1_0()); 
            match(input,RULE_VARTYPE,FOLLOW_2); 
             after(grammarAccess.getREGISTERED_VALUEAccess().getVarVARTYPETerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__REGISTERED_VALUE__VarAssignment_1"


    // $ANTLR start "rule__COUNT__NameAssignment_0"
    // InternalDomainmodel.g:3629:1: rule__COUNT__NameAssignment_0 : ( ( 'count' ) ) ;
    public final void rule__COUNT__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:3633:1: ( ( ( 'count' ) ) )
            // InternalDomainmodel.g:3634:2: ( ( 'count' ) )
            {
            // InternalDomainmodel.g:3634:2: ( ( 'count' ) )
            // InternalDomainmodel.g:3635:3: ( 'count' )
            {
             before(grammarAccess.getCOUNTAccess().getNameCountKeyword_0_0()); 
            // InternalDomainmodel.g:3636:3: ( 'count' )
            // InternalDomainmodel.g:3637:4: 'count'
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


    // $ANTLR start "rule__COUNT__IdentifierAssignment_2"
    // InternalDomainmodel.g:3648:1: rule__COUNT__IdentifierAssignment_2 : ( ruleELEMENTIDENTIFIER ) ;
    public final void rule__COUNT__IdentifierAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:3652:1: ( ( ruleELEMENTIDENTIFIER ) )
            // InternalDomainmodel.g:3653:2: ( ruleELEMENTIDENTIFIER )
            {
            // InternalDomainmodel.g:3653:2: ( ruleELEMENTIDENTIFIER )
            // InternalDomainmodel.g:3654:3: ruleELEMENTIDENTIFIER
            {
             before(grammarAccess.getCOUNTAccess().getIdentifierELEMENTIDENTIFIERParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleELEMENTIDENTIFIER();

            state._fsp--;

             after(grammarAccess.getCOUNTAccess().getIdentifierELEMENTIDENTIFIERParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__COUNT__IdentifierAssignment_2"


    // $ANTLR start "rule__COUNT__SaveVariableAssignment_3"
    // InternalDomainmodel.g:3663:1: rule__COUNT__SaveVariableAssignment_3 : ( ruleSAVEVAR ) ;
    public final void rule__COUNT__SaveVariableAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:3667:1: ( ( ruleSAVEVAR ) )
            // InternalDomainmodel.g:3668:2: ( ruleSAVEVAR )
            {
            // InternalDomainmodel.g:3668:2: ( ruleSAVEVAR )
            // InternalDomainmodel.g:3669:3: ruleSAVEVAR
            {
             before(grammarAccess.getCOUNTAccess().getSaveVariableSAVEVARParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleSAVEVAR();

            state._fsp--;

             after(grammarAccess.getCOUNTAccess().getSaveVariableSAVEVARParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__COUNT__SaveVariableAssignment_3"


    // $ANTLR start "rule__SAVEVAR__VarAssignment_3"
    // InternalDomainmodel.g:3678:1: rule__SAVEVAR__VarAssignment_3 : ( RULE_VARTYPE ) ;
    public final void rule__SAVEVAR__VarAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:3682:1: ( ( RULE_VARTYPE ) )
            // InternalDomainmodel.g:3683:2: ( RULE_VARTYPE )
            {
            // InternalDomainmodel.g:3683:2: ( RULE_VARTYPE )
            // InternalDomainmodel.g:3684:3: RULE_VARTYPE
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
    // InternalDomainmodel.g:3693:1: rule__PLAY__NameAssignment_0 : ( ( 'play' ) ) ;
    public final void rule__PLAY__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:3697:1: ( ( ( 'play' ) ) )
            // InternalDomainmodel.g:3698:2: ( ( 'play' ) )
            {
            // InternalDomainmodel.g:3698:2: ( ( 'play' ) )
            // InternalDomainmodel.g:3699:3: ( 'play' )
            {
             before(grammarAccess.getPLAYAccess().getNamePlayKeyword_0_0()); 
            // InternalDomainmodel.g:3700:3: ( 'play' )
            // InternalDomainmodel.g:3701:4: 'play'
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


    // $ANTLR start "rule__PLAY__PreocedureAssignment_2"
    // InternalDomainmodel.g:3712:1: rule__PLAY__PreocedureAssignment_2 : ( RULE_VARTYPE ) ;
    public final void rule__PLAY__PreocedureAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:3716:1: ( ( RULE_VARTYPE ) )
            // InternalDomainmodel.g:3717:2: ( RULE_VARTYPE )
            {
            // InternalDomainmodel.g:3717:2: ( RULE_VARTYPE )
            // InternalDomainmodel.g:3718:3: RULE_VARTYPE
            {
             before(grammarAccess.getPLAYAccess().getPreocedureVARTYPETerminalRuleCall_2_0()); 
            match(input,RULE_VARTYPE,FOLLOW_2); 
             after(grammarAccess.getPLAYAccess().getPreocedureVARTYPETerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__PLAY__PreocedureAssignment_2"


    // $ANTLR start "rule__PLAY__ParamsAssignment_3"
    // InternalDomainmodel.g:3727:1: rule__PLAY__ParamsAssignment_3 : ( RULE_STRING ) ;
    public final void rule__PLAY__ParamsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:3731:1: ( ( RULE_STRING ) )
            // InternalDomainmodel.g:3732:2: ( RULE_STRING )
            {
            // InternalDomainmodel.g:3732:2: ( RULE_STRING )
            // InternalDomainmodel.g:3733:3: RULE_STRING
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
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x006EF81004000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x006EF81000000002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000008000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000000000003C000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0010000004000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000020000020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0001000040000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000F00000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000001020000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0010004000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000020018020L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000022L});

}