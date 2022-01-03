# This script generates and updates project configuration files.

# We are assuming that project-config is available in sibling directory.
# Checkout from https://github.com/robertvazan/project-config
import os.path
import sys
sys.path.append(os.path.normpath(os.path.join(__file__, '../../../project-config/src')))

from java import *

project_script_path = __file__
repository_name = lambda: 'stagean'
pretty_name = lambda: 'Stagean'
pom_description = lambda: 'Annotation types documenting current development stage on class or method level.'
inception_year = lambda: 2020
jdk_version = lambda: 11
test_coverage = lambda: False

def dependencies():
    use_junit()

generate(globals())
