/*
 * generated by Xtext 2.15.0
 */
package org.xtext.project.browserautomationdsl.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class DomainmodelAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("org/xtext/project/browserautomationdsl/parser/antlr/internal/InternalDomainmodel.tokens");
	}
}
