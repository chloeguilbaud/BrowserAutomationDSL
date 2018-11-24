/*
 * generated by Xtext 2.15.0
 */
package org.xtext.project.browserautomationdsl.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.project.browserautomationdsl.domainmodel.CHECK;
import org.xtext.project.browserautomationdsl.domainmodel.CLICK;
import org.xtext.project.browserautomationdsl.domainmodel.COUNT;
import org.xtext.project.browserautomationdsl.domainmodel.DomainmodelPackage;
import org.xtext.project.browserautomationdsl.domainmodel.ELEMENTIDENTIFIER;
import org.xtext.project.browserautomationdsl.domainmodel.FILL;
import org.xtext.project.browserautomationdsl.domainmodel.GOTO;
import org.xtext.project.browserautomationdsl.domainmodel.OPEN;
import org.xtext.project.browserautomationdsl.domainmodel.PLAY;
import org.xtext.project.browserautomationdsl.domainmodel.PROCEDURE;
import org.xtext.project.browserautomationdsl.domainmodel.PROGRAMME;
import org.xtext.project.browserautomationdsl.domainmodel.READ;
import org.xtext.project.browserautomationdsl.domainmodel.REGISTERED_VALUE;
import org.xtext.project.browserautomationdsl.domainmodel.SAVEVAR;
import org.xtext.project.browserautomationdsl.domainmodel.SELECT;
import org.xtext.project.browserautomationdsl.domainmodel.UNCHECK;
import org.xtext.project.browserautomationdsl.domainmodel.VERIFY_CONTAINS;
import org.xtext.project.browserautomationdsl.domainmodel.VERIFY_EQUALS;
import org.xtext.project.browserautomationdsl.services.DomainmodelGrammarAccess;

