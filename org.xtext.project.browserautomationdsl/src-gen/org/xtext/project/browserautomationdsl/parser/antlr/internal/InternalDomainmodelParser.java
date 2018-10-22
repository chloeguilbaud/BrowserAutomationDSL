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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_VARTYPE", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'procedure'", "'with'", "'open'", "'FIREFOX'", "'CHROME'", "'go to'", "'given'", "'click'", "'on'", "'BUTTON'", "'LINK'", "'IMAGE'", "'TEXT'", "'fill'", "'TEXTFIELD'", "'SEARCHFIELD'", "'saved'", "'check'", "'all'", "'CHECKBOX'", "'uncheck'", "'select'", "'in'", "'COMBOBOX'", "'read'", "'url'", "'from'", "'identified'", "'by'", "'LABEL'", "'CLASS'", "'ID'", "'ALT'", "'count'", "'ELEMENT'", "'and'", "'save'", "'verify'", "'that'", "'PAGE'", "'contains'", "'equals'", "'play'"
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
    // InternalDomainmodel.g:71:1: rulePROGRAMME returns [EObject current=null] : (otherlv_0= 'procedure' ( (lv_name_1_0= RULE_VARTYPE ) ) (otherlv_2= 'with' ( (lv_param_3_0= RULE_VARTYPE ) ) ( (lv_params_4_0= RULE_VARTYPE ) )* )? ( (lv_inst_5_0= ruleINSTRUCTION ) )* )* ;
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
            // InternalDomainmodel.g:77:2: ( (otherlv_0= 'procedure' ( (lv_name_1_0= RULE_VARTYPE ) ) (otherlv_2= 'with' ( (lv_param_3_0= RULE_VARTYPE ) ) ( (lv_params_4_0= RULE_VARTYPE ) )* )? ( (lv_inst_5_0= ruleINSTRUCTION ) )* )* )
            // InternalDomainmodel.g:78:2: (otherlv_0= 'procedure' ( (lv_name_1_0= RULE_VARTYPE ) ) (otherlv_2= 'with' ( (lv_param_3_0= RULE_VARTYPE ) ) ( (lv_params_4_0= RULE_VARTYPE ) )* )? ( (lv_inst_5_0= ruleINSTRUCTION ) )* )*
            {
            // InternalDomainmodel.g:78:2: (otherlv_0= 'procedure' ( (lv_name_1_0= RULE_VARTYPE ) ) (otherlv_2= 'with' ( (lv_param_3_0= RULE_VARTYPE ) ) ( (lv_params_4_0= RULE_VARTYPE ) )* )? ( (lv_inst_5_0= ruleINSTRUCTION ) )* )*
            loop4:
            do {
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

            	        if ( (LA3_0==14||LA3_0==17||LA3_0==19||LA3_0==25||LA3_0==29||(LA3_0>=32 && LA3_0<=33)||LA3_0==36||LA3_0==45||LA3_0==49||LA3_0==54) ) {
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

            	default :
            	    break loop4;
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
    // InternalDomainmodel.g:173:1: ruleINSTRUCTION returns [EObject current=null] : ( ( () ruleOPEN ) | ( () ruleCLICK ) | ( () ruleCHECK ) | ( () ruleUNCHECK ) | this_READ_8= ruleREAD | this_COUNT_9= ruleCOUNT | this_VERIFY_10= ruleVERIFY | this_SELECT_11= ruleSELECT | ( () ruleGOTO ) | this_FILL_14= ruleFILL | this_PLAY_15= rulePLAY ) ;
    public final EObject ruleINSTRUCTION() throws RecognitionException {
        EObject current = null;

        EObject this_READ_8 = null;

        EObject this_COUNT_9 = null;

        EObject this_VERIFY_10 = null;

        EObject this_SELECT_11 = null;

        EObject this_FILL_14 = null;

        EObject this_PLAY_15 = null;



        	enterRule();

        try {
            // InternalDomainmodel.g:179:2: ( ( ( () ruleOPEN ) | ( () ruleCLICK ) | ( () ruleCHECK ) | ( () ruleUNCHECK ) | this_READ_8= ruleREAD | this_COUNT_9= ruleCOUNT | this_VERIFY_10= ruleVERIFY | this_SELECT_11= ruleSELECT | ( () ruleGOTO ) | this_FILL_14= ruleFILL | this_PLAY_15= rulePLAY ) )
            // InternalDomainmodel.g:180:2: ( ( () ruleOPEN ) | ( () ruleCLICK ) | ( () ruleCHECK ) | ( () ruleUNCHECK ) | this_READ_8= ruleREAD | this_COUNT_9= ruleCOUNT | this_VERIFY_10= ruleVERIFY | this_SELECT_11= ruleSELECT | ( () ruleGOTO ) | this_FILL_14= ruleFILL | this_PLAY_15= rulePLAY )
            {
            // InternalDomainmodel.g:180:2: ( ( () ruleOPEN ) | ( () ruleCLICK ) | ( () ruleCHECK ) | ( () ruleUNCHECK ) | this_READ_8= ruleREAD | this_COUNT_9= ruleCOUNT | this_VERIFY_10= ruleVERIFY | this_SELECT_11= ruleSELECT | ( () ruleGOTO ) | this_FILL_14= ruleFILL | this_PLAY_15= rulePLAY )
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
            case 45:
                {
                alt5=6;
                }
                break;
            case 49:
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
                    // InternalDomainmodel.g:285:3: ( () ruleGOTO )
                    {
                    // InternalDomainmodel.g:285:3: ( () ruleGOTO )
                    // InternalDomainmodel.g:286:4: () ruleGOTO
                    {
                    // InternalDomainmodel.g:286:4: ()
                    // InternalDomainmodel.g:287:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getINSTRUCTIONAccess().getINSTRUCTIONAction_8_0(),
                    						current);
                    				

                    }


                    				newCompositeNode(grammarAccess.getINSTRUCTIONAccess().getGOTOParserRuleCall_8_1());
                    			
                    pushFollow(FOLLOW_2);
                    ruleGOTO();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalDomainmodel.g:302:3: this_FILL_14= ruleFILL
                    {

                    			newCompositeNode(grammarAccess.getINSTRUCTIONAccess().getFILLParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_FILL_14=ruleFILL();

                    state._fsp--;


                    			current = this_FILL_14;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 11 :
                    // InternalDomainmodel.g:311:3: this_PLAY_15= rulePLAY
                    {

                    			newCompositeNode(grammarAccess.getINSTRUCTIONAccess().getPLAYParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_PLAY_15=rulePLAY();

                    state._fsp--;


                    			current = this_PLAY_15;
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
    // InternalDomainmodel.g:323:1: entryRuleOPEN returns [String current=null] : iv_ruleOPEN= ruleOPEN EOF ;
    public final String entryRuleOPEN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOPEN = null;


        try {
            // InternalDomainmodel.g:323:44: (iv_ruleOPEN= ruleOPEN EOF )
            // InternalDomainmodel.g:324:2: iv_ruleOPEN= ruleOPEN EOF
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
    // InternalDomainmodel.g:330:1: ruleOPEN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'open' (kw= 'FIREFOX' | kw= 'CHROME' ) ) ;
    public final AntlrDatatypeRuleToken ruleOPEN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDomainmodel.g:336:2: ( (kw= 'open' (kw= 'FIREFOX' | kw= 'CHROME' ) ) )
            // InternalDomainmodel.g:337:2: (kw= 'open' (kw= 'FIREFOX' | kw= 'CHROME' ) )
            {
            // InternalDomainmodel.g:337:2: (kw= 'open' (kw= 'FIREFOX' | kw= 'CHROME' ) )
            // InternalDomainmodel.g:338:3: kw= 'open' (kw= 'FIREFOX' | kw= 'CHROME' )
            {
            kw=(Token)match(input,14,FOLLOW_7); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getOPENAccess().getOpenKeyword_0());
            		
            // InternalDomainmodel.g:343:3: (kw= 'FIREFOX' | kw= 'CHROME' )
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
                    // InternalDomainmodel.g:344:4: kw= 'FIREFOX'
                    {
                    kw=(Token)match(input,15,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getOPENAccess().getFIREFOXKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalDomainmodel.g:350:4: kw= 'CHROME'
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
    // InternalDomainmodel.g:360:1: entryRuleGOTO returns [String current=null] : iv_ruleGOTO= ruleGOTO EOF ;
    public final String entryRuleGOTO() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleGOTO = null;


        try {
            // InternalDomainmodel.g:360:44: (iv_ruleGOTO= ruleGOTO EOF )
            // InternalDomainmodel.g:361:2: iv_ruleGOTO= ruleGOTO EOF
            {
             newCompositeNode(grammarAccess.getGOTORule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGOTO=ruleGOTO();

            state._fsp--;

             current =iv_ruleGOTO.getText(); 
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
    // InternalDomainmodel.g:367:1: ruleGOTO returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'go to' (kw= 'given' )? this_STRING_2= RULE_STRING ) ;
    public final AntlrDatatypeRuleToken ruleGOTO() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_STRING_2=null;


        	enterRule();

        try {
            // InternalDomainmodel.g:373:2: ( (kw= 'go to' (kw= 'given' )? this_STRING_2= RULE_STRING ) )
            // InternalDomainmodel.g:374:2: (kw= 'go to' (kw= 'given' )? this_STRING_2= RULE_STRING )
            {
            // InternalDomainmodel.g:374:2: (kw= 'go to' (kw= 'given' )? this_STRING_2= RULE_STRING )
            // InternalDomainmodel.g:375:3: kw= 'go to' (kw= 'given' )? this_STRING_2= RULE_STRING
            {
            kw=(Token)match(input,17,FOLLOW_8); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getGOTOAccess().getGoToKeyword_0());
            		
            // InternalDomainmodel.g:380:3: (kw= 'given' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalDomainmodel.g:381:4: kw= 'given'
                    {
                    kw=(Token)match(input,18,FOLLOW_9); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getGOTOAccess().getGivenKeyword_1());
                    			

                    }
                    break;

            }

            this_STRING_2=(Token)match(input,RULE_STRING,FOLLOW_2); 

            			current.merge(this_STRING_2);
            		

            			newLeafNode(this_STRING_2, grammarAccess.getGOTOAccess().getSTRINGTerminalRuleCall_2());
            		

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
    // InternalDomainmodel.g:398:1: entryRuleCLICK returns [String current=null] : iv_ruleCLICK= ruleCLICK EOF ;
    public final String entryRuleCLICK() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCLICK = null;


        try {
            // InternalDomainmodel.g:398:45: (iv_ruleCLICK= ruleCLICK EOF )
            // InternalDomainmodel.g:399:2: iv_ruleCLICK= ruleCLICK EOF
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
    // InternalDomainmodel.g:405:1: ruleCLICK returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'click' kw= 'on' (kw= 'BUTTON' | kw= 'LINK' | kw= 'IMAGE' | kw= 'TEXT' ) this_ELEMENTIDENTIFIER_6= ruleELEMENTIDENTIFIER ) ;
    public final AntlrDatatypeRuleToken ruleCLICK() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ELEMENTIDENTIFIER_6 = null;



        	enterRule();

        try {
            // InternalDomainmodel.g:411:2: ( (kw= 'click' kw= 'on' (kw= 'BUTTON' | kw= 'LINK' | kw= 'IMAGE' | kw= 'TEXT' ) this_ELEMENTIDENTIFIER_6= ruleELEMENTIDENTIFIER ) )
            // InternalDomainmodel.g:412:2: (kw= 'click' kw= 'on' (kw= 'BUTTON' | kw= 'LINK' | kw= 'IMAGE' | kw= 'TEXT' ) this_ELEMENTIDENTIFIER_6= ruleELEMENTIDENTIFIER )
            {
            // InternalDomainmodel.g:412:2: (kw= 'click' kw= 'on' (kw= 'BUTTON' | kw= 'LINK' | kw= 'IMAGE' | kw= 'TEXT' ) this_ELEMENTIDENTIFIER_6= ruleELEMENTIDENTIFIER )
            // InternalDomainmodel.g:413:3: kw= 'click' kw= 'on' (kw= 'BUTTON' | kw= 'LINK' | kw= 'IMAGE' | kw= 'TEXT' ) this_ELEMENTIDENTIFIER_6= ruleELEMENTIDENTIFIER
            {
            kw=(Token)match(input,19,FOLLOW_10); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getCLICKAccess().getClickKeyword_0());
            		
            kw=(Token)match(input,20,FOLLOW_11); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getCLICKAccess().getOnKeyword_1());
            		
            // InternalDomainmodel.g:423:3: (kw= 'BUTTON' | kw= 'LINK' | kw= 'IMAGE' | kw= 'TEXT' )
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
                    // InternalDomainmodel.g:424:4: kw= 'BUTTON'
                    {
                    kw=(Token)match(input,21,FOLLOW_12); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getCLICKAccess().getBUTTONKeyword_2_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalDomainmodel.g:430:4: kw= 'LINK'
                    {
                    kw=(Token)match(input,22,FOLLOW_12); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getCLICKAccess().getLINKKeyword_2_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalDomainmodel.g:436:4: kw= 'IMAGE'
                    {
                    kw=(Token)match(input,23,FOLLOW_12); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getCLICKAccess().getIMAGEKeyword_2_2());
                    			

                    }
                    break;
                case 4 :
                    // InternalDomainmodel.g:442:4: kw= 'TEXT'
                    {
                    kw=(Token)match(input,24,FOLLOW_12); 

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
    // InternalDomainmodel.g:462:1: entryRuleFILL returns [EObject current=null] : iv_ruleFILL= ruleFILL EOF ;
    public final EObject entryRuleFILL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFILL = null;


        try {
            // InternalDomainmodel.g:462:45: (iv_ruleFILL= ruleFILL EOF )
            // InternalDomainmodel.g:463:2: iv_ruleFILL= ruleFILL EOF
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
    // InternalDomainmodel.g:469:1: ruleFILL returns [EObject current=null] : (otherlv_0= 'fill' (otherlv_1= 'TEXTFIELD' | otherlv_2= 'SEARCHFIELD' ) ( ruleELEMENTIDENTIFIER )? otherlv_4= 'with' ( (otherlv_5= 'saved' ( (lv_var_6_0= RULE_VARTYPE ) ) ) | ( (lv_value_7_0= RULE_STRING ) ) ) ) ;
    public final EObject ruleFILL() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_var_6_0=null;
        Token lv_value_7_0=null;


        	enterRule();

        try {
            // InternalDomainmodel.g:475:2: ( (otherlv_0= 'fill' (otherlv_1= 'TEXTFIELD' | otherlv_2= 'SEARCHFIELD' ) ( ruleELEMENTIDENTIFIER )? otherlv_4= 'with' ( (otherlv_5= 'saved' ( (lv_var_6_0= RULE_VARTYPE ) ) ) | ( (lv_value_7_0= RULE_STRING ) ) ) ) )
            // InternalDomainmodel.g:476:2: (otherlv_0= 'fill' (otherlv_1= 'TEXTFIELD' | otherlv_2= 'SEARCHFIELD' ) ( ruleELEMENTIDENTIFIER )? otherlv_4= 'with' ( (otherlv_5= 'saved' ( (lv_var_6_0= RULE_VARTYPE ) ) ) | ( (lv_value_7_0= RULE_STRING ) ) ) )
            {
            // InternalDomainmodel.g:476:2: (otherlv_0= 'fill' (otherlv_1= 'TEXTFIELD' | otherlv_2= 'SEARCHFIELD' ) ( ruleELEMENTIDENTIFIER )? otherlv_4= 'with' ( (otherlv_5= 'saved' ( (lv_var_6_0= RULE_VARTYPE ) ) ) | ( (lv_value_7_0= RULE_STRING ) ) ) )
            // InternalDomainmodel.g:477:3: otherlv_0= 'fill' (otherlv_1= 'TEXTFIELD' | otherlv_2= 'SEARCHFIELD' ) ( ruleELEMENTIDENTIFIER )? otherlv_4= 'with' ( (otherlv_5= 'saved' ( (lv_var_6_0= RULE_VARTYPE ) ) ) | ( (lv_value_7_0= RULE_STRING ) ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getFILLAccess().getFillKeyword_0());
            		
            // InternalDomainmodel.g:481:3: (otherlv_1= 'TEXTFIELD' | otherlv_2= 'SEARCHFIELD' )
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
                    // InternalDomainmodel.g:482:4: otherlv_1= 'TEXTFIELD'
                    {
                    otherlv_1=(Token)match(input,26,FOLLOW_14); 

                    				newLeafNode(otherlv_1, grammarAccess.getFILLAccess().getTEXTFIELDKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalDomainmodel.g:487:4: otherlv_2= 'SEARCHFIELD'
                    {
                    otherlv_2=(Token)match(input,27,FOLLOW_14); 

                    				newLeafNode(otherlv_2, grammarAccess.getFILLAccess().getSEARCHFIELDKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalDomainmodel.g:492:3: ( ruleELEMENTIDENTIFIER )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==39) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalDomainmodel.g:493:4: ruleELEMENTIDENTIFIER
                    {

                    				newCompositeNode(grammarAccess.getFILLAccess().getELEMENTIDENTIFIERParserRuleCall_2());
                    			
                    pushFollow(FOLLOW_15);
                    ruleELEMENTIDENTIFIER();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            otherlv_4=(Token)match(input,13,FOLLOW_16); 

            			newLeafNode(otherlv_4, grammarAccess.getFILLAccess().getWithKeyword_3());
            		
            // InternalDomainmodel.g:505:3: ( (otherlv_5= 'saved' ( (lv_var_6_0= RULE_VARTYPE ) ) ) | ( (lv_value_7_0= RULE_STRING ) ) )
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
                    // InternalDomainmodel.g:506:4: (otherlv_5= 'saved' ( (lv_var_6_0= RULE_VARTYPE ) ) )
                    {
                    // InternalDomainmodel.g:506:4: (otherlv_5= 'saved' ( (lv_var_6_0= RULE_VARTYPE ) ) )
                    // InternalDomainmodel.g:507:5: otherlv_5= 'saved' ( (lv_var_6_0= RULE_VARTYPE ) )
                    {
                    otherlv_5=(Token)match(input,28,FOLLOW_3); 

                    					newLeafNode(otherlv_5, grammarAccess.getFILLAccess().getSavedKeyword_4_0_0());
                    				
                    // InternalDomainmodel.g:511:5: ( (lv_var_6_0= RULE_VARTYPE ) )
                    // InternalDomainmodel.g:512:6: (lv_var_6_0= RULE_VARTYPE )
                    {
                    // InternalDomainmodel.g:512:6: (lv_var_6_0= RULE_VARTYPE )
                    // InternalDomainmodel.g:513:7: lv_var_6_0= RULE_VARTYPE
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
                    // InternalDomainmodel.g:531:4: ( (lv_value_7_0= RULE_STRING ) )
                    {
                    // InternalDomainmodel.g:531:4: ( (lv_value_7_0= RULE_STRING ) )
                    // InternalDomainmodel.g:532:5: (lv_value_7_0= RULE_STRING )
                    {
                    // InternalDomainmodel.g:532:5: (lv_value_7_0= RULE_STRING )
                    // InternalDomainmodel.g:533:6: lv_value_7_0= RULE_STRING
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
    // InternalDomainmodel.g:554:1: entryRuleCHECK returns [String current=null] : iv_ruleCHECK= ruleCHECK EOF ;
    public final String entryRuleCHECK() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCHECK = null;


        try {
            // InternalDomainmodel.g:554:45: (iv_ruleCHECK= ruleCHECK EOF )
            // InternalDomainmodel.g:555:2: iv_ruleCHECK= ruleCHECK EOF
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
    // InternalDomainmodel.g:561:1: ruleCHECK returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'check' (kw= 'all' )? kw= 'CHECKBOX' (this_ELEMENTIDENTIFIER_3= ruleELEMENTIDENTIFIER )? ) ;
    public final AntlrDatatypeRuleToken ruleCHECK() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ELEMENTIDENTIFIER_3 = null;



        	enterRule();

        try {
            // InternalDomainmodel.g:567:2: ( (kw= 'check' (kw= 'all' )? kw= 'CHECKBOX' (this_ELEMENTIDENTIFIER_3= ruleELEMENTIDENTIFIER )? ) )
            // InternalDomainmodel.g:568:2: (kw= 'check' (kw= 'all' )? kw= 'CHECKBOX' (this_ELEMENTIDENTIFIER_3= ruleELEMENTIDENTIFIER )? )
            {
            // InternalDomainmodel.g:568:2: (kw= 'check' (kw= 'all' )? kw= 'CHECKBOX' (this_ELEMENTIDENTIFIER_3= ruleELEMENTIDENTIFIER )? )
            // InternalDomainmodel.g:569:3: kw= 'check' (kw= 'all' )? kw= 'CHECKBOX' (this_ELEMENTIDENTIFIER_3= ruleELEMENTIDENTIFIER )?
            {
            kw=(Token)match(input,29,FOLLOW_17); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getCHECKAccess().getCheckKeyword_0());
            		
            // InternalDomainmodel.g:574:3: (kw= 'all' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==30) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalDomainmodel.g:575:4: kw= 'all'
                    {
                    kw=(Token)match(input,30,FOLLOW_18); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getCHECKAccess().getAllKeyword_1());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,31,FOLLOW_19); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getCHECKAccess().getCHECKBOXKeyword_2());
            		
            // InternalDomainmodel.g:586:3: (this_ELEMENTIDENTIFIER_3= ruleELEMENTIDENTIFIER )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==39) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalDomainmodel.g:587:4: this_ELEMENTIDENTIFIER_3= ruleELEMENTIDENTIFIER
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
    // InternalDomainmodel.g:602:1: entryRuleUNCHECK returns [String current=null] : iv_ruleUNCHECK= ruleUNCHECK EOF ;
    public final String entryRuleUNCHECK() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUNCHECK = null;


        try {
            // InternalDomainmodel.g:602:47: (iv_ruleUNCHECK= ruleUNCHECK EOF )
            // InternalDomainmodel.g:603:2: iv_ruleUNCHECK= ruleUNCHECK EOF
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
    // InternalDomainmodel.g:609:1: ruleUNCHECK returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'uncheck' (kw= 'all' )? kw= 'CHECKBOX' (this_ELEMENTIDENTIFIER_3= ruleELEMENTIDENTIFIER )? ) ;
    public final AntlrDatatypeRuleToken ruleUNCHECK() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ELEMENTIDENTIFIER_3 = null;



        	enterRule();

        try {
            // InternalDomainmodel.g:615:2: ( (kw= 'uncheck' (kw= 'all' )? kw= 'CHECKBOX' (this_ELEMENTIDENTIFIER_3= ruleELEMENTIDENTIFIER )? ) )
            // InternalDomainmodel.g:616:2: (kw= 'uncheck' (kw= 'all' )? kw= 'CHECKBOX' (this_ELEMENTIDENTIFIER_3= ruleELEMENTIDENTIFIER )? )
            {
            // InternalDomainmodel.g:616:2: (kw= 'uncheck' (kw= 'all' )? kw= 'CHECKBOX' (this_ELEMENTIDENTIFIER_3= ruleELEMENTIDENTIFIER )? )
            // InternalDomainmodel.g:617:3: kw= 'uncheck' (kw= 'all' )? kw= 'CHECKBOX' (this_ELEMENTIDENTIFIER_3= ruleELEMENTIDENTIFIER )?
            {
            kw=(Token)match(input,32,FOLLOW_17); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getUNCHECKAccess().getUncheckKeyword_0());
            		
            // InternalDomainmodel.g:622:3: (kw= 'all' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==30) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalDomainmodel.g:623:4: kw= 'all'
                    {
                    kw=(Token)match(input,30,FOLLOW_18); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getUNCHECKAccess().getAllKeyword_1());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,31,FOLLOW_19); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getUNCHECKAccess().getCHECKBOXKeyword_2());
            		
            // InternalDomainmodel.g:634:3: (this_ELEMENTIDENTIFIER_3= ruleELEMENTIDENTIFIER )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==39) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalDomainmodel.g:635:4: this_ELEMENTIDENTIFIER_3= ruleELEMENTIDENTIFIER
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
    // InternalDomainmodel.g:650:1: entryRuleSELECT returns [EObject current=null] : iv_ruleSELECT= ruleSELECT EOF ;
    public final EObject entryRuleSELECT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSELECT = null;


        try {
            // InternalDomainmodel.g:650:47: (iv_ruleSELECT= ruleSELECT EOF )
            // InternalDomainmodel.g:651:2: iv_ruleSELECT= ruleSELECT EOF
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
    // InternalDomainmodel.g:657:1: ruleSELECT returns [EObject current=null] : (otherlv_0= 'select' ( (lv_elem_1_0= RULE_STRING ) ) otherlv_2= 'in' otherlv_3= 'COMBOBOX' ( ruleELEMENTIDENTIFIER )? ) ;
    public final EObject ruleSELECT() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_elem_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalDomainmodel.g:663:2: ( (otherlv_0= 'select' ( (lv_elem_1_0= RULE_STRING ) ) otherlv_2= 'in' otherlv_3= 'COMBOBOX' ( ruleELEMENTIDENTIFIER )? ) )
            // InternalDomainmodel.g:664:2: (otherlv_0= 'select' ( (lv_elem_1_0= RULE_STRING ) ) otherlv_2= 'in' otherlv_3= 'COMBOBOX' ( ruleELEMENTIDENTIFIER )? )
            {
            // InternalDomainmodel.g:664:2: (otherlv_0= 'select' ( (lv_elem_1_0= RULE_STRING ) ) otherlv_2= 'in' otherlv_3= 'COMBOBOX' ( ruleELEMENTIDENTIFIER )? )
            // InternalDomainmodel.g:665:3: otherlv_0= 'select' ( (lv_elem_1_0= RULE_STRING ) ) otherlv_2= 'in' otherlv_3= 'COMBOBOX' ( ruleELEMENTIDENTIFIER )?
            {
            otherlv_0=(Token)match(input,33,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getSELECTAccess().getSelectKeyword_0());
            		
            // InternalDomainmodel.g:669:3: ( (lv_elem_1_0= RULE_STRING ) )
            // InternalDomainmodel.g:670:4: (lv_elem_1_0= RULE_STRING )
            {
            // InternalDomainmodel.g:670:4: (lv_elem_1_0= RULE_STRING )
            // InternalDomainmodel.g:671:5: lv_elem_1_0= RULE_STRING
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
            		
            otherlv_3=(Token)match(input,35,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getSELECTAccess().getCOMBOBOXKeyword_3());
            		
            // InternalDomainmodel.g:695:3: ( ruleELEMENTIDENTIFIER )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==39) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalDomainmodel.g:696:4: ruleELEMENTIDENTIFIER
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
    // InternalDomainmodel.g:708:1: entryRuleREAD returns [EObject current=null] : iv_ruleREAD= ruleREAD EOF ;
    public final EObject entryRuleREAD() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleREAD = null;


        try {
            // InternalDomainmodel.g:708:45: (iv_ruleREAD= ruleREAD EOF )
            // InternalDomainmodel.g:709:2: iv_ruleREAD= ruleREAD EOF
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
    // InternalDomainmodel.g:715:1: ruleREAD returns [EObject current=null] : ( () otherlv_1= 'read' otherlv_2= 'url' otherlv_3= 'from' (otherlv_4= 'BUTTON' | otherlv_5= 'LINK' | otherlv_6= 'IMAGE' | otherlv_7= 'TEXT' ) ruleELEMENTIDENTIFIER (this_SAVEVAR_9= ruleSAVEVAR )? ) ;
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
            // InternalDomainmodel.g:721:2: ( ( () otherlv_1= 'read' otherlv_2= 'url' otherlv_3= 'from' (otherlv_4= 'BUTTON' | otherlv_5= 'LINK' | otherlv_6= 'IMAGE' | otherlv_7= 'TEXT' ) ruleELEMENTIDENTIFIER (this_SAVEVAR_9= ruleSAVEVAR )? ) )
            // InternalDomainmodel.g:722:2: ( () otherlv_1= 'read' otherlv_2= 'url' otherlv_3= 'from' (otherlv_4= 'BUTTON' | otherlv_5= 'LINK' | otherlv_6= 'IMAGE' | otherlv_7= 'TEXT' ) ruleELEMENTIDENTIFIER (this_SAVEVAR_9= ruleSAVEVAR )? )
            {
            // InternalDomainmodel.g:722:2: ( () otherlv_1= 'read' otherlv_2= 'url' otherlv_3= 'from' (otherlv_4= 'BUTTON' | otherlv_5= 'LINK' | otherlv_6= 'IMAGE' | otherlv_7= 'TEXT' ) ruleELEMENTIDENTIFIER (this_SAVEVAR_9= ruleSAVEVAR )? )
            // InternalDomainmodel.g:723:3: () otherlv_1= 'read' otherlv_2= 'url' otherlv_3= 'from' (otherlv_4= 'BUTTON' | otherlv_5= 'LINK' | otherlv_6= 'IMAGE' | otherlv_7= 'TEXT' ) ruleELEMENTIDENTIFIER (this_SAVEVAR_9= ruleSAVEVAR )?
            {
            // InternalDomainmodel.g:723:3: ()
            // InternalDomainmodel.g:724:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getREADAccess().getREADAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,36,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getREADAccess().getReadKeyword_1());
            		
            otherlv_2=(Token)match(input,37,FOLLOW_23); 

            			newLeafNode(otherlv_2, grammarAccess.getREADAccess().getUrlKeyword_2());
            		
            otherlv_3=(Token)match(input,38,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getREADAccess().getFromKeyword_3());
            		
            // InternalDomainmodel.g:742:3: (otherlv_4= 'BUTTON' | otherlv_5= 'LINK' | otherlv_6= 'IMAGE' | otherlv_7= 'TEXT' )
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
                    // InternalDomainmodel.g:743:4: otherlv_4= 'BUTTON'
                    {
                    otherlv_4=(Token)match(input,21,FOLLOW_12); 

                    				newLeafNode(otherlv_4, grammarAccess.getREADAccess().getBUTTONKeyword_4_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalDomainmodel.g:748:4: otherlv_5= 'LINK'
                    {
                    otherlv_5=(Token)match(input,22,FOLLOW_12); 

                    				newLeafNode(otherlv_5, grammarAccess.getREADAccess().getLINKKeyword_4_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalDomainmodel.g:753:4: otherlv_6= 'IMAGE'
                    {
                    otherlv_6=(Token)match(input,23,FOLLOW_12); 

                    				newLeafNode(otherlv_6, grammarAccess.getREADAccess().getIMAGEKeyword_4_2());
                    			

                    }
                    break;
                case 4 :
                    // InternalDomainmodel.g:758:4: otherlv_7= 'TEXT'
                    {
                    otherlv_7=(Token)match(input,24,FOLLOW_12); 

                    				newLeafNode(otherlv_7, grammarAccess.getREADAccess().getTEXTKeyword_4_3());
                    			

                    }
                    break;

            }


            			newCompositeNode(grammarAccess.getREADAccess().getELEMENTIDENTIFIERParserRuleCall_5());
            		
            pushFollow(FOLLOW_24);
            ruleELEMENTIDENTIFIER();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalDomainmodel.g:770:3: (this_SAVEVAR_9= ruleSAVEVAR )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==47) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalDomainmodel.g:771:4: this_SAVEVAR_9= ruleSAVEVAR
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
    // InternalDomainmodel.g:784:1: entryRuleELEMENTIDENTIFIER returns [String current=null] : iv_ruleELEMENTIDENTIFIER= ruleELEMENTIDENTIFIER EOF ;
    public final String entryRuleELEMENTIDENTIFIER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleELEMENTIDENTIFIER = null;


        try {
            // InternalDomainmodel.g:784:57: (iv_ruleELEMENTIDENTIFIER= ruleELEMENTIDENTIFIER EOF )
            // InternalDomainmodel.g:785:2: iv_ruleELEMENTIDENTIFIER= ruleELEMENTIDENTIFIER EOF
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
    // InternalDomainmodel.g:791:1: ruleELEMENTIDENTIFIER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'identified' kw= 'by' (kw= 'LABEL' | kw= 'CLASS' | kw= 'ID' | kw= 'ALT' ) (this_STRING_6= RULE_STRING | (kw= 'given' this_VARTYPE_8= RULE_VARTYPE ) ) ) ;
    public final AntlrDatatypeRuleToken ruleELEMENTIDENTIFIER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_STRING_6=null;
        Token this_VARTYPE_8=null;


        	enterRule();

        try {
            // InternalDomainmodel.g:797:2: ( (kw= 'identified' kw= 'by' (kw= 'LABEL' | kw= 'CLASS' | kw= 'ID' | kw= 'ALT' ) (this_STRING_6= RULE_STRING | (kw= 'given' this_VARTYPE_8= RULE_VARTYPE ) ) ) )
            // InternalDomainmodel.g:798:2: (kw= 'identified' kw= 'by' (kw= 'LABEL' | kw= 'CLASS' | kw= 'ID' | kw= 'ALT' ) (this_STRING_6= RULE_STRING | (kw= 'given' this_VARTYPE_8= RULE_VARTYPE ) ) )
            {
            // InternalDomainmodel.g:798:2: (kw= 'identified' kw= 'by' (kw= 'LABEL' | kw= 'CLASS' | kw= 'ID' | kw= 'ALT' ) (this_STRING_6= RULE_STRING | (kw= 'given' this_VARTYPE_8= RULE_VARTYPE ) ) )
            // InternalDomainmodel.g:799:3: kw= 'identified' kw= 'by' (kw= 'LABEL' | kw= 'CLASS' | kw= 'ID' | kw= 'ALT' ) (this_STRING_6= RULE_STRING | (kw= 'given' this_VARTYPE_8= RULE_VARTYPE ) )
            {
            kw=(Token)match(input,39,FOLLOW_25); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getELEMENTIDENTIFIERAccess().getIdentifiedKeyword_0());
            		
            kw=(Token)match(input,40,FOLLOW_26); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getELEMENTIDENTIFIERAccess().getByKeyword_1());
            		
            // InternalDomainmodel.g:809:3: (kw= 'LABEL' | kw= 'CLASS' | kw= 'ID' | kw= 'ALT' )
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
                    // InternalDomainmodel.g:810:4: kw= 'LABEL'
                    {
                    kw=(Token)match(input,41,FOLLOW_8); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getELEMENTIDENTIFIERAccess().getLABELKeyword_2_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalDomainmodel.g:816:4: kw= 'CLASS'
                    {
                    kw=(Token)match(input,42,FOLLOW_8); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getELEMENTIDENTIFIERAccess().getCLASSKeyword_2_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalDomainmodel.g:822:4: kw= 'ID'
                    {
                    kw=(Token)match(input,43,FOLLOW_8); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getELEMENTIDENTIFIERAccess().getIDKeyword_2_2());
                    			

                    }
                    break;
                case 4 :
                    // InternalDomainmodel.g:828:4: kw= 'ALT'
                    {
                    kw=(Token)match(input,44,FOLLOW_8); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getELEMENTIDENTIFIERAccess().getALTKeyword_2_3());
                    			

                    }
                    break;

            }

            // InternalDomainmodel.g:834:3: (this_STRING_6= RULE_STRING | (kw= 'given' this_VARTYPE_8= RULE_VARTYPE ) )
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
                    // InternalDomainmodel.g:835:4: this_STRING_6= RULE_STRING
                    {
                    this_STRING_6=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    				current.merge(this_STRING_6);
                    			

                    				newLeafNode(this_STRING_6, grammarAccess.getELEMENTIDENTIFIERAccess().getSTRINGTerminalRuleCall_3_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalDomainmodel.g:843:4: (kw= 'given' this_VARTYPE_8= RULE_VARTYPE )
                    {
                    // InternalDomainmodel.g:843:4: (kw= 'given' this_VARTYPE_8= RULE_VARTYPE )
                    // InternalDomainmodel.g:844:5: kw= 'given' this_VARTYPE_8= RULE_VARTYPE
                    {
                    kw=(Token)match(input,18,FOLLOW_3); 

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


    // $ANTLR start "entryRuleCOUNT"
    // InternalDomainmodel.g:862:1: entryRuleCOUNT returns [EObject current=null] : iv_ruleCOUNT= ruleCOUNT EOF ;
    public final EObject entryRuleCOUNT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCOUNT = null;


        try {
            // InternalDomainmodel.g:862:46: (iv_ruleCOUNT= ruleCOUNT EOF )
            // InternalDomainmodel.g:863:2: iv_ruleCOUNT= ruleCOUNT EOF
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
    // InternalDomainmodel.g:869:1: ruleCOUNT returns [EObject current=null] : ( () otherlv_1= 'count' otherlv_2= 'ELEMENT' ruleELEMENTIDENTIFIER (this_SAVEVAR_4= ruleSAVEVAR )? ) ;
    public final EObject ruleCOUNT() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject this_SAVEVAR_4 = null;



        	enterRule();

        try {
            // InternalDomainmodel.g:875:2: ( ( () otherlv_1= 'count' otherlv_2= 'ELEMENT' ruleELEMENTIDENTIFIER (this_SAVEVAR_4= ruleSAVEVAR )? ) )
            // InternalDomainmodel.g:876:2: ( () otherlv_1= 'count' otherlv_2= 'ELEMENT' ruleELEMENTIDENTIFIER (this_SAVEVAR_4= ruleSAVEVAR )? )
            {
            // InternalDomainmodel.g:876:2: ( () otherlv_1= 'count' otherlv_2= 'ELEMENT' ruleELEMENTIDENTIFIER (this_SAVEVAR_4= ruleSAVEVAR )? )
            // InternalDomainmodel.g:877:3: () otherlv_1= 'count' otherlv_2= 'ELEMENT' ruleELEMENTIDENTIFIER (this_SAVEVAR_4= ruleSAVEVAR )?
            {
            // InternalDomainmodel.g:877:3: ()
            // InternalDomainmodel.g:878:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCOUNTAccess().getCOUNTAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,45,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getCOUNTAccess().getCountKeyword_1());
            		
            otherlv_2=(Token)match(input,46,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getCOUNTAccess().getELEMENTKeyword_2());
            		

            			newCompositeNode(grammarAccess.getCOUNTAccess().getELEMENTIDENTIFIERParserRuleCall_3());
            		
            pushFollow(FOLLOW_24);
            ruleELEMENTIDENTIFIER();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalDomainmodel.g:899:3: (this_SAVEVAR_4= ruleSAVEVAR )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==47) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalDomainmodel.g:900:4: this_SAVEVAR_4= ruleSAVEVAR
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
    // InternalDomainmodel.g:913:1: entryRuleSAVEVAR returns [EObject current=null] : iv_ruleSAVEVAR= ruleSAVEVAR EOF ;
    public final EObject entryRuleSAVEVAR() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSAVEVAR = null;


        try {
            // InternalDomainmodel.g:913:48: (iv_ruleSAVEVAR= ruleSAVEVAR EOF )
            // InternalDomainmodel.g:914:2: iv_ruleSAVEVAR= ruleSAVEVAR EOF
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
    // InternalDomainmodel.g:920:1: ruleSAVEVAR returns [EObject current=null] : (otherlv_0= 'and' otherlv_1= 'save' otherlv_2= 'in' ( (lv_var_3_0= RULE_VARTYPE ) ) ) ;
    public final EObject ruleSAVEVAR() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_var_3_0=null;


        	enterRule();

        try {
            // InternalDomainmodel.g:926:2: ( (otherlv_0= 'and' otherlv_1= 'save' otherlv_2= 'in' ( (lv_var_3_0= RULE_VARTYPE ) ) ) )
            // InternalDomainmodel.g:927:2: (otherlv_0= 'and' otherlv_1= 'save' otherlv_2= 'in' ( (lv_var_3_0= RULE_VARTYPE ) ) )
            {
            // InternalDomainmodel.g:927:2: (otherlv_0= 'and' otherlv_1= 'save' otherlv_2= 'in' ( (lv_var_3_0= RULE_VARTYPE ) ) )
            // InternalDomainmodel.g:928:3: otherlv_0= 'and' otherlv_1= 'save' otherlv_2= 'in' ( (lv_var_3_0= RULE_VARTYPE ) )
            {
            otherlv_0=(Token)match(input,47,FOLLOW_28); 

            			newLeafNode(otherlv_0, grammarAccess.getSAVEVARAccess().getAndKeyword_0());
            		
            otherlv_1=(Token)match(input,48,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getSAVEVARAccess().getSaveKeyword_1());
            		
            otherlv_2=(Token)match(input,34,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getSAVEVARAccess().getInKeyword_2());
            		
            // InternalDomainmodel.g:940:3: ( (lv_var_3_0= RULE_VARTYPE ) )
            // InternalDomainmodel.g:941:4: (lv_var_3_0= RULE_VARTYPE )
            {
            // InternalDomainmodel.g:941:4: (lv_var_3_0= RULE_VARTYPE )
            // InternalDomainmodel.g:942:5: lv_var_3_0= RULE_VARTYPE
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
    // InternalDomainmodel.g:962:1: entryRuleVERIFY returns [EObject current=null] : iv_ruleVERIFY= ruleVERIFY EOF ;
    public final EObject entryRuleVERIFY() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVERIFY = null;


        try {
            // InternalDomainmodel.g:962:47: (iv_ruleVERIFY= ruleVERIFY EOF )
            // InternalDomainmodel.g:963:2: iv_ruleVERIFY= ruleVERIFY EOF
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
    // InternalDomainmodel.g:969:1: ruleVERIFY returns [EObject current=null] : (otherlv_0= 'verify' otherlv_1= 'that' (this_COUNT_2= ruleCOUNT | ( (otherlv_3= 'PAGE' | otherlv_4= 'TEXT' ) ( ruleELEMENTIDENTIFIER )? ) ) ( (otherlv_6= 'contains' ( ( (otherlv_7= 'LINK' | otherlv_8= 'IMAGE' ) ruleELEMENTIDENTIFIER ) | ( (lv_value_10_0= RULE_STRING ) ) | (otherlv_11= 'saved' ( (lv_var_12_0= RULE_VARTYPE ) ) ) ) ) | (otherlv_13= 'equals' ( (otherlv_14= 'saved' ( (lv_var_15_0= RULE_VARTYPE ) ) ) | ( (lv_value_16_0= RULE_STRING ) ) ) ) ) ) ;
    public final EObject ruleVERIFY() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
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
        EObject this_COUNT_2 = null;



        	enterRule();

        try {
            // InternalDomainmodel.g:975:2: ( (otherlv_0= 'verify' otherlv_1= 'that' (this_COUNT_2= ruleCOUNT | ( (otherlv_3= 'PAGE' | otherlv_4= 'TEXT' ) ( ruleELEMENTIDENTIFIER )? ) ) ( (otherlv_6= 'contains' ( ( (otherlv_7= 'LINK' | otherlv_8= 'IMAGE' ) ruleELEMENTIDENTIFIER ) | ( (lv_value_10_0= RULE_STRING ) ) | (otherlv_11= 'saved' ( (lv_var_12_0= RULE_VARTYPE ) ) ) ) ) | (otherlv_13= 'equals' ( (otherlv_14= 'saved' ( (lv_var_15_0= RULE_VARTYPE ) ) ) | ( (lv_value_16_0= RULE_STRING ) ) ) ) ) ) )
            // InternalDomainmodel.g:976:2: (otherlv_0= 'verify' otherlv_1= 'that' (this_COUNT_2= ruleCOUNT | ( (otherlv_3= 'PAGE' | otherlv_4= 'TEXT' ) ( ruleELEMENTIDENTIFIER )? ) ) ( (otherlv_6= 'contains' ( ( (otherlv_7= 'LINK' | otherlv_8= 'IMAGE' ) ruleELEMENTIDENTIFIER ) | ( (lv_value_10_0= RULE_STRING ) ) | (otherlv_11= 'saved' ( (lv_var_12_0= RULE_VARTYPE ) ) ) ) ) | (otherlv_13= 'equals' ( (otherlv_14= 'saved' ( (lv_var_15_0= RULE_VARTYPE ) ) ) | ( (lv_value_16_0= RULE_STRING ) ) ) ) ) )
            {
            // InternalDomainmodel.g:976:2: (otherlv_0= 'verify' otherlv_1= 'that' (this_COUNT_2= ruleCOUNT | ( (otherlv_3= 'PAGE' | otherlv_4= 'TEXT' ) ( ruleELEMENTIDENTIFIER )? ) ) ( (otherlv_6= 'contains' ( ( (otherlv_7= 'LINK' | otherlv_8= 'IMAGE' ) ruleELEMENTIDENTIFIER ) | ( (lv_value_10_0= RULE_STRING ) ) | (otherlv_11= 'saved' ( (lv_var_12_0= RULE_VARTYPE ) ) ) ) ) | (otherlv_13= 'equals' ( (otherlv_14= 'saved' ( (lv_var_15_0= RULE_VARTYPE ) ) ) | ( (lv_value_16_0= RULE_STRING ) ) ) ) ) )
            // InternalDomainmodel.g:977:3: otherlv_0= 'verify' otherlv_1= 'that' (this_COUNT_2= ruleCOUNT | ( (otherlv_3= 'PAGE' | otherlv_4= 'TEXT' ) ( ruleELEMENTIDENTIFIER )? ) ) ( (otherlv_6= 'contains' ( ( (otherlv_7= 'LINK' | otherlv_8= 'IMAGE' ) ruleELEMENTIDENTIFIER ) | ( (lv_value_10_0= RULE_STRING ) ) | (otherlv_11= 'saved' ( (lv_var_12_0= RULE_VARTYPE ) ) ) ) ) | (otherlv_13= 'equals' ( (otherlv_14= 'saved' ( (lv_var_15_0= RULE_VARTYPE ) ) ) | ( (lv_value_16_0= RULE_STRING ) ) ) ) )
            {
            otherlv_0=(Token)match(input,49,FOLLOW_29); 

            			newLeafNode(otherlv_0, grammarAccess.getVERIFYAccess().getVerifyKeyword_0());
            		
            otherlv_1=(Token)match(input,50,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getVERIFYAccess().getThatKeyword_1());
            		
            // InternalDomainmodel.g:985:3: (this_COUNT_2= ruleCOUNT | ( (otherlv_3= 'PAGE' | otherlv_4= 'TEXT' ) ( ruleELEMENTIDENTIFIER )? ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==45) ) {
                alt24=1;
            }
            else if ( (LA24_0==24||LA24_0==51) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalDomainmodel.g:986:4: this_COUNT_2= ruleCOUNT
                    {

                    				newCompositeNode(grammarAccess.getVERIFYAccess().getCOUNTParserRuleCall_2_0());
                    			
                    pushFollow(FOLLOW_31);
                    this_COUNT_2=ruleCOUNT();

                    state._fsp--;


                    				current = this_COUNT_2;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalDomainmodel.g:995:4: ( (otherlv_3= 'PAGE' | otherlv_4= 'TEXT' ) ( ruleELEMENTIDENTIFIER )? )
                    {
                    // InternalDomainmodel.g:995:4: ( (otherlv_3= 'PAGE' | otherlv_4= 'TEXT' ) ( ruleELEMENTIDENTIFIER )? )
                    // InternalDomainmodel.g:996:5: (otherlv_3= 'PAGE' | otherlv_4= 'TEXT' ) ( ruleELEMENTIDENTIFIER )?
                    {
                    // InternalDomainmodel.g:996:5: (otherlv_3= 'PAGE' | otherlv_4= 'TEXT' )
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==51) ) {
                        alt22=1;
                    }
                    else if ( (LA22_0==24) ) {
                        alt22=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 22, 0, input);

                        throw nvae;
                    }
                    switch (alt22) {
                        case 1 :
                            // InternalDomainmodel.g:997:6: otherlv_3= 'PAGE'
                            {
                            otherlv_3=(Token)match(input,51,FOLLOW_32); 

                            						newLeafNode(otherlv_3, grammarAccess.getVERIFYAccess().getPAGEKeyword_2_1_0_0());
                            					

                            }
                            break;
                        case 2 :
                            // InternalDomainmodel.g:1002:6: otherlv_4= 'TEXT'
                            {
                            otherlv_4=(Token)match(input,24,FOLLOW_32); 

                            						newLeafNode(otherlv_4, grammarAccess.getVERIFYAccess().getTEXTKeyword_2_1_0_1());
                            					

                            }
                            break;

                    }

                    // InternalDomainmodel.g:1007:5: ( ruleELEMENTIDENTIFIER )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==39) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // InternalDomainmodel.g:1008:6: ruleELEMENTIDENTIFIER
                            {

                            						newCompositeNode(grammarAccess.getVERIFYAccess().getELEMENTIDENTIFIERParserRuleCall_2_1_1());
                            					
                            pushFollow(FOLLOW_31);
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

            // InternalDomainmodel.g:1018:3: ( (otherlv_6= 'contains' ( ( (otherlv_7= 'LINK' | otherlv_8= 'IMAGE' ) ruleELEMENTIDENTIFIER ) | ( (lv_value_10_0= RULE_STRING ) ) | (otherlv_11= 'saved' ( (lv_var_12_0= RULE_VARTYPE ) ) ) ) ) | (otherlv_13= 'equals' ( (otherlv_14= 'saved' ( (lv_var_15_0= RULE_VARTYPE ) ) ) | ( (lv_value_16_0= RULE_STRING ) ) ) ) )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==52) ) {
                alt28=1;
            }
            else if ( (LA28_0==53) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalDomainmodel.g:1019:4: (otherlv_6= 'contains' ( ( (otherlv_7= 'LINK' | otherlv_8= 'IMAGE' ) ruleELEMENTIDENTIFIER ) | ( (lv_value_10_0= RULE_STRING ) ) | (otherlv_11= 'saved' ( (lv_var_12_0= RULE_VARTYPE ) ) ) ) )
                    {
                    // InternalDomainmodel.g:1019:4: (otherlv_6= 'contains' ( ( (otherlv_7= 'LINK' | otherlv_8= 'IMAGE' ) ruleELEMENTIDENTIFIER ) | ( (lv_value_10_0= RULE_STRING ) ) | (otherlv_11= 'saved' ( (lv_var_12_0= RULE_VARTYPE ) ) ) ) )
                    // InternalDomainmodel.g:1020:5: otherlv_6= 'contains' ( ( (otherlv_7= 'LINK' | otherlv_8= 'IMAGE' ) ruleELEMENTIDENTIFIER ) | ( (lv_value_10_0= RULE_STRING ) ) | (otherlv_11= 'saved' ( (lv_var_12_0= RULE_VARTYPE ) ) ) )
                    {
                    otherlv_6=(Token)match(input,52,FOLLOW_33); 

                    					newLeafNode(otherlv_6, grammarAccess.getVERIFYAccess().getContainsKeyword_3_0_0());
                    				
                    // InternalDomainmodel.g:1024:5: ( ( (otherlv_7= 'LINK' | otherlv_8= 'IMAGE' ) ruleELEMENTIDENTIFIER ) | ( (lv_value_10_0= RULE_STRING ) ) | (otherlv_11= 'saved' ( (lv_var_12_0= RULE_VARTYPE ) ) ) )
                    int alt26=3;
                    switch ( input.LA(1) ) {
                    case 22:
                    case 23:
                        {
                        alt26=1;
                        }
                        break;
                    case RULE_STRING:
                        {
                        alt26=2;
                        }
                        break;
                    case 28:
                        {
                        alt26=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 26, 0, input);

                        throw nvae;
                    }

                    switch (alt26) {
                        case 1 :
                            // InternalDomainmodel.g:1025:6: ( (otherlv_7= 'LINK' | otherlv_8= 'IMAGE' ) ruleELEMENTIDENTIFIER )
                            {
                            // InternalDomainmodel.g:1025:6: ( (otherlv_7= 'LINK' | otherlv_8= 'IMAGE' ) ruleELEMENTIDENTIFIER )
                            // InternalDomainmodel.g:1026:7: (otherlv_7= 'LINK' | otherlv_8= 'IMAGE' ) ruleELEMENTIDENTIFIER
                            {
                            // InternalDomainmodel.g:1026:7: (otherlv_7= 'LINK' | otherlv_8= 'IMAGE' )
                            int alt25=2;
                            int LA25_0 = input.LA(1);

                            if ( (LA25_0==22) ) {
                                alt25=1;
                            }
                            else if ( (LA25_0==23) ) {
                                alt25=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 25, 0, input);

                                throw nvae;
                            }
                            switch (alt25) {
                                case 1 :
                                    // InternalDomainmodel.g:1027:8: otherlv_7= 'LINK'
                                    {
                                    otherlv_7=(Token)match(input,22,FOLLOW_12); 

                                    								newLeafNode(otherlv_7, grammarAccess.getVERIFYAccess().getLINKKeyword_3_0_1_0_0_0());
                                    							

                                    }
                                    break;
                                case 2 :
                                    // InternalDomainmodel.g:1032:8: otherlv_8= 'IMAGE'
                                    {
                                    otherlv_8=(Token)match(input,23,FOLLOW_12); 

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
                            // InternalDomainmodel.g:1046:6: ( (lv_value_10_0= RULE_STRING ) )
                            {
                            // InternalDomainmodel.g:1046:6: ( (lv_value_10_0= RULE_STRING ) )
                            // InternalDomainmodel.g:1047:7: (lv_value_10_0= RULE_STRING )
                            {
                            // InternalDomainmodel.g:1047:7: (lv_value_10_0= RULE_STRING )
                            // InternalDomainmodel.g:1048:8: lv_value_10_0= RULE_STRING
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
                            // InternalDomainmodel.g:1065:6: (otherlv_11= 'saved' ( (lv_var_12_0= RULE_VARTYPE ) ) )
                            {
                            // InternalDomainmodel.g:1065:6: (otherlv_11= 'saved' ( (lv_var_12_0= RULE_VARTYPE ) ) )
                            // InternalDomainmodel.g:1066:7: otherlv_11= 'saved' ( (lv_var_12_0= RULE_VARTYPE ) )
                            {
                            otherlv_11=(Token)match(input,28,FOLLOW_3); 

                            							newLeafNode(otherlv_11, grammarAccess.getVERIFYAccess().getSavedKeyword_3_0_1_2_0());
                            						
                            // InternalDomainmodel.g:1070:7: ( (lv_var_12_0= RULE_VARTYPE ) )
                            // InternalDomainmodel.g:1071:8: (lv_var_12_0= RULE_VARTYPE )
                            {
                            // InternalDomainmodel.g:1071:8: (lv_var_12_0= RULE_VARTYPE )
                            // InternalDomainmodel.g:1072:9: lv_var_12_0= RULE_VARTYPE
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
                    // InternalDomainmodel.g:1092:4: (otherlv_13= 'equals' ( (otherlv_14= 'saved' ( (lv_var_15_0= RULE_VARTYPE ) ) ) | ( (lv_value_16_0= RULE_STRING ) ) ) )
                    {
                    // InternalDomainmodel.g:1092:4: (otherlv_13= 'equals' ( (otherlv_14= 'saved' ( (lv_var_15_0= RULE_VARTYPE ) ) ) | ( (lv_value_16_0= RULE_STRING ) ) ) )
                    // InternalDomainmodel.g:1093:5: otherlv_13= 'equals' ( (otherlv_14= 'saved' ( (lv_var_15_0= RULE_VARTYPE ) ) ) | ( (lv_value_16_0= RULE_STRING ) ) )
                    {
                    otherlv_13=(Token)match(input,53,FOLLOW_16); 

                    					newLeafNode(otherlv_13, grammarAccess.getVERIFYAccess().getEqualsKeyword_3_1_0());
                    				
                    // InternalDomainmodel.g:1097:5: ( (otherlv_14= 'saved' ( (lv_var_15_0= RULE_VARTYPE ) ) ) | ( (lv_value_16_0= RULE_STRING ) ) )
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==28) ) {
                        alt27=1;
                    }
                    else if ( (LA27_0==RULE_STRING) ) {
                        alt27=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 27, 0, input);

                        throw nvae;
                    }
                    switch (alt27) {
                        case 1 :
                            // InternalDomainmodel.g:1098:6: (otherlv_14= 'saved' ( (lv_var_15_0= RULE_VARTYPE ) ) )
                            {
                            // InternalDomainmodel.g:1098:6: (otherlv_14= 'saved' ( (lv_var_15_0= RULE_VARTYPE ) ) )
                            // InternalDomainmodel.g:1099:7: otherlv_14= 'saved' ( (lv_var_15_0= RULE_VARTYPE ) )
                            {
                            otherlv_14=(Token)match(input,28,FOLLOW_3); 

                            							newLeafNode(otherlv_14, grammarAccess.getVERIFYAccess().getSavedKeyword_3_1_1_0_0());
                            						
                            // InternalDomainmodel.g:1103:7: ( (lv_var_15_0= RULE_VARTYPE ) )
                            // InternalDomainmodel.g:1104:8: (lv_var_15_0= RULE_VARTYPE )
                            {
                            // InternalDomainmodel.g:1104:8: (lv_var_15_0= RULE_VARTYPE )
                            // InternalDomainmodel.g:1105:9: lv_var_15_0= RULE_VARTYPE
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
                            // InternalDomainmodel.g:1123:6: ( (lv_value_16_0= RULE_STRING ) )
                            {
                            // InternalDomainmodel.g:1123:6: ( (lv_value_16_0= RULE_STRING ) )
                            // InternalDomainmodel.g:1124:7: (lv_value_16_0= RULE_STRING )
                            {
                            // InternalDomainmodel.g:1124:7: (lv_value_16_0= RULE_STRING )
                            // InternalDomainmodel.g:1125:8: lv_value_16_0= RULE_STRING
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


    // $ANTLR start "entryRulePLAY"
    // InternalDomainmodel.g:1148:1: entryRulePLAY returns [EObject current=null] : iv_rulePLAY= rulePLAY EOF ;
    public final EObject entryRulePLAY() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePLAY = null;


        try {
            // InternalDomainmodel.g:1148:45: (iv_rulePLAY= rulePLAY EOF )
            // InternalDomainmodel.g:1149:2: iv_rulePLAY= rulePLAY EOF
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
    // InternalDomainmodel.g:1155:1: rulePLAY returns [EObject current=null] : ( () otherlv_1= 'play' otherlv_2= 'procedure' this_VARTYPE_3= RULE_VARTYPE ( (lv_params_4_0= RULE_STRING ) )* ) ;
    public final EObject rulePLAY() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token this_VARTYPE_3=null;
        Token lv_params_4_0=null;


        	enterRule();

        try {
            // InternalDomainmodel.g:1161:2: ( ( () otherlv_1= 'play' otherlv_2= 'procedure' this_VARTYPE_3= RULE_VARTYPE ( (lv_params_4_0= RULE_STRING ) )* ) )
            // InternalDomainmodel.g:1162:2: ( () otherlv_1= 'play' otherlv_2= 'procedure' this_VARTYPE_3= RULE_VARTYPE ( (lv_params_4_0= RULE_STRING ) )* )
            {
            // InternalDomainmodel.g:1162:2: ( () otherlv_1= 'play' otherlv_2= 'procedure' this_VARTYPE_3= RULE_VARTYPE ( (lv_params_4_0= RULE_STRING ) )* )
            // InternalDomainmodel.g:1163:3: () otherlv_1= 'play' otherlv_2= 'procedure' this_VARTYPE_3= RULE_VARTYPE ( (lv_params_4_0= RULE_STRING ) )*
            {
            // InternalDomainmodel.g:1163:3: ()
            // InternalDomainmodel.g:1164:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPLAYAccess().getPLAYAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,54,FOLLOW_34); 

            			newLeafNode(otherlv_1, grammarAccess.getPLAYAccess().getPlayKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getPLAYAccess().getProcedureKeyword_2());
            		
            this_VARTYPE_3=(Token)match(input,RULE_VARTYPE,FOLLOW_35); 

            			newLeafNode(this_VARTYPE_3, grammarAccess.getPLAYAccess().getVARTYPETerminalRuleCall_3());
            		
            // InternalDomainmodel.g:1182:3: ( (lv_params_4_0= RULE_STRING ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_STRING) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalDomainmodel.g:1183:4: (lv_params_4_0= RULE_STRING )
            	    {
            	    // InternalDomainmodel.g:1183:4: (lv_params_4_0= RULE_STRING )
            	    // InternalDomainmodel.g:1184:5: lv_params_4_0= RULE_STRING
            	    {
            	    lv_params_4_0=(Token)match(input,RULE_STRING,FOLLOW_35); 

            	    					newLeafNode(lv_params_4_0, grammarAccess.getPLAYAccess().getParamsSTRINGTerminalRuleCall_4_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getPLAYRule());
            	    					}
            	    					addWithLastConsumed(
            	    						current,
            	    						"params",
            	    						lv_params_4_0,
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00422013220A7002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00422013220A5012L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00422013220A5002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001E00000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000008000002000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000010000020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x00001E0000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0008200001000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0030000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0030008000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000010C00020L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000022L});

}