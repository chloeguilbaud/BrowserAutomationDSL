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
    // InternalDomainmodel.g:443:1: ruleCLICK returns [EObject current=null] : ( ( (lv_name_0_0= 'click' ) ) otherlv_1= 'on' ( ( (lv_type_2_1= 'BUTTON' | lv_type_2_2= 'LINK' | lv_type_2_3= 'IMAGE' | lv_type_2_4= 'TEXT' ) ) ) ( (lv_value_3_0= ruleELEMENTIDENTIFIER ) ) ) ;
    public final EObject ruleCLICK() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_type_2_1=null;
        Token lv_type_2_2=null;
        Token lv_type_2_3=null;
        Token lv_type_2_4=null;
        AntlrDatatypeRuleToken lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalDomainmodel.g:449:2: ( ( ( (lv_name_0_0= 'click' ) ) otherlv_1= 'on' ( ( (lv_type_2_1= 'BUTTON' | lv_type_2_2= 'LINK' | lv_type_2_3= 'IMAGE' | lv_type_2_4= 'TEXT' ) ) ) ( (lv_value_3_0= ruleELEMENTIDENTIFIER ) ) ) )
            // InternalDomainmodel.g:450:2: ( ( (lv_name_0_0= 'click' ) ) otherlv_1= 'on' ( ( (lv_type_2_1= 'BUTTON' | lv_type_2_2= 'LINK' | lv_type_2_3= 'IMAGE' | lv_type_2_4= 'TEXT' ) ) ) ( (lv_value_3_0= ruleELEMENTIDENTIFIER ) ) )
            {
            // InternalDomainmodel.g:450:2: ( ( (lv_name_0_0= 'click' ) ) otherlv_1= 'on' ( ( (lv_type_2_1= 'BUTTON' | lv_type_2_2= 'LINK' | lv_type_2_3= 'IMAGE' | lv_type_2_4= 'TEXT' ) ) ) ( (lv_value_3_0= ruleELEMENTIDENTIFIER ) ) )
            // InternalDomainmodel.g:451:3: ( (lv_name_0_0= 'click' ) ) otherlv_1= 'on' ( ( (lv_type_2_1= 'BUTTON' | lv_type_2_2= 'LINK' | lv_type_2_3= 'IMAGE' | lv_type_2_4= 'TEXT' ) ) ) ( (lv_value_3_0= ruleELEMENTIDENTIFIER ) )
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

            // InternalDomainmodel.g:518:3: ( (lv_value_3_0= ruleELEMENTIDENTIFIER ) )
            // InternalDomainmodel.g:519:4: (lv_value_3_0= ruleELEMENTIDENTIFIER )
            {
            // InternalDomainmodel.g:519:4: (lv_value_3_0= ruleELEMENTIDENTIFIER )
            // InternalDomainmodel.g:520:5: lv_value_3_0= ruleELEMENTIDENTIFIER
            {

            					newCompositeNode(grammarAccess.getCLICKAccess().getValueELEMENTIDENTIFIERParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_3_0=ruleELEMENTIDENTIFIER();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCLICKRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_3_0,
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
    // InternalDomainmodel.g:548:1: ruleFILL returns [EObject current=null] : ( ( (lv_name_0_0= 'fill' ) ) (otherlv_1= 'TEXTFIELD' | otherlv_2= 'SEARCHFIELD' ) ( ruleELEMENTIDENTIFIER )? otherlv_4= 'with' ( (otherlv_5= 'saved' ( (lv_var_6_0= RULE_VARTYPE ) ) ) | ( (lv_value_7_0= RULE_STRING ) ) ) ) ;
    public final EObject ruleFILL() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_var_6_0=null;
        Token lv_value_7_0=null;


        	enterRule();

        try {
            // InternalDomainmodel.g:554:2: ( ( ( (lv_name_0_0= 'fill' ) ) (otherlv_1= 'TEXTFIELD' | otherlv_2= 'SEARCHFIELD' ) ( ruleELEMENTIDENTIFIER )? otherlv_4= 'with' ( (otherlv_5= 'saved' ( (lv_var_6_0= RULE_VARTYPE ) ) ) | ( (lv_value_7_0= RULE_STRING ) ) ) ) )
            // InternalDomainmodel.g:555:2: ( ( (lv_name_0_0= 'fill' ) ) (otherlv_1= 'TEXTFIELD' | otherlv_2= 'SEARCHFIELD' ) ( ruleELEMENTIDENTIFIER )? otherlv_4= 'with' ( (otherlv_5= 'saved' ( (lv_var_6_0= RULE_VARTYPE ) ) ) | ( (lv_value_7_0= RULE_STRING ) ) ) )
            {
            // InternalDomainmodel.g:555:2: ( ( (lv_name_0_0= 'fill' ) ) (otherlv_1= 'TEXTFIELD' | otherlv_2= 'SEARCHFIELD' ) ( ruleELEMENTIDENTIFIER )? otherlv_4= 'with' ( (otherlv_5= 'saved' ( (lv_var_6_0= RULE_VARTYPE ) ) ) | ( (lv_value_7_0= RULE_STRING ) ) ) )
            // InternalDomainmodel.g:556:3: ( (lv_name_0_0= 'fill' ) ) (otherlv_1= 'TEXTFIELD' | otherlv_2= 'SEARCHFIELD' ) ( ruleELEMENTIDENTIFIER )? otherlv_4= 'with' ( (otherlv_5= 'saved' ( (lv_var_6_0= RULE_VARTYPE ) ) ) | ( (lv_value_7_0= RULE_STRING ) ) )
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

            // InternalDomainmodel.g:570:3: (otherlv_1= 'TEXTFIELD' | otherlv_2= 'SEARCHFIELD' )
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
                    // InternalDomainmodel.g:571:4: otherlv_1= 'TEXTFIELD'
                    {
                    otherlv_1=(Token)match(input,26,FOLLOW_15); 

                    				newLeafNode(otherlv_1, grammarAccess.getFILLAccess().getTEXTFIELDKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalDomainmodel.g:576:4: otherlv_2= 'SEARCHFIELD'
                    {
                    otherlv_2=(Token)match(input,27,FOLLOW_15); 

                    				newLeafNode(otherlv_2, grammarAccess.getFILLAccess().getSEARCHFIELDKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalDomainmodel.g:581:3: ( ruleELEMENTIDENTIFIER )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==39) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalDomainmodel.g:582:4: ruleELEMENTIDENTIFIER
                    {

                    				newCompositeNode(grammarAccess.getFILLAccess().getELEMENTIDENTIFIERParserRuleCall_2());
                    			
                    pushFollow(FOLLOW_16);
                    ruleELEMENTIDENTIFIER();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            otherlv_4=(Token)match(input,13,FOLLOW_17); 

            			newLeafNode(otherlv_4, grammarAccess.getFILLAccess().getWithKeyword_3());
            		
            // InternalDomainmodel.g:594:3: ( (otherlv_5= 'saved' ( (lv_var_6_0= RULE_VARTYPE ) ) ) | ( (lv_value_7_0= RULE_STRING ) ) )
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
                    // InternalDomainmodel.g:595:4: (otherlv_5= 'saved' ( (lv_var_6_0= RULE_VARTYPE ) ) )
                    {
                    // InternalDomainmodel.g:595:4: (otherlv_5= 'saved' ( (lv_var_6_0= RULE_VARTYPE ) ) )
                    // InternalDomainmodel.g:596:5: otherlv_5= 'saved' ( (lv_var_6_0= RULE_VARTYPE ) )
                    {
                    otherlv_5=(Token)match(input,28,FOLLOW_4); 

                    					newLeafNode(otherlv_5, grammarAccess.getFILLAccess().getSavedKeyword_4_0_0());
                    				
                    // InternalDomainmodel.g:600:5: ( (lv_var_6_0= RULE_VARTYPE ) )
                    // InternalDomainmodel.g:601:6: (lv_var_6_0= RULE_VARTYPE )
                    {
                    // InternalDomainmodel.g:601:6: (lv_var_6_0= RULE_VARTYPE )
                    // InternalDomainmodel.g:602:7: lv_var_6_0= RULE_VARTYPE
                    {
                    lv_var_6_0=(Token)match(input,RULE_VARTYPE,FOLLOW_2); 

                    							newLeafNode(lv_var_6_0, grammarAccess.getFILLAccess().getVarVARTYPETerminalRuleCall_4_0_1_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getFILLRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"var",
                    								lv_var_6_0,
                    								"org.xtext.project.browserautomationdsl.Domainmodel.VARTYPE");
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDomainmodel.g:620:4: ( (lv_value_7_0= RULE_STRING ) )
                    {
                    // InternalDomainmodel.g:620:4: ( (lv_value_7_0= RULE_STRING ) )
                    // InternalDomainmodel.g:621:5: (lv_value_7_0= RULE_STRING )
                    {
                    // InternalDomainmodel.g:621:5: (lv_value_7_0= RULE_STRING )
                    // InternalDomainmodel.g:622:6: lv_value_7_0= RULE_STRING
                    {
                    lv_value_7_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_value_7_0, grammarAccess.getFILLAccess().getValueSTRINGTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFILLRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_7_0,
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
    // InternalDomainmodel.g:643:1: entryRuleCHECK returns [EObject current=null] : iv_ruleCHECK= ruleCHECK EOF ;
    public final EObject entryRuleCHECK() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCHECK = null;


        try {
            // InternalDomainmodel.g:643:46: (iv_ruleCHECK= ruleCHECK EOF )
            // InternalDomainmodel.g:644:2: iv_ruleCHECK= ruleCHECK EOF
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
    // InternalDomainmodel.g:650:1: ruleCHECK returns [EObject current=null] : ( ( (lv_name_0_0= 'check' ) ) (otherlv_1= 'all' )? otherlv_2= 'CHECKBOX' ( ruleELEMENTIDENTIFIER )? ) ;
    public final EObject ruleCHECK() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalDomainmodel.g:656:2: ( ( ( (lv_name_0_0= 'check' ) ) (otherlv_1= 'all' )? otherlv_2= 'CHECKBOX' ( ruleELEMENTIDENTIFIER )? ) )
            // InternalDomainmodel.g:657:2: ( ( (lv_name_0_0= 'check' ) ) (otherlv_1= 'all' )? otherlv_2= 'CHECKBOX' ( ruleELEMENTIDENTIFIER )? )
            {
            // InternalDomainmodel.g:657:2: ( ( (lv_name_0_0= 'check' ) ) (otherlv_1= 'all' )? otherlv_2= 'CHECKBOX' ( ruleELEMENTIDENTIFIER )? )
            // InternalDomainmodel.g:658:3: ( (lv_name_0_0= 'check' ) ) (otherlv_1= 'all' )? otherlv_2= 'CHECKBOX' ( ruleELEMENTIDENTIFIER )?
            {
            // InternalDomainmodel.g:658:3: ( (lv_name_0_0= 'check' ) )
            // InternalDomainmodel.g:659:4: (lv_name_0_0= 'check' )
            {
            // InternalDomainmodel.g:659:4: (lv_name_0_0= 'check' )
            // InternalDomainmodel.g:660:5: lv_name_0_0= 'check'
            {
            lv_name_0_0=(Token)match(input,29,FOLLOW_18); 

            					newLeafNode(lv_name_0_0, grammarAccess.getCHECKAccess().getNameCheckKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCHECKRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "check");
            				

            }


            }

            // InternalDomainmodel.g:672:3: (otherlv_1= 'all' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==30) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalDomainmodel.g:673:4: otherlv_1= 'all'
                    {
                    otherlv_1=(Token)match(input,30,FOLLOW_19); 

                    				newLeafNode(otherlv_1, grammarAccess.getCHECKAccess().getAllKeyword_1());
                    			

                    }
                    break;

            }

            otherlv_2=(Token)match(input,31,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getCHECKAccess().getCHECKBOXKeyword_2());
            		
            // InternalDomainmodel.g:682:3: ( ruleELEMENTIDENTIFIER )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==39) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalDomainmodel.g:683:4: ruleELEMENTIDENTIFIER
                    {

                    				newCompositeNode(grammarAccess.getCHECKAccess().getELEMENTIDENTIFIERParserRuleCall_3());
                    			
                    pushFollow(FOLLOW_2);
                    ruleELEMENTIDENTIFIER();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

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
    // $ANTLR end "ruleCHECK"


    // $ANTLR start "entryRuleUNCHECK"
    // InternalDomainmodel.g:695:1: entryRuleUNCHECK returns [EObject current=null] : iv_ruleUNCHECK= ruleUNCHECK EOF ;
    public final EObject entryRuleUNCHECK() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUNCHECK = null;


        try {
            // InternalDomainmodel.g:695:48: (iv_ruleUNCHECK= ruleUNCHECK EOF )
            // InternalDomainmodel.g:696:2: iv_ruleUNCHECK= ruleUNCHECK EOF
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
    // InternalDomainmodel.g:702:1: ruleUNCHECK returns [EObject current=null] : ( ( (lv_name_0_0= 'uncheck' ) ) (otherlv_1= 'all' )? otherlv_2= 'CHECKBOX' ( ruleELEMENTIDENTIFIER )? ) ;
    public final EObject ruleUNCHECK() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalDomainmodel.g:708:2: ( ( ( (lv_name_0_0= 'uncheck' ) ) (otherlv_1= 'all' )? otherlv_2= 'CHECKBOX' ( ruleELEMENTIDENTIFIER )? ) )
            // InternalDomainmodel.g:709:2: ( ( (lv_name_0_0= 'uncheck' ) ) (otherlv_1= 'all' )? otherlv_2= 'CHECKBOX' ( ruleELEMENTIDENTIFIER )? )
            {
            // InternalDomainmodel.g:709:2: ( ( (lv_name_0_0= 'uncheck' ) ) (otherlv_1= 'all' )? otherlv_2= 'CHECKBOX' ( ruleELEMENTIDENTIFIER )? )
            // InternalDomainmodel.g:710:3: ( (lv_name_0_0= 'uncheck' ) ) (otherlv_1= 'all' )? otherlv_2= 'CHECKBOX' ( ruleELEMENTIDENTIFIER )?
            {
            // InternalDomainmodel.g:710:3: ( (lv_name_0_0= 'uncheck' ) )
            // InternalDomainmodel.g:711:4: (lv_name_0_0= 'uncheck' )
            {
            // InternalDomainmodel.g:711:4: (lv_name_0_0= 'uncheck' )
            // InternalDomainmodel.g:712:5: lv_name_0_0= 'uncheck'
            {
            lv_name_0_0=(Token)match(input,32,FOLLOW_18); 

            					newLeafNode(lv_name_0_0, grammarAccess.getUNCHECKAccess().getNameUncheckKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUNCHECKRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "uncheck");
            				

            }


            }

            // InternalDomainmodel.g:724:3: (otherlv_1= 'all' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==30) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalDomainmodel.g:725:4: otherlv_1= 'all'
                    {
                    otherlv_1=(Token)match(input,30,FOLLOW_19); 

                    				newLeafNode(otherlv_1, grammarAccess.getUNCHECKAccess().getAllKeyword_1());
                    			

                    }
                    break;

            }

            otherlv_2=(Token)match(input,31,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getUNCHECKAccess().getCHECKBOXKeyword_2());
            		
            // InternalDomainmodel.g:734:3: ( ruleELEMENTIDENTIFIER )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==39) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalDomainmodel.g:735:4: ruleELEMENTIDENTIFIER
                    {

                    				newCompositeNode(grammarAccess.getUNCHECKAccess().getELEMENTIDENTIFIERParserRuleCall_3());
                    			
                    pushFollow(FOLLOW_2);
                    ruleELEMENTIDENTIFIER();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

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
    // $ANTLR end "ruleUNCHECK"


    // $ANTLR start "entryRuleSELECT"
    // InternalDomainmodel.g:747:1: entryRuleSELECT returns [EObject current=null] : iv_ruleSELECT= ruleSELECT EOF ;
    public final EObject entryRuleSELECT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSELECT = null;


        try {
            // InternalDomainmodel.g:747:47: (iv_ruleSELECT= ruleSELECT EOF )
            // InternalDomainmodel.g:748:2: iv_ruleSELECT= ruleSELECT EOF
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
    // InternalDomainmodel.g:754:1: ruleSELECT returns [EObject current=null] : ( ( (lv_name_0_0= 'select' ) ) ( (lv_elem_1_0= RULE_STRING ) ) otherlv_2= 'in' otherlv_3= 'COMBOBOX' ( ruleELEMENTIDENTIFIER )? ) ;
    public final EObject ruleSELECT() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_elem_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalDomainmodel.g:760:2: ( ( ( (lv_name_0_0= 'select' ) ) ( (lv_elem_1_0= RULE_STRING ) ) otherlv_2= 'in' otherlv_3= 'COMBOBOX' ( ruleELEMENTIDENTIFIER )? ) )
            // InternalDomainmodel.g:761:2: ( ( (lv_name_0_0= 'select' ) ) ( (lv_elem_1_0= RULE_STRING ) ) otherlv_2= 'in' otherlv_3= 'COMBOBOX' ( ruleELEMENTIDENTIFIER )? )
            {
            // InternalDomainmodel.g:761:2: ( ( (lv_name_0_0= 'select' ) ) ( (lv_elem_1_0= RULE_STRING ) ) otherlv_2= 'in' otherlv_3= 'COMBOBOX' ( ruleELEMENTIDENTIFIER )? )
            // InternalDomainmodel.g:762:3: ( (lv_name_0_0= 'select' ) ) ( (lv_elem_1_0= RULE_STRING ) ) otherlv_2= 'in' otherlv_3= 'COMBOBOX' ( ruleELEMENTIDENTIFIER )?
            {
            // InternalDomainmodel.g:762:3: ( (lv_name_0_0= 'select' ) )
            // InternalDomainmodel.g:763:4: (lv_name_0_0= 'select' )
            {
            // InternalDomainmodel.g:763:4: (lv_name_0_0= 'select' )
            // InternalDomainmodel.g:764:5: lv_name_0_0= 'select'
            {
            lv_name_0_0=(Token)match(input,33,FOLLOW_10); 

            					newLeafNode(lv_name_0_0, grammarAccess.getSELECTAccess().getNameSelectKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSELECTRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "select");
            				

            }


            }

            // InternalDomainmodel.g:776:3: ( (lv_elem_1_0= RULE_STRING ) )
            // InternalDomainmodel.g:777:4: (lv_elem_1_0= RULE_STRING )
            {
            // InternalDomainmodel.g:777:4: (lv_elem_1_0= RULE_STRING )
            // InternalDomainmodel.g:778:5: lv_elem_1_0= RULE_STRING
            {
            lv_elem_1_0=(Token)match(input,RULE_STRING,FOLLOW_21); 

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

            otherlv_2=(Token)match(input,34,FOLLOW_22); 

            			newLeafNode(otherlv_2, grammarAccess.getSELECTAccess().getInKeyword_2());
            		
            otherlv_3=(Token)match(input,35,FOLLOW_20); 

            			newLeafNode(otherlv_3, grammarAccess.getSELECTAccess().getCOMBOBOXKeyword_3());
            		
            // InternalDomainmodel.g:802:3: ( ruleELEMENTIDENTIFIER )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==39) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalDomainmodel.g:803:4: ruleELEMENTIDENTIFIER
                    {

                    				newCompositeNode(grammarAccess.getSELECTAccess().getELEMENTIDENTIFIERParserRuleCall_4());
                    			
                    pushFollow(FOLLOW_2);
                    ruleELEMENTIDENTIFIER();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

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
    // $ANTLR end "ruleSELECT"


    // $ANTLR start "entryRuleREAD"
    // InternalDomainmodel.g:815:1: entryRuleREAD returns [EObject current=null] : iv_ruleREAD= ruleREAD EOF ;
    public final EObject entryRuleREAD() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleREAD = null;


        try {
            // InternalDomainmodel.g:815:45: (iv_ruleREAD= ruleREAD EOF )
            // InternalDomainmodel.g:816:2: iv_ruleREAD= ruleREAD EOF
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
    // InternalDomainmodel.g:822:1: ruleREAD returns [EObject current=null] : ( ( (lv_name_0_0= 'read' ) ) otherlv_1= 'url' otherlv_2= 'from' (otherlv_3= 'BUTTON' | otherlv_4= 'LINK' | otherlv_5= 'IMAGE' | otherlv_6= 'TEXT' ) ruleELEMENTIDENTIFIER (this_SAVEVAR_8= ruleSAVEVAR )? ) ;
    public final EObject ruleREAD() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject this_SAVEVAR_8 = null;



        	enterRule();

        try {
            // InternalDomainmodel.g:828:2: ( ( ( (lv_name_0_0= 'read' ) ) otherlv_1= 'url' otherlv_2= 'from' (otherlv_3= 'BUTTON' | otherlv_4= 'LINK' | otherlv_5= 'IMAGE' | otherlv_6= 'TEXT' ) ruleELEMENTIDENTIFIER (this_SAVEVAR_8= ruleSAVEVAR )? ) )
            // InternalDomainmodel.g:829:2: ( ( (lv_name_0_0= 'read' ) ) otherlv_1= 'url' otherlv_2= 'from' (otherlv_3= 'BUTTON' | otherlv_4= 'LINK' | otherlv_5= 'IMAGE' | otherlv_6= 'TEXT' ) ruleELEMENTIDENTIFIER (this_SAVEVAR_8= ruleSAVEVAR )? )
            {
            // InternalDomainmodel.g:829:2: ( ( (lv_name_0_0= 'read' ) ) otherlv_1= 'url' otherlv_2= 'from' (otherlv_3= 'BUTTON' | otherlv_4= 'LINK' | otherlv_5= 'IMAGE' | otherlv_6= 'TEXT' ) ruleELEMENTIDENTIFIER (this_SAVEVAR_8= ruleSAVEVAR )? )
            // InternalDomainmodel.g:830:3: ( (lv_name_0_0= 'read' ) ) otherlv_1= 'url' otherlv_2= 'from' (otherlv_3= 'BUTTON' | otherlv_4= 'LINK' | otherlv_5= 'IMAGE' | otherlv_6= 'TEXT' ) ruleELEMENTIDENTIFIER (this_SAVEVAR_8= ruleSAVEVAR )?
            {
            // InternalDomainmodel.g:830:3: ( (lv_name_0_0= 'read' ) )
            // InternalDomainmodel.g:831:4: (lv_name_0_0= 'read' )
            {
            // InternalDomainmodel.g:831:4: (lv_name_0_0= 'read' )
            // InternalDomainmodel.g:832:5: lv_name_0_0= 'read'
            {
            lv_name_0_0=(Token)match(input,36,FOLLOW_23); 

            					newLeafNode(lv_name_0_0, grammarAccess.getREADAccess().getNameReadKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getREADRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "read");
            				

            }


            }

            otherlv_1=(Token)match(input,37,FOLLOW_24); 

            			newLeafNode(otherlv_1, grammarAccess.getREADAccess().getUrlKeyword_1());
            		
            otherlv_2=(Token)match(input,38,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getREADAccess().getFromKeyword_2());
            		
            // InternalDomainmodel.g:852:3: (otherlv_3= 'BUTTON' | otherlv_4= 'LINK' | otherlv_5= 'IMAGE' | otherlv_6= 'TEXT' )
            int alt17=4;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt17=1;
                }
                break;
            case 22:
                {
                alt17=2;
                }
                break;
            case 23:
                {
                alt17=3;
                }
                break;
            case 24:
                {
                alt17=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalDomainmodel.g:853:4: otherlv_3= 'BUTTON'
                    {
                    otherlv_3=(Token)match(input,21,FOLLOW_13); 

                    				newLeafNode(otherlv_3, grammarAccess.getREADAccess().getBUTTONKeyword_3_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalDomainmodel.g:858:4: otherlv_4= 'LINK'
                    {
                    otherlv_4=(Token)match(input,22,FOLLOW_13); 

                    				newLeafNode(otherlv_4, grammarAccess.getREADAccess().getLINKKeyword_3_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalDomainmodel.g:863:4: otherlv_5= 'IMAGE'
                    {
                    otherlv_5=(Token)match(input,23,FOLLOW_13); 

                    				newLeafNode(otherlv_5, grammarAccess.getREADAccess().getIMAGEKeyword_3_2());
                    			

                    }
                    break;
                case 4 :
                    // InternalDomainmodel.g:868:4: otherlv_6= 'TEXT'
                    {
                    otherlv_6=(Token)match(input,24,FOLLOW_13); 

                    				newLeafNode(otherlv_6, grammarAccess.getREADAccess().getTEXTKeyword_3_3());
                    			

                    }
                    break;

            }


            			newCompositeNode(grammarAccess.getREADAccess().getELEMENTIDENTIFIERParserRuleCall_4());
            		
            pushFollow(FOLLOW_25);
            ruleELEMENTIDENTIFIER();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalDomainmodel.g:880:3: (this_SAVEVAR_8= ruleSAVEVAR )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==52) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalDomainmodel.g:881:4: this_SAVEVAR_8= ruleSAVEVAR
                    {

                    				newCompositeNode(grammarAccess.getREADAccess().getSAVEVARParserRuleCall_5());
                    			
                    pushFollow(FOLLOW_2);
                    this_SAVEVAR_8=ruleSAVEVAR();

                    state._fsp--;


                    				current = this_SAVEVAR_8;
                    				afterParserOrEnumRuleCall();
                    			

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
    // InternalDomainmodel.g:894:1: entryRuleELEMENTIDENTIFIER returns [String current=null] : iv_ruleELEMENTIDENTIFIER= ruleELEMENTIDENTIFIER EOF ;
    public final String entryRuleELEMENTIDENTIFIER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleELEMENTIDENTIFIER = null;


        try {
            // InternalDomainmodel.g:894:57: (iv_ruleELEMENTIDENTIFIER= ruleELEMENTIDENTIFIER EOF )
            // InternalDomainmodel.g:895:2: iv_ruleELEMENTIDENTIFIER= ruleELEMENTIDENTIFIER EOF
            {
             newCompositeNode(grammarAccess.getELEMENTIDENTIFIERRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleELEMENTIDENTIFIER=ruleELEMENTIDENTIFIER();

            state._fsp--;

             current =iv_ruleELEMENTIDENTIFIER.getText(); 
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
    // InternalDomainmodel.g:901:1: ruleELEMENTIDENTIFIER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'identified' kw= 'by' (kw= 'LABEL' | kw= 'CLASS' | kw= 'ID' | kw= 'ALT' ) (this_STRING_6= RULE_STRING | (kw= 'given' this_VARTYPE_8= RULE_VARTYPE ) ) ) ;
    public final AntlrDatatypeRuleToken ruleELEMENTIDENTIFIER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_STRING_6=null;
        Token this_VARTYPE_8=null;


        	enterRule();

        try {
            // InternalDomainmodel.g:907:2: ( (kw= 'identified' kw= 'by' (kw= 'LABEL' | kw= 'CLASS' | kw= 'ID' | kw= 'ALT' ) (this_STRING_6= RULE_STRING | (kw= 'given' this_VARTYPE_8= RULE_VARTYPE ) ) ) )
            // InternalDomainmodel.g:908:2: (kw= 'identified' kw= 'by' (kw= 'LABEL' | kw= 'CLASS' | kw= 'ID' | kw= 'ALT' ) (this_STRING_6= RULE_STRING | (kw= 'given' this_VARTYPE_8= RULE_VARTYPE ) ) )
            {
            // InternalDomainmodel.g:908:2: (kw= 'identified' kw= 'by' (kw= 'LABEL' | kw= 'CLASS' | kw= 'ID' | kw= 'ALT' ) (this_STRING_6= RULE_STRING | (kw= 'given' this_VARTYPE_8= RULE_VARTYPE ) ) )
            // InternalDomainmodel.g:909:3: kw= 'identified' kw= 'by' (kw= 'LABEL' | kw= 'CLASS' | kw= 'ID' | kw= 'ALT' ) (this_STRING_6= RULE_STRING | (kw= 'given' this_VARTYPE_8= RULE_VARTYPE ) )
            {
            kw=(Token)match(input,39,FOLLOW_26); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getELEMENTIDENTIFIERAccess().getIdentifiedKeyword_0());
            		
            kw=(Token)match(input,40,FOLLOW_27); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getELEMENTIDENTIFIERAccess().getByKeyword_1());
            		
            // InternalDomainmodel.g:919:3: (kw= 'LABEL' | kw= 'CLASS' | kw= 'ID' | kw= 'ALT' )
            int alt19=4;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt19=1;
                }
                break;
            case 42:
                {
                alt19=2;
                }
                break;
            case 43:
                {
                alt19=3;
                }
                break;
            case 44:
                {
                alt19=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalDomainmodel.g:920:4: kw= 'LABEL'
                    {
                    kw=(Token)match(input,41,FOLLOW_9); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getELEMENTIDENTIFIERAccess().getLABELKeyword_2_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalDomainmodel.g:926:4: kw= 'CLASS'
                    {
                    kw=(Token)match(input,42,FOLLOW_9); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getELEMENTIDENTIFIERAccess().getCLASSKeyword_2_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalDomainmodel.g:932:4: kw= 'ID'
                    {
                    kw=(Token)match(input,43,FOLLOW_9); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getELEMENTIDENTIFIERAccess().getIDKeyword_2_2());
                    			

                    }
                    break;
                case 4 :
                    // InternalDomainmodel.g:938:4: kw= 'ALT'
                    {
                    kw=(Token)match(input,44,FOLLOW_9); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getELEMENTIDENTIFIERAccess().getALTKeyword_2_3());
                    			

                    }
                    break;

            }

            // InternalDomainmodel.g:944:3: (this_STRING_6= RULE_STRING | (kw= 'given' this_VARTYPE_8= RULE_VARTYPE ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_STRING) ) {
                alt20=1;
            }
            else if ( (LA20_0==18) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalDomainmodel.g:945:4: this_STRING_6= RULE_STRING
                    {
                    this_STRING_6=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    				current.merge(this_STRING_6);
                    			

                    				newLeafNode(this_STRING_6, grammarAccess.getELEMENTIDENTIFIERAccess().getSTRINGTerminalRuleCall_3_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalDomainmodel.g:953:4: (kw= 'given' this_VARTYPE_8= RULE_VARTYPE )
                    {
                    // InternalDomainmodel.g:953:4: (kw= 'given' this_VARTYPE_8= RULE_VARTYPE )
                    // InternalDomainmodel.g:954:5: kw= 'given' this_VARTYPE_8= RULE_VARTYPE
                    {
                    kw=(Token)match(input,18,FOLLOW_4); 

                    					current.merge(kw);
                    					newLeafNode(kw, grammarAccess.getELEMENTIDENTIFIERAccess().getGivenKeyword_3_1_0());
                    				
                    this_VARTYPE_8=(Token)match(input,RULE_VARTYPE,FOLLOW_2); 

                    					current.merge(this_VARTYPE_8);
                    				

                    					newLeafNode(this_VARTYPE_8, grammarAccess.getELEMENTIDENTIFIERAccess().getVARTYPETerminalRuleCall_3_1_1());
                    				

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
    // InternalDomainmodel.g:972:1: entryRuleVERIFY returns [EObject current=null] : iv_ruleVERIFY= ruleVERIFY EOF ;
    public final EObject entryRuleVERIFY() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVERIFY = null;


        try {
            // InternalDomainmodel.g:972:47: (iv_ruleVERIFY= ruleVERIFY EOF )
            // InternalDomainmodel.g:973:2: iv_ruleVERIFY= ruleVERIFY EOF
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
    // InternalDomainmodel.g:979:1: ruleVERIFY returns [EObject current=null] : ( ( (lv_name_0_0= 'verify' ) ) otherlv_1= 'that' ( ( (lv_count_2_0= ruleCOUNT ) ) | ( (otherlv_3= 'PAGE' | otherlv_4= 'TEXT' ) ( ruleELEMENTIDENTIFIER )? ) ) ( (otherlv_6= 'contains' ( ( (otherlv_7= 'LINK' | otherlv_8= 'IMAGE' ) ruleELEMENTIDENTIFIER ) | ( (lv_value_10_0= RULE_STRING ) ) | (otherlv_11= 'saved' ( (lv_var_12_0= RULE_VARTYPE ) ) ) ) ) | (otherlv_13= 'equals' ( (otherlv_14= 'saved' ( (lv_var_15_0= RULE_VARTYPE ) ) ) | ( (lv_value_16_0= RULE_STRING ) ) ) ) ) ) ;
    public final EObject ruleVERIFY() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_value_10_0=null;
        Token otherlv_11=null;
        Token lv_var_12_0=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token lv_var_15_0=null;
        Token lv_value_16_0=null;
        EObject lv_count_2_0 = null;



        	enterRule();

        try {
            // InternalDomainmodel.g:985:2: ( ( ( (lv_name_0_0= 'verify' ) ) otherlv_1= 'that' ( ( (lv_count_2_0= ruleCOUNT ) ) | ( (otherlv_3= 'PAGE' | otherlv_4= 'TEXT' ) ( ruleELEMENTIDENTIFIER )? ) ) ( (otherlv_6= 'contains' ( ( (otherlv_7= 'LINK' | otherlv_8= 'IMAGE' ) ruleELEMENTIDENTIFIER ) | ( (lv_value_10_0= RULE_STRING ) ) | (otherlv_11= 'saved' ( (lv_var_12_0= RULE_VARTYPE ) ) ) ) ) | (otherlv_13= 'equals' ( (otherlv_14= 'saved' ( (lv_var_15_0= RULE_VARTYPE ) ) ) | ( (lv_value_16_0= RULE_STRING ) ) ) ) ) ) )
            // InternalDomainmodel.g:986:2: ( ( (lv_name_0_0= 'verify' ) ) otherlv_1= 'that' ( ( (lv_count_2_0= ruleCOUNT ) ) | ( (otherlv_3= 'PAGE' | otherlv_4= 'TEXT' ) ( ruleELEMENTIDENTIFIER )? ) ) ( (otherlv_6= 'contains' ( ( (otherlv_7= 'LINK' | otherlv_8= 'IMAGE' ) ruleELEMENTIDENTIFIER ) | ( (lv_value_10_0= RULE_STRING ) ) | (otherlv_11= 'saved' ( (lv_var_12_0= RULE_VARTYPE ) ) ) ) ) | (otherlv_13= 'equals' ( (otherlv_14= 'saved' ( (lv_var_15_0= RULE_VARTYPE ) ) ) | ( (lv_value_16_0= RULE_STRING ) ) ) ) ) )
            {
            // InternalDomainmodel.g:986:2: ( ( (lv_name_0_0= 'verify' ) ) otherlv_1= 'that' ( ( (lv_count_2_0= ruleCOUNT ) ) | ( (otherlv_3= 'PAGE' | otherlv_4= 'TEXT' ) ( ruleELEMENTIDENTIFIER )? ) ) ( (otherlv_6= 'contains' ( ( (otherlv_7= 'LINK' | otherlv_8= 'IMAGE' ) ruleELEMENTIDENTIFIER ) | ( (lv_value_10_0= RULE_STRING ) ) | (otherlv_11= 'saved' ( (lv_var_12_0= RULE_VARTYPE ) ) ) ) ) | (otherlv_13= 'equals' ( (otherlv_14= 'saved' ( (lv_var_15_0= RULE_VARTYPE ) ) ) | ( (lv_value_16_0= RULE_STRING ) ) ) ) ) )
            // InternalDomainmodel.g:987:3: ( (lv_name_0_0= 'verify' ) ) otherlv_1= 'that' ( ( (lv_count_2_0= ruleCOUNT ) ) | ( (otherlv_3= 'PAGE' | otherlv_4= 'TEXT' ) ( ruleELEMENTIDENTIFIER )? ) ) ( (otherlv_6= 'contains' ( ( (otherlv_7= 'LINK' | otherlv_8= 'IMAGE' ) ruleELEMENTIDENTIFIER ) | ( (lv_value_10_0= RULE_STRING ) ) | (otherlv_11= 'saved' ( (lv_var_12_0= RULE_VARTYPE ) ) ) ) ) | (otherlv_13= 'equals' ( (otherlv_14= 'saved' ( (lv_var_15_0= RULE_VARTYPE ) ) ) | ( (lv_value_16_0= RULE_STRING ) ) ) ) )
            {
            // InternalDomainmodel.g:987:3: ( (lv_name_0_0= 'verify' ) )
            // InternalDomainmodel.g:988:4: (lv_name_0_0= 'verify' )
            {
            // InternalDomainmodel.g:988:4: (lv_name_0_0= 'verify' )
            // InternalDomainmodel.g:989:5: lv_name_0_0= 'verify'
            {
            lv_name_0_0=(Token)match(input,45,FOLLOW_28); 

            					newLeafNode(lv_name_0_0, grammarAccess.getVERIFYAccess().getNameVerifyKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVERIFYRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "verify");
            				

            }


            }

            otherlv_1=(Token)match(input,46,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getVERIFYAccess().getThatKeyword_1());
            		
            // InternalDomainmodel.g:1005:3: ( ( (lv_count_2_0= ruleCOUNT ) ) | ( (otherlv_3= 'PAGE' | otherlv_4= 'TEXT' ) ( ruleELEMENTIDENTIFIER )? ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==50) ) {
                alt23=1;
            }
            else if ( (LA23_0==24||LA23_0==47) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalDomainmodel.g:1006:4: ( (lv_count_2_0= ruleCOUNT ) )
                    {
                    // InternalDomainmodel.g:1006:4: ( (lv_count_2_0= ruleCOUNT ) )
                    // InternalDomainmodel.g:1007:5: (lv_count_2_0= ruleCOUNT )
                    {
                    // InternalDomainmodel.g:1007:5: (lv_count_2_0= ruleCOUNT )
                    // InternalDomainmodel.g:1008:6: lv_count_2_0= ruleCOUNT
                    {

                    						newCompositeNode(grammarAccess.getVERIFYAccess().getCountCOUNTParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_count_2_0=ruleCOUNT();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVERIFYRule());
                    						}
                    						set(
                    							current,
                    							"count",
                    							lv_count_2_0,
                    							"org.xtext.project.browserautomationdsl.Domainmodel.COUNT");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDomainmodel.g:1026:4: ( (otherlv_3= 'PAGE' | otherlv_4= 'TEXT' ) ( ruleELEMENTIDENTIFIER )? )
                    {
                    // InternalDomainmodel.g:1026:4: ( (otherlv_3= 'PAGE' | otherlv_4= 'TEXT' ) ( ruleELEMENTIDENTIFIER )? )
                    // InternalDomainmodel.g:1027:5: (otherlv_3= 'PAGE' | otherlv_4= 'TEXT' ) ( ruleELEMENTIDENTIFIER )?
                    {
                    // InternalDomainmodel.g:1027:5: (otherlv_3= 'PAGE' | otherlv_4= 'TEXT' )
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==47) ) {
                        alt21=1;
                    }
                    else if ( (LA21_0==24) ) {
                        alt21=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 21, 0, input);

                        throw nvae;
                    }
                    switch (alt21) {
                        case 1 :
                            // InternalDomainmodel.g:1028:6: otherlv_3= 'PAGE'
                            {
                            otherlv_3=(Token)match(input,47,FOLLOW_31); 

                            						newLeafNode(otherlv_3, grammarAccess.getVERIFYAccess().getPAGEKeyword_2_1_0_0());
                            					

                            }
                            break;
                        case 2 :
                            // InternalDomainmodel.g:1033:6: otherlv_4= 'TEXT'
                            {
                            otherlv_4=(Token)match(input,24,FOLLOW_31); 

                            						newLeafNode(otherlv_4, grammarAccess.getVERIFYAccess().getTEXTKeyword_2_1_0_1());
                            					

                            }
                            break;

                    }

                    // InternalDomainmodel.g:1038:5: ( ruleELEMENTIDENTIFIER )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==39) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // InternalDomainmodel.g:1039:6: ruleELEMENTIDENTIFIER
                            {

                            						newCompositeNode(grammarAccess.getVERIFYAccess().getELEMENTIDENTIFIERParserRuleCall_2_1_1());
                            					
                            pushFollow(FOLLOW_30);
                            ruleELEMENTIDENTIFIER();

                            state._fsp--;


                            						afterParserOrEnumRuleCall();
                            					

                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            // InternalDomainmodel.g:1049:3: ( (otherlv_6= 'contains' ( ( (otherlv_7= 'LINK' | otherlv_8= 'IMAGE' ) ruleELEMENTIDENTIFIER ) | ( (lv_value_10_0= RULE_STRING ) ) | (otherlv_11= 'saved' ( (lv_var_12_0= RULE_VARTYPE ) ) ) ) ) | (otherlv_13= 'equals' ( (otherlv_14= 'saved' ( (lv_var_15_0= RULE_VARTYPE ) ) ) | ( (lv_value_16_0= RULE_STRING ) ) ) ) )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==48) ) {
                alt27=1;
            }
            else if ( (LA27_0==49) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalDomainmodel.g:1050:4: (otherlv_6= 'contains' ( ( (otherlv_7= 'LINK' | otherlv_8= 'IMAGE' ) ruleELEMENTIDENTIFIER ) | ( (lv_value_10_0= RULE_STRING ) ) | (otherlv_11= 'saved' ( (lv_var_12_0= RULE_VARTYPE ) ) ) ) )
                    {
                    // InternalDomainmodel.g:1050:4: (otherlv_6= 'contains' ( ( (otherlv_7= 'LINK' | otherlv_8= 'IMAGE' ) ruleELEMENTIDENTIFIER ) | ( (lv_value_10_0= RULE_STRING ) ) | (otherlv_11= 'saved' ( (lv_var_12_0= RULE_VARTYPE ) ) ) ) )
                    // InternalDomainmodel.g:1051:5: otherlv_6= 'contains' ( ( (otherlv_7= 'LINK' | otherlv_8= 'IMAGE' ) ruleELEMENTIDENTIFIER ) | ( (lv_value_10_0= RULE_STRING ) ) | (otherlv_11= 'saved' ( (lv_var_12_0= RULE_VARTYPE ) ) ) )
                    {
                    otherlv_6=(Token)match(input,48,FOLLOW_32); 

                    					newLeafNode(otherlv_6, grammarAccess.getVERIFYAccess().getContainsKeyword_3_0_0());
                    				
                    // InternalDomainmodel.g:1055:5: ( ( (otherlv_7= 'LINK' | otherlv_8= 'IMAGE' ) ruleELEMENTIDENTIFIER ) | ( (lv_value_10_0= RULE_STRING ) ) | (otherlv_11= 'saved' ( (lv_var_12_0= RULE_VARTYPE ) ) ) )
                    int alt25=3;
                    switch ( input.LA(1) ) {
                    case 22:
                    case 23:
                        {
                        alt25=1;
                        }
                        break;
                    case RULE_STRING:
                        {
                        alt25=2;
                        }
                        break;
                    case 28:
                        {
                        alt25=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 25, 0, input);

                        throw nvae;
                    }

                    switch (alt25) {
                        case 1 :
                            // InternalDomainmodel.g:1056:6: ( (otherlv_7= 'LINK' | otherlv_8= 'IMAGE' ) ruleELEMENTIDENTIFIER )
                            {
                            // InternalDomainmodel.g:1056:6: ( (otherlv_7= 'LINK' | otherlv_8= 'IMAGE' ) ruleELEMENTIDENTIFIER )
                            // InternalDomainmodel.g:1057:7: (otherlv_7= 'LINK' | otherlv_8= 'IMAGE' ) ruleELEMENTIDENTIFIER
                            {
                            // InternalDomainmodel.g:1057:7: (otherlv_7= 'LINK' | otherlv_8= 'IMAGE' )
                            int alt24=2;
                            int LA24_0 = input.LA(1);

                            if ( (LA24_0==22) ) {
                                alt24=1;
                            }
                            else if ( (LA24_0==23) ) {
                                alt24=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 24, 0, input);

                                throw nvae;
                            }
                            switch (alt24) {
                                case 1 :
                                    // InternalDomainmodel.g:1058:8: otherlv_7= 'LINK'
                                    {
                                    otherlv_7=(Token)match(input,22,FOLLOW_13); 

                                    								newLeafNode(otherlv_7, grammarAccess.getVERIFYAccess().getLINKKeyword_3_0_1_0_0_0());
                                    							

                                    }
                                    break;
                                case 2 :
                                    // InternalDomainmodel.g:1063:8: otherlv_8= 'IMAGE'
                                    {
                                    otherlv_8=(Token)match(input,23,FOLLOW_13); 

                                    								newLeafNode(otherlv_8, grammarAccess.getVERIFYAccess().getIMAGEKeyword_3_0_1_0_0_1());
                                    							

                                    }
                                    break;

                            }


                            							newCompositeNode(grammarAccess.getVERIFYAccess().getELEMENTIDENTIFIERParserRuleCall_3_0_1_0_1());
                            						
                            pushFollow(FOLLOW_2);
                            ruleELEMENTIDENTIFIER();

                            state._fsp--;


                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }
                            break;
                        case 2 :
                            // InternalDomainmodel.g:1077:6: ( (lv_value_10_0= RULE_STRING ) )
                            {
                            // InternalDomainmodel.g:1077:6: ( (lv_value_10_0= RULE_STRING ) )
                            // InternalDomainmodel.g:1078:7: (lv_value_10_0= RULE_STRING )
                            {
                            // InternalDomainmodel.g:1078:7: (lv_value_10_0= RULE_STRING )
                            // InternalDomainmodel.g:1079:8: lv_value_10_0= RULE_STRING
                            {
                            lv_value_10_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                            								newLeafNode(lv_value_10_0, grammarAccess.getVERIFYAccess().getValueSTRINGTerminalRuleCall_3_0_1_1_0());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getVERIFYRule());
                            								}
                            								setWithLastConsumed(
                            									current,
                            									"value",
                            									lv_value_10_0,
                            									"org.eclipse.xtext.common.Terminals.STRING");
                            							

                            }


                            }


                            }
                            break;
                        case 3 :
                            // InternalDomainmodel.g:1096:6: (otherlv_11= 'saved' ( (lv_var_12_0= RULE_VARTYPE ) ) )
                            {
                            // InternalDomainmodel.g:1096:6: (otherlv_11= 'saved' ( (lv_var_12_0= RULE_VARTYPE ) ) )
                            // InternalDomainmodel.g:1097:7: otherlv_11= 'saved' ( (lv_var_12_0= RULE_VARTYPE ) )
                            {
                            otherlv_11=(Token)match(input,28,FOLLOW_4); 

                            							newLeafNode(otherlv_11, grammarAccess.getVERIFYAccess().getSavedKeyword_3_0_1_2_0());
                            						
                            // InternalDomainmodel.g:1101:7: ( (lv_var_12_0= RULE_VARTYPE ) )
                            // InternalDomainmodel.g:1102:8: (lv_var_12_0= RULE_VARTYPE )
                            {
                            // InternalDomainmodel.g:1102:8: (lv_var_12_0= RULE_VARTYPE )
                            // InternalDomainmodel.g:1103:9: lv_var_12_0= RULE_VARTYPE
                            {
                            lv_var_12_0=(Token)match(input,RULE_VARTYPE,FOLLOW_2); 

                            									newLeafNode(lv_var_12_0, grammarAccess.getVERIFYAccess().getVarVARTYPETerminalRuleCall_3_0_1_2_1_0());
                            								

                            									if (current==null) {
                            										current = createModelElement(grammarAccess.getVERIFYRule());
                            									}
                            									setWithLastConsumed(
                            										current,
                            										"var",
                            										lv_var_12_0,
                            										"org.xtext.project.browserautomationdsl.Domainmodel.VARTYPE");
                            								

                            }


                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDomainmodel.g:1123:4: (otherlv_13= 'equals' ( (otherlv_14= 'saved' ( (lv_var_15_0= RULE_VARTYPE ) ) ) | ( (lv_value_16_0= RULE_STRING ) ) ) )
                    {
                    // InternalDomainmodel.g:1123:4: (otherlv_13= 'equals' ( (otherlv_14= 'saved' ( (lv_var_15_0= RULE_VARTYPE ) ) ) | ( (lv_value_16_0= RULE_STRING ) ) ) )
                    // InternalDomainmodel.g:1124:5: otherlv_13= 'equals' ( (otherlv_14= 'saved' ( (lv_var_15_0= RULE_VARTYPE ) ) ) | ( (lv_value_16_0= RULE_STRING ) ) )
                    {
                    otherlv_13=(Token)match(input,49,FOLLOW_17); 

                    					newLeafNode(otherlv_13, grammarAccess.getVERIFYAccess().getEqualsKeyword_3_1_0());
                    				
                    // InternalDomainmodel.g:1128:5: ( (otherlv_14= 'saved' ( (lv_var_15_0= RULE_VARTYPE ) ) ) | ( (lv_value_16_0= RULE_STRING ) ) )
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==28) ) {
                        alt26=1;
                    }
                    else if ( (LA26_0==RULE_STRING) ) {
                        alt26=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 26, 0, input);

                        throw nvae;
                    }
                    switch (alt26) {
                        case 1 :
                            // InternalDomainmodel.g:1129:6: (otherlv_14= 'saved' ( (lv_var_15_0= RULE_VARTYPE ) ) )
                            {
                            // InternalDomainmodel.g:1129:6: (otherlv_14= 'saved' ( (lv_var_15_0= RULE_VARTYPE ) ) )
                            // InternalDomainmodel.g:1130:7: otherlv_14= 'saved' ( (lv_var_15_0= RULE_VARTYPE ) )
                            {
                            otherlv_14=(Token)match(input,28,FOLLOW_4); 

                            							newLeafNode(otherlv_14, grammarAccess.getVERIFYAccess().getSavedKeyword_3_1_1_0_0());
                            						
                            // InternalDomainmodel.g:1134:7: ( (lv_var_15_0= RULE_VARTYPE ) )
                            // InternalDomainmodel.g:1135:8: (lv_var_15_0= RULE_VARTYPE )
                            {
                            // InternalDomainmodel.g:1135:8: (lv_var_15_0= RULE_VARTYPE )
                            // InternalDomainmodel.g:1136:9: lv_var_15_0= RULE_VARTYPE
                            {
                            lv_var_15_0=(Token)match(input,RULE_VARTYPE,FOLLOW_2); 

                            									newLeafNode(lv_var_15_0, grammarAccess.getVERIFYAccess().getVarVARTYPETerminalRuleCall_3_1_1_0_1_0());
                            								

                            									if (current==null) {
                            										current = createModelElement(grammarAccess.getVERIFYRule());
                            									}
                            									setWithLastConsumed(
                            										current,
                            										"var",
                            										lv_var_15_0,
                            										"org.xtext.project.browserautomationdsl.Domainmodel.VARTYPE");
                            								

                            }


                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalDomainmodel.g:1154:6: ( (lv_value_16_0= RULE_STRING ) )
                            {
                            // InternalDomainmodel.g:1154:6: ( (lv_value_16_0= RULE_STRING ) )
                            // InternalDomainmodel.g:1155:7: (lv_value_16_0= RULE_STRING )
                            {
                            // InternalDomainmodel.g:1155:7: (lv_value_16_0= RULE_STRING )
                            // InternalDomainmodel.g:1156:8: lv_value_16_0= RULE_STRING
                            {
                            lv_value_16_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                            								newLeafNode(lv_value_16_0, grammarAccess.getVERIFYAccess().getValueSTRINGTerminalRuleCall_3_1_1_1_0());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getVERIFYRule());
                            								}
                            								setWithLastConsumed(
                            									current,
                            									"value",
                            									lv_value_16_0,
                            									"org.eclipse.xtext.common.Terminals.STRING");
                            							

                            }


                            }


                            }
                            break;

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
    // $ANTLR end "ruleVERIFY"


    // $ANTLR start "entryRuleCOUNT"
    // InternalDomainmodel.g:1179:1: entryRuleCOUNT returns [EObject current=null] : iv_ruleCOUNT= ruleCOUNT EOF ;
    public final EObject entryRuleCOUNT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCOUNT = null;


        try {
            // InternalDomainmodel.g:1179:46: (iv_ruleCOUNT= ruleCOUNT EOF )
            // InternalDomainmodel.g:1180:2: iv_ruleCOUNT= ruleCOUNT EOF
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
    // InternalDomainmodel.g:1186:1: ruleCOUNT returns [EObject current=null] : ( ( (lv_name_0_0= 'count' ) ) otherlv_1= 'ELEMENT' ruleELEMENTIDENTIFIER (this_SAVEVAR_3= ruleSAVEVAR )? ) ;
    public final EObject ruleCOUNT() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject this_SAVEVAR_3 = null;



        	enterRule();

        try {
            // InternalDomainmodel.g:1192:2: ( ( ( (lv_name_0_0= 'count' ) ) otherlv_1= 'ELEMENT' ruleELEMENTIDENTIFIER (this_SAVEVAR_3= ruleSAVEVAR )? ) )
            // InternalDomainmodel.g:1193:2: ( ( (lv_name_0_0= 'count' ) ) otherlv_1= 'ELEMENT' ruleELEMENTIDENTIFIER (this_SAVEVAR_3= ruleSAVEVAR )? )
            {
            // InternalDomainmodel.g:1193:2: ( ( (lv_name_0_0= 'count' ) ) otherlv_1= 'ELEMENT' ruleELEMENTIDENTIFIER (this_SAVEVAR_3= ruleSAVEVAR )? )
            // InternalDomainmodel.g:1194:3: ( (lv_name_0_0= 'count' ) ) otherlv_1= 'ELEMENT' ruleELEMENTIDENTIFIER (this_SAVEVAR_3= ruleSAVEVAR )?
            {
            // InternalDomainmodel.g:1194:3: ( (lv_name_0_0= 'count' ) )
            // InternalDomainmodel.g:1195:4: (lv_name_0_0= 'count' )
            {
            // InternalDomainmodel.g:1195:4: (lv_name_0_0= 'count' )
            // InternalDomainmodel.g:1196:5: lv_name_0_0= 'count'
            {
            lv_name_0_0=(Token)match(input,50,FOLLOW_33); 

            					newLeafNode(lv_name_0_0, grammarAccess.getCOUNTAccess().getNameCountKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCOUNTRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "count");
            				

            }


            }

            otherlv_1=(Token)match(input,51,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getCOUNTAccess().getELEMENTKeyword_1());
            		

            			newCompositeNode(grammarAccess.getCOUNTAccess().getELEMENTIDENTIFIERParserRuleCall_2());
            		
            pushFollow(FOLLOW_25);
            ruleELEMENTIDENTIFIER();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalDomainmodel.g:1219:3: (this_SAVEVAR_3= ruleSAVEVAR )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==52) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalDomainmodel.g:1220:4: this_SAVEVAR_3= ruleSAVEVAR
                    {

                    				newCompositeNode(grammarAccess.getCOUNTAccess().getSAVEVARParserRuleCall_3());
                    			
                    pushFollow(FOLLOW_2);
                    this_SAVEVAR_3=ruleSAVEVAR();

                    state._fsp--;


                    				current = this_SAVEVAR_3;
                    				afterParserOrEnumRuleCall();
                    			

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
    // InternalDomainmodel.g:1233:1: entryRuleSAVEVAR returns [EObject current=null] : iv_ruleSAVEVAR= ruleSAVEVAR EOF ;
    public final EObject entryRuleSAVEVAR() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSAVEVAR = null;


        try {
            // InternalDomainmodel.g:1233:48: (iv_ruleSAVEVAR= ruleSAVEVAR EOF )
            // InternalDomainmodel.g:1234:2: iv_ruleSAVEVAR= ruleSAVEVAR EOF
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
    // InternalDomainmodel.g:1240:1: ruleSAVEVAR returns [EObject current=null] : (otherlv_0= 'and' otherlv_1= 'save' otherlv_2= 'in' ( (lv_var_3_0= RULE_VARTYPE ) ) ) ;
    public final EObject ruleSAVEVAR() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_var_3_0=null;


        	enterRule();

        try {
            // InternalDomainmodel.g:1246:2: ( (otherlv_0= 'and' otherlv_1= 'save' otherlv_2= 'in' ( (lv_var_3_0= RULE_VARTYPE ) ) ) )
            // InternalDomainmodel.g:1247:2: (otherlv_0= 'and' otherlv_1= 'save' otherlv_2= 'in' ( (lv_var_3_0= RULE_VARTYPE ) ) )
            {
            // InternalDomainmodel.g:1247:2: (otherlv_0= 'and' otherlv_1= 'save' otherlv_2= 'in' ( (lv_var_3_0= RULE_VARTYPE ) ) )
            // InternalDomainmodel.g:1248:3: otherlv_0= 'and' otherlv_1= 'save' otherlv_2= 'in' ( (lv_var_3_0= RULE_VARTYPE ) )
            {
            otherlv_0=(Token)match(input,52,FOLLOW_34); 

            			newLeafNode(otherlv_0, grammarAccess.getSAVEVARAccess().getAndKeyword_0());
            		
            otherlv_1=(Token)match(input,53,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getSAVEVARAccess().getSaveKeyword_1());
            		
            otherlv_2=(Token)match(input,34,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getSAVEVARAccess().getInKeyword_2());
            		
            // InternalDomainmodel.g:1260:3: ( (lv_var_3_0= RULE_VARTYPE ) )
            // InternalDomainmodel.g:1261:4: (lv_var_3_0= RULE_VARTYPE )
            {
            // InternalDomainmodel.g:1261:4: (lv_var_3_0= RULE_VARTYPE )
            // InternalDomainmodel.g:1262:5: lv_var_3_0= RULE_VARTYPE
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
    // InternalDomainmodel.g:1282:1: entryRulePLAY returns [EObject current=null] : iv_rulePLAY= rulePLAY EOF ;
    public final EObject entryRulePLAY() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePLAY = null;


        try {
            // InternalDomainmodel.g:1282:45: (iv_rulePLAY= rulePLAY EOF )
            // InternalDomainmodel.g:1283:2: iv_rulePLAY= rulePLAY EOF
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
    // InternalDomainmodel.g:1289:1: rulePLAY returns [EObject current=null] : ( ( (lv_name_0_0= 'play' ) ) otherlv_1= 'procedure' this_VARTYPE_2= RULE_VARTYPE ( (lv_params_3_0= RULE_STRING ) )* ) ;
    public final EObject rulePLAY() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token this_VARTYPE_2=null;
        Token lv_params_3_0=null;


        	enterRule();

        try {
            // InternalDomainmodel.g:1295:2: ( ( ( (lv_name_0_0= 'play' ) ) otherlv_1= 'procedure' this_VARTYPE_2= RULE_VARTYPE ( (lv_params_3_0= RULE_STRING ) )* ) )
            // InternalDomainmodel.g:1296:2: ( ( (lv_name_0_0= 'play' ) ) otherlv_1= 'procedure' this_VARTYPE_2= RULE_VARTYPE ( (lv_params_3_0= RULE_STRING ) )* )
            {
            // InternalDomainmodel.g:1296:2: ( ( (lv_name_0_0= 'play' ) ) otherlv_1= 'procedure' this_VARTYPE_2= RULE_VARTYPE ( (lv_params_3_0= RULE_STRING ) )* )
            // InternalDomainmodel.g:1297:3: ( (lv_name_0_0= 'play' ) ) otherlv_1= 'procedure' this_VARTYPE_2= RULE_VARTYPE ( (lv_params_3_0= RULE_STRING ) )*
            {
            // InternalDomainmodel.g:1297:3: ( (lv_name_0_0= 'play' ) )
            // InternalDomainmodel.g:1298:4: (lv_name_0_0= 'play' )
            {
            // InternalDomainmodel.g:1298:4: (lv_name_0_0= 'play' )
            // InternalDomainmodel.g:1299:5: lv_name_0_0= 'play'
            {
            lv_name_0_0=(Token)match(input,54,FOLLOW_35); 

            					newLeafNode(lv_name_0_0, grammarAccess.getPLAYAccess().getNamePlayKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPLAYRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "play");
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getPLAYAccess().getProcedureKeyword_1());
            		
            this_VARTYPE_2=(Token)match(input,RULE_VARTYPE,FOLLOW_36); 

            			newLeafNode(this_VARTYPE_2, grammarAccess.getPLAYAccess().getVARTYPETerminalRuleCall_2());
            		
            // InternalDomainmodel.g:1319:3: ( (lv_params_3_0= RULE_STRING ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_STRING) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalDomainmodel.g:1320:4: (lv_params_3_0= RULE_STRING )
            	    {
            	    // InternalDomainmodel.g:1320:4: (lv_params_3_0= RULE_STRING )
            	    // InternalDomainmodel.g:1321:5: lv_params_3_0= RULE_STRING
            	    {
            	    lv_params_3_0=(Token)match(input,RULE_STRING,FOLLOW_36); 

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
            	    break loop29;
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
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x00001E0000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0004800001000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0003000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0003008000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000010C00020L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000022L});

}