# Quick Docker Tutorial:

  * Terminology:
    * Image: a file that specifies instructions for creating a docker container
    * Container: an (running or not) instance of an image
  * A more detailed overview can be found in the [Docker docs](https://docs.docker.com/engine/docker-overview/)

## Docker Commands:
  * The `docker run` command in the setup step will start the docker image in interactive mode. However one may wish to 1) print information about the docker images and containers once they are setup 2) exit, 3) restart, 4) deattach, 5) reattach to a container

### 1. Print Docker Info
  * `docker images` will list all of the images available
   `docker ps -as` will list all of the containers (both running and not, as we
ll as their size)
   `docker ps` will only list the running containers.
   * all of the above commands will also provide the container and image ids fo
r the docker entities present.

### 2. Exit Container:
  * when in an interactive docker session simply type `exit` to terminate the running process.
  
### 3. Restart Container:
  * `docker start <Container-ID>` will start a stopped container, however `docker start -ai <Container-ID>` can be used to both start and attach at the same time.

### 4. Dettach from Container:
  * One can dettach from a container (this will leave the container running) with the escape sequence `Ctrl-p , Ctrl-q`

### 5. Reattach to Container:
  * Once can attach to a running container with: `docker attach <Container-ID>`

## Cleanup
  * After the session you may choose to remove the docker images and containers that were setup. This can be done with the following:

To remove a container:
```
   docker rm <Container-ID>
```  
To remove an image:
```
   docker rmi <Image-ID>
```