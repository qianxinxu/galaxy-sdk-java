namespace java com.xiaomi.infra.galaxy.emq.thrift
namespace php EMQ.Range
namespace py emq.range
namespace go emq.range

/**
 * Copyright 2015, Xiaomi.
 * All rights reserved.
 * Author: shenyuannan@xiaomi.com
 */

/* emq Queue config that can be set by user; */

/**
 * message delay seconds in this queue, default 0s (0s ~ 15min)
 */
const i32 GALAXY_EMQ_QUEUE_DELAY_SECONDS_DEFAULT = 0;
const i32 GALAXY_EMQ_QUEUE_DELAY_SECONDS_MINIMAL = 0;
const i32 GALAXY_EMQ_QUEUE_DELAY_SECONDS_MAXIMAL = 900;

/**
 * message invisibility seconds in this queue, default 30s (1s ~ 12hour)
 */
const i32 GALAXY_EMQ_QUEUE_INVISIBILITY_SECONDS_DEFAULT = 30;
const i32 GALAXY_EMQ_QUEUE_INVISIBILITY_SECONDS_MINIMAL = 2;
const i32 GALAXY_EMQ_QUEUE_INVISIBILITY_SECONDS_MAXIMAL = 43200;

/**
 * receive message seconds in this queue, default 0s which means no wait (0s ~ 20s)
 */
const i32 GALAXY_EMQ_QUEUE_RECEIVE_WAIT_SECONDS_DEFAULT = 0;
const i32 GALAXY_EMQ_QUEUE_RECEIVE_WAIT_SECONDS_MINIMAL = 0;
const i32 GALAXY_EMQ_QUEUE_RECEIVE_WAIT_SECONDS_MAXIMAL = 20;

/**
 * maximum receive message number in this queue, default 100(1 ~ 100)
 */
const i32 GALAXY_EMQ_QUEUE_RECEIVE_NUMBER_DEFAULT = 100;
const i32 GALAXY_EMQ_QUEUE_RECEIVE_NUMBER_MINIMAL = 1;
const i32 GALAXY_EMQ_QUEUE_RECEIVE_NUMBER_MAXIMAL = 100;

/**
 * message retention seconds in this queue, default 4days (60s ~ 14days)
 */
const i32 GALAXY_EMQ_QUEUE_RETENTION_SECONDS_DEFAULT = 345600;
const i32 GALAXY_EMQ_QUEUE_RETENTION_SECONDS_MINIMAL = 60;
const i32 GALAXY_EMQ_QUEUE_RETENTION_SECONDS_MAXIMAL = 1209600;

/**
 * max message size in this queue, default 256K (1K ~ 256K)
 */
const i32 GALAXY_EMQ_QUEUE_MAX_MESSAGE_BYTES_DEFAULT = 262144;
const i32 GALAXY_EMQ_QUEUE_MAX_MESSAGE_BYTES_MINIMAL = 1024;
const i32 GALAXY_EMQ_QUEUE_MAX_MESSAGE_BYTES_MAXIMAL = 262144;

const i32 GALAXY_EMQ_QUEUE_PARTITION_NUMBER_DEFAULT = 4;
const i32 GALAXY_EMQ_QUEUE_PARTITION_NUMBER_MINIMAL = 1;
const i32 GALAXY_EMQ_QUEUE_PARTITION_NUMBER_MAXIMAL = 255;

// emq Message config that can be set by user;
/**
 * message delay seconds that overwrite GALAXY_EMQ_QUEUE_DELAY_SECONDS,
 * default 0s (0s ~ 15min)
 */
const i32 GALAXY_EMQ_MESSAGE_DELAY_SECONDS_DEFAULT =
    GALAXY_EMQ_QUEUE_DELAY_SECONDS_DEFAULT;
const i32 GALAXY_EMQ_MESSAGE_DELAY_SECONDS_MINIMAL =
    GALAXY_EMQ_QUEUE_DELAY_SECONDS_MINIMAL;
const i32 GALAXY_EMQ_MESSAGE_DELAY_SECONDS_MAXIMAL =
    GALAXY_EMQ_QUEUE_DELAY_SECONDS_MAXIMAL;

/**
 * message invisibility seconds that overwrite
 * GALAXY_EMQ_QUEUE_INVISIBILITY_SECONDS, default 30s (0s ~ 12hour)
 */
const i32 GALAXY_EMQ_MESSAGE_INVISIBILITY_SECONDS_DEFAULT =
    GALAXY_EMQ_QUEUE_INVISIBILITY_SECONDS_DEFAULT;
const i32 GALAXY_EMQ_MESSAGE_INVISIBILITY_SECONDS_MINIMAL =
    GALAXY_EMQ_QUEUE_INVISIBILITY_SECONDS_MINIMAL;
const i32 GALAXY_EMQ_MESSAGE_INVISIBILITY_SECONDS_MAXIMAL =
    GALAXY_EMQ_QUEUE_INVISIBILITY_SECONDS_MAXIMAL;
