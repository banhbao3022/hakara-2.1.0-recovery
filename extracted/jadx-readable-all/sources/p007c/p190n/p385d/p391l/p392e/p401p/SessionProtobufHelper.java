package p007c.p190n.p385d.p391l.p392e.p401p;

import android.app.ActivityManager;
import java.util.List;
import java.util.Map;
import p007c.p190n.p385d.p391l.p392e.p409t.TrimmedThrowableData;

/* JADX INFO: renamed from: c.n.d.l.e.p.d, reason: use source file name */
/* JADX INFO: compiled from: SessionProtobufHelper.java */
/* JADX INFO: loaded from: classes.dex */
public class SessionProtobufHelper {

    /* JADX INFO: renamed from: a */
    public static final ByteString f26920a = ByteString.m11984a("0");

    /* JADX INFO: renamed from: b */
    public static final ByteString f26921b = ByteString.m11984a("Unity");

    /* JADX INFO: renamed from: a */
    public static int m12004a(ByteString byteString, ByteString byteString2) {
        int iM11987c = CodedOutputStream.m11987c(3, byteString) + CodedOutputStream.m11992j(2, 0L) + CodedOutputStream.m11992j(1, 0L) + 0;
        return byteString2 != null ? iM11987c + CodedOutputStream.m11987c(4, byteString2) : iM11987c;
    }

    /* JADX INFO: renamed from: b */
    public static int m12005b(String str, String str2) {
        int iM11987c = CodedOutputStream.m11987c(1, ByteString.m11984a(str));
        if (str2 == null) {
            str2 = "";
        }
        return CodedOutputStream.m11987c(2, ByteString.m11984a(str2)) + iM11987c;
    }

    /* JADX INFO: renamed from: c */
    public static int m12006c(TrimmedThrowableData trimmedThrowableData, int i, int i2) {
        int i3 = 0;
        int iM11987c = CodedOutputStream.m11987c(1, ByteString.m11984a(trimmedThrowableData.f27008b)) + 0;
        String str = trimmedThrowableData.f27007a;
        if (str != null) {
            iM11987c += CodedOutputStream.m11987c(3, ByteString.m11984a(str));
        }
        for (StackTraceElement stackTraceElement : trimmedThrowableData.f27009c) {
            int iM12011h = m12011h(stackTraceElement, true);
            iM11987c += CodedOutputStream.m11989f(iM12011h) + CodedOutputStream.m11990h(4) + iM12011h;
        }
        TrimmedThrowableData trimmedThrowableData2 = trimmedThrowableData.f27010d;
        if (trimmedThrowableData2 == null) {
            return iM11987c;
        }
        if (i < i2) {
            int iM12006c = m12006c(trimmedThrowableData2, i + 1, i2);
            return iM11987c + CodedOutputStream.m11989f(iM12006c) + CodedOutputStream.m11990h(6) + iM12006c;
        }
        while (trimmedThrowableData2 != null) {
            trimmedThrowableData2 = trimmedThrowableData2.f27010d;
            i3++;
        }
        return iM11987c + CodedOutputStream.m11991i(7, i3);
    }

    /* JADX INFO: renamed from: d */
    public static int m12007d() {
        ByteString byteString = f26920a;
        return CodedOutputStream.m11992j(3, 0L) + CodedOutputStream.m11987c(2, byteString) + CodedOutputStream.m11987c(1, byteString) + 0;
    }

