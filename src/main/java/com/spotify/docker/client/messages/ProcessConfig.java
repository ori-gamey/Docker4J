/*
 * Copyright (c) 2014 Spotify AB.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package com.spotify.docker.client.messages;

import com.google.common.base.MoreObjects;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Objects;

/**
 * An object that represents the JSON returned by the Docker API for an exec command's process
 * configuration.
 */
public class ProcessConfig {

  @JsonProperty("privileged") private Boolean privileged;
  @JsonProperty("user") private String user;
  @JsonProperty("tty") private Boolean tty;
  @JsonProperty("entrypoint") private String entrypoint;
  @JsonProperty("arguments") private List<String> arguments;

  public Boolean privileged() {
    return privileged;
  }

  public String user() {
    return user;
  }

  public Boolean tty() {
    return tty;
  }

  public String entrypoint() {
    return entrypoint;
  }

  public List<String> arguments() {
    return arguments;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    ProcessConfig that = (ProcessConfig) o;

    if (privileged != null ? !privileged.equals(that.privileged) : that.privileged != null) {
      return false;
    }
    if (user != null ? !user.equals(that.user) : that.user != null) {
      return false;
    }
    if (tty != null ? !tty.equals(that.tty) : that.tty != null) {
      return false;
    }
    if (entrypoint != null ? !entrypoint.equals(that.entrypoint) : that.entrypoint != null) {
      return false;
    }
    return arguments != null ? arguments.equals(that.arguments) : that.arguments == null;

  }

  @Override
  public int hashCode() {
    return Objects.hash(privileged, user, tty, entrypoint, arguments);
  }

  @Override
  public String toString() {
    return MoreObjects.toStringHelper(this)
        .add("privileged", privileged)
        .add("user", user)
        .add("tty", tty)
        .add("entrypoint", entrypoint)
        .add("arguments", arguments)
        .toString();
  }
}