@SuppressWarnings("all")
public class DomainmodelSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private DomainmodelGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == DomainmodelPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case DomainmodelPackage.CHECK:
				sequence_CHECK(context, (CHECK) semanticObject); 
				return; 
			case DomainmodelPackage.CLICK:
				sequence_CLICK(context, (CLICK) semanticObject); 
				return; 
			case DomainmodelPackage.COUNT:
				sequence_COUNT(context, (COUNT) semanticObject); 
				return; 
			case DomainmodelPackage.ELEMENTIDENTIFIER:
				sequence_ELEMENTIDENTIFIER(context, (ELEMENTIDENTIFIER) semanticObject); 
				return; 
			case DomainmodelPackage.FILL:
				sequence_FILL(context, (FILL) semanticObject); 
				return; 
			case DomainmodelPackage.GOTO:
				sequence_GOTO(context, (GOTO) semanticObject); 
				return; 
			case DomainmodelPackage.OPEN:
				sequence_OPEN(context, (OPEN) semanticObject); 
				return; 
			case DomainmodelPackage.PLAY:
				sequence_PLAY(context, (PLAY) semanticObject); 
				return; 
			case DomainmodelPackage.PROCEDURE:
				sequence_PROCEDURE(context, (PROCEDURE) semanticObject); 
				return; 
			case DomainmodelPackage.PROGRAMME:
				sequence_PROGRAMME(context, (PROGRAMME) semanticObject); 
				return; 
			case DomainmodelPackage.READ:
				sequence_READ(context, (READ) semanticObject); 
				return; 
			case DomainmodelPackage.REGISTERED_VALUE:
				sequence_REGISTERED_VALUE(context, (REGISTERED_VALUE) semanticObject); 
				return; 
			case DomainmodelPackage.SAVEVAR:
				sequence_SAVEVAR(context, (SAVEVAR) semanticObject); 
				return; 
			case DomainmodelPackage.SELECT:
				sequence_SELECT(context, (SELECT) semanticObject); 
				return; 
			case DomainmodelPackage.UNCHECK:
				sequence_UNCHECK(context, (UNCHECK) semanticObject); 
				return; 
			case DomainmodelPackage.VERIFY_CONTAINS:
				sequence_VERIFY_CONTAINS(context, (VERIFY_CONTAINS) semanticObject); 
				return; 
			case DomainmodelPackage.VERIFY_EQUALS:
				sequence_VERIFY_EQUALS(context, (VERIFY_EQUALS) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     INSTRUCTION returns CHECK
	 *     CHECK returns CHECK
	 *
	 * Constraint:
	 *     (name='check' all='all'? identifier=ELEMENTIDENTIFIER)
	 */
	protected void sequence_CHECK(ISerializationContext context, CHECK semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     INSTRUCTION returns CLICK
	 *     CLICK returns CLICK
	 *
	 * Constraint:
	 *     (name='click' (type='BUTTON' | type='LINK' | type='IMAGE' | type='TEXT') identifier=ELEMENTIDENTIFIER)
	 */
	protected void sequence_CLICK(ISerializationContext context, CLICK semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     INSTRUCTION returns COUNT
	 *     COUNT returns COUNT
	 *
	 * Constraint:
	 *     (name='count' identifier=ELEMENTIDENTIFIER saveVariable=SAVEVAR?)
	 */
	protected void sequence_COUNT(ISerializationContext context, COUNT semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ELEMENTIDENTIFIER returns ELEMENTIDENTIFIER
	 *
	 * Constraint:
	 *     (name='identified' (type='LABEL' | type='CLASS' | type='ID' | type='ALT') (value=STRING | (info='given' var=VARTYPE)))
	 */
	protected void sequence_ELEMENTIDENTIFIER(ISerializationContext context, ELEMENTIDENTIFIER semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     INSTRUCTION returns FILL
	 *     FILL returns FILL
	 *
	 * Constraint:
	 *     (name='fill' (fieldType='TEXTFIELD' | fieldType='SEARCHFIELD') identifier=ELEMENTIDENTIFIER? (var=VARTYPE | value=STRING))
	 */
	protected void sequence_FILL(ISerializationContext context, FILL semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     INSTRUCTION returns GOTO
	 *     GOTO returns GOTO
	 *
	 * Constraint:
	 *     (name='go to' value=STRING)
	 */
	protected void sequence_GOTO(ISerializationContext context, GOTO semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DomainmodelPackage.Literals.GOTO__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DomainmodelPackage.Literals.GOTO__NAME));
			if (transientValues.isValueTransient(semanticObject, DomainmodelPackage.Literals.GOTO__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DomainmodelPackage.Literals.GOTO__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGOTOAccess().getNameGoToKeyword_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getGOTOAccess().getValueSTRINGTerminalRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     INSTRUCTION returns OPEN
	 *     OPEN returns OPEN
	 *
	 * Constraint:
	 *     (name='open' (value='FIREFOX' | value='CHROME'))
	 */
	protected void sequence_OPEN(ISerializationContext context, OPEN semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     INSTRUCTION returns PLAY
	 *     PLAY returns PLAY
	 *
	 * Constraint:
	 *     (name='play' preocedure=VARTYPE params+=STRING*)
	 */
	protected void sequence_PLAY(ISerializationContext context, PLAY semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     PROCEDURE returns PROCEDURE
	 *
	 * Constraint:
	 *     (name=VARTYPE (param=VARTYPE params+=VARTYPE*)? inst+=INSTRUCTION*)
	 */
	protected void sequence_PROCEDURE(ISerializationContext context, PROCEDURE semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     PROGRAMME returns PROGRAMME
	 *
	 * Constraint:
	 *     procedures+=PROCEDURE+
	 */
	protected void sequence_PROGRAMME(ISerializationContext context, PROGRAMME semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     INSTRUCTION returns READ
	 *     READ returns READ
	 *
	 * Constraint:
	 *     (name='read' identifier=ELEMENTIDENTIFIER savePath=SAVEVAR?)
	 */
	protected void sequence_READ(ISerializationContext context, READ semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     REGISTERED_VALUE returns REGISTERED_VALUE
	 *
	 * Constraint:
	 *     var=VARTYPE
	 */
	protected void sequence_REGISTERED_VALUE(ISerializationContext context, REGISTERED_VALUE semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DomainmodelPackage.Literals.REGISTERED_VALUE__VAR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DomainmodelPackage.Literals.REGISTERED_VALUE__VAR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getREGISTERED_VALUEAccess().getVarVARTYPETerminalRuleCall_1_0(), semanticObject.getVar());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     SAVEVAR returns SAVEVAR
	 *
	 * Constraint:
	 *     var=VARTYPE
	 */
	protected void sequence_SAVEVAR(ISerializationContext context, SAVEVAR semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DomainmodelPackage.Literals.SAVEVAR__VAR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DomainmodelPackage.Literals.SAVEVAR__VAR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSAVEVARAccess().getVarVARTYPETerminalRuleCall_3_0(), semanticObject.getVar());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     INSTRUCTION returns SELECT
	 *     SELECT returns SELECT
	 *
	 * Constraint:
	 *     (name='select' elem=STRING identifier=ELEMENTIDENTIFIER)
	 */
	protected void sequence_SELECT(ISerializationContext context, SELECT semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DomainmodelPackage.Literals.SELECT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DomainmodelPackage.Literals.SELECT__NAME));
			if (transientValues.isValueTransient(semanticObject, DomainmodelPackage.Literals.SELECT__ELEM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DomainmodelPackage.Literals.SELECT__ELEM));
			if (transientValues.isValueTransient(semanticObject, DomainmodelPackage.Literals.SELECT__IDENTIFIER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DomainmodelPackage.Literals.SELECT__IDENTIFIER));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSELECTAccess().getNameSelectKeyword_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getSELECTAccess().getElemSTRINGTerminalRuleCall_1_0(), semanticObject.getElem());
		feeder.accept(grammarAccess.getSELECTAccess().getIdentifierELEMENTIDENTIFIERParserRuleCall_4_0(), semanticObject.getIdentifier());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     INSTRUCTION returns UNCHECK
	 *     UNCHECK returns UNCHECK
	 *
	 * Constraint:
	 *     (name='uncheck' all='all'? identifier=ELEMENTIDENTIFIER)
	 */
	protected void sequence_UNCHECK(ISerializationContext context, UNCHECK semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     INSTRUCTION returns VERIFY_CONTAINS
	 *     VERIFY returns VERIFY_CONTAINS
	 *     VERIFY_CONTAINS returns VERIFY_CONTAINS
	 *
	 * Constraint:
	 *     ((type='PAGE' | type='TEXT') identifier=ELEMENTIDENTIFIER? (containedIdentifier=ELEMENTIDENTIFIER | value=STRING | variable=REGISTERED_VALUE))
	 */
	protected void sequence_VERIFY_CONTAINS(ISerializationContext context, VERIFY_CONTAINS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     INSTRUCTION returns VERIFY_EQUALS
	 *     VERIFY returns VERIFY_EQUALS
	 *     VERIFY_EQUALS returns VERIFY_EQUALS
	 *
	 * Constraint:
	 *     (operation=COUNT (value=STRING | registeredValue=REGISTERED_VALUE))
	 */
	protected void sequence_VERIFY_EQUALS(ISerializationContext context, VERIFY_EQUALS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
