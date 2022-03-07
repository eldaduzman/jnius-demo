import os
from pathlib import Path
import jnius_config

file_path = os.path.join(
    Path(__file__).parent.absolute().parent.absolute(), "some-java-app", "target", "*"
)
jnius_config.set_classpath(".", file_path)
print(file_path)


from jnius import autoclass

if __name__ == "__main__":

    List = autoclass("java.util.List")

    calculator_class = autoclass("com.eldad.jnius.example.Calculator")
    calculator_object = calculator_class(1, 2)
    my_java_list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    print(f"Mean of list is: {calculator_object.calculateFactoredMean(my_java_list)}")
    print(f"Mean of list is: {calculator_object.calculateFactoredMean(my_java_list)}")
    print(f"Mean of list is: {calculator_object.calculateFactoredMean(my_java_list)}")
