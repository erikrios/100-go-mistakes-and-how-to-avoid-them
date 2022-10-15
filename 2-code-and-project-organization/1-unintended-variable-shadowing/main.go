package main

import (
	"net/http"
)

func main() {
}

func runServer(logging bool) error {
	var server *http.Server
	var err error

	if logging {
		server, err = createServerWithLogging()
	} else {
		server, err = createDefaultServer()
	}

	if err != nil {
		return err
	}

	// Use server
	server.ListenAndServe()
	return nil
}

func createServerWithLogging() (*http.Server, error) {
	return nil, nil
}

func createDefaultServer() (*http.Server, error) {
	return nil, nil
}
