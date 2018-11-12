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
import org.xtext.project.browserautomationdsl.domainmodel.COUNT;
import org.xtext.project.browserautomationdsl.domainmodel.DomainmodelPackage;
import org.xtext.project.browserautomationdsl.domainmodel.FILL;
import org.xtext.project.browserautomationdsl.domainmodel.INSTRUCTION;
import org.xtext.project.browserautomationdsl.domainmodel.PLAY;
import org.xtext.project.browserautomationdsl.domainmodel.PROGRAMME;
import org.xtext.project.browserautomationdsl.domainmodel.READ;
import org.xtext.project.browserautomationdsl.domainmodel.SAVEVAR;
import org.xtext.project.browserautomationdsl.domainmodel.SELECT;
import org.xtext.project.browserautomationdsl.domainmodel.VERIFY;
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
			case DomainmodelPackage.COUNT:
				if (rule == grammarAccess.getCOUNTRule()) {
					sequence_COUNT_SAVEVAR(context, (COUNT) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getINSTRUCTIONRule()
						|| rule == grammarAccess.getVERIFYRule()) {
					sequence_COUNT_SAVEVAR_VERIFY(context, (COUNT) semanticObject); 
					return; 
				}
				else break;
			case DomainmodelPackage.FILL:
				sequence_FILL(context, (FILL) semanticObject); 
				return; 
			case DomainmodelPackage.INSTRUCTION:
				sequence_INSTRUCTION(context, (INSTRUCTION) semanticObject); 
				return; 
			case DomainmodelPackage.PLAY:
				sequence_PLAY(context, (PLAY) semanticObject); 
				return; 
			case DomainmodelPackage.PROGRAMME:
				sequence_PROGRAMME(context, (PROGRAMME) semanticObject); 
				return; 
			case DomainmodelPackage.READ:
				sequence_READ_SAVEVAR(context, (READ) semanticObject); 
				return; 
			case DomainmodelPackage.SAVEVAR:
				sequence_SAVEVAR(context, (SAVEVAR) semanticObject); 
				return; 
			case DomainmodelPackage.SELECT:
				sequence_SELECT(context, (SELECT) semanticObject); 
				return; 
			case DomainmodelPackage.VERIFY:
				sequence_VERIFY(context, (VERIFY) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     COUNT returns COUNT
	 *
	 * Constraint:
	 *     var=VARTYPE?
	 */
	protected void sequence_COUNT_SAVEVAR(ISerializationContext context, COUNT semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     INSTRUCTION returns COUNT
	 *     VERIFY returns COUNT
	 *
	 * Constraint:
	 *     (var=VARTYPE? (value=STRING | var=VARTYPE | var=VARTYPE | value=STRING)?)
	 */
	protected void sequence_COUNT_SAVEVAR_VERIFY(ISerializationContext context, COUNT semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     INSTRUCTION returns FILL
	 *     FILL returns FILL
	 *
	 * Constraint:
	 *     (var=VARTYPE | value=STRING)
	 */
	protected void sequence_FILL(ISerializationContext context, FILL semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     INSTRUCTION returns INSTRUCTION
	 *
	 * Constraint:
	 *     {INSTRUCTION}
	 */
	protected void sequence_INSTRUCTION(ISerializationContext context, INSTRUCTION semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     INSTRUCTION returns PLAY
	 *     PLAY returns PLAY
	 *
	 * Constraint:
	 *     params+=STRING*
	 */
	protected void sequence_PLAY(ISerializationContext context, PLAY semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     PROGRAMME returns PROGRAMME
	 *
	 * Constraint:
	 *     (name=VARTYPE (param=VARTYPE params+=VARTYPE*)? inst+=INSTRUCTION*)+
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
	 *     var=VARTYPE?
	 */
	protected void sequence_READ_SAVEVAR(ISerializationContext context, READ semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
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
			if (transientValues.isValueTransient(semanticObject, DomainmodelPackage.Literals.VERIFY__VAR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DomainmodelPackage.Literals.VERIFY__VAR));
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
	 *     elem=STRING
	 */
	protected void sequence_SELECT(ISerializationContext context, SELECT semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DomainmodelPackage.Literals.SELECT__ELEM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DomainmodelPackage.Literals.SELECT__ELEM));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSELECTAccess().getElemSTRINGTerminalRuleCall_1_0(), semanticObject.getElem());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     INSTRUCTION returns VERIFY
	 *     VERIFY returns VERIFY
	 *
	 * Constraint:
	 *     (value=STRING | var=VARTYPE | var=VARTYPE | value=STRING)
	 */
	protected void sequence_VERIFY(ISerializationContext context, VERIFY semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}