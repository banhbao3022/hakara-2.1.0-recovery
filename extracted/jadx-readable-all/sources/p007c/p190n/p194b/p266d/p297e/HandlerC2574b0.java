package p007c.p190n.p194b.p266d.p297e;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.util.Log;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p007c.p190n.p194b.p266d.p314j.p321g.HandlerC4061a;
import p007c.p190n.p194b.p266d.p333n.C4782j;
import p636z0.p691g.SimpleArrayMap;

/* JADX INFO: renamed from: c.n.b.d.e.b0 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cloud-messaging@@16.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class HandlerC2574b0 extends HandlerC4061a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C2575c f11498a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC2574b0(C2575c c2575c, Looper looper) {
        super(looper);
        this.f11498a = c2575c;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C2575c c2575c = this.f11498a;
        int i = C2575c.f11499a;
        Objects.requireNonNull(c2575c);
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(new C2577d.a());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof C2577d) {
                        c2575c.f11508j = (C2577d) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        c2575c.f11507i = (Messenger) parcelableExtra;
                    }
                }
                Intent intent2 = (Intent) message.obj;
                String action = intent2.getAction();
                if (!"com.google.android.c2dm.intent.REGISTRATION".equals(action)) {
                    if (Log.isLoggable("Rpc", 3)) {
                        String strValueOf = String.valueOf(action);
                        Log.d("Rpc", strValueOf.length() != 0 ? "Unexpected response action: ".concat(strValueOf) : new String("Unexpected response action: "));
                        return;
                    }
                    return;
                }
                String stringExtra = intent2.getStringExtra("registration_id");
                if (stringExtra == null) {
                    stringExtra = intent2.getStringExtra("unregistered");
                }
                if (stringExtra != null) {
                    Matcher matcher = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)").matcher(stringExtra);
                    if (!matcher.matches()) {
                        if (Log.isLoggable("Rpc", 3)) {
                            Log.d("Rpc", stringExtra.length() != 0 ? "Unexpected response string: ".concat(stringExtra) : new String("Unexpected response string: "));
                            return;
                        }
                        return;
                    }
                    String strGroup = matcher.group(1);
                    String strGroup2 = matcher.group(2);
                    if (strGroup != null) {
                        Bundle extras = intent2.getExtras();
                        extras.putString("registration_id", strGroup2);
                        c2575c.m5177a(strGroup, extras);
                        return;
                    }
                    return;
                }
                String stringExtra2 = intent2.getStringExtra("error");
                if (stringExtra2 == null) {
                    String strValueOf2 = String.valueOf(intent2.getExtras());
                    StringBuilder sb = new StringBuilder(strValueOf2.length() + 49);
                    sb.append("Unexpected response, no error or registration id ");
                    sb.append(strValueOf2);
                    Log.w("Rpc", sb.toString());
                    return;
                }
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", stringExtra2.length() != 0 ? "Received InstanceID error ".concat(stringExtra2) : new String("Received InstanceID error "));
                }
                if (!stringExtra2.startsWith("|")) {
                    synchronized (c2575c.f11502d) {
                        int i2 = 0;
                        while (true) {
                            SimpleArrayMap<String, C4782j<Bundle>> simpleArrayMap = c2575c.f11502d;
                            if (i2 < simpleArrayMap.f36667l) {
                                c2575c.m5177a(simpleArrayMap.m15611h(i2), intent2.getExtras());
                                i2++;
                            }
                        }
                    }
                    return;
                }
                String[] strArrSplit = stringExtra2.split("\\|");
                if (strArrSplit.length <= 2 || !"ID".equals(strArrSplit[1])) {
                    Log.w("Rpc", stringExtra2.length() != 0 ? "Unexpected structured response ".concat(stringExtra2) : new String("Unexpected structured response "));
                    return;
                }
                String str = strArrSplit[2];
                String strSubstring = strArrSplit[3];
                if (strSubstring.startsWith(":")) {
                    strSubstring = strSubstring.substring(1);
                }
                c2575c.m5177a(str, intent2.putExtra("error", strSubstring).getExtras());
                return;
            }
        }
        Log.w("Rpc", "Dropping invalid message");
    }
}
