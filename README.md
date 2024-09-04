# Spring Boot Hello Kubernetes
## Introduction
This example shows orchestrating a simple Spring Boot application in a Kubernetes cluster.
## Source
- https://docs.docker.com/guides/deployment-orchestration/kube-deploy/
## Invoking the URLs
Links that can be opened on application start:
- http://localhost:8080/api/v1/hello-kubernetes
- http://localhost:8080/swagger-ui/index.html#/hello-kubernetes-controller/helloKubernetes
- http://localhost:8080/actuator

When starting from the cluster use the node defined in the spring-boot-hello-kubernetes.yml file which is 30000.
## Creating the docker image
Creating docker image from the compiles jar (spring boot application).
```
docker build --build-arg JAR_FILE=build/libs/*.jar -t com.acme/spring-boot-hello-kubernetes .
```
## Apply and delete the kubernetes with the application 
Starting the cluster
```
kubectl apply -f .\spring-boot-hello-kubernetes.yml
```
Stopping the cluster
```
kubectl delete -f .\spring-boot-hello-kubernetes.yml
```
## Information about docker and kubernetes
With Rancher Desktop this was working correctly. 

"minikube" could not deploy correctly the image in the cluster because it could not (see) connect the local docker image from its virtualization. 





