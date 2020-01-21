package com.mapbox.navigation.trip.notification

import android.app.Notification
import androidx.core.app.NotificationCompat

/**
 * Provide notification for navigation process launched with a [TripSession]
 *
 * @since 1.0.0
 */
object NavigationNotificationProvider {

    /**
     * Build [Notification] based on [NotificationCompat.Builder] params
     *
     * @param builder is [NotificationCompat.Builder] used for
     * building notification
     * @return [Notification] was built based on [Notification.Builder] params
     * @since 1.0.0
     */
    fun buildNotification(builder: NotificationCompat.Builder): Notification {
        return builder.build()
    }
}
