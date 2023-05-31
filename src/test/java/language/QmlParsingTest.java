package language;

import com.intellij.testFramework.ParsingTestCase;
import com.qmlplugin.language.QmlParserDefinition;

public class QmlParsingTest extends ParsingTestCase {

    public QmlParsingTest() {
        super("", "qml", new QmlParserDefinition());
    }

    public void testParsingTestData() {
        doTest(true);
    }

    @Override
    protected String getTestDataPath() {
        return "src/test/testData";
    }

    @Override
    protected boolean skipSpaces() {
        return false;
    }

    @Override
    protected boolean includeRanges() {
        return false;
    }

}
