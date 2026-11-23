package p007c.p190n.p194b.p209b.p221s1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p007c.p190n.p194b.p209b.p212b2.Util6;
import p007c.p190n.p194b.p209b.p234u1.Metadata;
import p007c.p190n.p194b.p209b.p234u1.p239m.CommentFrame;
import p007c.p190n.p194b.p209b.p234u1.p239m.InternalFrame;

/* JADX INFO: renamed from: c.n.b.b.s1.r, reason: use source file name */
/* JADX INFO: compiled from: GaplessInfoHolder.java */
/* JADX INFO: loaded from: classes.dex */
public final class GaplessInfoHolder {

    /* JADX INFO: renamed from: a */
    public static final Pattern f8511a = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* JADX INFO: renamed from: b */
    public int f8512b = -1;

    /* JADX INFO: renamed from: c */
    public int f8513c = -1;

    /* JADX INFO: renamed from: a */
    public final boolean m3923a(String str) {
        Matcher matcher = f8511a.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String strGroup = matcher.group(1);
            int i = Util6.f6307a;
            int i2 = Integer.parseInt(strGroup, 16);
            int i3 = Integer.parseInt(matcher.group(2), 16);
            if (i2 <= 0 && i3 <= 0) {
                return false;
            }
            this.f8512b = i2;
            this.f8513c = i3;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public boolean m3924b(Metadata metadata) {
        int i = 0;
        while (true) {
            Metadata.b[] bVarArr = metadata.f8661f;
            if (i >= bVarArr.length) {
                return false;
            }
            Metadata.b bVar = bVarArr[i];
            if (bVar instanceof CommentFrame) {
                CommentFrame commentFrame = (CommentFrame) bVar;
                if ("iTunSMPB".equals(commentFrame.f8728h) && m3923a(commentFrame.f8729i)) {
                    return true;
                }
            } else if (bVar instanceof InternalFrame) {
                InternalFrame internalFrame = (InternalFrame) bVar;
                if ("com.apple.iTunes".equals(internalFrame.f8740g) && "iTunSMPB".equals(internalFrame.f8741h) && m3923a(internalFrame.f8742i)) {
                    return true;
                }
            } else {
                continue;
            }
            i++;
        }
    }
}
