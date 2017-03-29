FROM jenkins
COPY Plugins /usr/share/jenkins/ref/Plugins
COPY job.groovy /usr/share/jenkins/ref/init.groovy.d/test.groovy
COPY job /tmp/hello.groovy
RUN /usr/local/bin/plugins.sh /usr/share/jenkins/ref/Plugins




