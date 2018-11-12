/**
 * generated by Xtext 2.15.0
 */
package org.xtext.project.browserautomationdsl.generator;

import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.xtext.project.browserautomationdsl.domainmodel.PROGRAMME;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class DomainmodelGenerator extends AbstractGenerator {
  @Inject
  @Extension
  private IQualifiedNameProvider _iQualifiedNameProvider;
  
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    Iterable<PROGRAMME> _filter = Iterables.<PROGRAMME>filter(IteratorExtensions.<EObject>toIterable(resource.getAllContents()), PROGRAMME.class);
    for (final PROGRAMME p : _filter) {
      String _string = this._iQualifiedNameProvider.getFullyQualifiedName(p).toString("/");
      String _plus = (_string + ".java");
      fsa.generateFile(_plus, 
        this.compile(p));
    }
  }
  
  public CharSequence compile(final PROGRAMME p) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field superType is undefined for the type PROGRAMME"
      + "\nThe method or field superType is undefined for the type PROGRAMME"
      + "\n!== cannot be resolved"
      + "\nfullyQualifiedName cannot be resolved");
  }
}
