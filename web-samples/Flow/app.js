// @flow

function multiply(arr) {
    return arr.map(e => e * 2);
}

function capitalise(value) {
    return value.charAt(0).toUpperCase() + value.slice(1);
}

multiply([3, 42]);

capitalise("name");