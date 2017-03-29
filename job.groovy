import javaposse.jobdsl.dsl.DslScriptLoader
import javaposse.jobdsl.plugin.JenkinsJobManagement
 
def jobDslScript = new File('/tmp/hello.groovy')
def workspace = new File('.')
 
def jobManagement = new JenkinsJobManagement(System.out, [:], workspace)
 
new DslScriptLoader(jobManagement).runScript(jobDslScript.text)
