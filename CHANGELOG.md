# Changelog
All notable changes to the spring data couchbase project will be documented in this file, in a per release basis.

## [unreleased]

-------------------------------------------------------------------------------------


## [project_r1_v7] - 2018-03-27

## Modified
- upgrade spring boot from 2.1.2.RELEASE to 2.1.3.RELEASE

-------------------------------------------------------------------------------------


## [project_r1_v6] - 2018-02-02

## Modified
- upgrade spring boot from 2.1.0.RELEASE to 2.1.2.RELEASE
- remove @ResponseBody annotation because the @RestController already includes that

-------------------------------------------------------------------------------------


## [project_r1_v5] - 2018-11-19

## Modified
- branch multiple buckets integrated in main repo
- upgrade spring boot from 2.0.6.RELEASE to 2.1.0.RELEASE https://github.com/spring-projects/spring-boot/wiki/Spring-Boot-2.1.0-M1-Release-Notes

-------------------------------------------------------------------------------------


## [project_r1_v4] - 2018-07-07

## Added
- configuration to support multiple buckets with examples: controller, service, repo, counter, configuration

-------------------------------------------------------------------------------------


## [project_r1_v3] - 2018-06-29

## Added
- secondary indexes: idx_user_find_by_nickname, idx_user_find_by_name
- examples of key generation: UserDoc -> uses a Couchbase atomic counter. CarDoc -> uses doc attributes. ProductDoc -> uses random uuid.

## Modified
- upgrade spring boot to 2.0.3

-------------------------------------------------------------------------------------


## [project_r1_v2] - 2018-05-01
**Tag**: project_r1_v2

### Added
- add google formatter

## Modified
- upgrade spring boot to 2.0.1

-------------------------------------------------------------------------------------

## [project_r1_v1] - 2018-03-30
**Tag**: project_r1_v1

### Added
- upgrade to spring boot 2
- add changelog file

### Fixed
- spring boot servlet initializer package
- MockitoJUnitRunner package
- junit tests
- findOne crud repository (the api changed)
- exists crud repository (the api changed)
- delete crud repository (the api changed)
