#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end
#parse("File Header.java")
public class ${NAME}{
    private static ${NAME} theInstance = new ${NAME}();

    public static ${NAME} getInstance() {
        return theInstance;
    }

    private ${NAME}() {
    }
}
