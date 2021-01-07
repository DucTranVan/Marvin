#!/usr/bin/env bash

mkdir shares
cd shares

spring init \
--boot-version=2.4.1 \
--build=gradle \
--java-version=1.8 \
--packaging=jar \
--name=util \
--package-name=com.ari.services.util \
--groupId=com.ari.services.util \
--dependencies=webflux \
--version=1.0.0-SNAPSHOT \
util

spring init \
--boot-version=2.4.1 \
--build=gradle \
--java-version=1.8 \
--packaging=jar \
--name=api \
--package-name=com.ari.services.api \
--groupId=com.ari.services.api \
--dependencies=webflux \
--version=1.0.0-SNAPSHOT \
api

cd ..
