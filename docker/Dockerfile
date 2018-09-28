FROM alpine:edge
MAINTAINER learn.com
RUN apk add --update --no-cache openjdk8 \
    curl \
    git openssh && \
    rm -rf /var/lib/apt/lists/*
COPY files/UnlimitedJCEPolicyJDK8/* /usr/lib/jvm/java-1.8-openjdk/jre/lib/security/


