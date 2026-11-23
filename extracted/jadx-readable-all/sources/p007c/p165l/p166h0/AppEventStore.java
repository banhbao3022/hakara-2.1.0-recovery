package p007c.p165l.p166h0;

import android.content.Context;
import android.util.Log;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import java.util.HashSet;
import p007c.p165l.FacebookSdk;
import p007c.p165l.LoggingBehavior;
import p007c.p165l.p178k0.Validate;

/* JADX INFO: renamed from: c.l.h0.l, reason: use source file name */
/* JADX INFO: compiled from: AppEventStore.java */
/* JADX INFO: loaded from: classes.dex */
public class AppEventStore {

    /* JADX INFO: renamed from: a */
    public static final String f4838a = "c.l.h0.l";

    /* JADX INFO: renamed from: c.l.h0.l$a */
    /* JADX INFO: compiled from: AppEventStore.java */
    public static class a extends ObjectInputStream {
        public a(InputStream inputStream) throws IOException {
            super(inputStream);
        }

        @Override // java.io.ObjectInputStream
        public ObjectStreamClass readClassDescriptor() throws ClassNotFoundException, IOException {
            ObjectStreamClass classDescriptor = super.readClassDescriptor();
            if (classDescriptor.getName().equals("com.facebook.appevents.AppEventsLogger$AccessTokenAppIdPair$SerializationProxyV1")) {
                return ObjectStreamClass.lookup(AccessTokenAppIdPair.b.class);
            }
            return classDescriptor.getName().equals("com.facebook.appevents.AppEventsLogger$AppEvent$SerializationProxyV1") ? ObjectStreamClass.lookup(AppEvent.b.class) : classDescriptor;
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0092 A[Catch: all -> 0x0088, TRY_LEAVE, TryCatch #5 {, blocks: (B:4:0x0003, B:8:0x0021, B:9:0x0024, B:47:0x0092, B:12:0x002f, B:22:0x0049, B:23:0x004c, B:26:0x0057, B:27:0x005b, B:31:0x0062, B:32:0x0065, B:36:0x0077, B:35:0x0070, B:39:0x007b, B:40:0x007e, B:45:0x008b), top: B:63:0x0003, inners: #0, #1, #2, #7 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x0062 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r1v3, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.io.ObjectInputStream] */
    /* JADX INFO: renamed from: a */
    public static synchronized PersistedEvents m2358a() {
        PersistedEvents persistedEvents;
        ?? r4;
        Throwable th;
        a aVar;
        String str;
        String str2;
        Object obj;
        Object obj2;
        HashSet<LoggingBehavior> hashSet = FacebookSdk.f5352a;
        Validate.m2479h();
        ?? r1 = FacebookSdk.f5360i;
        persistedEvents = null;
        try {
            try {
                aVar = new a(new BufferedInputStream(r1.openFileInput("AppEventsLogger.persistedevents")));
                try {
                    PersistedEvents persistedEvents2 = (PersistedEvents) aVar.readObject();
                    try {
                        aVar.close();
                    } catch (IOException unused) {
                    }
                    try {
                        File fileStreamPath = r1.getFileStreamPath("AppEventsLogger.persistedevents");
                        fileStreamPath.delete();
                        obj2 = fileStreamPath;
                        obj = aVar;
                    } catch (Exception e) {
                        Log.w(f4838a, "Got unexpected exception when removing events file: ", e);
                        obj2 = e;
                        obj = "Got unexpected exception when removing events file: ";
                    }
                    persistedEvents = persistedEvents2;
                    r1 = obj2;
                    r4 = obj;
                } catch (FileNotFoundException unused2) {
                    if (aVar != null) {
                        try {
                            aVar.close();
                        } catch (IOException unused3) {
                        }
                    }
                    try {
                        r1.getFileStreamPath("AppEventsLogger.persistedevents").delete();
                    } catch (Exception e2) {
                        e = e2;
                        str = f4838a;
                        str2 = "Got unexpected exception when removing events file: ";
                        Log.w(str, str2, e);
                    }
                    if (persistedEvents == null) {
                        persistedEvents = new PersistedEvents();
                    }
                    return persistedEvents;
                } catch (Exception e3) {
                    e = e3;
                    Log.w(f4838a, "Got unexpected exception while reading events: ", e);
                    if (aVar != null) {
                        try {
                            aVar.close();
                        } catch (IOException unused4) {
                        }
                    }
                    try {
                        File fileStreamPath2 = r1.getFileStreamPath("AppEventsLogger.persistedevents");
                        fileStreamPath2.delete();
                        r1 = fileStreamPath2;
                        r4 = aVar;
                    } catch (Exception e4) {
                        e = e4;
                        str = f4838a;
                        str2 = "Got unexpected exception when removing events file: ";
                        Log.w(str, str2, e);
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (r4 != 0) {
                    try {
                        r4.close();
                    } catch (IOException unused5) {
                    }
                }
                try {
                    r1.getFileStreamPath("AppEventsLogger.persistedevents").delete();
                    throw th;
                } catch (Exception e5) {
                    Log.w(f4838a, "Got unexpected exception when removing events file: ", e5);
                    throw th;
                }
            }
        } catch (FileNotFoundException unused6) {
            aVar = null;
        } catch (Exception e6) {
            e = e6;
            aVar = null;
        } catch (Throwable th3) {
            r4 = 0;
            th = th3;
            if (r4 != 0) {
                r4.close();
            }
            r1.getFileStreamPath("AppEventsLogger.persistedevents").delete();
            throw th;
        }
        if (persistedEvents == null) {
            persistedEvents = new PersistedEvents();
        }
        return persistedEvents;
    }

    /* JADX INFO: renamed from: b */
    public static void m2359b(PersistedEvents persistedEvents) throws Throwable {
        ObjectOutputStream objectOutputStream;
        HashSet<LoggingBehavior> hashSet = FacebookSdk.f5352a;
        Validate.m2479h();
        Context context = FacebookSdk.f5360i;
        ObjectOutputStream objectOutputStream2 = null;
        try {
            try {
                try {
                    objectOutputStream = new ObjectOutputStream(new BufferedOutputStream(context.openFileOutput("AppEventsLogger.persistedevents", 0)));
                    try {
                        objectOutputStream.writeObject(persistedEvents);
                        objectOutputStream.close();
                    } catch (Exception e) {
                        e = e;
                        objectOutputStream2 = objectOutputStream;
                        Log.w(f4838a, "Got unexpected exception while persisting events: ", e);
                        try {
                            context.getFileStreamPath("AppEventsLogger.persistedevents").delete();
                        } catch (Exception unused) {
                        }
                        if (objectOutputStream2 == null) {
                        } else {
                            objectOutputStream2.close();
                        }
                    } catch (Throwable th) {
                        th = th;
                        if (objectOutputStream != null) {
                            try {
                                objectOutputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    objectOutputStream = null;
                }
            } catch (Exception e2) {
                e = e2;
            }
        } catch (IOException unused3) {
        }
    }
}
