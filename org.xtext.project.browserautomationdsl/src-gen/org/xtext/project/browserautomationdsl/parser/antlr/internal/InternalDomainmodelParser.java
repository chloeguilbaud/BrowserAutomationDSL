package org.xtext.project.browserautomationdsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.project.browserautomationdsl.services.DomainmodelGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDomainmodelParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_VARTYPE", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'procedure'", "'with'", "'open'", "'FIREFOX'", "'CHROME'", "'go to'", "'given'", "'click'", "'on'", "'BUTTON'", "'LINK'", "'IMAGE'", "'TEXT'", "'fill'", "'TEXTFIELD'", "'SEARCHFIELD'", "'saved'", "'check'", "'all'", "'CHECKBOX'", "'uncheck'", "'select'", "'in'", "'COMBOBOX'", "'read'", "'url'", "'from'", "'identified'", "'by'", "'LABEL'", "'CLASS'", "'ID'", "'ALT'", "'verify'", "'that'", "'PAGE'", "'contains'", "'equals'", "'count'", "'ELEMENT'", "'and'", "'save'", "'play'"
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

        public InternalDomainmodelParser(TokenStream input, DomainmodelGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "PROGRAMME";
       	}

       	@Override
       	protected DomainmodelGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRulePROGRAMME"
    // InternalDomainmodel.g:64:1: entryRulePROGRAMME returns [EObject current=null] : iv_rulePROGRAMME= rulePROGRAMME EOF ;
    public final EObject entryRulePROGRAMME() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePROGRAMME = null;


        try {
            // InternalDomainmodel.g:64:50: (iv_rulePROGRAMME= rulePROGRAMME EOF )
            // InternalDomainmodel.g:65:2: iv_rulePROGRAMME= rulePROGRAMME EOF
            {
             newCompositeNode(grammarAccess.getPROGRAMMERule()); 
            pushFollow(FOLLOW_1);
            iv_rulePROGRAMME=rulePROGRAMME();

            state._fsp--;

             current =iv_rulePROGRAMME; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePROGRAMME"


    // $ANTLR start "rulePROGRAMME"
    // InternalDomainmodel.g:71:1: rulePROGRAMME returns [EObject current=null] : ( (lv_procedures_0_0= rulePROCEDURE ) )* ;
    public final EObject rulePROGRAMME() throws RecognitionException {
        EObject current = null;

        EObject lv_procedures_0_0 = null;



        	enterRule();

        try {
            // InternalDomainmodel.g:77:2: ( ( (lv_procedures_0_0= rulePROCEDURE ) )* )
            // InternalDomainmodel.g:78:2: ( (lv_procedures_0_0= rulePROCEDURE ) )*
            {
            // InternalDomainmodel.g:78:2: ( (lv_procedures_0_0= rulePROCEDURE ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDomainmodel.g:79:3: (lv_procedures_0_0= rulePROCEDURE )
            	    {
            	    // InternalDomainmodel.g:79:3: (lv_procedures_0_0= rulePROCEDURE )
            	    // InternalDomainmodel.g:80:4: lv_procedures_0_0= rulePROCEDURE
            	    {

            	    				newCompositeNode(grammarAccess.getPROGRAMMEAccess().getProceduresPROCEDUREParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_procedures_0_0=rulePROCEDURE();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getPROGRAMMERule());
            	    				}
            	    				add(
            	    					current,
            	    					"procedures",
            	    					lv_procedures_0_0,
            	    					"org.xtext.project.browserautomationdsl.Domainmodel.PROCEDURE");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePROGRAMME"


    // $ANTLR start "entryRulePROCEDURE"
    // InternalDomainmodel.g:100:1: entryRulePROCEDURE returns [EObject current=null] : iv_rulePROCEDURE= rulePROCEDURE EOF ;
    public final EObject entryRulePROCEDURE() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePROCEDURE = null;


        try {
            // InternalDomainmodel.g:100:50: (iv_rulePROCEDURE= rulePROCEDURE EOF )
            // InternalDomainmodel.g:101:2: iv_rulePROCEDURE= rulePROCEDURE EOF
            {
             newCompositeNode(grammarAccess.getPROCEDURERule()); 
            pushFollow(FOLLOW_1);
            iv_rulePROCEDURE=rulePROCEDURE();

            state._fsp--;

             current =iv_rulePROCEDURE; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePROCEDURE"


    // $ANTLR start "rulePROCEDURE"
    // InternalDomainmodel.g:107:1: rulePROCEDURE returns [EObject current=null] : (otherlv_0= 'procedure' ( (lv_name_1_0= RULE_VARTYPE ) ) (otherlv_2= 'with' ( (lv_param_3_0= RULE_VARTYPE ) ) ( (lv_params_4_0= RULE_VARTYPE ) )* )? ( (lv_inst_5_0= ruleINSTRUCTION ) )* ) ;
    public final EObject rulePROCEDURE() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_param_3_0=null;
        Token lv_params_4_0=null;
        EObject lv_inst_5_0 = null;



        	enterRule();

        try {
            // InternalDomainmodel.g:113:2: ( (otherlv_0= 'procedure' ( (lv_name_1_0= RULE_VARTYPE ) ) (otherlv_2= 'with' ( (lv_param_3_0= RULE_VARTYPE ) ) ( (lv_params_4_0= RULE_VARTYPE ) )* )? ( (lv_inst_5_0= ruleINSTRUCTION ) )* ) )
            // InternalDomainmodel.g:114:2: (otherlv_0= 'procedure' ( (lv_name_1_0= RULE_VARTYPE ) ) (otherlv_2= 'with' ( (lv_param_3_0= RULE_VARTYPE ) ) ( (lv_params_4_0= RULE_VARTYPE ) )* )? ( (lv_inst_5_0= ruleINSTRUCTION ) )* )
            {
            // InternalDomainmodel.g:114:2: (otherlv_0= 'procedure' ( (lv_name_1_0= RULE_VARTYPE ) ) (otherlv_2= 'with' ( (lv_param_3_0= RULE_VARTYPE ) ) ( (lv_params_4_0= RULE_VARTYPE ) )* )? ( (lv_inst_5_0= ruleINSTRUCTION ) )* )
            // InternalDomainmodel.g:115:3: otherlv_0= 'procedure' ( (lv_name_1_0= RULE_VARTYPE ) ) (otherlv_2= 'with' ( (lv_param_3_0= RULE_VARTYPE ) ) ( (lv_params_4_0= RULE_VARTYPE ) )* )? ( (lv_inst_5_0= ruleINSTRUCTION ) )*
            {
            otherlv_0=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPROCEDUREAccess().getProcedureKeyword_0());
            		
            // InternalDomainmodel.g:119:3: ( (lv_name_1_0= RULE_VARTYPE ) )
            // InternalDomainmodel.g:120:4: (lv_name_1_0= RULE_VARTYPE )
            {
            // InternalDomainmodel.g:120:4: (lv_name_1_0= RULE_VARTYPE )
            // InternalDomainmodel.g:121:5: lv_name_1_0= RULE_VARTYPE
            {
            lv_name_1_0=(Token)match(input,RULE_VARTYPE,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPROCEDUREAccess().getNameVARTYPETerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPROCEDURERule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.project.browserautomationdsl.Domainmodel.VARTYPE");
            				

            }


            }

            // InternalDomainmodel.g:137:3: (otherlv_2= 'with' ( (lv_param_3_0= RULE_VARTYPE ) ) ( (lv_params_4_0= RULE_VARTYPE ) )* )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalDomainmodel.g:138:4: otherlv_2= 'with' ( (lv_param_3_0= RULE_VARTYPE ) ) ( (lv_params_4_0= RULE_VARTYPE ) )*
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getPROCEDUREAccess().getWithKeyword_2_0());
                    			
                    // InternalDomainmodel.g:142:4: ( (lv_param_3_0= RULE_VARTYPE ) )
                    // InternalDomainmodel.g:143:5: (lv_param_3_0= RULE_VARTYPE )
                    {
                    // InternalDomainmodel.g:143:5: (lv_param_3_0= RULE_VARTYPE )
                    // InternalDomainmodel.g:144:6: lv_param_3_0= RULE_VARTYPE
                    {
                    lv_param_3_0=(Token)match(input,RULE_VARTYPE,FOLLOW_6); 

                    						newLeafNode(lv_param_3_0, grammarAccess.getPROCEDUREAccess().getParamVARTYPETerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPROCEDURERule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"param",
                    							lv_param_3_0,
                    							"org.xtext.project.browserautomationdsl.Domainmodel.VARTYPE");
                    					

                    }


                    }

                    // InternalDomainmodel.g:160:4: ( (lv_params_4_0= RULE_VARTYPE ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==RULE_VARTYPE) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalDomainmodel.g:161:5: (lv_params_4_0= RULE_VARTYPE )
                    	    {
                    	    // InternalDomainmodel.g:161:5: (lv_params_4_0= RULE_VARTYPE )
                    	    // InternalDomainmodel.g:162:6: lv_params_4_0= RULE_VARTYPE
                    	    {
                    	    lv_params_4_0=(Token)match(input,RULE_VARTYPE,FOLLOW_6); 

                    	    						newLeafNode(lv_params_4_0, grammarAccess.getPROCEDUREAccess().getParamsVARTYPETerminalRuleCall_2_2_0());
                    	    					

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getPROCEDURERule());
                    	    						}
                    	    						addWithLastConsumed(
                    	    							current,
                    	    							"params",
                    	    							lv_params_4_0,
                    	    							"org.xtext.project.browserautomationdsl.Domainmodel.VARTYPE");
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalDomainmodel.g:179:3: ( (lv_inst_5_0= ruleINSTRUCTION ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==14||LA4_0==17||LA4_0==19||LA4_0==25||LA4_0==29||(LA4_0>=32 && LA4_0<=33)||LA4_0==36||LA4_0==45||LA4_0==50||LA4_0==54) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalDomainmodel.g:180:4: (lv_inst_5_0= ruleINSTRUCTION )
            	    {
            	    // InternalDomainmodel.g:180:4: (lv_inst_5_0= ruleINSTRUCTION )
            	    // InternalDomainmodel.g:181:5: lv_inst_5_0= ruleINSTRUCTION
            	    {

            	    					newCompositeNode(grammarAccess.getPROCEDUREAccess().getInstINSTRUCTIONParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_inst_5_0=ruleINSTRUCTION();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPROCEDURERule());
            	    					}
            	    					add(
            	    						current,
            	    						"inst",
            	    						lv_inst_5_0,
            	    						"org.xtext.project.browserautomationdsl.Domainmodel.INSTRUCTION");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePROCEDURE"


    // $ANTLR start "entryRuleINSTRUCTION"
    // InternalDomainmodel.g:202:1: entryRuleINSTRUCTION returns [EObject current=null] : iv_ruleINSTRUCTION= ruleINSTRUCTION EOF ;
    public final EObject entryRuleINSTRUCTION() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleINSTRUCTION = null;


        try {
            // InternalDomainmodel.g:202:52: (iv_ruleINSTRUCTION= ruleINSTRUCTION EOF )
            // InternalDomainmodel.g:203:2: iv_ruleINSTRUCTION= ruleINSTRUCTION EOF
            {
             newCompositeNode(grammarAccess.getINSTRUCTIONRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleINSTRUCTION=ruleINSTRUCTION();

            state._fsp--;

             current =iv_ruleINSTRUCTION; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleINSTRUCTION"


    // $ANTLR start "ruleINSTRUCTION"
    // InternalDomainmodel.g:209:1: ruleINSTRUCTION returns [EObject current=null] : (this_OPEN_0= ruleOPEN | this_CLICK_1= ruleCLICK | this_CHECK_2= ruleCHECK | this_UNCHECK_3= ruleUNCHECK | this_READ_4= ruleREAD | this_COUNT_5= ruleCOUNT | this_VERIFY_6= ruleVERIFY | this_SELECT_7= ruleSELECT | this_GOTO_8= ruleGOTO | this_FILL_9= ruleFILL | this_PLAY_10= rulePLAY ) ;
    public final EObject ruleINSTRUCTION() throws RecognitionException {
        EObject current = null;

        EObject this_OPEN_0 = null;

        EObject this_CLICK_1 = null;

        EObject this_CHECK_2 = null;

        EObject this_UNCHECK_3 = null;

        EObject this_READ_4 = null;

        EObject this_COUNT_5 = null;

        EObject this_VERIFY_6 = null;

        EObject this_SELECT_7 = null;

        EObject this_GOTO_8 = null;

        EObject this_FILL_9 = null;

        EObject this_PLAY_10 = null;



        	enterRule();

        try {
            // InternalDomainmodel.g:215:2: ( (this_OPEN_0= ruleOPEN | this_CLICK_1= ruleCLICK | this_CHECK_2= ruleCHECK | this_UNCHECK_3= ruleUNCHECK | this_READ_4= ruleREAD | this_COUNT_5= ruleCOUNT | this_VERIFY_6= ruleVERIFY | this_SELECT_7= ruleSELECT | this_GOTO_8= ruleGOTO | this_FILL_9= ruleFILL | this_PLAY_10= rulePLAY ) )
            // InternalDomainmodel.g:216:2: (this_OPEN_0= ruleOPEN | this_CLICK_1= ruleCLICK | this_CHECK_2= ruleCHECK | this_UNCHECK_3= ruleUNCHECK | this_READ_4= ruleREAD | this_COUNT_5= ruleCOUNT | this_VERIFY_6= ruleVERIFY | this_SELECT_7= ruleSELECT | this_GOTO_8= ruleGOTO | this_FILL_9= ruleFILL | this_PLAY_10= rulePLAY )
            {
            // InternalDomainmodel.g:216:2: (this_OPEN_0= ruleOPEN | this_CLICK_1= ruleCLICK | this_CHECK_2= ruleCHECK | this_UNCHECK_3= ruleUNCHECK | this_READ_4= ruleREAD | this_COUNT_5= ruleCOUNT | this_VERIFY_6= ruleVERIFY | this_SELECT_7= ruleSELECT | this_GOTO_8= ruleGOTO | this_FILL_9= ruleFILL | this_PLAY_10= rulePLAY )
            int alt5=11;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt5=1;
                }
                break;
            case 19:
                {
                alt5=2;
                }
                break;
            case 29:
                {
                alt5=3;
                }
                break;
            case 32:
                {
                alt5=4;
                }
                break;
            case 36:
                {
                alt5=5;
                }
                break;
            case 50:
                {
                alt5=6;
                }
                break;
            case 45:
                {
                alt5=7;
                }
                break;
            case 33:
                {
                alt5=8;
                }
                break;
            case 17:
                {
                alt5=9;
                }
                break;
            case 25:
                {
                alt5=10;
                }
                break;
            case 54:
                {
                alt5=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalDomainmodel.g:217:3: this_OPEN_0= ruleOPEN
                    {

                    			newCompositeNode(grammarAccess.getINSTRUCTIONAccess().getOPENParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_OPEN_0=ruleOPEN();

                    state._fsp--;


                    			current = this_OPEN_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDomainmodel.g:226:3: this_CLICK_1= ruleCLICK
                    {

                    			newCompositeNode(grammarAccess.getINSTRUCTIONAccess().getCLICKParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_CLICK_1=ruleCLICK();

                    state._fsp--;


                    			current = this_CLICK_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalDomainmodel.g:235:3: this_CHECK_2= ruleCHECK
                    {

                    			newCompositeNode(grammarAccess.getINSTRUCTIONAccess().getCHECKParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_CHECK_2=ruleCHECK();

                    state._fsp--;


                    			current = this_CHECK_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalDomainmodel.g:244:3: this_UNCHECK_3= ruleUNCHECK
                    {

                    			newCompositeNode(grammarAccess.getINSTRUCTIONAccess().getUNCHECKParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_UNCHECK_3=ruleUNCHECK();

                    state._fsp--;


                    			current = this_UNCHECK_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalDomainmodel.g:253:3: this_READ_4= ruleREAD
                    {

                    			newCompositeNode(grammarAccess.getINSTRUCTIONAccess().getREADParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_READ_4=ruleREAD();

                    state._fsp--;


                    			current = this_READ_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalDomainmodel.g:262:3: this_COUNT_5= ruleCOUNT
                    {

                    			newCompositeNode(grammarAccess.getINSTRUCTIONAccess().getCOUNTParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_COUNT_5=ruleCOUNT();

                    state._fsp--;


                    			current = this_COUNT_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalDomainmodel.g:271:3: this_VERIFY_6= ruleVERIFY
                    {

                    			newCompositeNode(grammarAccess.getINSTRUCTIONAccess().getVERIFYParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_VERIFY_6=ruleVERIFY();

                    state._fsp--;


                    			current = this_VERIFY_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalDomainmodel.g:280:3: this_SELECT_7= ruleSELECT
                    {

                    			newCompositeNode(grammarAccess.getINSTRUCTIONAccess().getSELECTParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_SELECT_7=ruleSELECT();

                    state._fsp--;


                    			current = this_SELECT_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalDomainmodel.g:289:3: this_GOTO_8= ruleGOTO
                    {

                    			newCompositeNode(grammarAccess.getINSTRUCTIONAccess().getGOTOParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_GOTO_8=ruleGOTO();

                    state._fsp--;


                    			current = this_GOTO_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalDomainmodel.g:298:3: this_FILL_9= ruleFILL
                    {

                    			newCompositeNode(grammarAccess.getINSTRUCTIONAccess().getFILLParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_FILL_9=ruleFILL();

                    state._fsp--;


                    			current = this_FILL_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 11 :
                    // InternalDomainmodel.g:307:3: this_PLAY_10= rulePLAY
                    {

                    			newCompositeNode(grammarAccess.getINSTRUCTIONAccess().getPLAYParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_PLAY_10=rulePLAY();

                    state._fsp--;


                    			current = this_PLAY_10;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleINSTRUCTION"


    // $ANTLR start "entryRuleOPEN"
    // InternalDomainmodel.g:319:1: entryRuleOPEN returns [EObject current=null] : iv_ruleOPEN= ruleOPEN EOF ;
    public final EObject entryRuleOPEN() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOPEN = null;


        try {
            // InternalDomainmodel.g:319:45: (iv_ruleOPEN= ruleOPEN EOF )
            // InternalDomainmodel.g:320:2: iv_ruleOPEN= ruleOPEN EOF
            {
             newCompositeNode(grammarAccess.getOPENRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOPEN=ruleOPEN();

            state._fsp--;

             current =iv_ruleOPEN; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOPEN"


    // $ANTLR start "ruleOPEN"
    // InternalDomainmodel.g:326:1: ruleOPEN returns [EObject current=null] : ( ( (lv_name_0_0= 'open' ) ) ( ( (lv_value_1_1= 'FIREFOX' | lv_value_1_2= 'CHROME' ) ) ) ) ;
    public final EObject ruleOPEN() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_value_1_1=null;
        Token lv_value_1_2=null;


        	enterRule();

        try {
            // InternalDomainmodel.g:332:2: ( ( ( (lv_name_0_0= 'open' ) ) ( ( (lv_value_1_1= 'FIREFOX' | lv_value_1_2= 'CHROME' ) ) ) ) )
            // InternalDomainmodel.g:333:2: ( ( (lv_name_0_0= 'open' ) ) ( ( (lv_value_1_1= 'FIREFOX' | lv_value_1_2= 'CHROME' ) ) ) )
            {
            // InternalDomainmodel.g:333:2: ( ( (lv_name_0_0= 'open' ) ) ( ( (lv_value_1_1= 'FIREFOX' | lv_value_1_2= 'CHROME' ) ) ) )
            // InternalDomainmodel.g:334:3: ( (lv_name_0_0= 'open' ) ) ( ( (lv_value_1_1= 'FIREFOX' | lv_value_1_2= 'CHROME' ) ) )
            {
            // InternalDomainmodel.g:334:3: ( (lv_name_0_0= 'open' ) )
            // InternalDomainmodel.g:335:4: (lv_name_0_0= 'open' )
            {
            // InternalDomainmodel.g:335:4: (lv_name_0_0= 'open' )
            // InternalDomainmodel.g:336:5: lv_name_0_0= 'open'
            {
            lv_name_0_0=(Token)match(input,14,FOLLOW_8); 

            					newLeafNode(lv_name_0_0, grammarAccess.getOPENAccess().getNameOpenKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOPENRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "open");
            				

            }


            }

            // InternalDomainmodel.g:348:3: ( ( (lv_value_1_1= 'FIREFOX' | lv_value_1_2= 'CHROME' ) ) )
            // InternalDomainmodel.g:349:4: ( (lv_value_1_1= 'FIREFOX' | lv_value_1_2= 'CHROME' ) )
            {
            // InternalDomainmodel.g:349:4: ( (lv_value_1_1= 'FIREFOX' | lv_value_1_2= 'CHROME' ) )
            // InternalDomainmodel.g:350:5: (lv_value_1_1= 'FIREFOX' | lv_value_1_2= 'CHROME' )
            {
            // InternalDomainmodel.g:350:5: (lv_value_1_1= 'FIREFOX' | lv_value_1_2= 'CHROME' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            else if ( (LA6_0==16) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalDomainmodel.g:351:6: lv_value_1_1= 'FIREFOX'
                    {
                    lv_value_1_1=(Token)match(input,15,FOLLOW_2); 

                    						newLeafNode(lv_value_1_1, grammarAccess.getOPENAccess().getValueFIREFOXKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOPENRule());
                    						}
                    						setWithLastConsumed(current, "value", lv_value_1_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalDomainmodel.g:362:6: lv_value_1_2= 'CHROME'
                    {
                    lv_value_1_2=(Token)match(input,16,FOLLOW_2); 

                    						newLeafNode(lv_value_1_2, grammarAccess.getOPENAccess().getValueCHROMEKeyword_1_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOPENRule());
                    						}
                    						setWithLastConsumed(current, "value", lv_value_1_2, null);
                    					

                    }
                    break;

            }


            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOPEN"


    // $ANTLR start "entryRuleGOTO"
    // InternalDomainmodel.g:379:1: entryRuleGOTO returns [EObject current=null] : iv_ruleGOTO= ruleGOTO EOF ;
    public final EObject entryRuleGOTO() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGOTO = null;


        try {
            // InternalDomainmodel.g:379:45: (iv_ruleGOTO= ruleGOTO EOF )
            // InternalDomainmodel.g:380:2: iv_ruleGOTO= ruleGOTO EOF
            {
             newCompositeNode(grammarAccess.getGOTORule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGOTO=ruleGOTO();

            state._fsp--;

             current =iv_ruleGOTO; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGOTO"


    // $ANTLR start "ruleGOTO"
    // InternalDomainmodel.g:386:1: ruleGOTO returns [EObject current=null] : ( ( (lv_name_0_0= 'go to' ) ) (otherlv_1= 'given' )? ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleGOTO() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalDomainmodel.g:392:2: ( ( ( (lv_name_0_0= 'go to' ) ) (otherlv_1= 'given' )? ( (lv_value_2_0= RULE_STRING ) ) ) )
            // InternalDomainmodel.g:393:2: ( ( (lv_name_0_0= 'go to' ) ) (otherlv_1= 'given' )? ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // InternalDomainmodel.g:393:2: ( ( (lv_name_0_0= 'go to' ) ) (otherlv_1= 'given' )? ( (lv_value_2_0= RULE_STRING ) ) )
            // InternalDomainmodel.g:394:3: ( (lv_name_0_0= 'go to' ) ) (otherlv_1= 'given' )? ( (lv_value_2_0= RULE_STRING ) )
            {
            // InternalDomainmodel.g:394:3: ( (lv_name_0_0= 'go to' ) )
            // InternalDomainmodel.g:395:4: (lv_name_0_0= 'go to' )
            {
            // InternalDomainmodel.g:395:4: (lv_name_0_0= 'go to' )
            // InternalDomainmodel.g:396:5: lv_name_0_0= 'go to'
            {
            lv_name_0_0=(Token)match(input,17,FOLLOW_9); 

            					newLeafNode(lv_name_0_0, grammarAccess.getGOTOAccess().getNameGoToKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGOTORule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "go to");
            				

            }


            }

            // InternalDomainmodel.g:408:3: (otherlv_1= 'given' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalDomainmodel.g:409:4: otherlv_1= 'given'
                    {
                    otherlv_1=(Token)match(input,18,FOLLOW_10); 

                    				newLeafNode(otherlv_1, grammarAccess.getGOTOAccess().getGivenKeyword_1());
                    			

                    }
                    break;

            }

            // InternalDomainmodel.g:414:3: ( (lv_value_2_0= RULE_STRING ) )
            // InternalDomainmodel.g:415:4: (lv_value_2_0= RULE_STRING )
            {
            // InternalDomainmodel.g:415:4: (lv_value_2_0= RULE_STRING )
            // InternalDomainmodel.g:416:5: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_value_2_0, grammarAccess.getGOTOAccess().getValueSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGOTORule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGOTO"


    // $ANTLR start "entryRuleCLICK"
    // InternalDomainmodel.g:436:1: entryRuleCLICK returns [EObject current=null] : iv_ruleCLICK= ruleCLICK EOF ;
    public final EObject entryRuleCLICK() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCLICK = null;


        try {
            // InternalDomainmodel.g:436:46: (iv_ruleCLICK= ruleCLICK EOF )
            // InternalDomainmodel.g:437:2: iv_ruleCLICK= ruleCLICK EOF
            {
             newCompositeNode(grammarAccess.getCLICKRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCLICK=ruleCLICK();

            state._fsp--;

             current =iv_ruleCLICK; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCLICK"


    // $ANTLR start "ruleCLICK"
    // InternalDomainmodel.g:443:1: ruleCLICK returns [EObject current=null] : ( ( (lv_name_0_0= 'click' ) ) otherlv_1= 'on' ( ( (lv_type_2_1= 'BUTTON' | lv_type_2_2= 'LINK' | lv_type_2_3= 'IMAGE' | lv_type_2_4= 'TEXT' ) ) ) ( (lv_identifier_3_0= ruleELEMENTIDENTIFIER ) ) ) ;
    public final EObject ruleCLICK() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_type_2_1=null;
        Token lv_type_2_2=null;
        Token lv_type_2_3=null;
        Token lv_type_2_4=null;
        EObject lv_identifier_3_0 = null;



        	enterRule();

        try {
            // InternalDomainmodel.g:449:2: ( ( ( (lv_name_0_0= 'click' ) ) otherlv_1= 'on' ( ( (lv_type_2_1= 'BUTTON' | lv_type_2_2= 'LINK' | lv_type_2_3= 'IMAGE' | lv_type_2_4= 'TEXT' ) ) ) ( (lv_identifier_3_0= ruleELEMENTIDENTIFIER ) ) ) )
            // InternalDomainmodel.g:450:2: ( ( (lv_name_0_0= 'click' ) ) otherlv_1= 'on' ( ( (lv_type_2_1= 'BUTTON' | lv_type_2_2= 'LINK' | lv_type_2_3= 'IMAGE' | lv_type_2_4= 'TEXT' ) ) ) ( (lv_identifier_3_0= ruleELEMENTIDENTIFIER ) ) )
            {
            // InternalDomainmodel.g:450:2: ( ( (lv_name_0_0= 'click' ) ) otherlv_1= 'on' ( ( (lv_type_2_1= 'BUTTON' | lv_type_2_2= 'LINK' | lv_type_2_3= 'IMAGE' | lv_type_2_4= 'TEXT' ) ) ) ( (lv_identifier_3_0= ruleELEMENTIDENTIFIER ) ) )
            // InternalDomainmodel.g:451:3: ( (lv_name_0_0= 'click' ) ) otherlv_1= 'on' ( ( (lv_type_2_1= 'BUTTON' | lv_type_2_2= 'LINK' | lv_type_2_3= 'IMAGE' | lv_type_2_4= 'TEXT' ) ) ) ( (lv_identifier_3_0= ruleELEMENTIDENTIFIER ) )
            {
            // InternalDomainmodel.g:451:3: ( (lv_name_0_0= 'click' ) )
            // InternalDomainmodel.g:452:4: (lv_name_0_0= 'click' )
            {
            // InternalDomainmodel.g:452:4: (lv_name_0_0= 'click' )
            // InternalDomainmodel.g:453:5: lv_name_0_0= 'click'
            {
            lv_name_0_0=(Token)match(input,19,FOLLOW_11); 

            					newLeafNode(lv_name_0_0, grammarAccess.getCLICKAccess().getNameClickKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCLICKRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "click");
            				

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getCLICKAccess().getOnKeyword_1());
            		
            // InternalDomainmodel.g:469:3: ( ( (lv_type_2_1= 'BUTTON' | lv_type_2_2= 'LINK' | lv_type_2_3= 'IMAGE' | lv_type_2_4= 'TEXT' ) ) )
            // InternalDomainmodel.g:470:4: ( (lv_type_2_1= 'BUTTON' | lv_type_2_2= 'LINK' | lv_type_2_3= 'IMAGE' | lv_type_2_4= 'TEXT' ) )
            {
            // InternalDomainmodel.g:470:4: ( (lv_type_2_1= 'BUTTON' | lv_type_2_2= 'LINK' | lv_type_2_3= 'IMAGE' | lv_type_2_4= 'TEXT' ) )
            // InternalDomainmodel.g:471:5: (lv_type_2_1= 'BUTTON' | lv_type_2_2= 'LINK' | lv_type_2_3= 'IMAGE' | lv_type_2_4= 'TEXT' )
            {
            // InternalDomainmodel.g:471:5: (lv_type_2_1= 'BUTTON' | lv_type_2_2= 'LINK' | lv_type_2_3= 'IMAGE' | lv_type_2_4= 'TEXT' )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt8=1;
                }
                break;
            case 22:
                {
                alt8=2;
                }
                break;
            case 23:
                {
                alt8=3;
                }
                break;
            case 24:
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
                    // InternalDomainmodel.g:472:6: lv_type_2_1= 'BUTTON'
                    {
                    lv_type_2_1=(Token)match(input,21,FOLLOW_13); 

                    						newLeafNode(lv_type_2_1, grammarAccess.getCLICKAccess().getTypeBUTTONKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCLICKRule());
                    						}
                    						setWithLastConsumed(current, "type", lv_type_2_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalDomainmodel.g:483:6: lv_type_2_2= 'LINK'
                    {
                    lv_type_2_2=(Token)match(input,22,FOLLOW_13); 

                    						newLeafNode(lv_type_2_2, grammarAccess.getCLICKAccess().getTypeLINKKeyword_2_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCLICKRule());
                    						}
                    						setWithLastConsumed(current, "type", lv_type_2_2, null);
                    					

                    }
                    break;
                case 3 :
                    // InternalDomainmodel.g:494:6: lv_type_2_3= 'IMAGE'
                    {
                    lv_type_2_3=(Token)match(input,23,FOLLOW_13); 

                    						newLeafNode(lv_type_2_3, grammarAccess.getCLICKAccess().getTypeIMAGEKeyword_2_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCLICKRule());
                    						}
                    						setWithLastConsumed(current, "type", lv_type_2_3, null);
                    					

                    }
                    break;
                case 4 :
                    // InternalDomainmodel.g:505:6: lv_type_2_4= 'TEXT'
                    {
                    lv_type_2_4=(Token)match(input,24,FOLLOW_13); 

                    						newLeafNode(lv_type_2_4, grammarAccess.getCLICKAccess().getTypeTEXTKeyword_2_0_3());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCLICKRule());
                    						}
                    						setWithLastConsumed(current, "type", lv_type_2_4, null);
                    					

                    }
                    break;

            }


            }


            }

            // InternalDomainmodel.g:518:3: ( (lv_identifier_3_0= ruleELEMENTIDENTIFIER ) )
            // InternalDomainmodel.g:519:4: (lv_identifier_3_0= ruleELEMENTIDENTIFIER )
            {
            // InternalDomainmodel.g:519:4: (lv_identifier_3_0= ruleELEMENTIDENTIFIER )
            // InternalDomainmodel.g:520:5: lv_identifier_3_0= ruleELEMENTIDENTIFIER
            {

            					newCompositeNode(grammarAccess.getCLICKAccess().getIdentifierELEMENTIDENTIFIERParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_identifier_3_0=ruleELEMENTIDENTIFIER();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCLICKRule());
            					}
            					set(
            						current,
            						"identifier",
            						lv_identifier_3_0,
            						"org.xtext.project.browserautomationdsl.Domainmodel.ELEMENTIDENTIFIER");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCLICK"


    // $ANTLR start "entryRuleFILL"
    // InternalDomainmodel.g:541:1: entryRuleFILL returns [EObject current=null] : iv_ruleFILL= ruleFILL EOF ;
    public final EObject entryRuleFILL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFILL = null;


        try {
            // InternalDomainmodel.g:541:45: (iv_ruleFILL= ruleFILL EOF )
            // InternalDomainmodel.g:542:2: iv_ruleFILL= ruleFILL EOF
            {
             newCompositeNode(grammarAccess.getFILLRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFILL=ruleFILL();

            state._fsp--;

             current =iv_ruleFILL; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFILL"


    // $ANTLR start "ruleFILL"
    // InternalDomainmodel.g:548:1: ruleFILL returns [EObject current=null] : ( ( (lv_name_0_0= 'fill' ) ) ( ( (lv_fieldType_1_1= 'TEXTFIELD' | lv_fieldType_1_2= 'SEARCHFIELD' ) ) ) ( (lv_identifier_2_0= ruleELEMENTIDENTIFIER ) )? otherlv_3= 'with' ( (otherlv_4= 'saved' ( (lv_var_5_0= RULE_VARTYPE ) ) ) | ( (lv_value_6_0= RULE_STRING ) ) ) ) ;
    public final EObject ruleFILL() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_fieldType_1_1=null;
        Token lv_fieldType_1_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_var_5_0=null;
        Token lv_value_6_0=null;
        EObject lv_identifier_2_0 = null;



        	enterRule();

        try {
            // InternalDomainmodel.g:554:2: ( ( ( (lv_name_0_0= 'fill' ) ) ( ( (lv_fieldType_1_1= 'TEXTFIELD' | lv_fieldType_1_2= 'SEARCHFIELD' ) ) ) ( (lv_identifier_2_0= ruleELEMENTIDENTIFIER ) )? otherlv_3= 'with' ( (otherlv_4= 'saved' ( (lv_var_5_0= RULE_VARTYPE ) ) ) | ( (lv_value_6_0= RULE_STRING ) ) ) ) )
            // InternalDomainmodel.g:555:2: ( ( (lv_name_0_0= 'fill' ) ) ( ( (lv_fieldType_1_1= 'TEXTFIELD' | lv_fieldType_1_2= 'SEARCHFIELD' ) ) ) ( (lv_identifier_2_0= ruleELEMENTIDENTIFIER ) )? otherlv_3= 'with' ( (otherlv_4= 'saved' ( (lv_var_5_0= RULE_VARTYPE ) ) ) | ( (lv_value_6_0= RULE_STRING ) ) ) )
            {
            // InternalDomainmodel.g:555:2: ( ( (lv_name_0_0= 'fill' ) ) ( ( (lv_fieldType_1_1= 'TEXTFIELD' | lv_fieldType_1_2= 'SEARCHFIELD' ) ) ) ( (lv_identifier_2_0= ruleELEMENTIDENTIFIER ) )? otherlv_3= 'with' ( (otherlv_4= 'saved' ( (lv_var_5_0= RULE_VARTYPE ) ) ) | ( (lv_value_6_0= RULE_STRING ) ) ) )
            // InternalDomainmodel.g:556:3: ( (lv_name_0_0= 'fill' ) ) ( ( (lv_fieldType_1_1= 'TEXTFIELD' | lv_fieldType_1_2= 'SEARCHFIELD' ) ) ) ( (lv_identifier_2_0= ruleELEMENTIDENTIFIER ) )? otherlv_3= 'with' ( (otherlv_4= 'saved' ( (lv_var_5_0= RULE_VARTYPE ) ) ) | ( (lv_value_6_0= RULE_STRING ) ) )
            {
            // InternalDomainmodel.g:556:3: ( (lv_name_0_0= 'fill' ) )
            // InternalDomainmodel.g:557:4: (lv_name_0_0= 'fill' )
            {
            // InternalDomainmodel.g:557:4: (lv_name_0_0= 'fill' )
            // InternalDomainmodel.g:558:5: lv_name_0_0= 'fill'
            {
            lv_name_0_0=(Token)match(input,25,FOLLOW_14); 

            					newLeafNode(lv_name_0_0, grammarAccess.getFILLAccess().getNameFillKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFILLRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "fill");
            				

            }


            }

            // InternalDomainmodel.g:570:3: ( ( (lv_fieldType_1_1= 'TEXTFIELD' | lv_fieldType_1_2= 'SEARCHFIELD' ) ) )
            // InternalDomainmodel.g:571:4: ( (lv_fieldType_1_1= 'TEXTFIELD' | lv_fieldType_1_2= 'SEARCHFIELD' ) )
            {
            // InternalDomainmodel.g:571:4: ( (lv_fieldType_1_1= 'TEXTFIELD' | lv_fieldType_1_2= 'SEARCHFIELD' ) )
            // InternalDomainmodel.g:572:5: (lv_fieldType_1_1= 'TEXTFIELD' | lv_fieldType_1_2= 'SEARCHFIELD' )
            {
            // InternalDomainmodel.g:572:5: (lv_fieldType_1_1= 'TEXTFIELD' | lv_fieldType_1_2= 'SEARCHFIELD' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==26) ) {
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
                    // InternalDomainmodel.g:573:6: lv_fieldType_1_1= 'TEXTFIELD'
                    {
                    lv_fieldType_1_1=(Token)match(input,26,FOLLOW_15); 

                    						newLeafNode(lv_fieldType_1_1, grammarAccess.getFILLAccess().getFieldTypeTEXTFIELDKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFILLRule());
                    						}
                    						setWithLastConsumed(current, "fieldType", lv_fieldType_1_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalDomainmodel.g:584:6: lv_fieldType_1_2= 'SEARCHFIELD'
                    {
                    lv_fieldType_1_2=(Token)match(input,27,FOLLOW_15); 

                    						newLeafNode(lv_fieldType_1_2, grammarAccess.getFILLAccess().getFieldTypeSEARCHFIELDKeyword_1_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFILLRule());
                    						}
                    						setWithLastConsumed(current, "fieldType", lv_fieldType_1_2, null);
                    					

                    }
                    break;

            }


            }


            }

            // InternalDomainmodel.g:597:3: ( (lv_identifier_2_0= ruleELEMENTIDENTIFIER ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==39) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalDomainmodel.g:598:4: (lv_identifier_2_0= ruleELEMENTIDENTIFIER )
                    {
                    // InternalDomainmodel.g:598:4: (lv_identifier_2_0= ruleELEMENTIDENTIFIER )
                    // InternalDomainmodel.g:599:5: lv_identifier_2_0= ruleELEMENTIDENTIFIER
                    {

                    					newCompositeNode(grammarAccess.getFILLAccess().getIdentifierELEMENTIDENTIFIERParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_16);
                    lv_identifier_2_0=ruleELEMENTIDENTIFIER();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFILLRule());
                    					}
                    					set(
                    						current,
                    						"identifier",
                    						lv_identifier_2_0,
                    						"org.xtext.project.browserautomationdsl.Domainmodel.ELEMENTIDENTIFIER");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,13,FOLLOW_17); 

            			newLeafNode(otherlv_3, grammarAccess.getFILLAccess().getWithKeyword_3());
            		
            // InternalDomainmodel.g:620:3: ( (otherlv_4= 'saved' ( (lv_var_5_0= RULE_VARTYPE ) ) ) | ( (lv_value_6_0= RULE_STRING ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==28) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_STRING) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalDomainmodel.g:621:4: (otherlv_4= 'saved' ( (lv_var_5_0= RULE_VARTYPE ) ) )
                    {
                    // InternalDomainmodel.g:621:4: (otherlv_4= 'saved' ( (lv_var_5_0= RULE_VARTYPE ) ) )
                    // InternalDomainmodel.g:622:5: otherlv_4= 'saved' ( (lv_var_5_0= RULE_VARTYPE ) )
                    {
                    otherlv_4=(Token)match(input,28,FOLLOW_4); 

                    					newLeafNode(otherlv_4, grammarAccess.getFILLAccess().getSavedKeyword_4_0_0());
                    				
                    // InternalDomainmodel.g:626:5: ( (lv_var_5_0= RULE_VARTYPE ) )
                    // InternalDomainmodel.g:627:6: (lv_var_5_0= RULE_VARTYPE )
                    {
                    // InternalDomainmodel.g:627:6: (lv_var_5_0= RULE_VARTYPE )
                    // InternalDomainmodel.g:628:7: lv_var_5_0= RULE_VARTYPE
                    {
                    lv_var_5_0=(Token)match(input,RULE_VARTYPE,FOLLOW_2); 

                    							newLeafNode(lv_var_5_0, grammarAccess.getFILLAccess().getVarVARTYPETerminalRuleCall_4_0_1_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getFILLRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"var",
                    								lv_var_5_0,
                    								"org.xtext.project.browserautomationdsl.Domainmodel.VARTYPE");
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDomainmodel.g:646:4: ( (lv_value_6_0= RULE_STRING ) )
                    {
                    // InternalDomainmodel.g:646:4: ( (lv_value_6_0= RULE_STRING ) )
                    // InternalDomainmodel.g:647:5: (lv_value_6_0= RULE_STRING )
                    {
                    // InternalDomainmodel.g:647:5: (lv_value_6_0= RULE_STRING )
                    // InternalDomainmodel.g:648:6: lv_value_6_0= RULE_STRING
                    {
                    lv_value_6_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_value_6_0, grammarAccess.getFILLAccess().getValueSTRINGTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFILLRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_6_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFILL"


    // $ANTLR start "entryRuleCHECK"
    // InternalDomainmodel.g:669:1: entryRuleCHECK returns [EObject current=null] : iv_ruleCHECK= ruleCHECK EOF ;
    public final EObject entryRuleCHECK() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCHECK = null;


        try {
            // InternalDomainmodel.g:669:46: (iv_ruleCHECK= ruleCHECK EOF )
            // InternalDomainmodel.g:670:2: iv_ruleCHECK= ruleCHECK EOF
            {
             newCompositeNode(grammarAccess.getCHECKRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCHECK=ruleCHECK();

            state._fsp--;

             current =iv_ruleCHECK; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCHECK"


    // $ANTLR start "ruleCHECK"
    // InternalDomainmodel.g:676:1: ruleCHECK returns [EObject current=null] : ( ( (lv_name_0_0= 'check' ) ) ( (lv_all_1_0= 'all' ) )? otherlv_2= 'CHECKBOX' ( (lv_identifier_3_0= ruleELEMENTIDENTIFIER ) ) ) ;
    public final EObject ruleCHECK() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_all_1_0=null;
        Token otherlv_2=null;
        EObject lv_identifier_3_0 = null;



        	enterRule();

        try {
            // InternalDomainmodel.g:682:2: ( ( ( (lv_name_0_0= 'check' ) ) ( (lv_all_1_0= 'all' ) )? otherlv_2= 'CHECKBOX' ( (lv_identifier_3_0= ruleELEMENTIDENTIFIER ) ) ) )
            // InternalDomainmodel.g:683:2: ( ( (lv_name_0_0= 'check' ) ) ( (lv_all_1_0= 'all' ) )? otherlv_2= 'CHECKBOX' ( (lv_identifier_3_0= ruleELEMENTIDENTIFIER ) ) )
            {
            // InternalDomainmodel.g:683:2: ( ( (lv_name_0_0= 'check' ) ) ( (lv_all_1_0= 'all' ) )? otherlv_2= 'CHECKBOX' ( (lv_identifier_3_0= ruleELEMENTIDENTIFIER ) ) )
            // InternalDomainmodel.g:684:3: ( (lv_name_0_0= 'check' ) ) ( (lv_all_1_0= 'all' ) )? otherlv_2= 'CHECKBOX' ( (lv_identifier_3_0= ruleELEMENTIDENTIFIER ) )
            {
            // InternalDomainmodel.g:684:3: ( (lv_name_0_0= 'check' ) )
            // InternalDomainmodel.g:685:4: (lv_name_0_0= 'check' )
            {
            // InternalDomainmodel.g:685:4: (lv_name_0_0= 'check' )
            // InternalDomainmodel.g:686:5: lv_name_0_0= 'check'
            {
            lv_name_0_0=(Token)match(input,29,FOLLOW_18); 

            					newLeafNode(lv_name_0_0, grammarAccess.getCHECKAccess().getNameCheckKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCHECKRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "check");
            				

            }


            }

            // InternalDomainmodel.g:698:3: ( (lv_all_1_0= 'all' ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==30) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalDomainmodel.g:699:4: (lv_all_1_0= 'all' )
                    {
                    // InternalDomainmodel.g:699:4: (lv_all_1_0= 'all' )
                    // InternalDomainmodel.g:700:5: lv_all_1_0= 'all'
                    {
                    lv_all_1_0=(Token)match(input,30,FOLLOW_19); 

                    					newLeafNode(lv_all_1_0, grammarAccess.getCHECKAccess().getAllAllKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getCHECKRule());
                    					}
                    					setWithLastConsumed(current, "all", lv_all_1_0, "all");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,31,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getCHECKAccess().getCHECKBOXKeyword_2());
            		
            // InternalDomainmodel.g:716:3: ( (lv_identifier_3_0= ruleELEMENTIDENTIFIER ) )
            // InternalDomainmodel.g:717:4: (lv_identifier_3_0= ruleELEMENTIDENTIFIER )
            {
            // InternalDomainmodel.g:717:4: (lv_identifier_3_0= ruleELEMENTIDENTIFIER )
            // InternalDomainmodel.g:718:5: lv_identifier_3_0= ruleELEMENTIDENTIFIER
            {

            					newCompositeNode(grammarAccess.getCHECKAccess().getIdentifierELEMENTIDENTIFIERParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_identifier_3_0=ruleELEMENTIDENTIFIER();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCHECKRule());
            					}
            					set(
            						current,
            						"identifier",
            						lv_identifier_3_0,
            						"org.xtext.project.browserautomationdsl.Domainmodel.ELEMENTIDENTIFIER");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCHECK"


    // $ANTLR start "entryRuleUNCHECK"
    // InternalDomainmodel.g:739:1: entryRuleUNCHECK returns [EObject current=null] : iv_ruleUNCHECK= ruleUNCHECK EOF ;
    public final EObject entryRuleUNCHECK() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUNCHECK = null;


        try {
            // InternalDomainmodel.g:739:48: (iv_ruleUNCHECK= ruleUNCHECK EOF )
            // InternalDomainmodel.g:740:2: iv_ruleUNCHECK= ruleUNCHECK EOF
            {
             newCompositeNode(grammarAccess.getUNCHECKRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUNCHECK=ruleUNCHECK();

            state._fsp--;

             current =iv_ruleUNCHECK; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUNCHECK"


    // $ANTLR start "ruleUNCHECK"
    // InternalDomainmodel.g:746:1: ruleUNCHECK returns [EObject current=null] : ( ( (lv_name_0_0= 'uncheck' ) ) ( (lv_all_1_0= 'all' ) )? otherlv_2= 'CHECKBOX' ( (lv_identifier_3_0= ruleELEMENTIDENTIFIER ) ) ) ;
    public final EObject ruleUNCHECK() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_all_1_0=null;
        Token otherlv_2=null;
        EObject lv_identifier_3_0 = null;



        	enterRule();

        try {
            // InternalDomainmodel.g:752:2: ( ( ( (lv_name_0_0= 'uncheck' ) ) ( (lv_all_1_0= 'all' ) )? otherlv_2= 'CHECKBOX' ( (lv_identifier_3_0= ruleELEMENTIDENTIFIER ) ) ) )
            // InternalDomainmodel.g:753:2: ( ( (lv_name_0_0= 'uncheck' ) ) ( (lv_all_1_0= 'all' ) )? otherlv_2= 'CHECKBOX' ( (lv_identifier_3_0= ruleELEMENTIDENTIFIER ) ) )
            {
            // InternalDomainmodel.g:753:2: ( ( (lv_name_0_0= 'uncheck' ) ) ( (lv_all_1_0= 'all' ) )? otherlv_2= 'CHECKBOX' ( (lv_identifier_3_0= ruleELEMENTIDENTIFIER ) ) )
            // InternalDomainmodel.g:754:3: ( (lv_name_0_0= 'uncheck' ) ) ( (lv_all_1_0= 'all' ) )? otherlv_2= 'CHECKBOX' ( (lv_identifier_3_0= ruleELEMENTIDENTIFIER ) )
            {
            // InternalDomainmodel.g:754:3: ( (lv_name_0_0= 'uncheck' ) )
            // InternalDomainmodel.g:755:4: (lv_name_0_0= 'uncheck' )
            {
            // InternalDomainmodel.g:755:4: (lv_name_0_0= 'uncheck' )
            // InternalDomainmodel.g:756:5: lv_name_0_0= 'uncheck'
            {
            lv_name_0_0=(Token)match(input,32,FOLLOW_18); 

            					newLeafNode(lv_name_0_0, grammarAccess.getUNCHECKAccess().getNameUncheckKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUNCHECKRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "uncheck");
            				

            }


            }

            // InternalDomainmodel.g:768:3: ( (lv_all_1_0= 'all' ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==30) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalDomainmodel.g:769:4: (lv_all_1_0= 'all' )
                    {
                    // InternalDomainmodel.g:769:4: (lv_all_1_0= 'all' )
                    // InternalDomainmodel.g:770:5: lv_all_1_0= 'all'
                    {
                    lv_all_1_0=(Token)match(input,30,FOLLOW_19); 

                    					newLeafNode(lv_all_1_0, grammarAccess.getUNCHECKAccess().getAllAllKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getUNCHECKRule());
                    					}
                    					setWithLastConsumed(current, "all", lv_all_1_0, "all");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,31,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getUNCHECKAccess().getCHECKBOXKeyword_2());
            		
            // InternalDomainmodel.g:786:3: ( (lv_identifier_3_0= ruleELEMENTIDENTIFIER ) )
            // InternalDomainmodel.g:787:4: (lv_identifier_3_0= ruleELEMENTIDENTIFIER )
            {
            // InternalDomainmodel.g:787:4: (lv_identifier_3_0= ruleELEMENTIDENTIFIER )
            // InternalDomainmodel.g:788:5: lv_identifier_3_0= ruleELEMENTIDENTIFIER
            {

            					newCompositeNode(grammarAccess.getUNCHECKAccess().getIdentifierELEMENTIDENTIFIERParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_identifier_3_0=ruleELEMENTIDENTIFIER();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUNCHECKRule());
            					}
            					set(
            						current,
            						"identifier",
            						lv_identifier_3_0,
            						"org.xtext.project.browserautomationdsl.Domainmodel.ELEMENTIDENTIFIER");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUNCHECK"


    // $ANTLR start "entryRuleSELECT"
    // InternalDomainmodel.g:809:1: entryRuleSELECT returns [EObject current=null] : iv_ruleSELECT= ruleSELECT EOF ;
    public final EObject entryRuleSELECT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSELECT = null;


        try {
            // InternalDomainmodel.g:809:47: (iv_ruleSELECT= ruleSELECT EOF )
            // InternalDomainmodel.g:810:2: iv_ruleSELECT= ruleSELECT EOF
            {
             newCompositeNode(grammarAccess.getSELECTRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSELECT=ruleSELECT();

            state._fsp--;

             current =iv_ruleSELECT; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSELECT"


    // $ANTLR start "ruleSELECT"
    // InternalDomainmodel.g:816:1: ruleSELECT returns [EObject current=null] : ( ( (lv_name_0_0= 'select' ) ) ( (lv_elem_1_0= RULE_STRING ) ) otherlv_2= 'in' otherlv_3= 'COMBOBOX' ( (lv_identifier_4_0= ruleELEMENTIDENTIFIER ) ) ) ;
    public final EObject ruleSELECT() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_elem_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_identifier_4_0 = null;



        	enterRule();

        try {
            // InternalDomainmodel.g:822:2: ( ( ( (lv_name_0_0= 'select' ) ) ( (lv_elem_1_0= RULE_STRING ) ) otherlv_2= 'in' otherlv_3= 'COMBOBOX' ( (lv_identifier_4_0= ruleELEMENTIDENTIFIER ) ) ) )
            // InternalDomainmodel.g:823:2: ( ( (lv_name_0_0= 'select' ) ) ( (lv_elem_1_0= RULE_STRING ) ) otherlv_2= 'in' otherlv_3= 'COMBOBOX' ( (lv_identifier_4_0= ruleELEMENTIDENTIFIER ) ) )
            {
            // InternalDomainmodel.g:823:2: ( ( (lv_name_0_0= 'select' ) ) ( (lv_elem_1_0= RULE_STRING ) ) otherlv_2= 'in' otherlv_3= 'COMBOBOX' ( (lv_identifier_4_0= ruleELEMENTIDENTIFIER ) ) )
            // InternalDomainmodel.g:824:3: ( (lv_name_0_0= 'select' ) ) ( (lv_elem_1_0= RULE_STRING ) ) otherlv_2= 'in' otherlv_3= 'COMBOBOX' ( (lv_identifier_4_0= ruleELEMENTIDENTIFIER ) )
            {
            // InternalDomainmodel.g:824:3: ( (lv_name_0_0= 'select' ) )
            // InternalDomainmodel.g:825:4: (lv_name_0_0= 'select' )
            {
            // InternalDomainmodel.g:825:4: (lv_name_0_0= 'select' )
            // InternalDomainmodel.g:826:5: lv_name_0_0= 'select'
            {
            lv_name_0_0=(Token)match(input,33,FOLLOW_10); 

            					newLeafNode(lv_name_0_0, grammarAccess.getSELECTAccess().getNameSelectKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSELECTRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "select");
            				

            }


            }

            // InternalDomainmodel.g:838:3: ( (lv_elem_1_0= RULE_STRING ) )
            // InternalDomainmodel.g:839:4: (lv_elem_1_0= RULE_STRING )
            {
            // InternalDomainmodel.g:839:4: (lv_elem_1_0= RULE_STRING )
            // InternalDomainmodel.g:840:5: lv_elem_1_0= RULE_STRING
            {
            lv_elem_1_0=(Token)match(input,RULE_STRING,FOLLOW_20); 

            					newLeafNode(lv_elem_1_0, grammarAccess.getSELECTAccess().getElemSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSELECTRule());
            					}
            					setWithLastConsumed(
            						current,
            						"elem",
            						lv_elem_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,34,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getSELECTAccess().getInKeyword_2());
            		
            otherlv_3=(Token)match(input,35,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getSELECTAccess().getCOMBOBOXKeyword_3());
            		
            // InternalDomainmodel.g:864:3: ( (lv_identifier_4_0= ruleELEMENTIDENTIFIER ) )
            // InternalDomainmodel.g:865:4: (lv_identifier_4_0= ruleELEMENTIDENTIFIER )
            {
            // InternalDomainmodel.g:865:4: (lv_identifier_4_0= ruleELEMENTIDENTIFIER )
            // InternalDomainmodel.g:866:5: lv_identifier_4_0= ruleELEMENTIDENTIFIER
            {

            					newCompositeNode(grammarAccess.getSELECTAccess().getIdentifierELEMENTIDENTIFIERParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_identifier_4_0=ruleELEMENTIDENTIFIER();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSELECTRule());
            					}
            					set(
            						current,
            						"identifier",
            						lv_identifier_4_0,
            						"org.xtext.project.browserautomationdsl.Domainmodel.ELEMENTIDENTIFIER");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSELECT"


    // $ANTLR start "entryRuleREAD"
    // InternalDomainmodel.g:887:1: entryRuleREAD returns [EObject current=null] : iv_ruleREAD= ruleREAD EOF ;
    public final EObject entryRuleREAD() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleREAD = null;


        try {
            // InternalDomainmodel.g:887:45: (iv_ruleREAD= ruleREAD EOF )
            // InternalDomainmodel.g:888:2: iv_ruleREAD= ruleREAD EOF
            {
             newCompositeNode(grammarAccess.getREADRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleREAD=ruleREAD();

            state._fsp--;

             current =iv_ruleREAD; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleREAD"


    // $ANTLR start "ruleREAD"
    // InternalDomainmodel.g:894:1: ruleREAD returns [EObject current=null] : ( ( (lv_name_0_0= 'read' ) ) otherlv_1= 'url' otherlv_2= 'from' (otherlv_3= 'BUTTON' | otherlv_4= 'LINK' | otherlv_5= 'IMAGE' | otherlv_6= 'TEXT' ) ( (lv_identifier_7_0= ruleELEMENTIDENTIFIER ) ) ( (lv_savePath_8_0= ruleSAVEVAR ) )? ) ;
    public final EObject ruleREAD() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_identifier_7_0 = null;

        EObject lv_savePath_8_0 = null;



        	enterRule();

        try {
            // InternalDomainmodel.g:900:2: ( ( ( (lv_name_0_0= 'read' ) ) otherlv_1= 'url' otherlv_2= 'from' (otherlv_3= 'BUTTON' | otherlv_4= 'LINK' | otherlv_5= 'IMAGE' | otherlv_6= 'TEXT' ) ( (lv_identifier_7_0= ruleELEMENTIDENTIFIER ) ) ( (lv_savePath_8_0= ruleSAVEVAR ) )? ) )
            // InternalDomainmodel.g:901:2: ( ( (lv_name_0_0= 'read' ) ) otherlv_1= 'url' otherlv_2= 'from' (otherlv_3= 'BUTTON' | otherlv_4= 'LINK' | otherlv_5= 'IMAGE' | otherlv_6= 'TEXT' ) ( (lv_identifier_7_0= ruleELEMENTIDENTIFIER ) ) ( (lv_savePath_8_0= ruleSAVEVAR ) )? )
            {
            // InternalDomainmodel.g:901:2: ( ( (lv_name_0_0= 'read' ) ) otherlv_1= 'url' otherlv_2= 'from' (otherlv_3= 'BUTTON' | otherlv_4= 'LINK' | otherlv_5= 'IMAGE' | otherlv_6= 'TEXT' ) ( (lv_identifier_7_0= ruleELEMENTIDENTIFIER ) ) ( (lv_savePath_8_0= ruleSAVEVAR ) )? )
            // InternalDomainmodel.g:902:3: ( (lv_name_0_0= 'read' ) ) otherlv_1= 'url' otherlv_2= 'from' (otherlv_3= 'BUTTON' | otherlv_4= 'LINK' | otherlv_5= 'IMAGE' | otherlv_6= 'TEXT' ) ( (lv_identifier_7_0= ruleELEMENTIDENTIFIER ) ) ( (lv_savePath_8_0= ruleSAVEVAR ) )?
            {
            // InternalDomainmodel.g:902:3: ( (lv_name_0_0= 'read' ) )
            // InternalDomainmodel.g:903:4: (lv_name_0_0= 'read' )
            {
            // InternalDomainmodel.g:903:4: (lv_name_0_0= 'read' )
            // InternalDomainmodel.g:904:5: lv_name_0_0= 'read'
            {
            lv_name_0_0=(Token)match(input,36,FOLLOW_22); 

            					newLeafNode(lv_name_0_0, grammarAccess.getREADAccess().getNameReadKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getREADRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "read");
            				

            }


            }

            otherlv_1=(Token)match(input,37,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getREADAccess().getUrlKeyword_1());
            		
            otherlv_2=(Token)match(input,38,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getREADAccess().getFromKeyword_2());
            		
            // InternalDomainmodel.g:924:3: (otherlv_3= 'BUTTON' | otherlv_4= 'LINK' | otherlv_5= 'IMAGE' | otherlv_6= 'TEXT' )
            int alt14=4;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt14=1;
                }
                break;
            case 22:
                {
                alt14=2;
                }
                break;
            case 23:
                {
                alt14=3;
                }
                break;
            case 24:
                {
                alt14=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalDomainmodel.g:925:4: otherlv_3= 'BUTTON'
                    {
                    otherlv_3=(Token)match(input,21,FOLLOW_13); 

                    				newLeafNode(otherlv_3, grammarAccess.getREADAccess().getBUTTONKeyword_3_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalDomainmodel.g:930:4: otherlv_4= 'LINK'
                    {
                    otherlv_4=(Token)match(input,22,FOLLOW_13); 

                    				newLeafNode(otherlv_4, grammarAccess.getREADAccess().getLINKKeyword_3_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalDomainmodel.g:935:4: otherlv_5= 'IMAGE'
                    {
                    otherlv_5=(Token)match(input,23,FOLLOW_13); 

                    				newLeafNode(otherlv_5, grammarAccess.getREADAccess().getIMAGEKeyword_3_2());
                    			

                    }
                    break;
                case 4 :
                    // InternalDomainmodel.g:940:4: otherlv_6= 'TEXT'
                    {
                    otherlv_6=(Token)match(input,24,FOLLOW_13); 

                    				newLeafNode(otherlv_6, grammarAccess.getREADAccess().getTEXTKeyword_3_3());
                    			

                    }
                    break;

            }

            // InternalDomainmodel.g:945:3: ( (lv_identifier_7_0= ruleELEMENTIDENTIFIER ) )
            // InternalDomainmodel.g:946:4: (lv_identifier_7_0= ruleELEMENTIDENTIFIER )
            {
            // InternalDomainmodel.g:946:4: (lv_identifier_7_0= ruleELEMENTIDENTIFIER )
            // InternalDomainmodel.g:947:5: lv_identifier_7_0= ruleELEMENTIDENTIFIER
            {

            					newCompositeNode(grammarAccess.getREADAccess().getIdentifierELEMENTIDENTIFIERParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_24);
            lv_identifier_7_0=ruleELEMENTIDENTIFIER();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getREADRule());
            					}
            					set(
            						current,
            						"identifier",
            						lv_identifier_7_0,
            						"org.xtext.project.browserautomationdsl.Domainmodel.ELEMENTIDENTIFIER");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDomainmodel.g:964:3: ( (lv_savePath_8_0= ruleSAVEVAR ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==52) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalDomainmodel.g:965:4: (lv_savePath_8_0= ruleSAVEVAR )
                    {
                    // InternalDomainmodel.g:965:4: (lv_savePath_8_0= ruleSAVEVAR )
                    // InternalDomainmodel.g:966:5: lv_savePath_8_0= ruleSAVEVAR
                    {

                    					newCompositeNode(grammarAccess.getREADAccess().getSavePathSAVEVARParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_savePath_8_0=ruleSAVEVAR();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getREADRule());
                    					}
                    					set(
                    						current,
                    						"savePath",
                    						lv_savePath_8_0,
                    						"org.xtext.project.browserautomationdsl.Domainmodel.SAVEVAR");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleREAD"


    // $ANTLR start "entryRuleELEMENTIDENTIFIER"
    // InternalDomainmodel.g:987:1: entryRuleELEMENTIDENTIFIER returns [EObject current=null] : iv_ruleELEMENTIDENTIFIER= ruleELEMENTIDENTIFIER EOF ;
    public final EObject entryRuleELEMENTIDENTIFIER() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleELEMENTIDENTIFIER = null;


        try {
            // InternalDomainmodel.g:987:58: (iv_ruleELEMENTIDENTIFIER= ruleELEMENTIDENTIFIER EOF )
            // InternalDomainmodel.g:988:2: iv_ruleELEMENTIDENTIFIER= ruleELEMENTIDENTIFIER EOF
            {
             newCompositeNode(grammarAccess.getELEMENTIDENTIFIERRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleELEMENTIDENTIFIER=ruleELEMENTIDENTIFIER();

            state._fsp--;

             current =iv_ruleELEMENTIDENTIFIER; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleELEMENTIDENTIFIER"


    // $ANTLR start "ruleELEMENTIDENTIFIER"
    // InternalDomainmodel.g:994:1: ruleELEMENTIDENTIFIER returns [EObject current=null] : ( ( (lv_name_0_0= 'identified' ) ) otherlv_1= 'by' ( ( (lv_type_2_1= 'LABEL' | lv_type_2_2= 'CLASS' | lv_type_2_3= 'ID' | lv_type_2_4= 'ALT' ) ) ) ( ( (lv_value_3_0= RULE_STRING ) ) | ( ( (lv_info_4_0= 'given' ) ) ( (lv_var_5_0= RULE_VARTYPE ) ) ) ) ) ;
    public final EObject ruleELEMENTIDENTIFIER() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_type_2_1=null;
        Token lv_type_2_2=null;
        Token lv_type_2_3=null;
        Token lv_type_2_4=null;
        Token lv_value_3_0=null;
        Token lv_info_4_0=null;
        Token lv_var_5_0=null;


        	enterRule();

        try {
            // InternalDomainmodel.g:1000:2: ( ( ( (lv_name_0_0= 'identified' ) ) otherlv_1= 'by' ( ( (lv_type_2_1= 'LABEL' | lv_type_2_2= 'CLASS' | lv_type_2_3= 'ID' | lv_type_2_4= 'ALT' ) ) ) ( ( (lv_value_3_0= RULE_STRING ) ) | ( ( (lv_info_4_0= 'given' ) ) ( (lv_var_5_0= RULE_VARTYPE ) ) ) ) ) )
            // InternalDomainmodel.g:1001:2: ( ( (lv_name_0_0= 'identified' ) ) otherlv_1= 'by' ( ( (lv_type_2_1= 'LABEL' | lv_type_2_2= 'CLASS' | lv_type_2_3= 'ID' | lv_type_2_4= 'ALT' ) ) ) ( ( (lv_value_3_0= RULE_STRING ) ) | ( ( (lv_info_4_0= 'given' ) ) ( (lv_var_5_0= RULE_VARTYPE ) ) ) ) )
            {
            // InternalDomainmodel.g:1001:2: ( ( (lv_name_0_0= 'identified' ) ) otherlv_1= 'by' ( ( (lv_type_2_1= 'LABEL' | lv_type_2_2= 'CLASS' | lv_type_2_3= 'ID' | lv_type_2_4= 'ALT' ) ) ) ( ( (lv_value_3_0= RULE_STRING ) ) | ( ( (lv_info_4_0= 'given' ) ) ( (lv_var_5_0= RULE_VARTYPE ) ) ) ) )
            // InternalDomainmodel.g:1002:3: ( (lv_name_0_0= 'identified' ) ) otherlv_1= 'by' ( ( (lv_type_2_1= 'LABEL' | lv_type_2_2= 'CLASS' | lv_type_2_3= 'ID' | lv_type_2_4= 'ALT' ) ) ) ( ( (lv_value_3_0= RULE_STRING ) ) | ( ( (lv_info_4_0= 'given' ) ) ( (lv_var_5_0= RULE_VARTYPE ) ) ) )
            {
            // InternalDomainmodel.g:1002:3: ( (lv_name_0_0= 'identified' ) )
            // InternalDomainmodel.g:1003:4: (lv_name_0_0= 'identified' )
            {
            // InternalDomainmodel.g:1003:4: (lv_name_0_0= 'identified' )
            // InternalDomainmodel.g:1004:5: lv_name_0_0= 'identified'
            {
            lv_name_0_0=(Token)match(input,39,FOLLOW_25); 

            					newLeafNode(lv_name_0_0, grammarAccess.getELEMENTIDENTIFIERAccess().getNameIdentifiedKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getELEMENTIDENTIFIERRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "identified");
            				

            }


            }

            otherlv_1=(Token)match(input,40,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getELEMENTIDENTIFIERAccess().getByKeyword_1());
            		
            // InternalDomainmodel.g:1020:3: ( ( (lv_type_2_1= 'LABEL' | lv_type_2_2= 'CLASS' | lv_type_2_3= 'ID' | lv_type_2_4= 'ALT' ) ) )
            // InternalDomainmodel.g:1021:4: ( (lv_type_2_1= 'LABEL' | lv_type_2_2= 'CLASS' | lv_type_2_3= 'ID' | lv_type_2_4= 'ALT' ) )
            {
            // InternalDomainmodel.g:1021:4: ( (lv_type_2_1= 'LABEL' | lv_type_2_2= 'CLASS' | lv_type_2_3= 'ID' | lv_type_2_4= 'ALT' ) )
            // InternalDomainmodel.g:1022:5: (lv_type_2_1= 'LABEL' | lv_type_2_2= 'CLASS' | lv_type_2_3= 'ID' | lv_type_2_4= 'ALT' )
            {
            // InternalDomainmodel.g:1022:5: (lv_type_2_1= 'LABEL' | lv_type_2_2= 'CLASS' | lv_type_2_3= 'ID' | lv_type_2_4= 'ALT' )
            int alt16=4;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt16=1;
                }
                break;
            case 42:
                {
                alt16=2;
                }
                break;
            case 43:
                {
                alt16=3;
                }
                break;
            case 44:
                {
                alt16=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalDomainmodel.g:1023:6: lv_type_2_1= 'LABEL'
                    {
                    lv_type_2_1=(Token)match(input,41,FOLLOW_9); 

                    						newLeafNode(lv_type_2_1, grammarAccess.getELEMENTIDENTIFIERAccess().getTypeLABELKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getELEMENTIDENTIFIERRule());
                    						}
                    						setWithLastConsumed(current, "type", lv_type_2_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalDomainmodel.g:1034:6: lv_type_2_2= 'CLASS'
                    {
                    lv_type_2_2=(Token)match(input,42,FOLLOW_9); 

                    						newLeafNode(lv_type_2_2, grammarAccess.getELEMENTIDENTIFIERAccess().getTypeCLASSKeyword_2_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getELEMENTIDENTIFIERRule());
                    						}
                    						setWithLastConsumed(current, "type", lv_type_2_2, null);
                    					

                    }
                    break;
                case 3 :
                    // InternalDomainmodel.g:1045:6: lv_type_2_3= 'ID'
                    {
                    lv_type_2_3=(Token)match(input,43,FOLLOW_9); 

                    						newLeafNode(lv_type_2_3, grammarAccess.getELEMENTIDENTIFIERAccess().getTypeIDKeyword_2_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getELEMENTIDENTIFIERRule());
                    						}
                    						setWithLastConsumed(current, "type", lv_type_2_3, null);
                    					

                    }
                    break;
                case 4 :
                    // InternalDomainmodel.g:1056:6: lv_type_2_4= 'ALT'
                    {
                    lv_type_2_4=(Token)match(input,44,FOLLOW_9); 

                    						newLeafNode(lv_type_2_4, grammarAccess.getELEMENTIDENTIFIERAccess().getTypeALTKeyword_2_0_3());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getELEMENTIDENTIFIERRule());
                    						}
                    						setWithLastConsumed(current, "type", lv_type_2_4, null);
                    					

                    }
                    break;

            }


            }


            }

            // InternalDomainmodel.g:1069:3: ( ( (lv_value_3_0= RULE_STRING ) ) | ( ( (lv_info_4_0= 'given' ) ) ( (lv_var_5_0= RULE_VARTYPE ) ) ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_STRING) ) {
                alt17=1;
            }
            else if ( (LA17_0==18) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalDomainmodel.g:1070:4: ( (lv_value_3_0= RULE_STRING ) )
                    {
                    // InternalDomainmodel.g:1070:4: ( (lv_value_3_0= RULE_STRING ) )
                    // InternalDomainmodel.g:1071:5: (lv_value_3_0= RULE_STRING )
                    {
                    // InternalDomainmodel.g:1071:5: (lv_value_3_0= RULE_STRING )
                    // InternalDomainmodel.g:1072:6: lv_value_3_0= RULE_STRING
                    {
                    lv_value_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_value_3_0, grammarAccess.getELEMENTIDENTIFIERAccess().getValueSTRINGTerminalRuleCall_3_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getELEMENTIDENTIFIERRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_3_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDomainmodel.g:1089:4: ( ( (lv_info_4_0= 'given' ) ) ( (lv_var_5_0= RULE_VARTYPE ) ) )
                    {
                    // InternalDomainmodel.g:1089:4: ( ( (lv_info_4_0= 'given' ) ) ( (lv_var_5_0= RULE_VARTYPE ) ) )
                    // InternalDomainmodel.g:1090:5: ( (lv_info_4_0= 'given' ) ) ( (lv_var_5_0= RULE_VARTYPE ) )
                    {
                    // InternalDomainmodel.g:1090:5: ( (lv_info_4_0= 'given' ) )
                    // InternalDomainmodel.g:1091:6: (lv_info_4_0= 'given' )
                    {
                    // InternalDomainmodel.g:1091:6: (lv_info_4_0= 'given' )
                    // InternalDomainmodel.g:1092:7: lv_info_4_0= 'given'
                    {
                    lv_info_4_0=(Token)match(input,18,FOLLOW_4); 

                    							newLeafNode(lv_info_4_0, grammarAccess.getELEMENTIDENTIFIERAccess().getInfoGivenKeyword_3_1_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getELEMENTIDENTIFIERRule());
                    							}
                    							setWithLastConsumed(current, "info", lv_info_4_0, "given");
                    						

                    }


                    }

                    // InternalDomainmodel.g:1104:5: ( (lv_var_5_0= RULE_VARTYPE ) )
                    // InternalDomainmodel.g:1105:6: (lv_var_5_0= RULE_VARTYPE )
                    {
                    // InternalDomainmodel.g:1105:6: (lv_var_5_0= RULE_VARTYPE )
                    // InternalDomainmodel.g:1106:7: lv_var_5_0= RULE_VARTYPE
                    {
                    lv_var_5_0=(Token)match(input,RULE_VARTYPE,FOLLOW_2); 

                    							newLeafNode(lv_var_5_0, grammarAccess.getELEMENTIDENTIFIERAccess().getVarVARTYPETerminalRuleCall_3_1_1_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getELEMENTIDENTIFIERRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"var",
                    								lv_var_5_0,
                    								"org.xtext.project.browserautomationdsl.Domainmodel.VARTYPE");
                    						

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleELEMENTIDENTIFIER"


    // $ANTLR start "entryRuleVERIFY"
    // InternalDomainmodel.g:1128:1: entryRuleVERIFY returns [EObject current=null] : iv_ruleVERIFY= ruleVERIFY EOF ;
    public final EObject entryRuleVERIFY() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVERIFY = null;


        try {
            // InternalDomainmodel.g:1128:47: (iv_ruleVERIFY= ruleVERIFY EOF )
            // InternalDomainmodel.g:1129:2: iv_ruleVERIFY= ruleVERIFY EOF
            {
             newCompositeNode(grammarAccess.getVERIFYRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVERIFY=ruleVERIFY();

            state._fsp--;

             current =iv_ruleVERIFY; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVERIFY"


    // $ANTLR start "ruleVERIFY"
    // InternalDomainmodel.g:1135:1: ruleVERIFY returns [EObject current=null] : (this_VERIFY_CONTAINS_0= ruleVERIFY_CONTAINS | this_VERIFY_EQUALS_1= ruleVERIFY_EQUALS ) ;
    public final EObject ruleVERIFY() throws RecognitionException {
        EObject current = null;

        EObject this_VERIFY_CONTAINS_0 = null;

        EObject this_VERIFY_EQUALS_1 = null;



        	enterRule();

        try {
            // InternalDomainmodel.g:1141:2: ( (this_VERIFY_CONTAINS_0= ruleVERIFY_CONTAINS | this_VERIFY_EQUALS_1= ruleVERIFY_EQUALS ) )
            // InternalDomainmodel.g:1142:2: (this_VERIFY_CONTAINS_0= ruleVERIFY_CONTAINS | this_VERIFY_EQUALS_1= ruleVERIFY_EQUALS )
            {
            // InternalDomainmodel.g:1142:2: (this_VERIFY_CONTAINS_0= ruleVERIFY_CONTAINS | this_VERIFY_EQUALS_1= ruleVERIFY_EQUALS )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==45) ) {
                int LA18_1 = input.LA(2);

                if ( (LA18_1==46) ) {
                    int LA18_2 = input.LA(3);

                    if ( (LA18_2==50) ) {
                        alt18=2;
                    }
                    else if ( (LA18_2==24||LA18_2==47) ) {
                        alt18=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 18, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalDomainmodel.g:1143:3: this_VERIFY_CONTAINS_0= ruleVERIFY_CONTAINS
                    {

                    			newCompositeNode(grammarAccess.getVERIFYAccess().getVERIFY_CONTAINSParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_VERIFY_CONTAINS_0=ruleVERIFY_CONTAINS();

                    state._fsp--;


                    			current = this_VERIFY_CONTAINS_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDomainmodel.g:1152:3: this_VERIFY_EQUALS_1= ruleVERIFY_EQUALS
                    {

                    			newCompositeNode(grammarAccess.getVERIFYAccess().getVERIFY_EQUALSParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_VERIFY_EQUALS_1=ruleVERIFY_EQUALS();

                    state._fsp--;


                    			current = this_VERIFY_EQUALS_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVERIFY"


    // $ANTLR start "entryRuleVERIFY_CONTAINS"
    // InternalDomainmodel.g:1164:1: entryRuleVERIFY_CONTAINS returns [EObject current=null] : iv_ruleVERIFY_CONTAINS= ruleVERIFY_CONTAINS EOF ;
    public final EObject entryRuleVERIFY_CONTAINS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVERIFY_CONTAINS = null;


        try {
            // InternalDomainmodel.g:1164:56: (iv_ruleVERIFY_CONTAINS= ruleVERIFY_CONTAINS EOF )
            // InternalDomainmodel.g:1165:2: iv_ruleVERIFY_CONTAINS= ruleVERIFY_CONTAINS EOF
            {
             newCompositeNode(grammarAccess.getVERIFY_CONTAINSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVERIFY_CONTAINS=ruleVERIFY_CONTAINS();

            state._fsp--;

             current =iv_ruleVERIFY_CONTAINS; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVERIFY_CONTAINS"


    // $ANTLR start "ruleVERIFY_CONTAINS"
    // InternalDomainmodel.g:1171:1: ruleVERIFY_CONTAINS returns [EObject current=null] : (otherlv_0= 'verify' otherlv_1= 'that' ( ( (lv_type_2_1= 'PAGE' | lv_type_2_2= 'TEXT' ) ) ) ( (lv_identifier_3_0= ruleELEMENTIDENTIFIER ) )? otherlv_4= 'contains' ( ( (otherlv_5= 'LINK' | otherlv_6= 'IMAGE' ) ( (lv_containedIdentifier_7_0= ruleELEMENTIDENTIFIER ) ) ) | ( ( (lv_value_8_0= RULE_STRING ) ) | ( (lv_variable_9_0= ruleREGISTERED_VALUE ) ) ) ) ) ;
    public final EObject ruleVERIFY_CONTAINS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_type_2_1=null;
        Token lv_type_2_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_value_8_0=null;
        EObject lv_identifier_3_0 = null;

        EObject lv_containedIdentifier_7_0 = null;

        EObject lv_variable_9_0 = null;



        	enterRule();

        try {
            // InternalDomainmodel.g:1177:2: ( (otherlv_0= 'verify' otherlv_1= 'that' ( ( (lv_type_2_1= 'PAGE' | lv_type_2_2= 'TEXT' ) ) ) ( (lv_identifier_3_0= ruleELEMENTIDENTIFIER ) )? otherlv_4= 'contains' ( ( (otherlv_5= 'LINK' | otherlv_6= 'IMAGE' ) ( (lv_containedIdentifier_7_0= ruleELEMENTIDENTIFIER ) ) ) | ( ( (lv_value_8_0= RULE_STRING ) ) | ( (lv_variable_9_0= ruleREGISTERED_VALUE ) ) ) ) ) )
            // InternalDomainmodel.g:1178:2: (otherlv_0= 'verify' otherlv_1= 'that' ( ( (lv_type_2_1= 'PAGE' | lv_type_2_2= 'TEXT' ) ) ) ( (lv_identifier_3_0= ruleELEMENTIDENTIFIER ) )? otherlv_4= 'contains' ( ( (otherlv_5= 'LINK' | otherlv_6= 'IMAGE' ) ( (lv_containedIdentifier_7_0= ruleELEMENTIDENTIFIER ) ) ) | ( ( (lv_value_8_0= RULE_STRING ) ) | ( (lv_variable_9_0= ruleREGISTERED_VALUE ) ) ) ) )
            {
            // InternalDomainmodel.g:1178:2: (otherlv_0= 'verify' otherlv_1= 'that' ( ( (lv_type_2_1= 'PAGE' | lv_type_2_2= 'TEXT' ) ) ) ( (lv_identifier_3_0= ruleELEMENTIDENTIFIER ) )? otherlv_4= 'contains' ( ( (otherlv_5= 'LINK' | otherlv_6= 'IMAGE' ) ( (lv_containedIdentifier_7_0= ruleELEMENTIDENTIFIER ) ) ) | ( ( (lv_value_8_0= RULE_STRING ) ) | ( (lv_variable_9_0= ruleREGISTERED_VALUE ) ) ) ) )
            // InternalDomainmodel.g:1179:3: otherlv_0= 'verify' otherlv_1= 'that' ( ( (lv_type_2_1= 'PAGE' | lv_type_2_2= 'TEXT' ) ) ) ( (lv_identifier_3_0= ruleELEMENTIDENTIFIER ) )? otherlv_4= 'contains' ( ( (otherlv_5= 'LINK' | otherlv_6= 'IMAGE' ) ( (lv_containedIdentifier_7_0= ruleELEMENTIDENTIFIER ) ) ) | ( ( (lv_value_8_0= RULE_STRING ) ) | ( (lv_variable_9_0= ruleREGISTERED_VALUE ) ) ) )
            {
            otherlv_0=(Token)match(input,45,FOLLOW_27); 

            			newLeafNode(otherlv_0, grammarAccess.getVERIFY_CONTAINSAccess().getVerifyKeyword_0());
            		
            otherlv_1=(Token)match(input,46,FOLLOW_28); 

            			newLeafNode(otherlv_1, grammarAccess.getVERIFY_CONTAINSAccess().getThatKeyword_1());
            		
            // InternalDomainmodel.g:1187:3: ( ( (lv_type_2_1= 'PAGE' | lv_type_2_2= 'TEXT' ) ) )
            // InternalDomainmodel.g:1188:4: ( (lv_type_2_1= 'PAGE' | lv_type_2_2= 'TEXT' ) )
            {
            // InternalDomainmodel.g:1188:4: ( (lv_type_2_1= 'PAGE' | lv_type_2_2= 'TEXT' ) )
            // InternalDomainmodel.g:1189:5: (lv_type_2_1= 'PAGE' | lv_type_2_2= 'TEXT' )
            {
            // InternalDomainmodel.g:1189:5: (lv_type_2_1= 'PAGE' | lv_type_2_2= 'TEXT' )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==47) ) {
                alt19=1;
            }
            else if ( (LA19_0==24) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalDomainmodel.g:1190:6: lv_type_2_1= 'PAGE'
                    {
                    lv_type_2_1=(Token)match(input,47,FOLLOW_29); 

                    						newLeafNode(lv_type_2_1, grammarAccess.getVERIFY_CONTAINSAccess().getTypePAGEKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVERIFY_CONTAINSRule());
                    						}
                    						setWithLastConsumed(current, "type", lv_type_2_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalDomainmodel.g:1201:6: lv_type_2_2= 'TEXT'
                    {
                    lv_type_2_2=(Token)match(input,24,FOLLOW_29); 

                    						newLeafNode(lv_type_2_2, grammarAccess.getVERIFY_CONTAINSAccess().getTypeTEXTKeyword_2_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVERIFY_CONTAINSRule());
                    						}
                    						setWithLastConsumed(current, "type", lv_type_2_2, null);
                    					

                    }
                    break;

            }


            }


            }

            // InternalDomainmodel.g:1214:3: ( (lv_identifier_3_0= ruleELEMENTIDENTIFIER ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==39) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalDomainmodel.g:1215:4: (lv_identifier_3_0= ruleELEMENTIDENTIFIER )
                    {
                    // InternalDomainmodel.g:1215:4: (lv_identifier_3_0= ruleELEMENTIDENTIFIER )
                    // InternalDomainmodel.g:1216:5: lv_identifier_3_0= ruleELEMENTIDENTIFIER
                    {

                    					newCompositeNode(grammarAccess.getVERIFY_CONTAINSAccess().getIdentifierELEMENTIDENTIFIERParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_30);
                    lv_identifier_3_0=ruleELEMENTIDENTIFIER();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getVERIFY_CONTAINSRule());
                    					}
                    					set(
                    						current,
                    						"identifier",
                    						lv_identifier_3_0,
                    						"org.xtext.project.browserautomationdsl.Domainmodel.ELEMENTIDENTIFIER");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,48,FOLLOW_31); 

            			newLeafNode(otherlv_4, grammarAccess.getVERIFY_CONTAINSAccess().getContainsKeyword_4());
            		
            // InternalDomainmodel.g:1237:3: ( ( (otherlv_5= 'LINK' | otherlv_6= 'IMAGE' ) ( (lv_containedIdentifier_7_0= ruleELEMENTIDENTIFIER ) ) ) | ( ( (lv_value_8_0= RULE_STRING ) ) | ( (lv_variable_9_0= ruleREGISTERED_VALUE ) ) ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=22 && LA23_0<=23)) ) {
                alt23=1;
            }
            else if ( (LA23_0==RULE_STRING||LA23_0==28) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalDomainmodel.g:1238:4: ( (otherlv_5= 'LINK' | otherlv_6= 'IMAGE' ) ( (lv_containedIdentifier_7_0= ruleELEMENTIDENTIFIER ) ) )
                    {
                    // InternalDomainmodel.g:1238:4: ( (otherlv_5= 'LINK' | otherlv_6= 'IMAGE' ) ( (lv_containedIdentifier_7_0= ruleELEMENTIDENTIFIER ) ) )
                    // InternalDomainmodel.g:1239:5: (otherlv_5= 'LINK' | otherlv_6= 'IMAGE' ) ( (lv_containedIdentifier_7_0= ruleELEMENTIDENTIFIER ) )
                    {
                    // InternalDomainmodel.g:1239:5: (otherlv_5= 'LINK' | otherlv_6= 'IMAGE' )
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==22) ) {
                        alt21=1;
                    }
                    else if ( (LA21_0==23) ) {
                        alt21=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 21, 0, input);

                        throw nvae;
                    }
                    switch (alt21) {
                        case 1 :
                            // InternalDomainmodel.g:1240:6: otherlv_5= 'LINK'
                            {
                            otherlv_5=(Token)match(input,22,FOLLOW_13); 

                            						newLeafNode(otherlv_5, grammarAccess.getVERIFY_CONTAINSAccess().getLINKKeyword_5_0_0_0());
                            					

                            }
                            break;
                        case 2 :
                            // InternalDomainmodel.g:1245:6: otherlv_6= 'IMAGE'
                            {
                            otherlv_6=(Token)match(input,23,FOLLOW_13); 

                            						newLeafNode(otherlv_6, grammarAccess.getVERIFY_CONTAINSAccess().getIMAGEKeyword_5_0_0_1());
                            					

                            }
                            break;

                    }

                    // InternalDomainmodel.g:1250:5: ( (lv_containedIdentifier_7_0= ruleELEMENTIDENTIFIER ) )
                    // InternalDomainmodel.g:1251:6: (lv_containedIdentifier_7_0= ruleELEMENTIDENTIFIER )
                    {
                    // InternalDomainmodel.g:1251:6: (lv_containedIdentifier_7_0= ruleELEMENTIDENTIFIER )
                    // InternalDomainmodel.g:1252:7: lv_containedIdentifier_7_0= ruleELEMENTIDENTIFIER
                    {

                    							newCompositeNode(grammarAccess.getVERIFY_CONTAINSAccess().getContainedIdentifierELEMENTIDENTIFIERParserRuleCall_5_0_1_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_containedIdentifier_7_0=ruleELEMENTIDENTIFIER();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getVERIFY_CONTAINSRule());
                    							}
                    							set(
                    								current,
                    								"containedIdentifier",
                    								lv_containedIdentifier_7_0,
                    								"org.xtext.project.browserautomationdsl.Domainmodel.ELEMENTIDENTIFIER");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDomainmodel.g:1271:4: ( ( (lv_value_8_0= RULE_STRING ) ) | ( (lv_variable_9_0= ruleREGISTERED_VALUE ) ) )
                    {
                    // InternalDomainmodel.g:1271:4: ( ( (lv_value_8_0= RULE_STRING ) ) | ( (lv_variable_9_0= ruleREGISTERED_VALUE ) ) )
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==RULE_STRING) ) {
                        alt22=1;
                    }
                    else if ( (LA22_0==28) ) {
                        alt22=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 22, 0, input);

                        throw nvae;
                    }
                    switch (alt22) {
                        case 1 :
                            // InternalDomainmodel.g:1272:5: ( (lv_value_8_0= RULE_STRING ) )
                            {
                            // InternalDomainmodel.g:1272:5: ( (lv_value_8_0= RULE_STRING ) )
                            // InternalDomainmodel.g:1273:6: (lv_value_8_0= RULE_STRING )
                            {
                            // InternalDomainmodel.g:1273:6: (lv_value_8_0= RULE_STRING )
                            // InternalDomainmodel.g:1274:7: lv_value_8_0= RULE_STRING
                            {
                            lv_value_8_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                            							newLeafNode(lv_value_8_0, grammarAccess.getVERIFY_CONTAINSAccess().getValueSTRINGTerminalRuleCall_5_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getVERIFY_CONTAINSRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"value",
                            								lv_value_8_0,
                            								"org.eclipse.xtext.common.Terminals.STRING");
                            						

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalDomainmodel.g:1291:5: ( (lv_variable_9_0= ruleREGISTERED_VALUE ) )
                            {
                            // InternalDomainmodel.g:1291:5: ( (lv_variable_9_0= ruleREGISTERED_VALUE ) )
                            // InternalDomainmodel.g:1292:6: (lv_variable_9_0= ruleREGISTERED_VALUE )
                            {
                            // InternalDomainmodel.g:1292:6: (lv_variable_9_0= ruleREGISTERED_VALUE )
                            // InternalDomainmodel.g:1293:7: lv_variable_9_0= ruleREGISTERED_VALUE
                            {

                            							newCompositeNode(grammarAccess.getVERIFY_CONTAINSAccess().getVariableREGISTERED_VALUEParserRuleCall_5_1_1_0());
                            						
                            pushFollow(FOLLOW_2);
                            lv_variable_9_0=ruleREGISTERED_VALUE();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getVERIFY_CONTAINSRule());
                            							}
                            							set(
                            								current,
                            								"variable",
                            								lv_variable_9_0,
                            								"org.xtext.project.browserautomationdsl.Domainmodel.REGISTERED_VALUE");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVERIFY_CONTAINS"


    // $ANTLR start "entryRuleVERIFY_EQUALS"
    // InternalDomainmodel.g:1316:1: entryRuleVERIFY_EQUALS returns [EObject current=null] : iv_ruleVERIFY_EQUALS= ruleVERIFY_EQUALS EOF ;
    public final EObject entryRuleVERIFY_EQUALS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVERIFY_EQUALS = null;


        try {
            // InternalDomainmodel.g:1316:54: (iv_ruleVERIFY_EQUALS= ruleVERIFY_EQUALS EOF )
            // InternalDomainmodel.g:1317:2: iv_ruleVERIFY_EQUALS= ruleVERIFY_EQUALS EOF
            {
             newCompositeNode(grammarAccess.getVERIFY_EQUALSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVERIFY_EQUALS=ruleVERIFY_EQUALS();

            state._fsp--;

             current =iv_ruleVERIFY_EQUALS; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVERIFY_EQUALS"


    // $ANTLR start "ruleVERIFY_EQUALS"
    // InternalDomainmodel.g:1323:1: ruleVERIFY_EQUALS returns [EObject current=null] : (otherlv_0= 'verify' otherlv_1= 'that' ( (lv_operation_2_0= ruleCOUNT ) ) otherlv_3= 'equals' ( ( (lv_value_4_0= RULE_STRING ) ) | ( (lv_registeredValue_5_0= ruleREGISTERED_VALUE ) ) ) ) ;
    public final EObject ruleVERIFY_EQUALS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_value_4_0=null;
        EObject lv_operation_2_0 = null;

        EObject lv_registeredValue_5_0 = null;



        	enterRule();

        try {
            // InternalDomainmodel.g:1329:2: ( (otherlv_0= 'verify' otherlv_1= 'that' ( (lv_operation_2_0= ruleCOUNT ) ) otherlv_3= 'equals' ( ( (lv_value_4_0= RULE_STRING ) ) | ( (lv_registeredValue_5_0= ruleREGISTERED_VALUE ) ) ) ) )
            // InternalDomainmodel.g:1330:2: (otherlv_0= 'verify' otherlv_1= 'that' ( (lv_operation_2_0= ruleCOUNT ) ) otherlv_3= 'equals' ( ( (lv_value_4_0= RULE_STRING ) ) | ( (lv_registeredValue_5_0= ruleREGISTERED_VALUE ) ) ) )
            {
            // InternalDomainmodel.g:1330:2: (otherlv_0= 'verify' otherlv_1= 'that' ( (lv_operation_2_0= ruleCOUNT ) ) otherlv_3= 'equals' ( ( (lv_value_4_0= RULE_STRING ) ) | ( (lv_registeredValue_5_0= ruleREGISTERED_VALUE ) ) ) )
            // InternalDomainmodel.g:1331:3: otherlv_0= 'verify' otherlv_1= 'that' ( (lv_operation_2_0= ruleCOUNT ) ) otherlv_3= 'equals' ( ( (lv_value_4_0= RULE_STRING ) ) | ( (lv_registeredValue_5_0= ruleREGISTERED_VALUE ) ) )
            {
            otherlv_0=(Token)match(input,45,FOLLOW_27); 

            			newLeafNode(otherlv_0, grammarAccess.getVERIFY_EQUALSAccess().getVerifyKeyword_0());
            		
            otherlv_1=(Token)match(input,46,FOLLOW_32); 

            			newLeafNode(otherlv_1, grammarAccess.getVERIFY_EQUALSAccess().getThatKeyword_1());
            		
            // InternalDomainmodel.g:1339:3: ( (lv_operation_2_0= ruleCOUNT ) )
            // InternalDomainmodel.g:1340:4: (lv_operation_2_0= ruleCOUNT )
            {
            // InternalDomainmodel.g:1340:4: (lv_operation_2_0= ruleCOUNT )
            // InternalDomainmodel.g:1341:5: lv_operation_2_0= ruleCOUNT
            {

            					newCompositeNode(grammarAccess.getVERIFY_EQUALSAccess().getOperationCOUNTParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_33);
            lv_operation_2_0=ruleCOUNT();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVERIFY_EQUALSRule());
            					}
            					set(
            						current,
            						"operation",
            						lv_operation_2_0,
            						"org.xtext.project.browserautomationdsl.Domainmodel.COUNT");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,49,FOLLOW_31); 

            			newLeafNode(otherlv_3, grammarAccess.getVERIFY_EQUALSAccess().getEqualsKeyword_3());
            		
            // InternalDomainmodel.g:1362:3: ( ( (lv_value_4_0= RULE_STRING ) ) | ( (lv_registeredValue_5_0= ruleREGISTERED_VALUE ) ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_STRING) ) {
                alt24=1;
            }
            else if ( (LA24_0==28) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalDomainmodel.g:1363:4: ( (lv_value_4_0= RULE_STRING ) )
                    {
                    // InternalDomainmodel.g:1363:4: ( (lv_value_4_0= RULE_STRING ) )
                    // InternalDomainmodel.g:1364:5: (lv_value_4_0= RULE_STRING )
                    {
                    // InternalDomainmodel.g:1364:5: (lv_value_4_0= RULE_STRING )
                    // InternalDomainmodel.g:1365:6: lv_value_4_0= RULE_STRING
                    {
                    lv_value_4_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_value_4_0, grammarAccess.getVERIFY_EQUALSAccess().getValueSTRINGTerminalRuleCall_4_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVERIFY_EQUALSRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_4_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDomainmodel.g:1382:4: ( (lv_registeredValue_5_0= ruleREGISTERED_VALUE ) )
                    {
                    // InternalDomainmodel.g:1382:4: ( (lv_registeredValue_5_0= ruleREGISTERED_VALUE ) )
                    // InternalDomainmodel.g:1383:5: (lv_registeredValue_5_0= ruleREGISTERED_VALUE )
                    {
                    // InternalDomainmodel.g:1383:5: (lv_registeredValue_5_0= ruleREGISTERED_VALUE )
                    // InternalDomainmodel.g:1384:6: lv_registeredValue_5_0= ruleREGISTERED_VALUE
                    {

                    						newCompositeNode(grammarAccess.getVERIFY_EQUALSAccess().getRegisteredValueREGISTERED_VALUEParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_registeredValue_5_0=ruleREGISTERED_VALUE();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVERIFY_EQUALSRule());
                    						}
                    						set(
                    							current,
                    							"registeredValue",
                    							lv_registeredValue_5_0,
                    							"org.xtext.project.browserautomationdsl.Domainmodel.REGISTERED_VALUE");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVERIFY_EQUALS"


    // $ANTLR start "entryRuleREGISTERED_VALUE"
    // InternalDomainmodel.g:1406:1: entryRuleREGISTERED_VALUE returns [EObject current=null] : iv_ruleREGISTERED_VALUE= ruleREGISTERED_VALUE EOF ;
    public final EObject entryRuleREGISTERED_VALUE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleREGISTERED_VALUE = null;


        try {
            // InternalDomainmodel.g:1406:57: (iv_ruleREGISTERED_VALUE= ruleREGISTERED_VALUE EOF )
            // InternalDomainmodel.g:1407:2: iv_ruleREGISTERED_VALUE= ruleREGISTERED_VALUE EOF
            {
             newCompositeNode(grammarAccess.getREGISTERED_VALUERule()); 
            pushFollow(FOLLOW_1);
            iv_ruleREGISTERED_VALUE=ruleREGISTERED_VALUE();

            state._fsp--;

             current =iv_ruleREGISTERED_VALUE; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleREGISTERED_VALUE"


    // $ANTLR start "ruleREGISTERED_VALUE"
    // InternalDomainmodel.g:1413:1: ruleREGISTERED_VALUE returns [EObject current=null] : (otherlv_0= 'saved' ( (lv_var_1_0= RULE_VARTYPE ) ) ) ;
    public final EObject ruleREGISTERED_VALUE() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_var_1_0=null;


        	enterRule();

        try {
            // InternalDomainmodel.g:1419:2: ( (otherlv_0= 'saved' ( (lv_var_1_0= RULE_VARTYPE ) ) ) )
            // InternalDomainmodel.g:1420:2: (otherlv_0= 'saved' ( (lv_var_1_0= RULE_VARTYPE ) ) )
            {
            // InternalDomainmodel.g:1420:2: (otherlv_0= 'saved' ( (lv_var_1_0= RULE_VARTYPE ) ) )
            // InternalDomainmodel.g:1421:3: otherlv_0= 'saved' ( (lv_var_1_0= RULE_VARTYPE ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getREGISTERED_VALUEAccess().getSavedKeyword_0());
            		
            // InternalDomainmodel.g:1425:3: ( (lv_var_1_0= RULE_VARTYPE ) )
            // InternalDomainmodel.g:1426:4: (lv_var_1_0= RULE_VARTYPE )
            {
            // InternalDomainmodel.g:1426:4: (lv_var_1_0= RULE_VARTYPE )
            // InternalDomainmodel.g:1427:5: lv_var_1_0= RULE_VARTYPE
            {
            lv_var_1_0=(Token)match(input,RULE_VARTYPE,FOLLOW_2); 

            					newLeafNode(lv_var_1_0, grammarAccess.getREGISTERED_VALUEAccess().getVarVARTYPETerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getREGISTERED_VALUERule());
            					}
            					setWithLastConsumed(
            						current,
            						"var",
            						lv_var_1_0,
            						"org.xtext.project.browserautomationdsl.Domainmodel.VARTYPE");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleREGISTERED_VALUE"


    // $ANTLR start "entryRuleCOUNT"
    // InternalDomainmodel.g:1447:1: entryRuleCOUNT returns [EObject current=null] : iv_ruleCOUNT= ruleCOUNT EOF ;
    public final EObject entryRuleCOUNT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCOUNT = null;


        try {
            // InternalDomainmodel.g:1447:46: (iv_ruleCOUNT= ruleCOUNT EOF )
            // InternalDomainmodel.g:1448:2: iv_ruleCOUNT= ruleCOUNT EOF
            {
             newCompositeNode(grammarAccess.getCOUNTRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCOUNT=ruleCOUNT();

            state._fsp--;

             current =iv_ruleCOUNT; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCOUNT"


    // $ANTLR start "ruleCOUNT"
    // InternalDomainmodel.g:1454:1: ruleCOUNT returns [EObject current=null] : ( ( (lv_name_0_0= 'count' ) ) otherlv_1= 'ELEMENT' ( (lv_identifier_2_0= ruleELEMENTIDENTIFIER ) ) ( (lv_saveVariable_3_0= ruleSAVEVAR ) )? ) ;
    public final EObject ruleCOUNT() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_identifier_2_0 = null;

        EObject lv_saveVariable_3_0 = null;



        	enterRule();

        try {
            // InternalDomainmodel.g:1460:2: ( ( ( (lv_name_0_0= 'count' ) ) otherlv_1= 'ELEMENT' ( (lv_identifier_2_0= ruleELEMENTIDENTIFIER ) ) ( (lv_saveVariable_3_0= ruleSAVEVAR ) )? ) )
            // InternalDomainmodel.g:1461:2: ( ( (lv_name_0_0= 'count' ) ) otherlv_1= 'ELEMENT' ( (lv_identifier_2_0= ruleELEMENTIDENTIFIER ) ) ( (lv_saveVariable_3_0= ruleSAVEVAR ) )? )
            {
            // InternalDomainmodel.g:1461:2: ( ( (lv_name_0_0= 'count' ) ) otherlv_1= 'ELEMENT' ( (lv_identifier_2_0= ruleELEMENTIDENTIFIER ) ) ( (lv_saveVariable_3_0= ruleSAVEVAR ) )? )
            // InternalDomainmodel.g:1462:3: ( (lv_name_0_0= 'count' ) ) otherlv_1= 'ELEMENT' ( (lv_identifier_2_0= ruleELEMENTIDENTIFIER ) ) ( (lv_saveVariable_3_0= ruleSAVEVAR ) )?
            {
            // InternalDomainmodel.g:1462:3: ( (lv_name_0_0= 'count' ) )
            // InternalDomainmodel.g:1463:4: (lv_name_0_0= 'count' )
            {
            // InternalDomainmodel.g:1463:4: (lv_name_0_0= 'count' )
            // InternalDomainmodel.g:1464:5: lv_name_0_0= 'count'
            {
            lv_name_0_0=(Token)match(input,50,FOLLOW_34); 

            					newLeafNode(lv_name_0_0, grammarAccess.getCOUNTAccess().getNameCountKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCOUNTRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "count");
            				

            }


            }

            otherlv_1=(Token)match(input,51,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getCOUNTAccess().getELEMENTKeyword_1());
            		
            // InternalDomainmodel.g:1480:3: ( (lv_identifier_2_0= ruleELEMENTIDENTIFIER ) )
            // InternalDomainmodel.g:1481:4: (lv_identifier_2_0= ruleELEMENTIDENTIFIER )
            {
            // InternalDomainmodel.g:1481:4: (lv_identifier_2_0= ruleELEMENTIDENTIFIER )
            // InternalDomainmodel.g:1482:5: lv_identifier_2_0= ruleELEMENTIDENTIFIER
            {

            					newCompositeNode(grammarAccess.getCOUNTAccess().getIdentifierELEMENTIDENTIFIERParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_24);
            lv_identifier_2_0=ruleELEMENTIDENTIFIER();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCOUNTRule());
            					}
            					set(
            						current,
            						"identifier",
            						lv_identifier_2_0,
            						"org.xtext.project.browserautomationdsl.Domainmodel.ELEMENTIDENTIFIER");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDomainmodel.g:1499:3: ( (lv_saveVariable_3_0= ruleSAVEVAR ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==52) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalDomainmodel.g:1500:4: (lv_saveVariable_3_0= ruleSAVEVAR )
                    {
                    // InternalDomainmodel.g:1500:4: (lv_saveVariable_3_0= ruleSAVEVAR )
                    // InternalDomainmodel.g:1501:5: lv_saveVariable_3_0= ruleSAVEVAR
                    {

                    					newCompositeNode(grammarAccess.getCOUNTAccess().getSaveVariableSAVEVARParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_saveVariable_3_0=ruleSAVEVAR();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getCOUNTRule());
                    					}
                    					set(
                    						current,
                    						"saveVariable",
                    						lv_saveVariable_3_0,
                    						"org.xtext.project.browserautomationdsl.Domainmodel.SAVEVAR");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCOUNT"


    // $ANTLR start "entryRuleSAVEVAR"
    // InternalDomainmodel.g:1522:1: entryRuleSAVEVAR returns [EObject current=null] : iv_ruleSAVEVAR= ruleSAVEVAR EOF ;
    public final EObject entryRuleSAVEVAR() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSAVEVAR = null;


        try {
            // InternalDomainmodel.g:1522:48: (iv_ruleSAVEVAR= ruleSAVEVAR EOF )
            // InternalDomainmodel.g:1523:2: iv_ruleSAVEVAR= ruleSAVEVAR EOF
            {
             newCompositeNode(grammarAccess.getSAVEVARRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSAVEVAR=ruleSAVEVAR();

            state._fsp--;

             current =iv_ruleSAVEVAR; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSAVEVAR"


    // $ANTLR start "ruleSAVEVAR"
    // InternalDomainmodel.g:1529:1: ruleSAVEVAR returns [EObject current=null] : (otherlv_0= 'and' otherlv_1= 'save' otherlv_2= 'in' ( (lv_var_3_0= RULE_VARTYPE ) ) ) ;
    public final EObject ruleSAVEVAR() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_var_3_0=null;


        	enterRule();

        try {
            // InternalDomainmodel.g:1535:2: ( (otherlv_0= 'and' otherlv_1= 'save' otherlv_2= 'in' ( (lv_var_3_0= RULE_VARTYPE ) ) ) )
            // InternalDomainmodel.g:1536:2: (otherlv_0= 'and' otherlv_1= 'save' otherlv_2= 'in' ( (lv_var_3_0= RULE_VARTYPE ) ) )
            {
            // InternalDomainmodel.g:1536:2: (otherlv_0= 'and' otherlv_1= 'save' otherlv_2= 'in' ( (lv_var_3_0= RULE_VARTYPE ) ) )
            // InternalDomainmodel.g:1537:3: otherlv_0= 'and' otherlv_1= 'save' otherlv_2= 'in' ( (lv_var_3_0= RULE_VARTYPE ) )
            {
            otherlv_0=(Token)match(input,52,FOLLOW_35); 

            			newLeafNode(otherlv_0, grammarAccess.getSAVEVARAccess().getAndKeyword_0());
            		
            otherlv_1=(Token)match(input,53,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getSAVEVARAccess().getSaveKeyword_1());
            		
            otherlv_2=(Token)match(input,34,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getSAVEVARAccess().getInKeyword_2());
            		
            // InternalDomainmodel.g:1549:3: ( (lv_var_3_0= RULE_VARTYPE ) )
            // InternalDomainmodel.g:1550:4: (lv_var_3_0= RULE_VARTYPE )
            {
            // InternalDomainmodel.g:1550:4: (lv_var_3_0= RULE_VARTYPE )
            // InternalDomainmodel.g:1551:5: lv_var_3_0= RULE_VARTYPE
            {
            lv_var_3_0=(Token)match(input,RULE_VARTYPE,FOLLOW_2); 

            					newLeafNode(lv_var_3_0, grammarAccess.getSAVEVARAccess().getVarVARTYPETerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSAVEVARRule());
            					}
            					setWithLastConsumed(
            						current,
            						"var",
            						lv_var_3_0,
            						"org.xtext.project.browserautomationdsl.Domainmodel.VARTYPE");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSAVEVAR"


    // $ANTLR start "entryRulePLAY"
    // InternalDomainmodel.g:1571:1: entryRulePLAY returns [EObject current=null] : iv_rulePLAY= rulePLAY EOF ;
    public final EObject entryRulePLAY() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePLAY = null;


        try {
            // InternalDomainmodel.g:1571:45: (iv_rulePLAY= rulePLAY EOF )
            // InternalDomainmodel.g:1572:2: iv_rulePLAY= rulePLAY EOF
            {
             newCompositeNode(grammarAccess.getPLAYRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePLAY=rulePLAY();

            state._fsp--;

             current =iv_rulePLAY; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePLAY"


    // $ANTLR start "rulePLAY"
    // InternalDomainmodel.g:1578:1: rulePLAY returns [EObject current=null] : ( ( (lv_name_0_0= 'play' ) ) otherlv_1= 'procedure' ( (lv_preocedure_2_0= RULE_VARTYPE ) ) ( (lv_params_3_0= RULE_STRING ) )* ) ;
    public final EObject rulePLAY() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_preocedure_2_0=null;
        Token lv_params_3_0=null;


        	enterRule();

        try {
            // InternalDomainmodel.g:1584:2: ( ( ( (lv_name_0_0= 'play' ) ) otherlv_1= 'procedure' ( (lv_preocedure_2_0= RULE_VARTYPE ) ) ( (lv_params_3_0= RULE_STRING ) )* ) )
            // InternalDomainmodel.g:1585:2: ( ( (lv_name_0_0= 'play' ) ) otherlv_1= 'procedure' ( (lv_preocedure_2_0= RULE_VARTYPE ) ) ( (lv_params_3_0= RULE_STRING ) )* )
            {
            // InternalDomainmodel.g:1585:2: ( ( (lv_name_0_0= 'play' ) ) otherlv_1= 'procedure' ( (lv_preocedure_2_0= RULE_VARTYPE ) ) ( (lv_params_3_0= RULE_STRING ) )* )
            // InternalDomainmodel.g:1586:3: ( (lv_name_0_0= 'play' ) ) otherlv_1= 'procedure' ( (lv_preocedure_2_0= RULE_VARTYPE ) ) ( (lv_params_3_0= RULE_STRING ) )*
            {
            // InternalDomainmodel.g:1586:3: ( (lv_name_0_0= 'play' ) )
            // InternalDomainmodel.g:1587:4: (lv_name_0_0= 'play' )
            {
            // InternalDomainmodel.g:1587:4: (lv_name_0_0= 'play' )
            // InternalDomainmodel.g:1588:5: lv_name_0_0= 'play'
            {
            lv_name_0_0=(Token)match(input,54,FOLLOW_36); 

            					newLeafNode(lv_name_0_0, grammarAccess.getPLAYAccess().getNamePlayKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPLAYRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "play");
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getPLAYAccess().getProcedureKeyword_1());
            		
            // InternalDomainmodel.g:1604:3: ( (lv_preocedure_2_0= RULE_VARTYPE ) )
            // InternalDomainmodel.g:1605:4: (lv_preocedure_2_0= RULE_VARTYPE )
            {
            // InternalDomainmodel.g:1605:4: (lv_preocedure_2_0= RULE_VARTYPE )
            // InternalDomainmodel.g:1606:5: lv_preocedure_2_0= RULE_VARTYPE
            {
            lv_preocedure_2_0=(Token)match(input,RULE_VARTYPE,FOLLOW_37); 

            					newLeafNode(lv_preocedure_2_0, grammarAccess.getPLAYAccess().getPreocedureVARTYPETerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPLAYRule());
            					}
            					setWithLastConsumed(
            						current,
            						"preocedure",
            						lv_preocedure_2_0,
            						"org.xtext.project.browserautomationdsl.Domainmodel.VARTYPE");
            				

            }


            }

            // InternalDomainmodel.g:1622:3: ( (lv_params_3_0= RULE_STRING ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_STRING) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalDomainmodel.g:1623:4: (lv_params_3_0= RULE_STRING )
            	    {
            	    // InternalDomainmodel.g:1623:4: (lv_params_3_0= RULE_STRING )
            	    // InternalDomainmodel.g:1624:5: lv_params_3_0= RULE_STRING
            	    {
            	    lv_params_3_0=(Token)match(input,RULE_STRING,FOLLOW_37); 

            	    					newLeafNode(lv_params_3_0, grammarAccess.getPLAYAccess().getParamsSTRINGTerminalRuleCall_3_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getPLAYRule());
            	    					}
            	    					addWithLastConsumed(
            	    						current,
            	    						"params",
            	    						lv_params_3_0,
            	    						"org.eclipse.xtext.common.Terminals.STRING");
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePLAY"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00442013220A6002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00442013220A4012L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00442013220A4002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001E00000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000008000002000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000010000020L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x00001E0000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000800001000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0001008000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000010C00020L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000022L});

}