# This script generates and updates project configuration files.

# We are assuming that project-config is available in sibling directory.
# Checkout from https://github.com/robertvazan/project-config
import sys
sys.path.append('../../project-config/src')

from java import *

repository_name = lambda: 'stagean'
pretty_name = lambda: 'Stagean'
pom_version = lambda: '1.1.0'
pom_description = lambda: 'Annotation types documenting current development stage on class or method level.'
inception_year = lambda: 2020
jdk_version = lambda: 11
test_coverage = lambda: False

def dependencies():
    use_junit()

generate(globals())
