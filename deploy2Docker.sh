#!/usr/bin/env bash
mvn clean install package
docker-compose -f docker-compose.yml build
docker-compose -f docker-compose.yml up --d