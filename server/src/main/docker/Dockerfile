# Dockerfile for applet-server
# Build with:
# docker build -t applet-server .
# Run with:
# docker run -p 5543:5543 -d -v /tmp/logs:/opt/logs --name applet-server applet-server
#
# docker run -p 5543:5543 -d -v /tmp/logs/applet-server:/applet-server/logs --name applet-server docker.apiacmed.com/library/applet-server:2.2.0.BUILD-SNAPSHOT
#
#

FROM docker.apiacmed.com/env/openjdk-acmed:8-jre-alpine
MAINTAINER Elve.Xu <iskp.me@gmail.com>

ENV VERSION 2.2.0.BUILD-SNAPSHOT

RUN echo "http://mirrors.aliyun.com/alpine/v3.6/main" > /etc/apk/repositories \
    && echo "http://mirrors.aliyun.com/alpine/v3.6/community" >> /etc/apk/repositories \
    && apk update upgrade \
    && apk add --no-cache procps unzip curl bash tzdata \
    && ln -sf /usr/share/zoneinfo/Asia/Shanghai /etc/localtime \
    && echo "Asia/Shanghai" > /etc/timezone

ADD applet-server-${VERSION}.zip /applet-server/applet-server-${VERSION}.zip

RUN unzip /applet-server/applet-server-${VERSION}.zip -d /applet-server \
    && rm -rf /applet-server/applet-server-${VERSION}.zip \
    && sed -i '$d' /applet-server/bin/startup.sh \
    && echo "tail -f /dev/null" >> /applet-server/bin/startup.sh

EXPOSE 5543

CMD ["/applet-server/bin/startup.sh"]
