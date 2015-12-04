'use strict';

angular.module('settlerApplication').config(function ($stateProvider) {
    $stateProvider.state("login", {
        parent:  'publicSite',
        url:     "/login",
        views:   {
            'content@': {
                templateUrl: 'scripts/ui/login/login.html',
                controller:  'LoginCtrl'
            }
        },
        resolve: {}
    });
});