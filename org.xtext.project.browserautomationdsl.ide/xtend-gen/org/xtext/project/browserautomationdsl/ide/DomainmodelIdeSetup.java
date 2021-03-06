/**
 * generated by Xtext 2.15.0
 */
package org.xtext.project.browserautomationdsl.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import org.xtext.project.browserautomationdsl.DomainmodelRuntimeModule;
import org.xtext.project.browserautomationdsl.DomainmodelStandaloneSetup;
import org.xtext.project.browserautomationdsl.ide.DomainmodelIdeModule;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class DomainmodelIdeSetup extends DomainmodelStandaloneSetup {
  @Override
  public Injector createInjector() {
    DomainmodelRuntimeModule _domainmodelRuntimeModule = new DomainmodelRuntimeModule();
    DomainmodelIdeModule _domainmodelIdeModule = new DomainmodelIdeModule();
    return Guice.createInjector(Modules2.mixin(_domainmodelRuntimeModule, _domainmodelIdeModule));
  }
}
