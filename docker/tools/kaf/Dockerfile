FROM docker.io/library/golang:1.21.4-alpine3.18

RUN go install github.com/birdayz/kaf/cmd/kaf@latest

RUN apk update && apk add busybox-extras && apk add bind-tools && apk add postgresql-client && apk add py3-pip && apk add --no-cache aws-cli
USER root