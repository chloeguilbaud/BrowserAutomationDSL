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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_VARTYPE", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'procedure'", "'with'", "'open'", "'FIREFOX'", "'CHROME'", "'go'", "'to'", "'\"'", "'given'", "'click'", "'on'", "'BUTTON'", "'LINK'", "'IMAGE'", "'TEXT'", "'fill'", "'TEXTFIELD'", "'SEARCHFIELD'", "'saved'", "'check'", "'all'", "'CHECKBOX'", "'uncheck'", "'select'", "'in'", "'COMBOBOX'", "'read'", "'url'", "'from'", "'identified'", "'by'", "'LABEL'", "'CLASS'", "'ID'", "'ALT'", "'count'", "'ELEMENT'", "'and'", "'save'", "'verify'", "'that'", "'PAGE'", "'contains'", "'play'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
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
    // InternalDomainmodel.g:71:1: rulePROGRAMME returns [EObject current=null] : (otherlv_0= 'procedure' ( (lv_name_1_0= RULE_VARTYPE ) ) (otherlv_2= 'with' ( (lv_param_3_0= RULE_VARTYPE ) ) ( (lv_params_4_0= RULE_VARTYPE ) )* )? ( (lv_inst_5_0= ruleINSTRUCTION ) )* )? ;
    public final EObject rulePROGRAMME() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_param_3_0=null;
        Token lv_params_4_0=null;
        EObject lv_inst_5_0 = null;



        	enterRule();

        try {
            // InternalDomainmodel.g:77:2: ( (otherlv_0= 'procedure' ( (lv_name_1_0= RULE_VARTYPE ) ) (otherlv_2= 'with' ( (lv_param_3_0= RULE_VARTYPE ) ) ( (lv_params_4_0= RULE_VARTYPE ) )* )? ( (lv_inst_5_0= ruleINSTRUCTION ) )* )? )
            // InternalDomainmodel.g:78:2: (otherlv_0= 'procedure' ( (lv_name_1_0= RULE_VARTYPE ) ) (otherlv_2= 'with' ( (lv_param_3_0= RULE_VARTYPE ) ) ( (lv_params_4_0= RULE_VARTYPE ) )* )? ( (lv_inst_5_0= ruleINSTRUCTION ) )* )?
            {
            // InternalDomainmodel.g:78:2: (otherlv_0= 'procedure' ( (lv_name_1_0= RULE_VARTYPE ) ) (otherlv_2= 'with' ( (lv_param_3_0= RULE_VARTYPE ) ) ( (lv_params_4_0= RULE_VARTYPE ) )* )? ( (lv_inst_5_0= ruleINSTRUCTION ) )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==12) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalDomainmodel.g:79:3: otherlv_0= 'procedure' ( (lv_name_1_0= RULE_VARTYPE ) ) (otherlv_2= 'with' ( (lv_param_3_0= RULE_VARTYPE ) ) ( (lv_params_4_0= RULE_VARTYPE ) )* )? ( (lv_inst_5_0= ruleINSTRUCTION ) )*
                    {
                    otherlv_0=(Token)match(input,12,FOLLOW_3); 

                    			newLeafNode(otherlv_0, grammarAccess.getPROGRAMMEAccess().getProcedureKeyword_0());
                    		
                    // InternalDomainmodel.g:83:3: ( (lv_name_1_0= RULE_VARTYPE ) )
                    // InternalDomainmodel.g:84:4: (lv_name_1_0= RULE_VARTYPE )
                    {
                    // InternalDomainmodel.g:84:4: (lv_name_1_0= RULE_VARTYPE )
                    // InternalDomainmodel.g:85:5: lv_name_1_0= RULE_VARTYPE
                    {
                    lv_name_1_0=(Token)match(input,RULE_VARTYPE,FOLLOW_4); 

                    					newLeafNode(lv_name_1_0, grammarAccess.getPROGRAMMEAccess().getNameVARTYPETerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPROGRAMMERule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_1_0,
                    						"org.xtext.project.browserautomationdsl.Domainmodel.VARTYPE");
                    				

                    }


                    }

                    // InternalDomainmodel.g:101:3: (otherlv_2= 'with' ( (lv_param_3_0= RULE_VARTYPE ) ) ( (lv_params_4_0= RULE_VARTYPE ) )* )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==13) ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // InternalDomainmodel.g:102:4: otherlv_2= 'with' ( (lv_param_3_0= RULE_VARTYPE ) ) ( (lv_params_4_0= RULE_VARTYPE ) )*
                            {
                            otherlv_2=(Token)match(input,13,FOLLOW_3); 

                            				newLeafNode(otherlv_2, grammarAccess.getPROGRAMMEAccess().getWithKeyword_2_0());
                            			
                            // InternalDomainmodel.g:106:4: ( (lv_param_3_0= RULE_VARTYPE ) )
                            // InternalDomainmodel.g:107:5: (lv_param_3_0= RULE_VARTYPE )
                            {
                            // InternalDomainmodel.g:107:5: (lv_param_3_0= RULE_VARTYPE )
                            // InternalDomainmodel.g:108:6: lv_param_3_0= RULE_VARTYPE
                            {
                            lv_param_3_0=(Token)match(input,RULE_VARTYPE,FOLLOW_5); 

                            						newLeafNode(lv_param_3_0, grammarAccess.getPROGRAMMEAccess().getParamVARTYPETerminalRuleCall_2_1_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getPROGRAMMERule());
                            						}
                            						setWithLastConsumed(
                            							current,
                            							"param",
                            							lv_param_3_0,
                            							"org.xtext.project.browserautomationdsl.Domainmodel.VARTYPE");
                            					

                            }


                            }

                            // InternalDomainmodel.g:124:4: ( (lv_params_4_0= RULE_VARTYPE ) )*
                            loop1:
                            do {
                                int alt1=2;
                                int LA1_0 = input.LA(1);

                                if ( (LA1_0==RULE_VARTYPE) ) {
                                    alt1=1;
                                }


                                switch (alt1) {
                            	case 1 :
                            	    // InternalDomainmodel.g:125:5: (lv_params_4_0= RULE_VARTYPE )
                            	    {
                            	    // InternalDomainmodel.g:125:5: (lv_params_4_0= RULE_VARTYPE )
                            	    // InternalDomainmodel.g:126:6: lv_params_4_0= RULE_VARTYPE
                            	    {
                            	    lv_params_4_0=(Token)match(input,RULE_VARTYPE,FOLLOW_5); 

                            	    						newLeafNode(lv_params_4_0, grammarAccess.getPROGRAMMEAccess().getParamsVARTYPETerminalRuleCall_2_2_0());
                            	    					

                            	    						if (current==null) {
                            	    							current = createModelElement(grammarAccess.getPROGRAMMERule());
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
                            	    break loop1;
                                }
                            } while (true);


                            }
                            break;

                    }

                    // InternalDomainmodel.g:143:3: ( (lv_inst_5_0= ruleINSTRUCTION ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==14||LA3_0==17||LA3_0==21||LA3_0==27||LA3_0==31||(LA3_0>=34 && LA3_0<=35)||LA3_0==38||LA3_0==47||LA3_0==51||LA3_0==55) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalDomainmodel.g:144:4: (lv_inst_5_0= ruleINSTRUCTION )
                    	    {
                    	    // InternalDomainmodel.g:144:4: (lv_inst_5_0= ruleINSTRUCTION )
                    	    // InternalDomainmodel.g:145:5: lv_inst_5_0= ruleINSTRUCTION
                    	    {

                    	    					newCompositeNode(grammarAccess.getPROGRAMMEAccess().getInstINSTRUCTIONParserRuleCall_3_0());
                    	    				
                    	    pushFollow(FOLLOW_6);
                    	    lv_inst_5_0=ruleINSTRUCTION();

                    	    state._fsp--;


                    	    					if (current==null) {
                    	    						current = createModelElementForParent(grammarAccess.getPROGRAMMERule());
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
                    	    break loop3;
                        }
                    } while (true);


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
    // $ANTLR end "rulePROGRAMME"


    // $ANTLR start "entryRuleINSTRUCTION"
    // InternalDomainmodel.g:166:1: entryRuleINSTRUCTION returns [EObject current=null] : iv_ruleINSTRUCTION= ruleINSTRUCTION EOF ;
    public final EObject entryRuleINSTRUCTION() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleINSTRUCTION = null;


        try {
            // InternalDomainmodel.g:166:52: (iv_ruleINSTRUCTION= ruleINSTRUCTION EOF )
            // InternalDomainmodel.g:167:2: iv_ruleINSTRUCTION= ruleINSTRUCTION EOF
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
    // InternalDomainmodel.g:173:1: ruleINSTRUCTION returns [EObject current=null] : ( ( () ruleOPEN ) | ( () ruleCLICK ) | ( () ruleCHECK ) | ( () ruleUNCHECK ) | this_READ_8= ruleREAD | this_COUNT_9= ruleCOUNT | this_VERIFY_10= ruleVERIFY | this_SELECT_11= ruleSELECT | this_GOTO_12= ruleGOTO | this_FILL_13= ruleFILL | this_PLAY_14= rulePLAY ) ;
    public final EObject ruleINSTRUCTION() throws RecognitionException {
        EObject current = null;

        EObject this_READ_8 = null;

        EObject this_COUNT_9 = null;

        EObject this_VERIFY_10 = null;

        EObject this_SELECT_11 = null;

        EObject this_GOTO_12 = null;

        EObject this_FILL_13 = null;

        EObject this_PLAY_14 = null;



        	enterRule();

        try {
            // InternalDomainmodel.g:179:2: ( ( ( () ruleOPEN ) | ( () ruleCLICK ) | ( () ruleCHECK ) | ( () ruleUNCHECK ) | this_READ_8= ruleREAD | this_COUNT_9= ruleCOUNT | this_VERIFY_10= ruleVERIFY | this_SELECT_11= ruleSELECT | this_GOTO_12= ruleGOTO | this_FILL_13= ruleFILL | this_PLAY_14= rulePLAY ) )
            // InternalDomainmodel.g:180:2: ( ( () ruleOPEN ) | ( () ruleCLICK ) | ( () ruleCHECK ) | ( () ruleUNCHECK ) | this_READ_8= ruleREAD | this_COUNT_9= ruleCOUNT | this_VERIFY_10= ruleVERIFY | this_SELECT_11= ruleSELECT | this_GOTO_12= ruleGOTO | this_FILL_13= ruleFILL | this_PLAY_14= rulePLAY )
            {
            // InternalDomainmodel.g:180:2: ( ( () ruleOPEN ) | ( () ruleCLICK ) | ( () ruleCHECK ) | ( () ruleUNCHECK ) | this_READ_8= ruleREAD | this_COUNT_9= ruleCOUNT | this_VERIFY_10= ruleVERIFY | this_SELECT_11= ruleSELECT | this_GOTO_12= ruleGOTO | this_FILL_13= ruleFILL | this_PLAY_14= rulePLAY )
            int alt5=11;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt5=1;
                }
                break;
            case 21:
                {
                alt5=2;
                }
                break;
            case 31:
                {
                alt5=3;
                }
                break;
            case 34:
                {
                alt5=4;
                }
                break;
            case 38:
                {
                alt5=5;
                }
                break;
            case 47:
                {
                alt5=6;
                }
                break;
            case 51:
                {
                alt5=7;
                }
                break;
            case 35:
                {
                alt5=8;
                }
                break;
            case 17:
                {
                alt5=9;
                }
                break;
            case 27:
                {
                alt5=10;
                }
                break;
            case 55:
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
                    // InternalDomainmodel.g:181:3: ( () ruleOPEN )
                    {
                    // InternalDomainmodel.g:181:3: ( () ruleOPEN )
                    // InternalDomainmodel.g:182:4: () ruleOPEN
                    {
                    // InternalDomainmodel.g:182:4: ()
                    // InternalDomainmodel.g:183:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getINSTRUCTIONAccess().getINSTRUCTIONAction_0_0(),
                    						current);
                    				

                    }


                    				newCompositeNode(grammarAccess.getINSTRUCTIONAccess().getOPENParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_2);
                    ruleOPEN();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDomainmodel.g:198:3: ( () ruleCLICK )
                    {
                    // InternalDomainmodel.g:198:3: ( () ruleCLICK )
                    // InternalDomainmodel.g:199:4: () ruleCLICK
                    {
                    // InternalDomainmodel.g:199:4: ()
                    // InternalDomainmodel.g:200:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getINSTRUCTIONAccess().getINSTRUCTIONAction_1_0(),
                    						current);
                    				

                    }


                    				newCompositeNode(grammarAccess.getINSTRUCTIONAccess().getCLICKParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_2);
                    ruleCLICK();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDomainmodel.g:215:3: ( () ruleCHECK )
                    {
                    // InternalDomainmodel.g:215:3: ( () ruleCHECK )
                    // InternalDomainmodel.g:216:4: () ruleCHECK
                    {
                    // InternalDomainmodel.g:216:4: ()
                    // InternalDomainmodel.g:217:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getINSTRUCTIONAccess().getINSTRUCTIONAction_2_0(),
                    						current);
                    				

                    }


                    				newCompositeNode(grammarAccess.getINSTRUCTIONAccess().getCHECKParserRuleCall_2_1());
                    			
                    pushFollow(FOLLOW_2);
                    ruleCHECK();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalDomainmodel.g:232:3: ( () ruleUNCHECK )
                    {
                    // InternalDomainmodel.g:232:3: ( () ruleUNCHECK )
                    // InternalDomainmodel.g:233:4: () ruleUNCHECK
                    {
                    // InternalDomainmodel.g:233:4: ()
                    // InternalDomainmodel.g:234:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getINSTRUCTIONAccess().getINSTRUCTIONAction_3_0(),
                    						current);
                    				

                    }


                    				newCompositeNode(grammarAccess.getINSTRUCTIONAccess().getUNCHECKParserRuleCall_3_1());
                    			
                    pushFollow(FOLLOW_2);
                    ruleUNCHECK();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalDomainmodel.g:249:3: this_READ_8= ruleREAD
                    {

                    			newCompositeNode(grammarAccess.getINSTRUCTIONAccess().getREADParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_READ_8=ruleREAD();

                    state._fsp--;


                    			current = this_READ_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalDomainmodel.g:258:3: this_COUNT_9= ruleCOUNT
                    {

                    			newCompositeNode(grammarAccess.getINSTRUCTIONAccess().getCOUNTParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_COUNT_9=ruleCOUNT();

                    state._fsp--;


                    			current = this_COUNT_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalDomainmodel.g:267:3: this_VERIFY_10= ruleVERIFY
                    {

                    			newCompositeNode(grammarAccess.getINSTRUCTIONAccess().getVERIFYParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_VERIFY_10=ruleVERIFY();

                    state._fsp--;


                    			current = this_VERIFY_10;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalDomainmodel.g:276:3: this_SELECT_11= ruleSELECT
                    {

                    			newCompositeNode(grammarAccess.getINSTRUCTIONAccess().getSELECTParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_SELECT_11=ruleSELECT();

                    state._fsp--;


                    			current = this_SELECT_11;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalDomainmodel.g:285:3: this_GOTO_12= ruleGOTO
                    {

                    			newCompositeNode(grammarAccess.getINSTRUCTIONAccess().getGOTOParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_GOTO_12=ruleGOTO();

                    state._fsp--;


                    			current = this_GOTO_12;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalDomainmodel.g:294:3: this_FILL_13= ruleFILL
                    {

                    			newCompositeNode(grammarAccess.getINSTRUCTIONAccess().getFILLParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_FILL_13=ruleFILL();

                    state._fsp--;


                    			current = this_FILL_13;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 11 :
                    // InternalDomainmodel.g:303:3: this_PLAY_14= rulePLAY
                    {

                    			newCompositeNode(grammarAccess.getINSTRUCTIONAccess().getPLAYParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_PLAY_14=rulePLAY();

                    state._fsp--;


                    			current = this_PLAY_14;
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
    // InternalDomainmodel.g:315:1: entryRuleOPEN returns [String current=null] : iv_ruleOPEN= ruleOPEN EOF ;
    public final String entryRuleOPEN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOPEN = null;


        try {
            // InternalDomainmodel.g:315:44: (iv_ruleOPEN= ruleOPEN EOF )
            // InternalDomainmodel.g:316:2: iv_ruleOPEN= ruleOPEN EOF
            {
             newCompositeNode(grammarAccess.getOPENRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOPEN=ruleOPEN();

            state._fsp--;

             current =iv_ruleOPEN.getText(); 
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
    // InternalDomainmodel.g:322:1: ruleOPEN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'open' (kw= 'FIREFOX' | kw= 'CHROME' ) ) ;
    public final AntlrDatatypeRuleToken ruleOPEN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDomainmodel.g:328:2: ( (kw= 'open' (kw= 'FIREFOX' | kw= 'CHROME' ) ) )
            // InternalDomainmodel.g:329:2: (kw= 'open' (kw= 'FIREFOX' | kw= 'CHROME' ) )
            {
            // InternalDomainmodel.g:329:2: (kw= 'open' (kw= 'FIREFOX' | kw= 'CHROME' ) )
            // InternalDomainmodel.g:330:3: kw= 'open' (kw= 'FIREFOX' | kw= 'CHROME' )
            {
            kw=(Token)match(input,14,FOLLOW_7); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getOPENAccess().getOpenKeyword_0());
            		
            // InternalDomainmodel.g:335:3: (kw= 'FIREFOX' | kw= 'CHROME' )
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
                    // InternalDomainmodel.g:336:4: kw= 'FIREFOX'
                    {
                    kw=(Token)match(input,15,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getOPENAccess().getFIREFOXKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalDomainmodel.g:342:4: kw= 'CHROME'
                    {
                    kw=(Token)match(input,16,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getOPENAccess().getCHROMEKeyword_1_1());
                    			

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
    // $ANTLR end "ruleOPEN"


    // $ANTLR start "entryRuleGOTO"
    // InternalDomainmodel.g:352:1: entryRuleGOTO returns [EObject current=null] : iv_ruleGOTO= ruleGOTO EOF ;
    public final EObject entryRuleGOTO() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGOTO = null;


        try {
            // InternalDomainmodel.g:352:45: (iv_ruleGOTO= ruleGOTO EOF )
            // InternalDomainmodel.g:353:2: iv_ruleGOTO= ruleGOTO EOF
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
    // InternalDomainmodel.g:359:1: ruleGOTO returns [EObject current=null] : (otherlv_0= 'go' otherlv_1= 'to' ( (otherlv_2= '\"' ( (lv_val_3_0= RULE_VARTYPE ) ) otherlv_4= '\"' ) | (otherlv_5= 'given' ( (lv_val_6_0= RULE_VARTYPE ) ) ) ) ) ;
    public final EObject ruleGOTO() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_val_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_val_6_0=null;


        	enterRule();

        try {
            // InternalDomainmodel.g:365:2: ( (otherlv_0= 'go' otherlv_1= 'to' ( (otherlv_2= '\"' ( (lv_val_3_0= RULE_VARTYPE ) ) otherlv_4= '\"' ) | (otherlv_5= 'given' ( (lv_val_6_0= RULE_VARTYPE ) ) ) ) ) )
            // InternalDomainmodel.g:366:2: (otherlv_0= 'go' otherlv_1= 'to' ( (otherlv_2= '\"' ( (lv_val_3_0= RULE_VARTYPE ) ) otherlv_4= '\"' ) | (otherlv_5= 'given' ( (lv_val_6_0= RULE_VARTYPE ) ) ) ) )
            {
            // InternalDomainmodel.g:366:2: (otherlv_0= 'go' otherlv_1= 'to' ( (otherlv_2= '\"' ( (lv_val_3_0= RULE_VARTYPE ) ) otherlv_4= '\"' ) | (otherlv_5= 'given' ( (lv_val_6_0= RULE_VARTYPE ) ) ) ) )
            // InternalDomainmodel.g:367:3: otherlv_0= 'go' otherlv_1= 'to' ( (otherlv_2= '\"' ( (lv_val_3_0= RULE_VARTYPE ) ) otherlv_4= '\"' ) | (otherlv_5= 'given' ( (lv_val_6_0= RULE_VARTYPE ) ) ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getGOTOAccess().getGoKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getGOTOAccess().getToKeyword_1());
            		
            // InternalDomainmodel.g:375:3: ( (otherlv_2= '\"' ( (lv_val_3_0= RULE_VARTYPE ) ) otherlv_4= '\"' ) | (otherlv_5= 'given' ( (lv_val_6_0= RULE_VARTYPE ) ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            else if ( (LA7_0==20) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalDomainmodel.g:376:4: (otherlv_2= '\"' ( (lv_val_3_0= RULE_VARTYPE ) ) otherlv_4= '\"' )
                    {
                    // InternalDomainmodel.g:376:4: (otherlv_2= '\"' ( (lv_val_3_0= RULE_VARTYPE ) ) otherlv_4= '\"' )
                    // InternalDomainmodel.g:377:5: otherlv_2= '\"' ( (lv_val_3_0= RULE_VARTYPE ) ) otherlv_4= '\"'
                    {
                    otherlv_2=(Token)match(input,19,FOLLOW_3); 

                    					newLeafNode(otherlv_2, grammarAccess.getGOTOAccess().getQuotationMarkKeyword_2_0_0());
                    				
                    // InternalDomainmodel.g:381:5: ( (lv_val_3_0= RULE_VARTYPE ) )
                    // InternalDomainmodel.g:382:6: (lv_val_3_0= RULE_VARTYPE )
                    {
                    // InternalDomainmodel.g:382:6: (lv_val_3_0= RULE_VARTYPE )
                    // InternalDomainmodel.g:383:7: lv_val_3_0= RULE_VARTYPE
                    {
                    lv_val_3_0=(Token)match(input,RULE_VARTYPE,FOLLOW_10); 

                    							newLeafNode(lv_val_3_0, grammarAccess.getGOTOAccess().getValVARTYPETerminalRuleCall_2_0_1_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getGOTORule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"val",
                    								lv_val_3_0,
                    								"org.xtext.project.browserautomationdsl.Domainmodel.VARTYPE");
                    						

                    }


                    }

                    otherlv_4=(Token)match(input,19,FOLLOW_2); 

                    					newLeafNode(otherlv_4, grammarAccess.getGOTOAccess().getQuotationMarkKeyword_2_0_2());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalDomainmodel.g:405:4: (otherlv_5= 'given' ( (lv_val_6_0= RULE_VARTYPE ) ) )
                    {
                    // InternalDomainmodel.g:405:4: (otherlv_5= 'given' ( (lv_val_6_0= RULE_VARTYPE ) ) )
                    // InternalDomainmodel.g:406:5: otherlv_5= 'given' ( (lv_val_6_0= RULE_VARTYPE ) )
                    {
                    otherlv_5=(Token)match(input,20,FOLLOW_3); 

                    					newLeafNode(otherlv_5, grammarAccess.getGOTOAccess().getGivenKeyword_2_1_0());
                    				
                    // InternalDomainmodel.g:410:5: ( (lv_val_6_0= RULE_VARTYPE ) )
                    // InternalDomainmodel.g:411:6: (lv_val_6_0= RULE_VARTYPE )
                    {
                    // InternalDomainmodel.g:411:6: (lv_val_6_0= RULE_VARTYPE )
                    // InternalDomainmodel.g:412:7: lv_val_6_0= RULE_VARTYPE
                    {
                    lv_val_6_0=(Token)match(input,RULE_VARTYPE,FOLLOW_2); 

                    							newLeafNode(lv_val_6_0, grammarAccess.getGOTOAccess().getValVARTYPETerminalRuleCall_2_1_1_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getGOTORule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"val",
                    								lv_val_6_0,
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
    // $ANTLR end "ruleGOTO"


    // $ANTLR start "entryRuleCLICK"
    // InternalDomainmodel.g:434:1: entryRuleCLICK returns [String current=null] : iv_ruleCLICK= ruleCLICK EOF ;
    public final String entryRuleCLICK() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCLICK = null;


        try {
            // InternalDomainmodel.g:434:45: (iv_ruleCLICK= ruleCLICK EOF )
            // InternalDomainmodel.g:435:2: iv_ruleCLICK= ruleCLICK EOF
            {
             newCompositeNode(grammarAccess.getCLICKRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCLICK=ruleCLICK();

            state._fsp--;

             current =iv_ruleCLICK.getText(); 
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
    // InternalDomainmodel.g:441:1: ruleCLICK returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'click' kw= 'on' (kw= 'BUTTON' | kw= 'LINK' | kw= 'IMAGE' | kw= 'TEXT' ) this_ELEMENTIDENTIFIER_6= ruleELEMENTIDENTIFIER ) ;
    public final AntlrDatatypeRuleToken ruleCLICK() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ELEMENTIDENTIFIER_6 = null;



        	enterRule();

        try {
            // InternalDomainmodel.g:447:2: ( (kw= 'click' kw= 'on' (kw= 'BUTTON' | kw= 'LINK' | kw= 'IMAGE' | kw= 'TEXT' ) this_ELEMENTIDENTIFIER_6= ruleELEMENTIDENTIFIER ) )
            // InternalDomainmodel.g:448:2: (kw= 'click' kw= 'on' (kw= 'BUTTON' | kw= 'LINK' | kw= 'IMAGE' | kw= 'TEXT' ) this_ELEMENTIDENTIFIER_6= ruleELEMENTIDENTIFIER )
            {
            // InternalDomainmodel.g:448:2: (kw= 'click' kw= 'on' (kw= 'BUTTON' | kw= 'LINK' | kw= 'IMAGE' | kw= 'TEXT' ) this_ELEMENTIDENTIFIER_6= ruleELEMENTIDENTIFIER )
            // InternalDomainmodel.g:449:3: kw= 'click' kw= 'on' (kw= 'BUTTON' | kw= 'LINK' | kw= 'IMAGE' | kw= 'TEXT' ) this_ELEMENTIDENTIFIER_6= ruleELEMENTIDENTIFIER
            {
            kw=(Token)match(input,21,FOLLOW_11); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getCLICKAccess().getClickKeyword_0());
            		
            kw=(Token)match(input,22,FOLLOW_12); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getCLICKAccess().getOnKeyword_1());
            		
            // InternalDomainmodel.g:459:3: (kw= 'BUTTON' | kw= 'LINK' | kw= 'IMAGE' | kw= 'TEXT' )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt8=1;
                }
                break;
            case 24:
                {
                alt8=2;
                }
                break;
            case 25:
                {
                alt8=3;
                }
                break;
            case 26:
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
                    // InternalDomainmodel.g:460:4: kw= 'BUTTON'
                    {
                    kw=(Token)match(input,23,FOLLOW_13); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getCLICKAccess().getBUTTONKeyword_2_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalDomainmodel.g:466:4: kw= 'LINK'
                    {
                    kw=(Token)match(input,24,FOLLOW_13); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getCLICKAccess().getLINKKeyword_2_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalDomainmodel.g:472:4: kw= 'IMAGE'
                    {
                    kw=(Token)match(input,25,FOLLOW_13); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getCLICKAccess().getIMAGEKeyword_2_2());
                    			

                    }
                    break;
                case 4 :
                    // InternalDomainmodel.g:478:4: kw= 'TEXT'
                    {
                    kw=(Token)match(input,26,FOLLOW_13); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getCLICKAccess().getTEXTKeyword_2_3());
                    			

                    }
                    break;

            }


            			newCompositeNode(grammarAccess.getCLICKAccess().getELEMENTIDENTIFIERParserRuleCall_3());
            		
            pushFollow(FOLLOW_2);
            this_ELEMENTIDENTIFIER_6=ruleELEMENTIDENTIFIER();

            state._fsp--;


            			current.merge(this_ELEMENTIDENTIFIER_6);
            		

            			afterParserOrEnumRuleCall();
            		

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
    // InternalDomainmodel.g:498:1: entryRuleFILL returns [EObject current=null] : iv_ruleFILL= ruleFILL EOF ;
    public final EObject entryRuleFILL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFILL = null;


        try {
            // InternalDomainmodel.g:498:45: (iv_ruleFILL= ruleFILL EOF )
            // InternalDomainmodel.g:499:2: iv_ruleFILL= ruleFILL EOF
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
    // InternalDomainmodel.g:505:1: ruleFILL returns [EObject current=null] : (otherlv_0= 'fill' (otherlv_1= 'TEXTFIELD' | otherlv_2= 'SEARCHFIELD' ) ( ruleELEMENTIDENTIFIER )? otherlv_4= 'with' ( (otherlv_5= 'saved' ( (lv_var_6_0= RULE_VARTYPE ) ) ) | (otherlv_7= '\"' ( (lv_value_8_0= RULE_STRING ) ) otherlv_9= '\"' ) ) ) ;
    public final EObject ruleFILL() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_var_6_0=null;
        Token otherlv_7=null;
        Token lv_value_8_0=null;
        Token otherlv_9=null;


        	enterRule();

        try {
            // InternalDomainmodel.g:511:2: ( (otherlv_0= 'fill' (otherlv_1= 'TEXTFIELD' | otherlv_2= 'SEARCHFIELD' ) ( ruleELEMENTIDENTIFIER )? otherlv_4= 'with' ( (otherlv_5= 'saved' ( (lv_var_6_0= RULE_VARTYPE ) ) ) | (otherlv_7= '\"' ( (lv_value_8_0= RULE_STRING ) ) otherlv_9= '\"' ) ) ) )
            // InternalDomainmodel.g:512:2: (otherlv_0= 'fill' (otherlv_1= 'TEXTFIELD' | otherlv_2= 'SEARCHFIELD' ) ( ruleELEMENTIDENTIFIER )? otherlv_4= 'with' ( (otherlv_5= 'saved' ( (lv_var_6_0= RULE_VARTYPE ) ) ) | (otherlv_7= '\"' ( (lv_value_8_0= RULE_STRING ) ) otherlv_9= '\"' ) ) )
            {
            // InternalDomainmodel.g:512:2: (otherlv_0= 'fill' (otherlv_1= 'TEXTFIELD' | otherlv_2= 'SEARCHFIELD' ) ( ruleELEMENTIDENTIFIER )? otherlv_4= 'with' ( (otherlv_5= 'saved' ( (lv_var_6_0= RULE_VARTYPE ) ) ) | (otherlv_7= '\"' ( (lv_value_8_0= RULE_STRING ) ) otherlv_9= '\"' ) ) )
            // InternalDomainmodel.g:513:3: otherlv_0= 'fill' (otherlv_1= 'TEXTFIELD' | otherlv_2= 'SEARCHFIELD' ) ( ruleELEMENTIDENTIFIER )? otherlv_4= 'with' ( (otherlv_5= 'saved' ( (lv_var_6_0= RULE_VARTYPE ) ) ) | (otherlv_7= '\"' ( (lv_value_8_0= RULE_STRING ) ) otherlv_9= '\"' ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getFILLAccess().getFillKeyword_0());
            		
            // InternalDomainmodel.g:517:3: (otherlv_1= 'TEXTFIELD' | otherlv_2= 'SEARCHFIELD' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==28) ) {
                alt9=1;
            }
            else if ( (LA9_0==29) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalDomainmodel.g:518:4: otherlv_1= 'TEXTFIELD'
                    {
                    otherlv_1=(Token)match(input,28,FOLLOW_15); 

                    				newLeafNode(otherlv_1, grammarAccess.getFILLAccess().getTEXTFIELDKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalDomainmodel.g:523:4: otherlv_2= 'SEARCHFIELD'
                    {
                    otherlv_2=(Token)match(input,29,FOLLOW_15); 

                    				newLeafNode(otherlv_2, grammarAccess.getFILLAccess().getSEARCHFIELDKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalDomainmodel.g:528:3: ( ruleELEMENTIDENTIFIER )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==41) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalDomainmodel.g:529:4: ruleELEMENTIDENTIFIER
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
            		
            // InternalDomainmodel.g:541:3: ( (otherlv_5= 'saved' ( (lv_var_6_0= RULE_VARTYPE ) ) ) | (otherlv_7= '\"' ( (lv_value_8_0= RULE_STRING ) ) otherlv_9= '\"' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==30) ) {
                alt11=1;
            }
            else if ( (LA11_0==19) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalDomainmodel.g:542:4: (otherlv_5= 'saved' ( (lv_var_6_0= RULE_VARTYPE ) ) )
                    {
                    // InternalDomainmodel.g:542:4: (otherlv_5= 'saved' ( (lv_var_6_0= RULE_VARTYPE ) ) )
                    // InternalDomainmodel.g:543:5: otherlv_5= 'saved' ( (lv_var_6_0= RULE_VARTYPE ) )
                    {
                    otherlv_5=(Token)match(input,30,FOLLOW_3); 

                    					newLeafNode(otherlv_5, grammarAccess.getFILLAccess().getSavedKeyword_4_0_0());
                    				
                    // InternalDomainmodel.g:547:5: ( (lv_var_6_0= RULE_VARTYPE ) )
                    // InternalDomainmodel.g:548:6: (lv_var_6_0= RULE_VARTYPE )
                    {
                    // InternalDomainmodel.g:548:6: (lv_var_6_0= RULE_VARTYPE )
                    // InternalDomainmodel.g:549:7: lv_var_6_0= RULE_VARTYPE
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
                    // InternalDomainmodel.g:567:4: (otherlv_7= '\"' ( (lv_value_8_0= RULE_STRING ) ) otherlv_9= '\"' )
                    {
                    // InternalDomainmodel.g:567:4: (otherlv_7= '\"' ( (lv_value_8_0= RULE_STRING ) ) otherlv_9= '\"' )
                    // InternalDomainmodel.g:568:5: otherlv_7= '\"' ( (lv_value_8_0= RULE_STRING ) ) otherlv_9= '\"'
                    {
                    otherlv_7=(Token)match(input,19,FOLLOW_18); 

                    					newLeafNode(otherlv_7, grammarAccess.getFILLAccess().getQuotationMarkKeyword_4_1_0());
                    				
                    // InternalDomainmodel.g:572:5: ( (lv_value_8_0= RULE_STRING ) )
                    // InternalDomainmodel.g:573:6: (lv_value_8_0= RULE_STRING )
                    {
                    // InternalDomainmodel.g:573:6: (lv_value_8_0= RULE_STRING )
                    // InternalDomainmodel.g:574:7: lv_value_8_0= RULE_STRING
                    {
                    lv_value_8_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

                    							newLeafNode(lv_value_8_0, grammarAccess.getFILLAccess().getValueSTRINGTerminalRuleCall_4_1_1_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getFILLRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"value",
                    								lv_value_8_0,
                    								"org.eclipse.xtext.common.Terminals.STRING");
                    						

                    }


                    }

                    otherlv_9=(Token)match(input,19,FOLLOW_2); 

                    					newLeafNode(otherlv_9, grammarAccess.getFILLAccess().getQuotationMarkKeyword_4_1_2());
                    				

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
    // InternalDomainmodel.g:600:1: entryRuleCHECK returns [String current=null] : iv_ruleCHECK= ruleCHECK EOF ;
    public final String entryRuleCHECK() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCHECK = null;


        try {
            // InternalDomainmodel.g:600:45: (iv_ruleCHECK= ruleCHECK EOF )
            // InternalDomainmodel.g:601:2: iv_ruleCHECK= ruleCHECK EOF
            {
             newCompositeNode(grammarAccess.getCHECKRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCHECK=ruleCHECK();

            state._fsp--;

             current =iv_ruleCHECK.getText(); 
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
    // InternalDomainmodel.g:607:1: ruleCHECK returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'check' (kw= 'all' )? kw= 'CHECKBOX' (this_ELEMENTIDENTIFIER_3= ruleELEMENTIDENTIFIER )? ) ;
    public final AntlrDatatypeRuleToken ruleCHECK() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ELEMENTIDENTIFIER_3 = null;



        	enterRule();

        try {
            // InternalDomainmodel.g:613:2: ( (kw= 'check' (kw= 'all' )? kw= 'CHECKBOX' (this_ELEMENTIDENTIFIER_3= ruleELEMENTIDENTIFIER )? ) )
            // InternalDomainmodel.g:614:2: (kw= 'check' (kw= 'all' )? kw= 'CHECKBOX' (this_ELEMENTIDENTIFIER_3= ruleELEMENTIDENTIFIER )? )
            {
            // InternalDomainmodel.g:614:2: (kw= 'check' (kw= 'all' )? kw= 'CHECKBOX' (this_ELEMENTIDENTIFIER_3= ruleELEMENTIDENTIFIER )? )
            // InternalDomainmodel.g:615:3: kw= 'check' (kw= 'all' )? kw= 'CHECKBOX' (this_ELEMENTIDENTIFIER_3= ruleELEMENTIDENTIFIER )?
            {
            kw=(Token)match(input,31,FOLLOW_19); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getCHECKAccess().getCheckKeyword_0());
            		
            // InternalDomainmodel.g:620:3: (kw= 'all' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==32) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalDomainmodel.g:621:4: kw= 'all'
                    {
                    kw=(Token)match(input,32,FOLLOW_20); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getCHECKAccess().getAllKeyword_1());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,33,FOLLOW_21); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getCHECKAccess().getCHECKBOXKeyword_2());
            		
            // InternalDomainmodel.g:632:3: (this_ELEMENTIDENTIFIER_3= ruleELEMENTIDENTIFIER )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==41) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalDomainmodel.g:633:4: this_ELEMENTIDENTIFIER_3= ruleELEMENTIDENTIFIER
                    {

                    				newCompositeNode(grammarAccess.getCHECKAccess().getELEMENTIDENTIFIERParserRuleCall_3());
                    			
                    pushFollow(FOLLOW_2);
                    this_ELEMENTIDENTIFIER_3=ruleELEMENTIDENTIFIER();

                    state._fsp--;


                    				current.merge(this_ELEMENTIDENTIFIER_3);
                    			

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
    // InternalDomainmodel.g:648:1: entryRuleUNCHECK returns [String current=null] : iv_ruleUNCHECK= ruleUNCHECK EOF ;
    public final String entryRuleUNCHECK() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUNCHECK = null;


        try {
            // InternalDomainmodel.g:648:47: (iv_ruleUNCHECK= ruleUNCHECK EOF )
            // InternalDomainmodel.g:649:2: iv_ruleUNCHECK= ruleUNCHECK EOF
            {
             newCompositeNode(grammarAccess.getUNCHECKRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUNCHECK=ruleUNCHECK();

            state._fsp--;

             current =iv_ruleUNCHECK.getText(); 
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
    // InternalDomainmodel.g:655:1: ruleUNCHECK returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'uncheck' (kw= 'all' )? kw= 'CHECKBOX' (this_ELEMENTIDENTIFIER_3= ruleELEMENTIDENTIFIER )? ) ;
    public final AntlrDatatypeRuleToken ruleUNCHECK() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ELEMENTIDENTIFIER_3 = null;



        	enterRule();

        try {
            // InternalDomainmodel.g:661:2: ( (kw= 'uncheck' (kw= 'all' )? kw= 'CHECKBOX' (this_ELEMENTIDENTIFIER_3= ruleELEMENTIDENTIFIER )? ) )
            // InternalDomainmodel.g:662:2: (kw= 'uncheck' (kw= 'all' )? kw= 'CHECKBOX' (this_ELEMENTIDENTIFIER_3= ruleELEMENTIDENTIFIER )? )
            {
            // InternalDomainmodel.g:662:2: (kw= 'uncheck' (kw= 'all' )? kw= 'CHECKBOX' (this_ELEMENTIDENTIFIER_3= ruleELEMENTIDENTIFIER )? )
            // InternalDomainmodel.g:663:3: kw= 'uncheck' (kw= 'all' )? kw= 'CHECKBOX' (this_ELEMENTIDENTIFIER_3= ruleELEMENTIDENTIFIER )?
            {
            kw=(Token)match(input,34,FOLLOW_19); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getUNCHECKAccess().getUncheckKeyword_0());
            		
            // InternalDomainmodel.g:668:3: (kw= 'all' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==32) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalDomainmodel.g:669:4: kw= 'all'
                    {
                    kw=(Token)match(input,32,FOLLOW_20); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getUNCHECKAccess().getAllKeyword_1());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,33,FOLLOW_21); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getUNCHECKAccess().getCHECKBOXKeyword_2());
            		
            // InternalDomainmodel.g:680:3: (this_ELEMENTIDENTIFIER_3= ruleELEMENTIDENTIFIER )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==41) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalDomainmodel.g:681:4: this_ELEMENTIDENTIFIER_3= ruleELEMENTIDENTIFIER
                    {

                    				newCompositeNode(grammarAccess.getUNCHECKAccess().getELEMENTIDENTIFIERParserRuleCall_3());
                    			
                    pushFollow(FOLLOW_2);
                    this_ELEMENTIDENTIFIER_3=ruleELEMENTIDENTIFIER();

                    state._fsp--;


                    				current.merge(this_ELEMENTIDENTIFIER_3);
                    			

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
    // InternalDomainmodel.g:696:1: entryRuleSELECT returns [EObject current=null] : iv_ruleSELECT= ruleSELECT EOF ;
    public final EObject entryRuleSELECT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSELECT = null;


        try {
            // InternalDomainmodel.g:696:47: (iv_ruleSELECT= ruleSELECT EOF )
            // InternalDomainmodel.g:697:2: iv_ruleSELECT= ruleSELECT EOF
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
    // InternalDomainmodel.g:703:1: ruleSELECT returns [EObject current=null] : (otherlv_0= 'select' otherlv_1= '\"' ( (lv_elem_2_0= RULE_STRING ) ) otherlv_3= '\"' otherlv_4= 'in' otherlv_5= 'COMBOBOX' ( ruleELEMENTIDENTIFIER )? ) ;
    public final EObject ruleSELECT() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_elem_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalDomainmodel.g:709:2: ( (otherlv_0= 'select' otherlv_1= '\"' ( (lv_elem_2_0= RULE_STRING ) ) otherlv_3= '\"' otherlv_4= 'in' otherlv_5= 'COMBOBOX' ( ruleELEMENTIDENTIFIER )? ) )
            // InternalDomainmodel.g:710:2: (otherlv_0= 'select' otherlv_1= '\"' ( (lv_elem_2_0= RULE_STRING ) ) otherlv_3= '\"' otherlv_4= 'in' otherlv_5= 'COMBOBOX' ( ruleELEMENTIDENTIFIER )? )
            {
            // InternalDomainmodel.g:710:2: (otherlv_0= 'select' otherlv_1= '\"' ( (lv_elem_2_0= RULE_STRING ) ) otherlv_3= '\"' otherlv_4= 'in' otherlv_5= 'COMBOBOX' ( ruleELEMENTIDENTIFIER )? )
            // InternalDomainmodel.g:711:3: otherlv_0= 'select' otherlv_1= '\"' ( (lv_elem_2_0= RULE_STRING ) ) otherlv_3= '\"' otherlv_4= 'in' otherlv_5= 'COMBOBOX' ( ruleELEMENTIDENTIFIER )?
            {
            otherlv_0=(Token)match(input,35,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getSELECTAccess().getSelectKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getSELECTAccess().getQuotationMarkKeyword_1());
            		
            // InternalDomainmodel.g:719:3: ( (lv_elem_2_0= RULE_STRING ) )
            // InternalDomainmodel.g:720:4: (lv_elem_2_0= RULE_STRING )
            {
            // InternalDomainmodel.g:720:4: (lv_elem_2_0= RULE_STRING )
            // InternalDomainmodel.g:721:5: lv_elem_2_0= RULE_STRING
            {
            lv_elem_2_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

            					newLeafNode(lv_elem_2_0, grammarAccess.getSELECTAccess().getElemSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSELECTRule());
            					}
            					setWithLastConsumed(
            						current,
            						"elem",
            						lv_elem_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,19,FOLLOW_22); 

            			newLeafNode(otherlv_3, grammarAccess.getSELECTAccess().getQuotationMarkKeyword_3());
            		
            otherlv_4=(Token)match(input,36,FOLLOW_23); 

            			newLeafNode(otherlv_4, grammarAccess.getSELECTAccess().getInKeyword_4());
            		
            otherlv_5=(Token)match(input,37,FOLLOW_21); 

            			newLeafNode(otherlv_5, grammarAccess.getSELECTAccess().getCOMBOBOXKeyword_5());
            		
            // InternalDomainmodel.g:749:3: ( ruleELEMENTIDENTIFIER )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==41) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalDomainmodel.g:750:4: ruleELEMENTIDENTIFIER
                    {

                    				newCompositeNode(grammarAccess.getSELECTAccess().getELEMENTIDENTIFIERParserRuleCall_6());
                    			
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
    // InternalDomainmodel.g:762:1: entryRuleREAD returns [EObject current=null] : iv_ruleREAD= ruleREAD EOF ;
    public final EObject entryRuleREAD() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleREAD = null;


        try {
            // InternalDomainmodel.g:762:45: (iv_ruleREAD= ruleREAD EOF )
            // InternalDomainmodel.g:763:2: iv_ruleREAD= ruleREAD EOF
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
    // InternalDomainmodel.g:769:1: ruleREAD returns [EObject current=null] : ( () otherlv_1= 'read' otherlv_2= 'url' otherlv_3= 'from' (otherlv_4= 'BUTTON' | otherlv_5= 'LINK' | otherlv_6= 'IMAGE' | otherlv_7= 'TEXT' ) ruleELEMENTIDENTIFIER (this_SAVEVAR_9= ruleSAVEVAR )? ) ;
    public final EObject ruleREAD() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject this_SAVEVAR_9 = null;



        	enterRule();

        try {
            // InternalDomainmodel.g:775:2: ( ( () otherlv_1= 'read' otherlv_2= 'url' otherlv_3= 'from' (otherlv_4= 'BUTTON' | otherlv_5= 'LINK' | otherlv_6= 'IMAGE' | otherlv_7= 'TEXT' ) ruleELEMENTIDENTIFIER (this_SAVEVAR_9= ruleSAVEVAR )? ) )
            // InternalDomainmodel.g:776:2: ( () otherlv_1= 'read' otherlv_2= 'url' otherlv_3= 'from' (otherlv_4= 'BUTTON' | otherlv_5= 'LINK' | otherlv_6= 'IMAGE' | otherlv_7= 'TEXT' ) ruleELEMENTIDENTIFIER (this_SAVEVAR_9= ruleSAVEVAR )? )
            {
            // InternalDomainmodel.g:776:2: ( () otherlv_1= 'read' otherlv_2= 'url' otherlv_3= 'from' (otherlv_4= 'BUTTON' | otherlv_5= 'LINK' | otherlv_6= 'IMAGE' | otherlv_7= 'TEXT' ) ruleELEMENTIDENTIFIER (this_SAVEVAR_9= ruleSAVEVAR )? )
            // InternalDomainmodel.g:777:3: () otherlv_1= 'read' otherlv_2= 'url' otherlv_3= 'from' (otherlv_4= 'BUTTON' | otherlv_5= 'LINK' | otherlv_6= 'IMAGE' | otherlv_7= 'TEXT' ) ruleELEMENTIDENTIFIER (this_SAVEVAR_9= ruleSAVEVAR )?
            {
            // InternalDomainmodel.g:777:3: ()
            // InternalDomainmodel.g:778:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getREADAccess().getREADAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,38,FOLLOW_24); 

            			newLeafNode(otherlv_1, grammarAccess.getREADAccess().getReadKeyword_1());
            		
            otherlv_2=(Token)match(input,39,FOLLOW_25); 

            			newLeafNode(otherlv_2, grammarAccess.getREADAccess().getUrlKeyword_2());
            		
            otherlv_3=(Token)match(input,40,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getREADAccess().getFromKeyword_3());
            		
            // InternalDomainmodel.g:796:3: (otherlv_4= 'BUTTON' | otherlv_5= 'LINK' | otherlv_6= 'IMAGE' | otherlv_7= 'TEXT' )
            int alt17=4;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt17=1;
                }
                break;
            case 24:
                {
                alt17=2;
                }
                break;
            case 25:
                {
                alt17=3;
                }
                break;
            case 26:
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
                    // InternalDomainmodel.g:797:4: otherlv_4= 'BUTTON'
                    {
                    otherlv_4=(Token)match(input,23,FOLLOW_13); 

                    				newLeafNode(otherlv_4, grammarAccess.getREADAccess().getBUTTONKeyword_4_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalDomainmodel.g:802:4: otherlv_5= 'LINK'
                    {
                    otherlv_5=(Token)match(input,24,FOLLOW_13); 

                    				newLeafNode(otherlv_5, grammarAccess.getREADAccess().getLINKKeyword_4_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalDomainmodel.g:807:4: otherlv_6= 'IMAGE'
                    {
                    otherlv_6=(Token)match(input,25,FOLLOW_13); 

                    				newLeafNode(otherlv_6, grammarAccess.getREADAccess().getIMAGEKeyword_4_2());
                    			

                    }
                    break;
                case 4 :
                    // InternalDomainmodel.g:812:4: otherlv_7= 'TEXT'
                    {
                    otherlv_7=(Token)match(input,26,FOLLOW_13); 

                    				newLeafNode(otherlv_7, grammarAccess.getREADAccess().getTEXTKeyword_4_3());
                    			

                    }
                    break;

            }


            			newCompositeNode(grammarAccess.getREADAccess().getELEMENTIDENTIFIERParserRuleCall_5());
            		
            pushFollow(FOLLOW_26);
            ruleELEMENTIDENTIFIER();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalDomainmodel.g:824:3: (this_SAVEVAR_9= ruleSAVEVAR )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==49) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalDomainmodel.g:825:4: this_SAVEVAR_9= ruleSAVEVAR
                    {

                    				newCompositeNode(grammarAccess.getREADAccess().getSAVEVARParserRuleCall_6());
                    			
                    pushFollow(FOLLOW_2);
                    this_SAVEVAR_9=ruleSAVEVAR();

                    state._fsp--;


                    				current = this_SAVEVAR_9;
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
    // InternalDomainmodel.g:838:1: entryRuleELEMENTIDENTIFIER returns [String current=null] : iv_ruleELEMENTIDENTIFIER= ruleELEMENTIDENTIFIER EOF ;
    public final String entryRuleELEMENTIDENTIFIER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleELEMENTIDENTIFIER = null;


        try {
            // InternalDomainmodel.g:838:57: (iv_ruleELEMENTIDENTIFIER= ruleELEMENTIDENTIFIER EOF )
            // InternalDomainmodel.g:839:2: iv_ruleELEMENTIDENTIFIER= ruleELEMENTIDENTIFIER EOF
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
    // InternalDomainmodel.g:845:1: ruleELEMENTIDENTIFIER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'identified' kw= 'by' (kw= 'LABEL' | kw= 'CLASS' | kw= 'ID' | kw= 'ALT' ) kw= '\"' this_STRING_7= RULE_STRING kw= '\"' ) ;
    public final AntlrDatatypeRuleToken ruleELEMENTIDENTIFIER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_STRING_7=null;


        	enterRule();

        try {
            // InternalDomainmodel.g:851:2: ( (kw= 'identified' kw= 'by' (kw= 'LABEL' | kw= 'CLASS' | kw= 'ID' | kw= 'ALT' ) kw= '\"' this_STRING_7= RULE_STRING kw= '\"' ) )
            // InternalDomainmodel.g:852:2: (kw= 'identified' kw= 'by' (kw= 'LABEL' | kw= 'CLASS' | kw= 'ID' | kw= 'ALT' ) kw= '\"' this_STRING_7= RULE_STRING kw= '\"' )
            {
            // InternalDomainmodel.g:852:2: (kw= 'identified' kw= 'by' (kw= 'LABEL' | kw= 'CLASS' | kw= 'ID' | kw= 'ALT' ) kw= '\"' this_STRING_7= RULE_STRING kw= '\"' )
            // InternalDomainmodel.g:853:3: kw= 'identified' kw= 'by' (kw= 'LABEL' | kw= 'CLASS' | kw= 'ID' | kw= 'ALT' ) kw= '\"' this_STRING_7= RULE_STRING kw= '\"'
            {
            kw=(Token)match(input,41,FOLLOW_27); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getELEMENTIDENTIFIERAccess().getIdentifiedKeyword_0());
            		
            kw=(Token)match(input,42,FOLLOW_28); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getELEMENTIDENTIFIERAccess().getByKeyword_1());
            		
            // InternalDomainmodel.g:863:3: (kw= 'LABEL' | kw= 'CLASS' | kw= 'ID' | kw= 'ALT' )
            int alt19=4;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt19=1;
                }
                break;
            case 44:
                {
                alt19=2;
                }
                break;
            case 45:
                {
                alt19=3;
                }
                break;
            case 46:
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
                    // InternalDomainmodel.g:864:4: kw= 'LABEL'
                    {
                    kw=(Token)match(input,43,FOLLOW_10); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getELEMENTIDENTIFIERAccess().getLABELKeyword_2_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalDomainmodel.g:870:4: kw= 'CLASS'
                    {
                    kw=(Token)match(input,44,FOLLOW_10); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getELEMENTIDENTIFIERAccess().getCLASSKeyword_2_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalDomainmodel.g:876:4: kw= 'ID'
                    {
                    kw=(Token)match(input,45,FOLLOW_10); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getELEMENTIDENTIFIERAccess().getIDKeyword_2_2());
                    			

                    }
                    break;
                case 4 :
                    // InternalDomainmodel.g:882:4: kw= 'ALT'
                    {
                    kw=(Token)match(input,46,FOLLOW_10); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getELEMENTIDENTIFIERAccess().getALTKeyword_2_3());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,19,FOLLOW_18); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getELEMENTIDENTIFIERAccess().getQuotationMarkKeyword_3());
            		
            this_STRING_7=(Token)match(input,RULE_STRING,FOLLOW_10); 

            			current.merge(this_STRING_7);
            		

            			newLeafNode(this_STRING_7, grammarAccess.getELEMENTIDENTIFIERAccess().getSTRINGTerminalRuleCall_4());
            		
            kw=(Token)match(input,19,FOLLOW_2); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getELEMENTIDENTIFIERAccess().getQuotationMarkKeyword_5());
            		

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


    // $ANTLR start "entryRuleCOUNT"
    // InternalDomainmodel.g:909:1: entryRuleCOUNT returns [EObject current=null] : iv_ruleCOUNT= ruleCOUNT EOF ;
    public final EObject entryRuleCOUNT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCOUNT = null;


        try {
            // InternalDomainmodel.g:909:46: (iv_ruleCOUNT= ruleCOUNT EOF )
            // InternalDomainmodel.g:910:2: iv_ruleCOUNT= ruleCOUNT EOF
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
    // InternalDomainmodel.g:916:1: ruleCOUNT returns [EObject current=null] : ( () otherlv_1= 'count' otherlv_2= 'ELEMENT' ruleELEMENTIDENTIFIER (this_SAVEVAR_4= ruleSAVEVAR )? ) ;
    public final EObject ruleCOUNT() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject this_SAVEVAR_4 = null;



        	enterRule();

        try {
            // InternalDomainmodel.g:922:2: ( ( () otherlv_1= 'count' otherlv_2= 'ELEMENT' ruleELEMENTIDENTIFIER (this_SAVEVAR_4= ruleSAVEVAR )? ) )
            // InternalDomainmodel.g:923:2: ( () otherlv_1= 'count' otherlv_2= 'ELEMENT' ruleELEMENTIDENTIFIER (this_SAVEVAR_4= ruleSAVEVAR )? )
            {
            // InternalDomainmodel.g:923:2: ( () otherlv_1= 'count' otherlv_2= 'ELEMENT' ruleELEMENTIDENTIFIER (this_SAVEVAR_4= ruleSAVEVAR )? )
            // InternalDomainmodel.g:924:3: () otherlv_1= 'count' otherlv_2= 'ELEMENT' ruleELEMENTIDENTIFIER (this_SAVEVAR_4= ruleSAVEVAR )?
            {
            // InternalDomainmodel.g:924:3: ()
            // InternalDomainmodel.g:925:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCOUNTAccess().getCOUNTAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,47,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getCOUNTAccess().getCountKeyword_1());
            		
            otherlv_2=(Token)match(input,48,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getCOUNTAccess().getELEMENTKeyword_2());
            		

            			newCompositeNode(grammarAccess.getCOUNTAccess().getELEMENTIDENTIFIERParserRuleCall_3());
            		
            pushFollow(FOLLOW_26);
            ruleELEMENTIDENTIFIER();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalDomainmodel.g:946:3: (this_SAVEVAR_4= ruleSAVEVAR )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==49) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalDomainmodel.g:947:4: this_SAVEVAR_4= ruleSAVEVAR
                    {

                    				newCompositeNode(grammarAccess.getCOUNTAccess().getSAVEVARParserRuleCall_4());
                    			
                    pushFollow(FOLLOW_2);
                    this_SAVEVAR_4=ruleSAVEVAR();

                    state._fsp--;


                    				current = this_SAVEVAR_4;
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
    // InternalDomainmodel.g:960:1: entryRuleSAVEVAR returns [EObject current=null] : iv_ruleSAVEVAR= ruleSAVEVAR EOF ;
    public final EObject entryRuleSAVEVAR() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSAVEVAR = null;


        try {
            // InternalDomainmodel.g:960:48: (iv_ruleSAVEVAR= ruleSAVEVAR EOF )
            // InternalDomainmodel.g:961:2: iv_ruleSAVEVAR= ruleSAVEVAR EOF
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
    // InternalDomainmodel.g:967:1: ruleSAVEVAR returns [EObject current=null] : (otherlv_0= 'and' otherlv_1= 'save' otherlv_2= 'in' ( (lv_var_3_0= RULE_VARTYPE ) ) ) ;
    public final EObject ruleSAVEVAR() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_var_3_0=null;


        	enterRule();

        try {
            // InternalDomainmodel.g:973:2: ( (otherlv_0= 'and' otherlv_1= 'save' otherlv_2= 'in' ( (lv_var_3_0= RULE_VARTYPE ) ) ) )
            // InternalDomainmodel.g:974:2: (otherlv_0= 'and' otherlv_1= 'save' otherlv_2= 'in' ( (lv_var_3_0= RULE_VARTYPE ) ) )
            {
            // InternalDomainmodel.g:974:2: (otherlv_0= 'and' otherlv_1= 'save' otherlv_2= 'in' ( (lv_var_3_0= RULE_VARTYPE ) ) )
            // InternalDomainmodel.g:975:3: otherlv_0= 'and' otherlv_1= 'save' otherlv_2= 'in' ( (lv_var_3_0= RULE_VARTYPE ) )
            {
            otherlv_0=(Token)match(input,49,FOLLOW_30); 

            			newLeafNode(otherlv_0, grammarAccess.getSAVEVARAccess().getAndKeyword_0());
            		
            otherlv_1=(Token)match(input,50,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getSAVEVARAccess().getSaveKeyword_1());
            		
            otherlv_2=(Token)match(input,36,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getSAVEVARAccess().getInKeyword_2());
            		
            // InternalDomainmodel.g:987:3: ( (lv_var_3_0= RULE_VARTYPE ) )
            // InternalDomainmodel.g:988:4: (lv_var_3_0= RULE_VARTYPE )
            {
            // InternalDomainmodel.g:988:4: (lv_var_3_0= RULE_VARTYPE )
            // InternalDomainmodel.g:989:5: lv_var_3_0= RULE_VARTYPE
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


    // $ANTLR start "entryRuleVERIFY"
    // InternalDomainmodel.g:1009:1: entryRuleVERIFY returns [EObject current=null] : iv_ruleVERIFY= ruleVERIFY EOF ;
    public final EObject entryRuleVERIFY() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVERIFY = null;


        try {
            // InternalDomainmodel.g:1009:47: (iv_ruleVERIFY= ruleVERIFY EOF )
            // InternalDomainmodel.g:1010:2: iv_ruleVERIFY= ruleVERIFY EOF
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
    // InternalDomainmodel.g:1016:1: ruleVERIFY returns [EObject current=null] : (otherlv_0= 'verify' otherlv_1= 'that' (this_COUNT_2= ruleCOUNT | ( (otherlv_3= 'PAGE' | otherlv_4= 'TEXT' ) ( ruleELEMENTIDENTIFIER )? ) ) otherlv_6= 'contains' ( (otherlv_7= 'LINK' ruleELEMENTIDENTIFIER ) | (otherlv_9= '\"' ( (lv_value_10_0= RULE_STRING ) ) otherlv_11= '\"' ) ) ) ;
    public final EObject ruleVERIFY() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token lv_value_10_0=null;
        Token otherlv_11=null;
        EObject this_COUNT_2 = null;



        	enterRule();

        try {
            // InternalDomainmodel.g:1022:2: ( (otherlv_0= 'verify' otherlv_1= 'that' (this_COUNT_2= ruleCOUNT | ( (otherlv_3= 'PAGE' | otherlv_4= 'TEXT' ) ( ruleELEMENTIDENTIFIER )? ) ) otherlv_6= 'contains' ( (otherlv_7= 'LINK' ruleELEMENTIDENTIFIER ) | (otherlv_9= '\"' ( (lv_value_10_0= RULE_STRING ) ) otherlv_11= '\"' ) ) ) )
            // InternalDomainmodel.g:1023:2: (otherlv_0= 'verify' otherlv_1= 'that' (this_COUNT_2= ruleCOUNT | ( (otherlv_3= 'PAGE' | otherlv_4= 'TEXT' ) ( ruleELEMENTIDENTIFIER )? ) ) otherlv_6= 'contains' ( (otherlv_7= 'LINK' ruleELEMENTIDENTIFIER ) | (otherlv_9= '\"' ( (lv_value_10_0= RULE_STRING ) ) otherlv_11= '\"' ) ) )
            {
            // InternalDomainmodel.g:1023:2: (otherlv_0= 'verify' otherlv_1= 'that' (this_COUNT_2= ruleCOUNT | ( (otherlv_3= 'PAGE' | otherlv_4= 'TEXT' ) ( ruleELEMENTIDENTIFIER )? ) ) otherlv_6= 'contains' ( (otherlv_7= 'LINK' ruleELEMENTIDENTIFIER ) | (otherlv_9= '\"' ( (lv_value_10_0= RULE_STRING ) ) otherlv_11= '\"' ) ) )
            // InternalDomainmodel.g:1024:3: otherlv_0= 'verify' otherlv_1= 'that' (this_COUNT_2= ruleCOUNT | ( (otherlv_3= 'PAGE' | otherlv_4= 'TEXT' ) ( ruleELEMENTIDENTIFIER )? ) ) otherlv_6= 'contains' ( (otherlv_7= 'LINK' ruleELEMENTIDENTIFIER ) | (otherlv_9= '\"' ( (lv_value_10_0= RULE_STRING ) ) otherlv_11= '\"' ) )
            {
            otherlv_0=(Token)match(input,51,FOLLOW_31); 

            			newLeafNode(otherlv_0, grammarAccess.getVERIFYAccess().getVerifyKeyword_0());
            		
            otherlv_1=(Token)match(input,52,FOLLOW_32); 

            			newLeafNode(otherlv_1, grammarAccess.getVERIFYAccess().getThatKeyword_1());
            		
            // InternalDomainmodel.g:1032:3: (this_COUNT_2= ruleCOUNT | ( (otherlv_3= 'PAGE' | otherlv_4= 'TEXT' ) ( ruleELEMENTIDENTIFIER )? ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==47) ) {
                alt23=1;
            }
            else if ( (LA23_0==26||LA23_0==53) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalDomainmodel.g:1033:4: this_COUNT_2= ruleCOUNT
                    {

                    				newCompositeNode(grammarAccess.getVERIFYAccess().getCOUNTParserRuleCall_2_0());
                    			
                    pushFollow(FOLLOW_33);
                    this_COUNT_2=ruleCOUNT();

                    state._fsp--;


                    				current = this_COUNT_2;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalDomainmodel.g:1042:4: ( (otherlv_3= 'PAGE' | otherlv_4= 'TEXT' ) ( ruleELEMENTIDENTIFIER )? )
                    {
                    // InternalDomainmodel.g:1042:4: ( (otherlv_3= 'PAGE' | otherlv_4= 'TEXT' ) ( ruleELEMENTIDENTIFIER )? )
                    // InternalDomainmodel.g:1043:5: (otherlv_3= 'PAGE' | otherlv_4= 'TEXT' ) ( ruleELEMENTIDENTIFIER )?
                    {
                    // InternalDomainmodel.g:1043:5: (otherlv_3= 'PAGE' | otherlv_4= 'TEXT' )
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==53) ) {
                        alt21=1;
                    }
                    else if ( (LA21_0==26) ) {
                        alt21=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 21, 0, input);

                        throw nvae;
                    }
                    switch (alt21) {
                        case 1 :
                            // InternalDomainmodel.g:1044:6: otherlv_3= 'PAGE'
                            {
                            otherlv_3=(Token)match(input,53,FOLLOW_34); 

                            						newLeafNode(otherlv_3, grammarAccess.getVERIFYAccess().getPAGEKeyword_2_1_0_0());
                            					

                            }
                            break;
                        case 2 :
                            // InternalDomainmodel.g:1049:6: otherlv_4= 'TEXT'
                            {
                            otherlv_4=(Token)match(input,26,FOLLOW_34); 

                            						newLeafNode(otherlv_4, grammarAccess.getVERIFYAccess().getTEXTKeyword_2_1_0_1());
                            					

                            }
                            break;

                    }

                    // InternalDomainmodel.g:1054:5: ( ruleELEMENTIDENTIFIER )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==41) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // InternalDomainmodel.g:1055:6: ruleELEMENTIDENTIFIER
                            {

                            						newCompositeNode(grammarAccess.getVERIFYAccess().getELEMENTIDENTIFIERParserRuleCall_2_1_1());
                            					
                            pushFollow(FOLLOW_33);
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

            otherlv_6=(Token)match(input,54,FOLLOW_35); 

            			newLeafNode(otherlv_6, grammarAccess.getVERIFYAccess().getContainsKeyword_3());
            		
            // InternalDomainmodel.g:1069:3: ( (otherlv_7= 'LINK' ruleELEMENTIDENTIFIER ) | (otherlv_9= '\"' ( (lv_value_10_0= RULE_STRING ) ) otherlv_11= '\"' ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==24) ) {
                alt24=1;
            }
            else if ( (LA24_0==19) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalDomainmodel.g:1070:4: (otherlv_7= 'LINK' ruleELEMENTIDENTIFIER )
                    {
                    // InternalDomainmodel.g:1070:4: (otherlv_7= 'LINK' ruleELEMENTIDENTIFIER )
                    // InternalDomainmodel.g:1071:5: otherlv_7= 'LINK' ruleELEMENTIDENTIFIER
                    {
                    otherlv_7=(Token)match(input,24,FOLLOW_13); 

                    					newLeafNode(otherlv_7, grammarAccess.getVERIFYAccess().getLINKKeyword_4_0_0());
                    				

                    					newCompositeNode(grammarAccess.getVERIFYAccess().getELEMENTIDENTIFIERParserRuleCall_4_0_1());
                    				
                    pushFollow(FOLLOW_2);
                    ruleELEMENTIDENTIFIER();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalDomainmodel.g:1084:4: (otherlv_9= '\"' ( (lv_value_10_0= RULE_STRING ) ) otherlv_11= '\"' )
                    {
                    // InternalDomainmodel.g:1084:4: (otherlv_9= '\"' ( (lv_value_10_0= RULE_STRING ) ) otherlv_11= '\"' )
                    // InternalDomainmodel.g:1085:5: otherlv_9= '\"' ( (lv_value_10_0= RULE_STRING ) ) otherlv_11= '\"'
                    {
                    otherlv_9=(Token)match(input,19,FOLLOW_18); 

                    					newLeafNode(otherlv_9, grammarAccess.getVERIFYAccess().getQuotationMarkKeyword_4_1_0());
                    				
                    // InternalDomainmodel.g:1089:5: ( (lv_value_10_0= RULE_STRING ) )
                    // InternalDomainmodel.g:1090:6: (lv_value_10_0= RULE_STRING )
                    {
                    // InternalDomainmodel.g:1090:6: (lv_value_10_0= RULE_STRING )
                    // InternalDomainmodel.g:1091:7: lv_value_10_0= RULE_STRING
                    {
                    lv_value_10_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

                    							newLeafNode(lv_value_10_0, grammarAccess.getVERIFYAccess().getValueSTRINGTerminalRuleCall_4_1_1_0());
                    						

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

                    otherlv_11=(Token)match(input,19,FOLLOW_2); 

                    					newLeafNode(otherlv_11, grammarAccess.getVERIFYAccess().getQuotationMarkKeyword_4_1_2());
                    				

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


    // $ANTLR start "entryRulePLAY"
    // InternalDomainmodel.g:1117:1: entryRulePLAY returns [EObject current=null] : iv_rulePLAY= rulePLAY EOF ;
    public final EObject entryRulePLAY() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePLAY = null;


        try {
            // InternalDomainmodel.g:1117:45: (iv_rulePLAY= rulePLAY EOF )
            // InternalDomainmodel.g:1118:2: iv_rulePLAY= rulePLAY EOF
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
    // InternalDomainmodel.g:1124:1: rulePLAY returns [EObject current=null] : ( () otherlv_1= 'play' otherlv_2= 'procedure' this_VARTYPE_3= RULE_VARTYPE (otherlv_4= '\"' ( (lv_params_5_0= RULE_STRING ) ) otherlv_6= '\"' )* ) ;
    public final EObject rulePLAY() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token this_VARTYPE_3=null;
        Token otherlv_4=null;
        Token lv_params_5_0=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalDomainmodel.g:1130:2: ( ( () otherlv_1= 'play' otherlv_2= 'procedure' this_VARTYPE_3= RULE_VARTYPE (otherlv_4= '\"' ( (lv_params_5_0= RULE_STRING ) ) otherlv_6= '\"' )* ) )
            // InternalDomainmodel.g:1131:2: ( () otherlv_1= 'play' otherlv_2= 'procedure' this_VARTYPE_3= RULE_VARTYPE (otherlv_4= '\"' ( (lv_params_5_0= RULE_STRING ) ) otherlv_6= '\"' )* )
            {
            // InternalDomainmodel.g:1131:2: ( () otherlv_1= 'play' otherlv_2= 'procedure' this_VARTYPE_3= RULE_VARTYPE (otherlv_4= '\"' ( (lv_params_5_0= RULE_STRING ) ) otherlv_6= '\"' )* )
            // InternalDomainmodel.g:1132:3: () otherlv_1= 'play' otherlv_2= 'procedure' this_VARTYPE_3= RULE_VARTYPE (otherlv_4= '\"' ( (lv_params_5_0= RULE_STRING ) ) otherlv_6= '\"' )*
            {
            // InternalDomainmodel.g:1132:3: ()
            // InternalDomainmodel.g:1133:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPLAYAccess().getPLAYAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,55,FOLLOW_36); 

            			newLeafNode(otherlv_1, grammarAccess.getPLAYAccess().getPlayKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getPLAYAccess().getProcedureKeyword_2());
            		
            this_VARTYPE_3=(Token)match(input,RULE_VARTYPE,FOLLOW_37); 

            			newLeafNode(this_VARTYPE_3, grammarAccess.getPLAYAccess().getVARTYPETerminalRuleCall_3());
            		
            // InternalDomainmodel.g:1151:3: (otherlv_4= '\"' ( (lv_params_5_0= RULE_STRING ) ) otherlv_6= '\"' )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==19) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalDomainmodel.g:1152:4: otherlv_4= '\"' ( (lv_params_5_0= RULE_STRING ) ) otherlv_6= '\"'
            	    {
            	    otherlv_4=(Token)match(input,19,FOLLOW_18); 

            	    				newLeafNode(otherlv_4, grammarAccess.getPLAYAccess().getQuotationMarkKeyword_4_0());
            	    			
            	    // InternalDomainmodel.g:1156:4: ( (lv_params_5_0= RULE_STRING ) )
            	    // InternalDomainmodel.g:1157:5: (lv_params_5_0= RULE_STRING )
            	    {
            	    // InternalDomainmodel.g:1157:5: (lv_params_5_0= RULE_STRING )
            	    // InternalDomainmodel.g:1158:6: lv_params_5_0= RULE_STRING
            	    {
            	    lv_params_5_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

            	    						newLeafNode(lv_params_5_0, grammarAccess.getPLAYAccess().getParamsSTRINGTerminalRuleCall_4_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getPLAYRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"params",
            	    							lv_params_5_0,
            	    							"org.eclipse.xtext.common.Terminals.STRING");
            	    					

            	    }


            	    }

            	    otherlv_6=(Token)match(input,19,FOLLOW_37); 

            	    				newLeafNode(otherlv_6, grammarAccess.getPLAYAccess().getQuotationMarkKeyword_4_2());
            	    			

            	    }
            	    break;

            	default :
            	    break loop25;
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0088804C88226002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0088804C88224012L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0088804C88224002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000007800000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000020000002000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000040080000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000780000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0020800004000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0040020000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000001080000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000080002L});

}