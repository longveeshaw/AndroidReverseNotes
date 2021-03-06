package com.google.android.gms.internal.wearable;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.IOException;

public final class zzs extends IOException {
    public zzs(String str) {
        super(str);
    }

    static zzs zzu() {
        AppMethodBeat.i(70776);
        zzs zzs = new zzs("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
        AppMethodBeat.o(70776);
        return zzs;
    }

    static zzs zzv() {
        AppMethodBeat.i(70777);
        zzs zzs = new zzs("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        AppMethodBeat.o(70777);
        return zzs;
    }

    static zzs zzw() {
        AppMethodBeat.i(70778);
        zzs zzs = new zzs("CodedInputStream encountered a malformed varint.");
        AppMethodBeat.o(70778);
        return zzs;
    }
}
