#!/usr/bin/env bash

cd ..
spring init \
--boot-version=2.4.1 \
--build=gradle \
--java-version=1.8 \
--packaging=jar \
--name=common \
--package-name=com.marvin.core.account.common \
--groupId=com.marvin.core.account.common \
--version=1.0.0-SNAPSHOT \
common

spring init \
--boot-version=2.4.1 \
--build=gradle \
--java-version=1.8 \
--packaging=jar \
--name=configuration \
--package-name=com.marvin.core.account.configuration \
--groupId=com.marvin.core.account.configuration \
--version=1.0.0-SNAPSHOT \
configuration

mkdir adapters
cd adapters

spring init \
--boot-version=2.4.1 \
--build=gradle \
--java-version=1.8 \
--packaging=jar \
--name=open-api \
--package-name=com.marvin.core.account.open-api \
--groupId=com.marvin.core.account.open-api \
--dependencies=actuator,webflux \
--version=1.0.0-SNAPSHOT \
open-api

spring init \
--boot-version=2.4.1 \
--build=gradle \
--java-version=1.8 \
--packaging=jar \
--name=persistence \
--package-name=com.marvin.core.account.persistence \
--groupId=com.marvin.core.account.persistence \
--dependencies=actuator,webflux \
--version=1.0.0-SNAPSHOT \
persistence

cd ..

spring init \
--boot-version=2.4.1 \
--build=gradle \
--java-version=1.8 \
--packaging=jar \
--name=application \
--package-name=com.marvin.core.account.application \
--groupId=com.marvin.core.account.application \
--dependencies=actuator,webflux \
--version=1.0.0-SNAPSHOT \
application

spring init \
--boot-version=2.4.1 \
--build=gradle \
--java-version=1.8 \
--packaging=jar \
--name=mock-test \
--package-name=com.marvin.core.account.mock-test \
--groupId=com.marvin.core.account.mock-test \
--dependencies=actuator,webflux \
--version=1.0.0-SNAPSHOT \
mock-test





