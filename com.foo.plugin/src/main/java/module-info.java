

module com.foo.plugin {
    requires org.slf4j;
    requires org.slf4j.simple;
    opens com.foo.plugin;
    
    requires com.foo.api;

}    
