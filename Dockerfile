ARG KOBWEB_APP_ROOT="site"

FROM openjdk:11-jdk as export

ENV KOBWEB_CLI_VERSION=0.9.12
ARG KOBWEB_APP_ROOT
RUN apt-get update \
    && apt-get install -y curl gnupg unzip wget
    
RUN wget https://github.com/varabyte/kobweb-cli/releases/download/v${KOBWEB_CLI_VERSION}/kobweb-${KOBWEB_CLI_VERSION}.zip \
    && unzip kobweb-${KOBWEB_CLI_VERSION}.zip \
    && rm kobweb-${KOBWEB_CLI_VERSION}.zip

ENV PATH="/kobweb-${KOBWEB_CLI_VERSION}/bin:${PATH}"

WORKDIR /project/${KOBWEB_APP_ROOT}

COPY . /project/

ENTRYPOINT ["/bin/bash", "-c", "kobweb run"]
