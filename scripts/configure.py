# This script generates and updates project configuration files.

# Run this script with rvscaffold in PYTHONPATH
import rvscaffold as scaffold

class Project(scaffold.Java):
    def script_path_text(self): return __file__
    def repository_name(self): return 'stagean'
    def pretty_name(self): return 'Stagean'
    def pom_description(self): return 'Annotation types documenting current development stage on class or method level.'
    def inception_year(self): return 2020
    def test_coverage(self): return False
    def project_status(self): return self.stable_status()
    
    def dependencies(self):
        yield from super().dependencies()
        yield self.use_junit()

Project().generate()
