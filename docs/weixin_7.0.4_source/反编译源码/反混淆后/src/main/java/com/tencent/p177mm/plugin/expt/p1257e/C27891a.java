package com.tencent.p177mm.plugin.expt.p1257e;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.p177mm.p230g.p711c.C6567bi;
import com.tencent.p177mm.sdk.p603e.C4925c.C4924a;
import java.lang.reflect.Field;

/* renamed from: com.tencent.mm.plugin.expt.e.a */
public final class C27891a extends C6567bi {
    protected static C4924a ccO;

    /* renamed from: Ag */
    public final C4924a mo4635Ag() {
        return ccO;
    }

    static {
        AppMethodBeat.m2504i(73607);
        C4924a c4924a = new C4924a();
        c4924a.xDb = new Field[2];
        c4924a.columns = new String[3];
        StringBuilder stringBuilder = new StringBuilder();
        c4924a.columns[0] = "exptKey";
        c4924a.xDd.put("exptKey", "TEXT PRIMARY KEY ");
        stringBuilder.append(" exptKey TEXT PRIMARY KEY ");
        stringBuilder.append(", ");
        c4924a.xDc = "exptKey";
        c4924a.columns[1] = "exptId";
        c4924a.xDd.put("exptId", "INTEGER");
        stringBuilder.append(" exptId INTEGER");
        c4924a.columns[2] = "rowid";
        c4924a.sql = stringBuilder.toString();
        ccO = c4924a;
        AppMethodBeat.m2505o(73607);
    }
}
