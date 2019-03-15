# Create config map for application.properties, also can load from .properties file if required
oc create -f sboot-configmap.yaml

# Service account access to user
oc policy add-role-to-user view system:serviceaccount:myproject:default

# build the maven project 

# run docker build, tag to docker username if needed and push 

docker build -t springboot-openshift .


# Create deployment-config, rename the image name in deployment yaml 

oc create -f sboot-configmap-dep.yaml

#Reference - 
https://access.redhat.com/documentation/en-us/red_hat_jboss_fuse/6.3/html/fuse_integration_services_2.0_for_openshift/kube-spring-boot#kube-spring-boot-intro-configmap

https://github.com/spring-cloud/spring-cloud-kubernetes/tree/master/spring-cloud-kubernetes-examples/kubernetes-reload-example