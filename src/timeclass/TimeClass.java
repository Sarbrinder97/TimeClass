/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timeclass;

/**
 *
 * @author sarbrinder dhillon
 */
public class TimeClass {
private int hours, minutes, seconds;

public TimeClass()
{
    setTime(0,0,1);
}

public TimeClass(int hours, int minutes, int seconds)
{
    setTime(hours, minutes, seconds);
}
/**
 * this method will set the instance variables and set the instance variables
 * @param hours - 0 to 23
 * @param minutes - 0 to 59
 * @param seconds -0 to 59
 */

public void setTime(int hours, int minutes, int seconds)
{
    if (hours<0 || hours>=24)
        throw new IllegalArgumentException("Hours must be in the range 0-23");
    if (minutes<0 || minutes>=60)
        throw new IllegalArgumentException("minutes must be in the range 0-59");
    if (seconds<0 || seconds>=60)
        throw new IllegalArgumentException("seconds must be in the range 0-59");
    this.hours=hours;
    this.minutes=minutes;
    this.seconds=seconds;
}

public String toMilitaryTime()
{
    return String.format("%02d:%02d:%02d", hours, minutes, seconds);
   
}

public String toStandardTime()
{
    return String.format("%d:%02d:%02d %s",
                         ((hours == 0) || (hours == 12 ) ? 12 : hours % 12),
                         minutes,
                         seconds,
                         (hours>=12) ? "PM": "AM");
}



}