    /* JADX INFO: renamed from: e */
    public static int m12008e(TrimmedThrowableData trimmedThrowableData, Thread thread, StackTraceElement[] stackTraceElementArr, Thread[] threadArr, List<StackTraceElement[]> list, int i, ByteString byteString, ByteString byteString2) {
        int iM11990h = CodedOutputStream.m11990h(1);
        int iM12012i = m12012i(thread, stackTraceElementArr, 4, true);
        int iM11989f = CodedOutputStream.m11989f(iM12012i) + iM11990h + iM12012i + 0;
        int length = threadArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            int iM12012i2 = m12012i(threadArr[i2], list.get(i2), 0, false);
            iM11989f += CodedOutputStream.m11989f(iM12012i2) + iM11990h + iM12012i2;
        }
        int iM12006c = m12006c(trimmedThrowableData, 1, i);
        int iM11989f2 = CodedOutputStream.m11989f(iM12006c) + CodedOutputStream.m11990h(2) + iM12006c + iM11989f;
        int iM12007d = m12007d();
        int iM11989f3 = CodedOutputStream.m11989f(iM12007d) + CodedOutputStream.m11990h(3) + iM12007d + iM11989f2;
        int iM12004a = m12004a(byteString, byteString2);
        return CodedOutputStream.m11989f(iM12004a) + CodedOutputStream.m11990h(3) + iM12004a + iM11989f3;
    }

    /* JADX INFO: renamed from: f */
    public static int m12009f(TrimmedThrowableData trimmedThrowableData, Thread thread, StackTraceElement[] stackTraceElementArr, Thread[] threadArr, List<StackTraceElement[]> list, int i, ByteString byteString, ByteString byteString2, Map<String, String> map, ActivityManager.RunningAppProcessInfo runningAppProcessInfo, int i2) {
        int iM12008e = m12008e(trimmedThrowableData, thread, stackTraceElementArr, threadArr, list, i, byteString, byteString2);
        int iM11989f = CodedOutputStream.m11989f(iM12008e) + CodedOutputStream.m11990h(1) + iM12008e + 0;
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                int iM12005b = m12005b(entry.getKey(), entry.getValue());
                iM11989f += CodedOutputStream.m11989f(iM12005b) + CodedOutputStream.m11990h(2) + iM12005b;
            }
        }
        if (runningAppProcessInfo != null) {
            iM11989f += CodedOutputStream.m11986a(3, runningAppProcessInfo.importance != 100);
        }
        return CodedOutputStream.m11991i(4, i2) + iM11989f;
    }

    /* JADX INFO: renamed from: g */
    public static int m12010g(Float f, int i, boolean z, int i2, long j2, long j3) {
        int iM11990h = 0;
        if (f != null) {
            f.floatValue();
            iM11990h = 0 + CodedOutputStream.m11990h(1) + 4;
        }
        return CodedOutputStream.m11992j(6, j3) + CodedOutputStream.m11992j(5, j2) + CodedOutputStream.m11991i(4, i2) + CodedOutputStream.m11986a(3, z) + iM11990h + CodedOutputStream.m11989f((i >> 31) ^ (i << 1)) + CodedOutputStream.m11990h(2);
    }

    /* JADX INFO: renamed from: h */
    public static int m12011h(StackTraceElement stackTraceElement, boolean z) {
        int iM11987c = CodedOutputStream.m11987c(2, ByteString.m11984a(stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName())) + (stackTraceElement.isNativeMethod() ? CodedOutputStream.m11992j(1, Math.max(stackTraceElement.getLineNumber(), 0)) : CodedOutputStream.m11992j(1, 0L)) + 0;
        if (stackTraceElement.getFileName() != null) {
            iM11987c += CodedOutputStream.m11987c(3, ByteString.m11984a(stackTraceElement.getFileName()));
        }
        if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
            iM11987c += CodedOutputStream.m11992j(4, stackTraceElement.getLineNumber());
        }
        return CodedOutputStream.m11991i(5, z ? 2 : 0) + iM11987c;
    }

    /* JADX INFO: renamed from: i */
    public static int m12012i(Thread thread, StackTraceElement[] stackTraceElementArr, int i, boolean z) {
        int iM11991i = CodedOutputStream.m11991i(2, i) + CodedOutputStream.m11987c(1, ByteString.m11984a(thread.getName()));
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            int iM12011h = m12011h(stackTraceElement, z);
            iM11991i += CodedOutputStream.m11989f(iM12011h) + CodedOutputStream.m11990h(3) + iM12011h;
        }
        return iM11991i;
    }

    /* JADX INFO: renamed from: j */
    public static ByteString m12013j(String str) {
        if (str == null) {
            return null;
        }
        return ByteString.m11984a(str);
    }

    /* JADX INFO: renamed from: k */
    public static void m12014k(CodedOutputStream codedOutputStream, int i, StackTraceElement stackTraceElement, boolean z) throws Exception {
        codedOutputStream.m11999r((i << 3) | 2);
        codedOutputStream.m11999r(m12011h(stackTraceElement, z));
        if (stackTraceElement.isNativeMethod()) {
            codedOutputStream.m12003w(1, Math.max(stackTraceElement.getLineNumber(), 0));
        } else {
            codedOutputStream.m12003w(1, 0L);
        }
        codedOutputStream.m11996n(2, ByteString.m11984a(stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName()));
        if (stackTraceElement.getFileName() != null) {
            codedOutputStream.m11996n(3, ByteString.m11984a(stackTraceElement.getFileName()));
        }
        if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
            codedOutputStream.m12003w(4, stackTraceElement.getLineNumber());
        }
        codedOutputStream.m12002v(5, z ? 4 : 0);
    }

    /* JADX INFO: renamed from: l */
    public static void m12015l(CodedOutputStream codedOutputStream, TrimmedThrowableData trimmedThrowableData, int i, int i2, int i3) throws Exception {
        codedOutputStream.m11999r((i3 << 3) | 2);
        codedOutputStream.m11999r(m12006c(trimmedThrowableData, 1, i2));
        codedOutputStream.m11996n(1, ByteString.m11984a(trimmedThrowableData.f27008b));
        String str = trimmedThrowableData.f27007a;
        if (str != null) {
            codedOutputStream.m11996n(3, ByteString.m11984a(str));
        }
        int i4 = 0;
        for (StackTraceElement stackTraceElement : trimmedThrowableData.f27009c) {
            m12014k(codedOutputStream, 4, stackTraceElement, true);
        }
        TrimmedThrowableData trimmedThrowableData2 = trimmedThrowableData.f27010d;
        if (trimmedThrowableData2 != null) {
            if (i < i2) {
                m12015l(codedOutputStream, trimmedThrowableData2, i + 1, i2, 6);
                return;
            }
            while (trimmedThrowableData2 != null) {
                trimmedThrowableData2 = trimmedThrowableData2.f27010d;
                i4++;
            }
            codedOutputStream.m12002v(7, i4);
        }
    }

    /* JADX INFO: renamed from: m */
    public static void m12016m(CodedOutputStream codedOutputStream, Thread thread, StackTraceElement[] stackTraceElementArr, int i, boolean z) throws Exception {
        codedOutputStream.m12001u(1, 2);
        codedOutputStream.m11999r(m12012i(thread, stackTraceElementArr, i, z));
        codedOutputStream.m11996n(1, ByteString.m11984a(thread.getName()));
        codedOutputStream.m12002v(2, i);
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            m12014k(codedOutputStream, 3, stackTraceElement, z);
        }
    }
}
