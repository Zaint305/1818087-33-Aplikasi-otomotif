package com.example.aplikasiotomotif;

public class otomotif {
    private String _id, _nama, _pabrik, _cc, _deskrip;
    public otomotif (String id, String nama, String pabrikan, String cc, String deskrip) {
        this._id = id;
        this._nama = nama;
        this._pabrik = pabrikan;
        this._cc = cc;
        this._deskrip = deskrip;
    }
    public otomotif() {
    }
    public String get_id() {
        return _id;
    }
    public void set_id(String _id) {
        this._id = _id;
    }
    public String get_nama() {
        return _nama;
    }
    public void set_nama(String _nama) {
        this._nama = _nama;
    }
    public String get_pabrik() {
        return _pabrik;
    }
    public void set_pabrik(String _pabrik) {
        this._pabrik = _pabrik;
    }
    public String get_cc() {
        return _cc;
    }
    public void set_cc(String _cc) {
        this._cc = _cc;
    }
    public String get_deskrip() {
        return _deskrip;
    }
    public void set_deskrip(String _deskrip) {
        this._deskrip = _deskrip;
    }
}


