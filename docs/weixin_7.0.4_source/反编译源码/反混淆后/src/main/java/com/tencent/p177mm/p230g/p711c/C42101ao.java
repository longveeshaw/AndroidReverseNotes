package com.tencent.p177mm.p230g.p711c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.p177mm.sdk.p603e.C4925c;

/* renamed from: com.tencent.mm.g.c.ao */
public abstract class C42101ao extends C4925c {
    public static final String[] diI = new String[0];
    private static final int diR = "rowid".hashCode();
    private static final int dkV = "appId".hashCode();
    private static final int dlS = "version".hashCode();
    private static final int dth = "hit".hashCode();
    private static final int dti = "hitTimeMS".hashCode();
    private boolean dkE = true;
    private boolean dlM = true;
    private boolean dtf = true;
    private boolean dtg = true;
    public String field_appId;
    public int field_hit;
    public long field_hitTimeMS;
    public int field_version;

    /* renamed from: d */
    public final void mo8995d(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (dkV == hashCode) {
                    this.field_appId = cursor.getString(i);
                } else if (dlS == hashCode) {
                    this.field_version = cursor.getInt(i);
                } else if (dth == hashCode) {
                    this.field_hit = cursor.getInt(i);
                } else if (dti == hashCode) {
                    this.field_hitTimeMS = cursor.getLong(i);
                } else if (diR == hashCode) {
                    this.xDa = cursor.getLong(i);
                }
            }
        }
    }

    /* renamed from: Hl */
    public final ContentValues mo10098Hl() {
        ContentValues contentValues = new ContentValues();
        if (this.dkE) {
            contentValues.put("appId", this.field_appId);
        }
        if (this.dlM) {
            contentValues.put("version", Integer.valueOf(this.field_version));
        }
        if (this.dtf) {
            contentValues.put("hit", Integer.valueOf(this.field_hit));
        }
        if (this.dtg) {
            contentValues.put("hitTimeMS", Long.valueOf(this.field_hitTimeMS));
        }
        if (this.xDa > 0) {
            contentValues.put("rowid", Long.valueOf(this.xDa));
        }
        return contentValues;
    }
}
