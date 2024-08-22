package lt.techin.nz;

import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectPackages("lt.techin.nz")
@IncludeTags("PositiveTest")
public class TestSuite {
}
