package com.tencent.p177mm.plugin.game.p731d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.p177mm.p205bt.C1331a;
import com.tencent.p177mm.protocal.protobuf.BaseResponse;
import com.tencent.p177mm.protocal.protobuf.btd;
import java.util.LinkedList;
import p690e.p691a.p692a.C6087a;
import p690e.p691a.p692a.C6092b;
import p690e.p691a.p692a.p693a.C6086a;
import p690e.p691a.p692a.p698c.C6093a;

/* renamed from: com.tencent.mm.plugin.game.d.bk */
public final class C39189bk extends btd {
    public C39187at nci;
    public C34264aj ncj;
    public C28197h nck;
    public C12116cc ncl;
    public C43167ci ncm;

    /* renamed from: op */
    public final int mo4669op(int i, Object... objArr) {
        AppMethodBeat.m2504i(111611);
        C6092b c6092b;
        int ix;
        if (i == 0) {
            C6093a c6093a = (C6093a) objArr[0];
            if (this.BaseResponse == null) {
                c6092b = new C6092b("Not all required fields were included: BaseResponse");
                AppMethodBeat.m2505o(111611);
                throw c6092b;
            }
            if (this.BaseResponse != null) {
                c6093a.mo13479iy(1, this.BaseResponse.computeSize());
                this.BaseResponse.writeFields(c6093a);
            }
            if (this.ncj != null) {
                c6093a.mo13479iy(2, this.ncj.computeSize());
                this.ncj.writeFields(c6093a);
            }
            if (this.nci != null) {
                c6093a.mo13479iy(3, this.nci.computeSize());
                this.nci.writeFields(c6093a);
            }
            if (this.nck != null) {
                c6093a.mo13479iy(4, this.nck.computeSize());
                this.nck.writeFields(c6093a);
            }
            if (this.ncl != null) {
                c6093a.mo13479iy(5, this.ncl.computeSize());
                this.ncl.writeFields(c6093a);
            }
            if (this.ncm != null) {
                c6093a.mo13479iy(6, this.ncm.computeSize());
                this.ncm.writeFields(c6093a);
            }
            AppMethodBeat.m2505o(111611);
            return 0;
        } else if (i == 1) {
            if (this.BaseResponse != null) {
                ix = C6087a.m9557ix(1, this.BaseResponse.computeSize()) + 0;
            } else {
                ix = 0;
            }
            if (this.ncj != null) {
                ix += C6087a.m9557ix(2, this.ncj.computeSize());
            }
            if (this.nci != null) {
                ix += C6087a.m9557ix(3, this.nci.computeSize());
            }
            if (this.nck != null) {
                ix += C6087a.m9557ix(4, this.nck.computeSize());
            }
            if (this.ncl != null) {
                ix += C6087a.m9557ix(5, this.ncl.computeSize());
            }
            if (this.ncm != null) {
                ix += C6087a.m9557ix(6, this.ncm.computeSize());
            }
            AppMethodBeat.m2505o(111611);
            return ix;
        } else if (i == 2) {
            C6086a c6086a = new C6086a((byte[]) objArr[0], unknownTagHandler);
            for (ix = C1331a.getNextFieldNumber(c6086a); ix > 0; ix = C1331a.getNextFieldNumber(c6086a)) {
                if (!super.populateBuilderWithField(c6086a, this, ix)) {
                    c6086a.ems();
                }
            }
            if (this.BaseResponse == null) {
                c6092b = new C6092b("Not all required fields were included: BaseResponse");
                AppMethodBeat.m2505o(111611);
                throw c6092b;
            }
            AppMethodBeat.m2505o(111611);
            return 0;
        } else if (i == 3) {
            C6086a c6086a2 = (C6086a) objArr[0];
            C39189bk c39189bk = (C39189bk) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            LinkedList Vh;
            int size;
            byte[] bArr;
            C6086a c6086a3;
            boolean z;
            switch (intValue) {
                case 1:
                    Vh = c6086a2.mo13445Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        BaseResponse baseResponse = new BaseResponse();
                        c6086a3 = new C6086a(bArr, unknownTagHandler);
                        for (z = true; z; z = baseResponse.populateBuilderWithField(c6086a3, baseResponse, C1331a.getNextFieldNumber(c6086a3))) {
                        }
                        c39189bk.BaseResponse = baseResponse;
                    }
                    AppMethodBeat.m2505o(111611);
                    return 0;
                case 2:
                    Vh = c6086a2.mo13445Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        C34264aj c34264aj = new C34264aj();
                        c6086a3 = new C6086a(bArr, unknownTagHandler);
                        for (z = true; z; z = c34264aj.populateBuilderWithField(c6086a3, c34264aj, C1331a.getNextFieldNumber(c6086a3))) {
                        }
                        c39189bk.ncj = c34264aj;
                    }
                    AppMethodBeat.m2505o(111611);
                    return 0;
                case 3:
                    Vh = c6086a2.mo13445Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        C39187at c39187at = new C39187at();
                        c6086a3 = new C6086a(bArr, unknownTagHandler);
                        for (z = true; z; z = c39187at.populateBuilderWithField(c6086a3, c39187at, C1331a.getNextFieldNumber(c6086a3))) {
                        }
                        c39189bk.nci = c39187at;
                    }
                    AppMethodBeat.m2505o(111611);
                    return 0;
                case 4:
                    Vh = c6086a2.mo13445Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        C28197h c28197h = new C28197h();
                        c6086a3 = new C6086a(bArr, unknownTagHandler);
                        for (z = true; z; z = c28197h.populateBuilderWithField(c6086a3, c28197h, C1331a.getNextFieldNumber(c6086a3))) {
                        }
                        c39189bk.nck = c28197h;
                    }
                    AppMethodBeat.m2505o(111611);
                    return 0;
                case 5:
                    Vh = c6086a2.mo13445Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        C12116cc c12116cc = new C12116cc();
                        c6086a3 = new C6086a(bArr, unknownTagHandler);
                        for (z = true; z; z = c12116cc.populateBuilderWithField(c6086a3, c12116cc, C1331a.getNextFieldNumber(c6086a3))) {
                        }
                        c39189bk.ncl = c12116cc;
                    }
                    AppMethodBeat.m2505o(111611);
                    return 0;
                case 6:
                    Vh = c6086a2.mo13445Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        C43167ci c43167ci = new C43167ci();
                        c6086a3 = new C6086a(bArr, unknownTagHandler);
                        for (z = true; z; z = c43167ci.populateBuilderWithField(c6086a3, c43167ci, C1331a.getNextFieldNumber(c6086a3))) {
                        }
                        c39189bk.ncm = c43167ci;
                    }
                    AppMethodBeat.m2505o(111611);
                    return 0;
                default:
                    AppMethodBeat.m2505o(111611);
                    return -1;
            }
        } else {
            AppMethodBeat.m2505o(111611);
            return -1;
        }
    }
}
