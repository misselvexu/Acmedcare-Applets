# Dockerfile for sms-server
# Build with:
# docker build -t sms-server .
# Run with:
# docker run -p 4433:4433 -d -v /tmp/logs:/opt/logs --name sms-server sms-server
# --add-host redis.acmedcare.com:172.172.1.101
# --add-host jvm.perfino.acmedcare.com:127.0.0.1
#
# docker run -p 4433:4433 --net docker-br0 --ip 172.172.0.222 --add-host redis.acmedcare.com:172.172.1.101 --add-host mysql.acmedcare.com:172.172.1.101 --add-host trace.acmedcare.com:192.168.1.151 --add-host redis.acmedcare.com:172.172.1.101 --env REDIS_HOST=redis.acmedcare.com --env MYSQL_HOST=mysql.acmedcare.com --env MYSQL_USERNAME=root --env MYSQL_PASSWORD=jzyl2019yw -d -v /tmp/logs/sms-server:/sms-server/logs --name sms-server docker.apiacmed.com/library/sms-server:2.1.0.BUILD-SNAPSHOT
#
#

FROM docker.apiacmed.com/env/openjdk-acmed:8-jre-alpine
MAINTAINER Elve.Xu <iskp.me@gmail.com>

ENV VERSION 2.1.0.BUILD-SNAPSHOT

RUN echo "http://mirrors.aliyun.com/alpine/v3.6/main" > /etc/apk/repositories \
    && echo "http://mirrors.aliyun.com/alpine/v3.6/community" >> /etc/apk/repositories \
    && apk update upgrade \
    && apk add --no-cache procps unzip curl bash tzdata \
    && ln -sf /usr/share/zoneinfo/Asia/Shanghai /etc/localtime \
    && echo "Asia/Shanghai" > /etc/timezone

ADD sms-server-${VERSION}.zip /sms-server/sms-server-${VERSION}.zip

RUN unzip /sms-server/sms-server-${VERSION}.zip -d /sms-server \
    && rm -rf /sms-server/sms-server-${VERSION}.zip \
    && sed -i '$d' /sms-server/bin/startup.sh \
    && echo "tail -f /dev/null" >> /sms-server/bin/startup.sh

EXPOSE 4433

CMD ["/sms-server/bin/startup.sh"]
