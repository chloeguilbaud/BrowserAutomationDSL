/**
 * generated by Xtext 2.15.0
 */
package org.xtext.project.browserautomationdsl.generator;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.xtext.project.browserautomationdsl.domainmodel.CHECK;
import org.xtext.project.browserautomationdsl.domainmodel.CLICK;
import org.xtext.project.browserautomationdsl.domainmodel.COUNT;
import org.xtext.project.browserautomationdsl.domainmodel.ELEMENTIDENTIFIER;
import org.xtext.project.browserautomationdsl.domainmodel.FILL;
import org.xtext.project.browserautomationdsl.domainmodel.GOTO;
import org.xtext.project.browserautomationdsl.domainmodel.INSTRUCTION;
import org.xtext.project.browserautomationdsl.domainmodel.OPEN;
import org.xtext.project.browserautomationdsl.domainmodel.PLAY;
import org.xtext.project.browserautomationdsl.domainmodel.PROCEDURE;
import org.xtext.project.browserautomationdsl.domainmodel.PROGRAMME;
import org.xtext.project.browserautomationdsl.domainmodel.READ;
import org.xtext.project.browserautomationdsl.domainmodel.SAVEVAR;
import org.xtext.project.browserautomationdsl.domainmodel.SELECT;
import org.xtext.project.browserautomationdsl.domainmodel.UNCHECK;
import org.xtext.project.browserautomationdsl.domainmodel.VERIFY_CONTAINS;
import org.xtext.project.browserautomationdsl.domainmodel.VERIFY_EQUALS;

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
      String _substring = resource.getURI().lastSegment().substring(0, resource.getURI().lastSegment().indexOf(".ba"));
      String _plus = (_substring + ".java");
      fsa.generateFile(_plus, 
        this.compile(p, resource.getURI().lastSegment().substring(0, resource.getURI().lastSegment().indexOf(".ba"))));
    }
  }
  
  public CharSequence compile(final PROGRAMME p, final String s) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import org.junit.Test;");
    _builder.newLine();
    _builder.append("import java.util.List;");
    _builder.newLine();
    _builder.append("import org.openqa.selenium.By;");
    _builder.newLine();
    _builder.append("import org.openqa.selenium.WebDriver;");
    _builder.newLine();
    _builder.append("import org.openqa.selenium.WebElement;");
    _builder.newLine();
    _builder.append("import org.openqa.selenium.firefox.FirefoxDriver;");
    _builder.newLine();
    _builder.append("import static org.junit.Assert.assertTrue;");
    _builder.newLine();
    _builder.append("import org.openqa.selenium.JavascriptExecutor;");
    _builder.newLine();
    _builder.append("import org.openqa.selenium.remote.DesiredCapabilities;");
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class ");
    _builder.append(s);
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Test");
    _builder.newLine();
    {
      EList<PROCEDURE> _procedures = p.getProcedures();
      for(final PROCEDURE f : _procedures) {
        _builder.append(" \t");
        CharSequence _compile = this.compile(f);
        _builder.append(_compile, " \t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compile(final PROCEDURE p) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public void ");
    String _name = p.getName();
    _builder.append(_name);
    _builder.append("(");
    {
      String _param = p.getParam();
      boolean _tripleNotEquals = (_param != null);
      if (_tripleNotEquals) {
        _builder.append("String ");
        String _param_1 = p.getParam();
        _builder.append(_param_1);
      }
    }
    {
      EList<String> _params = p.getParams();
      for(final String param : _params) {
        _builder.append(", String ");
        _builder.append(param);
      }
    }
    _builder.append(") {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("List<WebElement> elements;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("WebElement element = null;");
    _builder.newLine();
    {
      EList<INSTRUCTION> _inst = p.getInst();
      for(final INSTRUCTION inst : _inst) {
        _builder.append("\t");
        CharSequence _compile = this.compile(inst);
        _builder.append(_compile, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compile(final INSTRUCTION i) {
    StringConcatenation _builder = new StringConcatenation();
    {
      if ((i instanceof OPEN)) {
        CharSequence _compile = this.compile(((OPEN)i));
        _builder.append(_compile);
        _builder.newLineIfNotEmpty();
      } else {
        if ((i instanceof CLICK)) {
          CharSequence _compile_1 = this.compile(((CLICK)i));
          _builder.append(_compile_1);
          _builder.newLineIfNotEmpty();
        } else {
          if ((i instanceof CHECK)) {
            CharSequence _compile_2 = this.compile(((CHECK)i));
            _builder.append(_compile_2);
            _builder.newLineIfNotEmpty();
          } else {
            if ((i instanceof UNCHECK)) {
              CharSequence _compile_3 = this.compile(((UNCHECK)i));
              _builder.append(_compile_3);
              _builder.newLineIfNotEmpty();
            } else {
              if ((i instanceof READ)) {
                CharSequence _compile_4 = this.compile(((READ)i));
                _builder.append(_compile_4);
                _builder.newLineIfNotEmpty();
              } else {
                if ((i instanceof COUNT)) {
                  CharSequence _compile_5 = this.compile(((COUNT)i));
                  _builder.append(_compile_5);
                  _builder.newLineIfNotEmpty();
                } else {
                  if ((i instanceof SELECT)) {
                    CharSequence _compile_6 = this.compile(((SELECT)i));
                    _builder.append(_compile_6);
                    _builder.newLineIfNotEmpty();
                  } else {
                    if ((i instanceof VERIFY_CONTAINS)) {
                      CharSequence _compile_7 = this.compile(((VERIFY_CONTAINS)i));
                      _builder.append(_compile_7);
                      _builder.newLineIfNotEmpty();
                    } else {
                      if ((i instanceof VERIFY_EQUALS)) {
                        CharSequence _compile_8 = this.compile(((VERIFY_EQUALS)i));
                        _builder.append(_compile_8);
                        _builder.newLineIfNotEmpty();
                      } else {
                        if ((i instanceof GOTO)) {
                          CharSequence _compile_9 = this.compile(((GOTO)i));
                          _builder.append(_compile_9);
                          _builder.newLineIfNotEmpty();
                        } else {
                          if ((i instanceof FILL)) {
                            CharSequence _compile_10 = this.compile(((FILL)i));
                            _builder.append(_compile_10);
                            _builder.newLineIfNotEmpty();
                          } else {
                            if ((i instanceof PLAY)) {
                              CharSequence _compile_11 = this.compile(((PLAY)i));
                              int _length = this.compile(((PLAY)i)).length();
                              int _minus = (_length - 3);
                              CharSequence _subSequence = _compile_11.subSequence(0, _minus);
                              _builder.append(_subSequence);
                              _builder.append(");");
                              _builder.newLineIfNotEmpty();
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    return _builder;
  }
  
  public CharSequence compile(final OPEN o) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("System.setProperty(\"webdriver.gecko.driver\", \"./geckodriver.exe\");");
    _builder.newLine();
    _builder.append("DesiredCapabilities capabilities = DesiredCapabilities.firefox();");
    _builder.newLine();
    _builder.append("capabilities.setCapability(\"marionette\", true);");
    _builder.newLine();
    _builder.append("WebDriver driver = new ");
    {
      String _value = o.getValue();
      boolean _equals = Objects.equal(_value, "FIREFOX");
      if (_equals) {
        _builder.append("FirefoxDriver");
      } else {
        _builder.append("ChromeDriver");
      }
    }
    _builder.append("(capabilities);");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("JavascriptExecutor jse = ((JavascriptExecutor) driver);");
    _builder.newLine();
    _builder.append("driver.manage().timeouts().implicitlyWait(10, java.util.concurrent.TimeUnit.SECONDS);");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compile(final CLICK c) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _find = this.find(this.compile(c.getIdentifier()));
    _builder.append(_find);
    _builder.newLineIfNotEmpty();
    _builder.append("element.click();");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence find(final CharSequence c) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("element = null;");
    _builder.newLine();
    _builder.append("elements = driver.findElements(");
    _builder.append(c);
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    _builder.append("for (WebElement e : elements) {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("if (!e.getTagName().isEmpty()) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("jse.executeScript(\"window.scrollTo(\"+ e.getLocation().x + \", \" + (e.getLocation().y - e.getRect().height * 3) + \")\");");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("element = e;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compile(final CHECK c) {
    StringConcatenation _builder = new StringConcatenation();
    {
      String _all = c.getAll();
      boolean _equals = Objects.equal(_all, "all");
      if (_equals) {
        {
          ELEMENTIDENTIFIER _identifier = c.getIdentifier();
          boolean _notEquals = (!Objects.equal(_identifier, null));
          if (_notEquals) {
            _builder.append("List<WebElement> checkboxes = driver.findElements(");
            CharSequence _compile = this.compile(c.getIdentifier());
            _builder.append(_compile);
            _builder.append(");");
            _builder.newLineIfNotEmpty();
          } else {
            _builder.append("List<WebElement> checkboxes = driver.findElements(By.checkbox);");
            _builder.newLine();
          }
        }
        _builder.append("checkboxes.forEach((element) -> {");
        _builder.newLine();
      } else {
        _builder.append("element = driver.findElement(");
        CharSequence _compile_1 = this.compile(c.getIdentifier());
        _builder.append(_compile_1);
        _builder.append(");");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("if(!element.isSelected()){");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("checkBox.click();");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    {
      String _all_1 = c.getAll();
      boolean _equals_1 = Objects.equal(_all_1, "all");
      if (_equals_1) {
        _builder.append("});");
        _builder.newLine();
      }
    }
    return _builder;
  }
  
  public CharSequence compile(final UNCHECK u) {
    StringConcatenation _builder = new StringConcatenation();
    {
      String _all = u.getAll();
      boolean _equals = Objects.equal(_all, "all");
      if (_equals) {
        {
          ELEMENTIDENTIFIER _identifier = u.getIdentifier();
          boolean _notEquals = (!Objects.equal(_identifier, null));
          if (_notEquals) {
            _builder.append("List<WebElement> checkboxes = driver.findElements(");
            CharSequence _compile = this.compile(u.getIdentifier());
            _builder.append(_compile);
            _builder.append(");");
            _builder.newLineIfNotEmpty();
          } else {
            _builder.append("List<WebElement> checkboxes = driver.findElements(By.checkbox);");
            _builder.newLine();
          }
        }
        _builder.append("checkboxes.forEach((element) -> {");
        _builder.newLine();
      } else {
        _builder.append("element = driver.findElement(");
        CharSequence _compile_1 = this.compile(u.getIdentifier());
        _builder.append(_compile_1);
        _builder.append(");");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("if(element.isSelected()){");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("checkBox.click();");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    {
      String _all_1 = u.getAll();
      boolean _equals_1 = Objects.equal(_all_1, "all");
      if (_equals_1) {
        _builder.append("});");
        _builder.newLine();
      }
    }
    return _builder;
  }
  
  public CharSequence compile(final READ r) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _find = this.find(this.compile(r.getIdentifier()));
    _builder.append(_find);
    _builder.newLineIfNotEmpty();
    _builder.append("String ");
    CharSequence _compile = this.compile(r.getSavePath());
    _builder.append(_compile);
    _builder.append(" = element;");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compile(final COUNT c) {
    StringConcatenation _builder = new StringConcatenation();
    {
      SAVEVAR _saveVariable = c.getSaveVariable();
      boolean _notEquals = (!Objects.equal(_saveVariable, null));
      if (_notEquals) {
        _builder.append("int ");
        CharSequence _compile = this.compile(c.getSaveVariable());
        _builder.append(_compile);
        _builder.append(" = ");
      }
    }
    _builder.append("driver.findElements(");
    CharSequence _compile_1 = this.compile(c.getIdentifier());
    _builder.append(_compile_1);
    _builder.append(").length");
    {
      SAVEVAR _saveVariable_1 = c.getSaveVariable();
      boolean _notEquals_1 = (!Objects.equal(_saveVariable_1, null));
      if (_notEquals_1) {
        _builder.append(";");
      }
    }
    return _builder;
  }
  
  public CharSequence compile(final VERIFY_EQUALS v) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("assertTrue(");
    CharSequence _compile = this.compile(v.getOperation());
    _builder.append(_compile);
    _builder.append(".equals(");
    {
      String _value = v.getValue();
      boolean _notEquals = (!Objects.equal(_value, null));
      if (_notEquals) {
        String _value_1 = v.getValue();
        _builder.append(_value_1);
      } else {
        String _var = v.getRegisteredValue().getVar();
        _builder.append(_var);
      }
    }
    _builder.append("));");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compile(final VERIFY_CONTAINS v) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("element = null;");
    _builder.newLine();
    _builder.append("elements = driver.findElements(");
    {
      ELEMENTIDENTIFIER _containedIdentifier = v.getContainedIdentifier();
      boolean _notEquals = (!Objects.equal(_containedIdentifier, null));
      if (_notEquals) {
        CharSequence _compile = this.compile(v.getContainedIdentifier());
        _builder.append(_compile);
      } else {
        _builder.append("By.xpath(\"//*[contains(text(), ");
        {
          String _value = v.getValue();
          boolean _notEquals_1 = (!Objects.equal(_value, null));
          if (_notEquals_1) {
            _builder.append("\'");
            String _value_1 = v.getValue();
            _builder.append(_value_1);
            _builder.append("\')]\"");
          } else {
            _builder.append("\" + ");
            String _var = v.getVariable().getVar();
            _builder.append(_var);
            _builder.append(" + \"\')]");
          }
        }
        _builder.append(")");
      }
    }
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    _builder.append("for (WebElement e : elements) {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("if (!e.getTagName().isEmpty()) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("jse.executeScript(\"window.scrollTo(\"+ e.getLocation().x + \", \" + (e.getLocation().y - e.getRect().height * 3) + \")\");");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("element = e;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append("assertTrue(element != null);");
    return _builder;
  }
  
  public CharSequence compile(final SELECT s) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("new Select(web.findElement(");
    CharSequence _compile = this.compile(s.getIdentifier());
    _builder.append(_compile);
    _builder.append(")).selectByValue(\"");
    String _elem = s.getElem();
    _builder.append(_elem);
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compile(final GOTO g) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("driver.get(\"");
    String _value = g.getValue();
    _builder.append(_value);
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compile(final FILL o) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("element = null;");
    _builder.newLine();
    _builder.append("elements = driver.findElements(");
    {
      String _fieldType = o.getFieldType();
      boolean _equals = Objects.equal(_fieldType, "TEXTFIELD");
      if (_equals) {
        CharSequence _compile = this.compile(o.getIdentifier());
        _builder.append(_compile);
      } else {
        _builder.append("\"SEARCHFILED\"");
      }
    }
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    _builder.append("for (WebElement e : elements) {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("if (!e.getTagName().isEmpty()) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("jse.executeScript(\"window.scrollTo(\"+ e.getLocation().x + \", \" + (e.getLocation().y - e.getRect().height * 3) + \")\");");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("element = e;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append("element.click();");
    _builder.newLine();
    _builder.append("element.clear();");
    _builder.newLine();
    _builder.append("element.sendKeys(");
    {
      String _value = o.getValue();
      boolean _notEquals = (!Objects.equal(_value, null));
      if (_notEquals) {
        _builder.append("\"");
        String _value_1 = o.getValue();
        _builder.append(_value_1);
        _builder.append("\"");
      } else {
        String _var = o.getVar();
        boolean _notEquals_1 = (!Objects.equal(_var, null));
        if (_notEquals_1) {
          String _var_1 = o.getVar();
          _builder.append(_var_1);
        }
      }
    }
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compile(final PLAY o) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("this.");
    String _preocedure = o.getPreocedure();
    _builder.append(_preocedure);
    _builder.append("(");
    {
      EList<String> _params = o.getParams();
      for(final String param : _params) {
        _builder.append("\"");
        _builder.append(param);
        _builder.append("\",");
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compile(final SAVEVAR s) {
    StringConcatenation _builder = new StringConcatenation();
    String _var = s.getVar();
    _builder.append(_var);
    return _builder;
  }
  
  public CharSequence compile(final ELEMENTIDENTIFIER e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("By.");
    {
      String _type = e.getType();
      boolean _equals = Objects.equal(_type, "LABEL");
      if (_equals) {
        _builder.append("xpath(\"//*[contains(text(), \'");
        {
          String _info = e.getInfo();
          boolean _equals_1 = Objects.equal(_info, "given");
          if (_equals_1) {
            _builder.append("\"+");
            String _var = e.getVar();
            _builder.append(_var);
            _builder.append("+\"");
          } else {
            String _value = e.getValue();
            _builder.append(_value);
          }
        }
        _builder.append("\')]\")");
      } else {
        String _type_1 = e.getType();
        boolean _equals_2 = Objects.equal(_type_1, "CLASS");
        if (_equals_2) {
          _builder.append("className(");
          {
            String _info_1 = e.getInfo();
            boolean _equals_3 = Objects.equal(_info_1, "given");
            if (_equals_3) {
              String _var_1 = e.getVar();
              _builder.append(_var_1);
            } else {
              _builder.append("\"");
              String _value_1 = e.getValue();
              _builder.append(_value_1);
              _builder.append("\"");
            }
          }
          _builder.append(")");
        } else {
          String _type_2 = e.getType();
          boolean _equals_4 = Objects.equal(_type_2, "ID");
          if (_equals_4) {
            _builder.append("id(");
            {
              String _info_2 = e.getInfo();
              boolean _equals_5 = Objects.equal(_info_2, "given");
              if (_equals_5) {
                String _var_2 = e.getVar();
                _builder.append(_var_2);
              } else {
                _builder.append("\"");
                String _value_2 = e.getValue();
                _builder.append(_value_2);
                _builder.append("\"");
              }
            }
            _builder.append(")");
          } else {
            String _type_3 = e.getType();
            boolean _equals_6 = Objects.equal(_type_3, "ALT");
            if (_equals_6) {
              _builder.append("xpath(\"//img[contains(@alt, \'");
              {
                String _info_3 = e.getInfo();
                boolean _equals_7 = Objects.equal(_info_3, "given");
                if (_equals_7) {
                  _builder.append("\"+");
                  String _var_3 = e.getVar();
                  _builder.append(_var_3);
                  _builder.append("+\"");
                } else {
                  String _value_3 = e.getValue();
                  _builder.append(_value_3);
                }
              }
              _builder.append("\')]\")");
            }
          }
        }
      }
    }
    return _builder;
  }
}
