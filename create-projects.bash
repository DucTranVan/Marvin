#!/usr/bin/env bash

mkdir services
cd services

spring init \
--boot-version=2.4.1 \
--build=gradle \
--java-version=1.8 \
--packaging=jar \
--name=account-service \
--package-name=com.ari.services.core.account \
--groupId=com.ari.services.core.account \
--dependencies=actuator,webflux \
--version=1.0.0-SNAPSHOT \
account-service

spring init \
--boot-version=2.4.1 \
--build=gradle \
--java-version=1.8 \
--packaging=jar \
--name=analytics-service \
--package-name=com.ari.services.core.analytics \
--groupId=com.ari.services.core.analytics \
--dependencies=actuator,webflux \
--version=1.0.0-SNAPSHOT \
analytics-service

spring init \
--boot-version=2.4.1 \
--build=gradle \
--java-version=1.8 \
--packaging=jar \
--name=notification-service \
--package-name=com.ari.services.core.notification \
--groupId=com.ari.services.core.notification \
--dependencies=actuator,webflux \
--version=1.0.0-SNAPSHOT \
notification-service

spring init \
--boot-version=2.1.0.RELEASE \
--build=gradle \
--java-version=1.8 \
--packaging=jar \
--name=base-composite-service \
--package-name=com.ari.services.composite.base \
--groupId=se.magnus.microservices.composite.base \
--dependencies=actuator,webflux \
--version=1.0.0-SNAPSHOT \
base-composite-service

cd ..
