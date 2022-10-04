function fromJSON(proto, json) {
    return JSON.parse(json,
        (k, v) => {
            if (k === "") {
                let arr = [];
                for (var property in v) {
                    arr.push(v[property]);
                }
                return new proto.constructor(...arr);
            }
            else
                return v;
        });
}
